grammar Expr;

s returns [String res]
@init {
    StringBuilder sb = new StringBuilder();
    sb.append("#include <stdio.h> \n");
}

@after {
    sb.append("}");
    $res = sb.toString();
}
    : main[sb] EOF
    ;

main [StringBuilder sb] returns [String res]
    : DEF MAIN NLINE expr[sb]
    {
        sb.append("int main()\n{ \n" + $expr.res);
    }
    ;

nlines
    : NLINE nlines
    |
    ;

expr[StringBuilder sb] returns [String res]
    : PRINT LROUND op[sb] RROUND nlines expr[sb]
     {
        $res = "printf(";
        $res += $op.res;
        $res += ");\n";
        $res += $expr.res;
     }
    | NAME EQ op[sb] nlines expr[sb] {$res = $NAME.text + "=" + $op.res + ";\n" + $expr.res;}
    | WHILE LROUND predicate[sb] RROUND COL nlines whileBody[sb] expr[sb]
                {
                    $res = "while";
                    $res += "(";
                    $res += $predicate.res;
                    $res += ")";
                    $res += ":";
                    $res += "\n";
                }
    | IF LROUND predicate[sb] RROUND COL nlines ifBody[sb] expr[sb]
            {
               $res = "if";
               $res += "(";
               $res += $predicate.res;
               $res += ")";
               $res += " {\n";
               $res += "\n";
               $res += $ifBody.res;

               $res += "}\n";
            }
    | {$res = "";}
    ;

predicate[StringBuilder sb] returns [String res]
    : opBool[sb] {$res = $opBool.res;}
    ;

whileBody[StringBuilder sb] returns [String res]
    : expr[sb] {$res = $expr.res;}
    | BREAK {$res = $BREAK.text;}
    | CONTINUE {$res = $CONTINUE.text;}
    ;

ifBody[StringBuilder sb] returns [String res]
    : expr[sb] {$res = $expr.res;}
    | BREAK {$res = "break\n";}
    | ELSE elseBody[sb] {$res = "{\n $elseBody.res + }\n";}
    ;

elseBody[StringBuilder sb] returns [String res]
    : expr[sb] {$res = $expr.res;}
    | BREAK {$res = "break\n";}
    ;

assign[StringBuilder sb] returns [String res]
    : NAME EQ op[sb]
    {
        $res = $NAME.text + " = ";
    }
    ;

opBool[StringBuilder sb] returns [String res]
    : bool[sb] opBoolT[sb] {$res = $bool.res + $opBoolT.res;}
    ;

opBoolT[StringBuilder sb] returns [String res]
    : AND opBool[sb] {$res = " && " + $opBool.res;}
    | OR opBool[sb] {$res = " || " + $opBool.res;}
    | {$res = "";}
    ;

bool[StringBuilder sb] returns [String res]
    : BOOL {$res = $BOOL.text;}
    | NAME {$res = $NAME.text;}
    | left = op[sb] BOOLOP right = op[sb] {
        $res = $left.res + $BOOLOP.text + $right.res;
    }
    ;

op[StringBuilder sb] returns [String res]
    : NUM opT[sb] {$res = $NUM.text + $opT.res;}
    | STR opT[sb] {$res = $STR.text + $opT.res;}
    | NAME opT[sb] {$res = $NAME.text + $opT.res;}
    ;

opT[StringBuilder sb] returns [String res]
    : OP op[sb] {$res = $OP.text + $op.res;}
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

WS: [ \r\t] -> skip;

