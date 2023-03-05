grammar Expr;

@header {
import java.util.*;
}

s returns [String res]
@init {
    HashMap<String, String> vars = new HashMap<String, String>();
    StringBuilder sb = new StringBuilder();
    sb.append("#include <stdio.h> \n");
}

@after {
    sb.append("}");
    $res = sb.toString();
}
    : main[vars] EOF {sb.append($main.res);}
    ;

main [HashMap<String, String> vars] returns [String res]
    : DEF MAIN NLINE expr[vars]
    {
        $res = "int main()\n{ \n" + $expr.res;
    }
    ;

nlines
    : NLINE nlines
    |
    ;

expr[HashMap<String, String> vars] returns [String res]
    : PRINT LROUND op RROUND nlines expr[vars]
        {
        $res = "printf(";
        if ($op.type.equals("int")) {
            $res += "\"%d\",";
        } else if ($op.type.equals("char*")) {
            $res += "\"%s\",";
        } else {
            if (vars.containsKey($op.type)){
                if (vars.get($op.type).equals("int")){
                    $res += "\"%d\",";
                } else if (vars.get($op.type).equals("int")){
                    $res += "\"%s\",";
                }
            }
        }
        $res += $op.res;
        $res += ");\n";
        $res += $expr.res;
        }
    | NAME EQ op
        {
            String type = "";
            if (vars.containsKey($NAME.text)){
                type = "";
            }
            else {
                type = $op.type;
                vars.put($NAME.text, type);
            }
        }
        nlines expr[vars]
        {
            $res = type + " " + $NAME.text + " = " + $op.res + ";\n" + $expr.res;
        }
    | WHILE LROUND predicate RROUND COL nlines whileBody[vars] expr[vars]
        {
            $res = "while";
            $res += "(";
            $res += $predicate.res;
            $res += ")";
            $res += "{\n";
            $res += $whileBody.res;
            $res += "}\n";
            $res += $expr.res;
        }
    | IF LROUND predicate RROUND COL nlines ifBody[vars] elseBody[vars] expr[vars]
            {
               $res = "if";
               $res += "(";
               $res += $predicate.res;
               $res += ")";
               $res += " {\n";
               $res += $ifBody.res;
               $res += "}\n";
               $res += $elseBody.res;
               $res += $expr.res;
            }

    | {$res = "";}
    ;

expr1[HashMap<String, String> vars] returns [String res]
    : PRINT LROUND op RROUND nlines
        {
        $res = "printf(";
        if ($op.type.equals("int")) {
            $res += "\"%d\",";
        } else if ($op.type.equals("char*")) {
            $res += "\"%s\",";
        } else {
            if (vars.containsKey($op.type)){
                if (vars.get($op.type).equals("int")){
                    $res += "\"%d\",";
                } else if (vars.get($op.type).equals("int")){
                    $res += "\"%s\",";
                }
            }
        }
        $res += $op.res;
        $res += ");\n";
        }
    | NAME EQ op
        {
            String type = "";
            if (vars.containsKey($NAME.text)){
                type = "";
            }
            else {
                type = $op.type;
                vars.put($NAME.text, type);
            }
        }
        nlines
        {
            $res = type + " " + $NAME.text + " = " + $op.res + ";\n";
        }
    | WHILE LROUND predicate RROUND COL nlines whileBody[vars]
        {
            $res = "while";
            $res += "(";
            $res += $predicate.res;
            $res += ")";
            $res += "{\n";
            $res += $whileBody.res;
            $res += "}\n";
        }
    | IF LROUND predicate RROUND COL nlines ifBody[vars] elseBody[vars]
            {
               $res = "if";
               $res += "(";
               $res += $predicate.res;
               $res += ")";
               $res += " {\n";
               $res += $ifBody.res;
               $res += "}\n";
               $res += $elseBody.res;
            }
    | {$res = "";}
    ;

predicate returns [String res]
    : opBool {$res = $opBool.res;}
    ;

whileBody[HashMap<String, String> vars] returns [String res]
    : expr1[vars] {$res = $expr1.res;}
    | BREAK {$res = $BREAK.text;}
    | CONTINUE {$res = $CONTINUE.text;}
    ;

ifBody[HashMap<String, String> vars] returns [String res]
    : expr1[vars] {$res = $expr1.res;}
    | BREAK {$res = "break\n";}
    ;

elseBody[HashMap<String, String> vars] returns [String res]
    : ELSE elIf[vars] COL nlines expr1[vars] elseBody[vars] {$res = "else" + $elIf.res + "{\n" + $expr1.res + "}\n"
        + $elseBody.res;}
    | BREAK {$res = "break\n";}
    | {$res = "";}
    ;

elIf[HashMap<String, String> vars] returns [String res]
    : IF LROUND predicate RROUND {$res = " if(" + $predicate.res + ")";}
    | {$res = "";}
    ;
opBool returns [String res]
    : bool opBoolT {$res = $bool.res + $opBoolT.res;}
    ;

opBoolT returns [String res]
    : AND opBool {$res = " && " + $opBool.res;}
    | OR opBool {$res = " || " + $opBool.res;}
    | {$res = "";}
    ;

bool returns [String res]
    : BOOL
    {
        if ($BOOL.text.equals("true")){
            $res = "1";
        }
        else if ($BOOL.text.equals("false")){
            $res = "0";
        }
        else {
            $res = "1";
        }
    }
    | NAME {$res = $NAME.text;}
    | left = op BOOLOP right = op {
        $res = $left.res + $BOOLOP.text + $right.res;
    }
    ;

op returns [String res, String type]
    : NUM opT {
        $res = $NUM.text + $opT.res;
        $type = "int";
        }
    | STR opT {
        $res = $STR.text + $opT.res;
        $type = "char*";
        }
    | NAME opT {
        $res = $NAME.text + $opT.res;
        $type = $NAME.text;
        }
    ;

opT returns [String res]
    : OP op {$res = $OP.text + $op.res;}
    | {$res = "";}
    ;

NLINE: '\n';
DEF: 'def';
MAIN: 'main():';
LROUND: '(';
RROUND: ')';
LBR: '{';
RBR: '}';
COL: ':';
PRINT: 'print';
SEMICOL: ';';
AND: 'and';
OR: 'or';
OP: [+-/*];
BOOLOP: '<' | '>' | '<=' | '>=' | '==';
EQ: '=';
WHILE: 'while';
IF: 'if';
STR: '"' .*? '"';
CONTINUE: 'continue';
BREAK: 'break';
ELSE: 'else';
BOOL: 'true'|'false';

NUM: [0-9]+ ;
NAME: [A-Za-z_][A-Za-z0-9_]* ;

WS: [ \r\t] -> skip ;