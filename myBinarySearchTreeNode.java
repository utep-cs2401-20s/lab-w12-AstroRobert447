
public class myBinarySearchTreeNode {
	  // Attributes  
	  int myValue;
	  myBinarySearchTreeNode left;
	  myBinarySearchTreeNode right;
	    
	  //Constructors
	  myBinarySearchTreeNode(int inValue){
	    // created a new node with empty child pointers
		  myValue = inValue;
	  }
	  
	  myBinarySearchTreeNode(int[] A){
	    // creates a new Binary Search Tree rooted at the first value in the array
	    /// by inserting elements into the tree in the order they are given in A.
		  if (A.length >= 1) {
			  myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A[0]);
			  for(int i = 1; i <= A.length; i++) {
				  tree.insert(A[i]);
			  }
		  }
	  }
	  
	  public void insert(int inValue){
	    // This method takes a new integer as input and decides 
	    // if it should be place: 
	    //    * as the left child,
	    //    * as the right child, 
	    //    * in the left subtree,
	    //    * or in the right subtree.
	    if (inValue > myValue){
	    	if (right == null) 
	    		right = new myBinarySearchTreeNode(inValue);
	    	else
	    		right.insert(inValue);
	    } else {
	    	if (left == null) 
	    		left = new myBinarySearchTreeNode(inValue);
	    	else
	    		left.insert(inValue);
	    }
	  }
	  
	  public int height(){
	     // This method recursively calculates the height of the entire (sub)tree.
	     // This method will take O(n) time
		  // Base cases
		  
		  // Recursive
		 int Lheight = left.height();
		 int Rheight = right.height();
		 
				 Rheight = right.height();
				if (Rheight == -1) {
					return -1;
				}
				else {
					return 1 + Lheight;
				}	  
	  }
	  
	  public int depth(int search){
	     // This method recursively calculates the depth of a given search value. 
	     // If the given value is not in the tree, this method returns -1. 
	     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
	     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
	     // (i.e. the number of the recursive calls).
		// if search is at the root: return 0
		if (search == myValue) {
			return 0;
		} 
		// if it is not the root: it is either in the relevant subtree, or it is not in the tree (-1)
		if (search < myValue) {
			if (left == null) {
				return -1;
			}
			int LDepth = left.depth(search);
			if (LDepth == -1) {
				return -1;
			}
			else {
				return 1 + LDepth;
			}
		} 
		else {
			int RDepth = right.depth(search);
		}
	    return -1;
	  }
	  
	  // Utility function included so you can debug your solution. 
	  public void print() { print(""); }
	  private void print(String prefix) {
	    System.out.println(prefix + myValue);
	    prefix = prefix.replace('\u251C', '\u2502');
	    prefix = prefix.replace('\u2514', ' ');
	    if(left != null) left.print(prefix + "\u251C ");
	    if(right != null) right.print(prefix + "\u2514 ");
	  }
	  
	  
}
