import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class myBinarySearchTreeTester {
	
	@Test
	public void test1() {
		int[] A = {3,1,9,1,2,10}; //I wanted to start with a default that is just positive.
		myBinarySearchTreeNode B = new myBinarySearchTreeNode(A);
		System.out.println(B.depth(0));  // - 1
		System.out.println(B.depth(2)); // 2
		System.out.println(B.height()); // 2 
		
	}
	
	@Test
	public void test2() {
		int[] A = {1,2,3,4,5,6}; // This test is about what would happen if the array has a increase order.
		myBinarySearchTreeNode B = new myBinarySearchTreeNode(A);
		System.out.println(B.depth(0)); 
		System.out.println(B.depth(2)); 
		System.out.println(B.height());  
		
	}
	
	@Test
	public void test3() {
		int[] A = {4,2,13,-4,7,6}; // This test is about adding one integer of a negative number.
		myBinarySearchTreeNode B = new myBinarySearchTreeNode(A);
		System.out.println(B.depth(0)); 
		System.out.println(B.depth(2)); 
		System.out.println(B.height());  
		
	}
	
	@Test
	public void test4() {
		int[] A = {4,-2,13,-4,7,-6}; // This test is each integer that are place have opposite side (negative or positive number) next to each other.
		myBinarySearchTreeNode B = new myBinarySearchTreeNode(A);
		System.out.println(B.depth(0)); 
		System.out.println(B.depth(2)); 
		System.out.println(B.height());  
		
	}
	
	@Test
	public void test5() {
		int[] A = {10, 20}; // This test is about to have little integers on the array.
		myBinarySearchTreeNode B = new myBinarySearchTreeNode(A);
		System.out.println(B.depth(0)); 
		System.out.println(B.depth(2)); 
		System.out.println(B.height());  
		
	}
	
	@Test
	public void test6() {
		int[] A = {-7, 2, 0, 12, 9, -3}; // This test is for everything included from the previuos 
		myBinarySearchTreeNode B = new myBinarySearchTreeNode(A);
		System.out.println(B.depth(0)); 
		System.out.println(B.depth(2)); 
		System.out.println(B.height());  
		
	}
}
