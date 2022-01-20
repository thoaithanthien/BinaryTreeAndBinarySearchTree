package algorithm;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// insert = Vong for
//		MyBinaryTree myTree = new MyBinaryTree();
//		myTree.init();
//		System.out.println("Done");
		
		// Insert = De quy
		MyBST myBST = new MyBST();
		myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 5);
		myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 1);
		myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 6);
		myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 0);
		myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 3);
		myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 7);
		myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 2);          
		myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 4);
		
		// Xoa 1 phan tu trong cay
		myBST.deleteNode(myBST.mRoot, 1);
		
		System.out.println("DONE");
	}

}
