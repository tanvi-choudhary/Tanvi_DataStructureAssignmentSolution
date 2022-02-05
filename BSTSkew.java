package BinaryAssignment;


	class Node
	{
		int key;
		Node left, right;
		
		Node(int data)
		{
			key = data;
			left = right = null;
		}
	}
	
	class BSTSkew
	{
		public static Node node;
		static Node prevnode = null;
		static Node currnode = null;
		
		static void BtToSkew(Node root, int order)
		{
			if (root == null)
			{
				return;
			}
			
			if (order > 0 )
			{
				BtToSkew(root.right,order);
			}
			else
			{
				BtToSkew(root.left,order);
			}
			
			Node rightNode = root.right;
			Node leftNode  = root.left;
			
			if ( currnode == null)
			{
				currnode = root;
				root.left = null;
				prevnode = root;
			}
			else
			{
				prevnode.right = root;
				root.left = null;
				prevnode= root;
			}
			
			if(order > 0)
			{
				BtToSkew(leftNode, order);
			}
			else
			{
				BtToSkew(rightNode,order);
			}
		
		}
		
		static void rightSkew(Node root)
		{
			if (root == null)
			{
				return;
			}
			System.out.print(root.key + " ");
			rightSkew(root.right);
		}
		
		public static void main(String[] args)
		{
			BSTSkew.node = new Node(50);
			BSTSkew.node.left = new Node(30);
			BSTSkew.node.right = new Node(60);
			BSTSkew.node.left.left = new Node(10);
			BSTSkew.node.right.left = new Node(55);
			
			int order = 0;
			BtToSkew(node, order);
			rightSkew(currnode);
			
			
		}
	}

