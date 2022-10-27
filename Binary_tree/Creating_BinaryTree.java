package Binary_tree;


import java.util.LinkedList;
import java.util.Queue;

public class Creating_BinaryTree 
{

	public class Node
	{
		int element;
		Node left;
		Node right;
		
		public Node(int e, Node l, Node r)
		{
			element = e;
			left = l;
			right = r;
		}
	}
	
	Node root;
	
	public Creating_BinaryTree()
	{
		root = null;
	}
	
	//Iteratively 
//	public void insert(Node temproot, int e)
//	{
//		Node temp = null;
//		while(temproot != null)
//		{
//			temp = temproot;
//			if(e == temproot.element)
//				return;
//			else if(e < temproot.element)
//				temproot = temproot.left;
//			else if( e > temproot.element)
//				temproot = temproot.right;
//		}
//		
//		Node n = new Node(e, null, null);
//		if(root != null)
//		{
//			if(e < temp.element)
//				temp.left = n;
//			else
//				temp.right = n;
//		}
//		else 
//			root = n;
//	}
	
	public Node insert(Node temproot, int e)
	{
		if(temproot != null)
		{
			if(e < temproot.element)
				temproot.left = insert(temproot.left, e);
			else if(e > temproot.element)
				temproot.right = insert(temproot.right, e);
		}
		else
		{
			Node n = new Node(e, null, null);
			temproot = n;
			
		}
		return temproot;
	}
	
	//Inorder Traversal
	public void inorder(Node temproot)
	{
		if(temproot != null)
		{
			inorder(temproot.left);
			System.out.print(temproot.element + " ");
			inorder(temproot.right);
		}
	}
	
	//Preorder Traversal
	public void preorder(Node temproot)
	{
		if(temproot != null)
		{
			System.out.print(temproot.element + " ");
			inorder(temproot.left);
			inorder(temproot.right);
		}
	}
	
	//Postorder Traversal
	public void postorder(Node temproot)
	{
		if(temproot != null)
		{
			System.out.print(temproot.element + " ");
			inorder(temproot.left);
			inorder(temproot.right);
		}
	}
	
	//Levelorder Traversal
	public void levelorder()
	{
		Queue<Node> q = new LinkedList<>();
		Node t = root;
		System.out.print(t.element + " ");
		q.add(t);
		while(!q.isEmpty())
		{
			t = q.remove();
			if(t.left != null)
			{
				System.out.print(t.left.element + " ");
				q.add(t.left);
			}
			if(t.right != null)
			{
				System.out.print(t.right.element + " ");
				q.add(t.right);
			}
		}
	}
	
	//Search In Binary Search tree Iteratively
	public boolean search(int key)
	{
		Node temproot = root;
		while(temproot != null)
		{
			if(key == temproot.element)
				return true;
			else if(key < temproot.element)
				temproot = temproot.left;
			else
				temproot = temproot.right;
		}
		return false;
	}
	
	//Search In Binary Search tree Recursively
	public boolean Rsearch(Node temproot, int key)
	{
		if(temproot != null)
		{
			if(key == temproot.element)
				return true;
			else if(key < temproot.element)
				return Rsearch(temproot.left, key);
			else
				return Rsearch(temproot.right, key);
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Creating_BinaryTree B = new Creating_BinaryTree();
		B.root = B.insert(B.root, 50);
		B.insert(B.root, 30);
		B.insert(B.root, 80);
		B.insert(B.root, 10);
		B.insert(B.root, 40);
		B.insert(B.root, 60);
		B.insert(B.root, 55);
		B.insert(B.root, 100);
		B.insert(B.root, 90);
		System.out.println(B.Rsearch(B.root, 101));
		
//		System.out.println("Inorder Traversal: ");
//		B.inorder(B.root);
//		System.out.println();
//		System.out.println("Preorder Traversal: ");
//		B.preorder(B.root);
//		System.out.println();
//		System.out.println("Postorder Traversal: ");
//		B.postorder(B.root);
//		System.out.println();
//		System.out.println("Levelorder Traversal: ");
//		B.levelorder();
	}


}
