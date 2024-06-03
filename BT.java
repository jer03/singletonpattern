package cs361proj2;

public abstract class BT {

  public abstract int height();

  public abstract boolean isBST();

  public static Node createBST(int[] values) {
    Node root = null;

    for (int value: values) {
      root = insert(root, value);
    }

    return root;
  }

  public static Node insert(Node root, int value) {

    if (root == null) {
      return Node.createNode(value);
    }

    if (value < root.num) {

      if (root.left == Nil.getNil()) {
        root.left = Node.createNode(value);
      } else {
        root.left = insert((Node) root.left, value);
      }
    } else {
      if (root.right == Nil.getNil()) {
        root.right = Node.createNode(value);
      } else {
        root.right = insert((Node) root.right, value);
      }
    }

    return root;
  }

  public static Node deleteNode(Node root, int key) {

    if (root == null) {

      return root;
    }

    if (key < root.num) {

      root.left = deleteNode((Node) root.left, key);

    } else if (key > root.num) {

      root.right = deleteNode((Node) root.right, key);

    } else {

      if (root.left == Nil.getNil() && root.right == Nil.getNil()) {
        return null;
      } else if (root.left == Nil.getNil()) {

        return (Node) root.right;
      } else if (root.right == Nil.getNil()) {

        return (Node) root.left;
      } else {

        root.num = minValue((Node) root.right);

        root.right = deleteNode((Node) root.right, root.num);
      }
    }

    return root;
  }

  public static int minValue(Node root) {
    int min = root.num;
    while (!(root.left == Nil.getNil())) {
      min = ((Node) root.left).num;
      root = (Node) root.left;
    }
    return min;
  }
}