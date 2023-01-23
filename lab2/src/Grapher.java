import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Grapher {
    private final Tree node;
    StringBuilder tree;

    Grapher(Tree node) {
        this.node = node;
        tree = new StringBuilder();
    }
    void draw() {
        tree.append("digraph G{").append(System.lineSeparator());
        dfs(node);
        tree.append("}");
        File file = new File("/Users/mac/IdeaProjects/lab2/src/tree.dot");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(tree.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void dfs(Tree node) {
        if (node.sons == null) {
            return;
        }
        for (Tree child : node.sons) {
            String nodeValue = "";
            if (node.node.equals("TYPE") || node.node.equals("NAME")){
                nodeValue = " | (" + node.value +  ")";
            }
            String childValue = node.value;
            if (child.node.equals("TYPE") || child.node.equals("NAME")){
                childValue = " | (" + child.value +  ")";
            }
            tree.append("\"")
                    .append(node.node)
                    .append(nodeValue)
                    .append("\"")
                    .append("->")
                    .append("\"")
                    .append(child.node)
                    .append(childValue)
                    .append("\"")
                    .append(System.lineSeparator());
            dfs(child);
        }
    }
}