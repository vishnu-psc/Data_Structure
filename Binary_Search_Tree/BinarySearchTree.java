package Binary_Search_Tree;

import java.util.*;

public class BinarySearchTree {

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
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	//Iteratively 
	public void insert(Node temproot, int e)
	{
		Node temp = null;
		while(temproot != null)
		{
			temp = temproot;
			if(e == temproot.element) 
			{
				System.out.println("Element already exist");
				return;
			}
			else if(e < temproot.element)
				temproot = temproot.left;
			else if( e > temproot.element)
				temproot = temproot.right;
		}
		
		Node n = new Node(e, null, null);
		if(root != null)
		{
			if(e < temp.element)
				temp.left = n;
			else
				temp.right = n;
		}
		else 
			root = n;
	}
	
//	public Node insert(Node temproot, int e)
//	{
//		if(temproot != null)
//		{
//			if(e < temproot.element)
//				temproot.left = insert(temproot.left, e);
//			else if(e > temproot.element)
//				temproot.right = insert(temproot.right, e);
//		}
//		else
//		{
//			Node n = new Node(e, null, null);
//			temproot = n;
//			
//		}
//		return temproot;
//	}
	
	//Deleting a node
//	public boolean delete(int e)
//	{
//		Node p = root;
//		Node pp = null;
//		while(p != null && p.element != e)
//		{
//			pp = p;
//			if(e < p.element)
//				p = p.left;
//			else
//				p = p.right;
//		}
//		if(p == null)
//			return false;
//		if(p.left != null && p.right != null)
//		{
//			Node s = p.left;
//			Node ps = p;
//			while(s.right != null)
//			{
//				ps = s;
//				s = s.right;
//			}
//			p.element = s.element;
//			p = s;
//			pp = ps;
//		}
//		Node c = null;
//		if(p.left != null)
//			c = p.left;
//		else
//			c = p.right;
//		if(p == root)
//			root = null;
//		else
//			if(p == pp.left)
//				pp.left = c;
//			else
//				pp.right = c;
//		return true;
//	}
	
	public Node delete(Node root, int key)
	{
		if(root == null)
			return root;
		if(key < root.element)
			root.left = delete(root.left, key);
		else if(key > root.element)
			root.right = delete(root.right, key);
		else
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			root.element = minValue(root.right);
			
			root.right = delete(root.right, root.element);	
		}
		return root;
	}
	
	public int minValue(Node root)
	{
		int minv = root.element;
		while(root.left != null)
		{
			minv = root.left.element;
			root = root.left;
		}
		return minv;
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
			preorder(temproot.left);
			preorder(temproot.right);
		}
	}
	
	//Postorder Traversal
	public void postorder(Node temproot)
	{
		if(temproot != null)
		{
			postorder(temproot.left);
			postorder(temproot.right);
			System.out.print(temproot.element + " ");
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
	
	public int count(Node temproot)
	{
		if(temproot != null)
		{
			int x = count(temproot.left);
			int y = count(temproot.right);
			return x+y+1;
		}
		return 0;
	}
	
	public int height(Node temproot)
	{
		if(temproot != null)
		{
			int x = height(temproot.left);
			int y = height(temproot.right);
			
			if(x > y)
				return x + 1;
			else
				return y + 1;
		}	
		return 0;
	}
	
	public static void main(String[] args) 
	{
		BinarySearchTree B = new BinarySearchTree();
		B.insert(B.root, 50);
		B.insert(B.root, 30);
		B.insert(B.root, 80);
		B.insert(B.root, 10);
		B.insert(B.root, 40);
		B.insert(B.root, 60);
		B.insert(B.root, 55);
		B.insert(B.root, 100);
		B.insert(B.root, 90);
		
		System.out.println("inorder Traversal: ");
		B.inorder(B.root);
		System.out.println();
		B.delete(B.root, 40);
		
		B.inorder(B.root);
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
