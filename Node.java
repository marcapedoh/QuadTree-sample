public class Node{
    public boolean val;
    public boolean isleaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node(){
        this.val = false;
        this.isleaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val,boolean isleaf){
        this.val = val;
        this.isleaf = isleaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isleaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight){
        this.val = val;
        this.isleaf = isleaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", isleaf=" + isleaf +
                ", topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}