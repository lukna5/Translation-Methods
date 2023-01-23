import java.text.ParseException;
import java.util.List;
import java.util.Map;

public class ParserTest {

    static Map<String, String> mapOfCorrectTests = Map.of(
            "var x: Array<Integer>", "var x:Array<Integer>",
            "   var  x14 : Array    <   MyClass  > ", "var x14:Array<MyClass>",
            "var G_sfs421: Array < Array<double>>", "var G_sfs421:Array<Array<double>>",
            "var name_42: Array< Array< Array<Integer>>>", "var name_42:Array<Array<Array<Integer>>>"
    );

    static Map<String, String> mapOfMapTests = Map.of(
            "var x: Map<Integer, Integer>", "var x:Map<Integer,Integer>",
            "var x: Map<Array<Integer>, Integer>", "var x:Map<Array<Integer>,Integer>",
            "var x: Map<Integer, Array<Integer>>", "var x:Map<Integer,Array<Integer>>",
            "var x: Map<Map<Integer,    BOOL>, Array  < Integer> > ", "var x:Map<Map<Integer,BOOL>,Array<Integer>>");
    static List<String> mapOfBadMapTests = List.of(
            "var x: MapInteger, Integer>",
            "var x: Map<Array<Integer> Integer>",
            "var x: Map<Integer, Arry<Integer>>",
            "var x: Mp<Map<Integer,    BOOL>, Array  < Integer> > ",
            "var : Map<Integer Integer>",
            "var x: MapInteger, Integer",
            "var x: Map<Map<Integer,    BOOL, Array  < Integer> > "
            );

    static List<String> listOfErrorTests = List.of(
            "ar x: Array<Integer>",
            "var g^2: Array<Integer>",
            "var x1: Arr<Integer>",
            "var : Array<Integer>",
            "x: Array<Integer>",
            "var x Array<Integer>",
            "var x: Array Integer>",
            "var x: Array <Integer",
            "var x: Array <>",
            "var x: Array <Array<>>",
            "var x: Array <Ar<Double>>",
            "var x: Array <Array Double>>",
            "var x: Array <Array<Double>",
            "Var x: Array <Int>",
            "var 8x: Array <Int>",
            "var _x: Array <Int>",
            "var x: Array <4Int>",
            "var x: Array <_Int>"
            );

    public static void main(String[] args) {
        Parser parser = new Parser();
        int count = 1;
        System.out.println("Checking right answers");
        for (String key: mapOfCorrectTests.keySet()) {
            try {
                Tree res = parser.parse(key);
                if (!mapOfCorrectTests.get(key).equals(parseRes(res))){
                    System.err.println("Test passed №" + count + ": " + key + " Not passed, res must be different: "
                            + mapOfCorrectTests.get(key) + " but found: " + parseRes(res));
                } else {
                    System.out.println("Test passed №" + count + ": " + key);
                }
                count++;
            } catch (ParseException e) {
                System.err.println("Test Not passed №" + count + ": " + key + " Not passed, catch error: " + e.getMessage());
            }
        }

        for (String key: mapOfMapTests.keySet()) {
            try {
                Tree res = parser.parse(key);
                if (!mapOfMapTests.get(key).equals(parseRes(res))){
                    System.err.println("Test passed №" + count + ": " + key + " Not passed, res must be different: |"
                            + mapOfMapTests.get(key) + "| but found: |" + parseRes(res) + "|");
                } else {
                    System.out.println("Test passed №" + count + ": " + key);
                }
                count++;
            } catch (ParseException e) {
                System.err.println("Test Not passed №" + count + ": " + key + " Not passed, catch error: " + e.getMessage());
            }
        }

        System.out.println("Checking catch errors");
        for (String test: listOfErrorTests){
            try {
                parser.parse(test);
                System.err.println("Test Not passed №" + count + ": " + test + ", didn't catch Error: ");
            } catch (ParseException e) {
                System.out.println("Test passed №" + count + ": " + test + ", Catch Error: " + e.getMessage());
            }
            count++;
        }
        System.out.println("Map Errors");
        for (String test: mapOfBadMapTests){
            try {
                parser.parse(test);
                System.err.println("Test Not passed №" + count + ": " + test + ", didn't catch Error: ");
            } catch (ParseException e) {
                System.out.println("Test passed №" + count + ": " + test + ", Catch Error: " + e.getMessage());
            }
            count++;
        }

        String text = "var x: Map <Array <Integer>, Map<Double, String>>";
        Tree tree = null;
        try {
            tree = parser.parse(text);
        } catch (ParseException e) {
            System.err.println("Test draw not passed");
        }
        Grapher grapher = new Grapher(tree);
        grapher.draw();
    }

    private static String parseRes(Tree tree){
        if (tree.sons == null) {
            return "NULL";
        }
        if (tree.sons.size() == 0){
            if (tree.value.equals("var")){
                return("var ");
            } else {
                return (tree.value);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (Tree child : tree.sons) {
            builder.append(parseRes(child));
        }
        return builder.toString();
    }
}