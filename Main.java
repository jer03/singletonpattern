public class Main {
	    public static void main(String[] args) {
	        // Step 1: Create an array of integer values
	        int[] values = {5,9,7,10,4,3};

	        // Step 2: Create the binary search tree
	        Node root = BT.createBST(values);
	        System.out.println(root);
	        

	        // Step 3: Perform operations
	        // Print the height of the tree
	        System.out.println("Height of the tree: " + root.height());

	        // Check if the tree is a binary search tree
	        boolean isBST = root.isBST();
	        System.out.println("Is the tree a binary search tree? " + isBST);

	        // Delete a node from the tree
	        int keyToDelete = 9;
	       
	        System.out.println("After deleting node with key " + keyToDelete + ": " + BT.deleteNode(root, keyToDelete));

	        // Step 4: Print the results
	        // Print the tree using toString method
	        System.out.println("Tree structure: " + root);
	    }
	}


