package cs361proj2;

public class Node extends BT {
  int num;
  BT left;
  BT right;

  public Node(int n, BT l, BT r) {
    this.num = n;
    this.left = l;
    this.right = r;
  }

  public int height() {
    int lh = left.height();
    int rh = right.height();
    return (lh < rh ? rh : lh) + 1;
  }

  public String toString() {
    String leftString = (left != null) ? left.toString() : "Nil";
    String rightString = (right != null) ? right.toString() : "Nil";
    return "Node(" + num + ", " + leftString + ", " + rightString + ")";
  }

  public boolean isBST() {

    boolean leftBST = left.isBST();

    boolean rightBST = right.isBST();

    if (leftBST && rightBST) {

      boolean leftCheck = left.isBST() && (left instanceof Nil || ((Node) left).num < num);

      boolean rightCheck = right.isBST() && (right instanceof Nil || ((Node) right).num > num);

      return leftCheck && rightCheck;
    }

    return false;
  }

  public static Node createNode(int value) {
    return new Node(value, Nil.getNil(), Nil.getNil());
  }
}