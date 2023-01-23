import java.util.Arrays;
import java.util.List;

public class Tree {
    public String node;
    public String value = "";
    public List<Tree> sons;

    public Tree(String node, Tree... sons){
        this.node = node;
        this.sons = Arrays.asList(sons);
    }

    public Tree(String node, String value, Tree... sons){
        this.node = node;
        this.value = value;
        this.sons = Arrays.asList(sons);
    }

    public Tree(String node){
        this.node = node;
    }
}
