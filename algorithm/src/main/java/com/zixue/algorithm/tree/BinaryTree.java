package com.zixue.algorithm.tree;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Test;


/**
 * 
 * @author houdo
 * @see 二叉树
 */
public class BinaryTree {
	private TreeNode  root = null;
	
	/**
	 * 创建二叉树
	 * @param index
	 * @param data
	 */
	private void createBTree(ArrayList<String> data) {
		createBinaryTree(0, data);
	}
	private TreeNode createBinaryTree(int size,ArrayList<String> data) {
		if (data.size()==0) {
			return null;
		}
		String d= data.get(0);
		TreeNode node;
		int index = size - data.size();
		if ("#".equals(d)) {
			node=null;
			return node;
		}
		node = new TreeNode(index,d);
		if (index==0) {
			//创建根节点
			root = node ;
			data.remove(0);
		}else {
			data.remove(0);
			node.leftChild = createBinaryTree(index, data);
			node.rightChild = createBinaryTree(index, data);
		}
		return node ;
		
	}
	@Test
	public void test() {
		ArrayList<String> aList = new ArrayList<String>();
		
		
	}
	
	/**
	 * 求二叉树的高度
	 * @author Administrator
	 *
	 */
	public int getHeight(){
		return getHeight(root);
	}
	
	private int getHeight(TreeNode node) {
		if(node == null){
			return 0;
		}else{
			int i = getHeight(node.leftChild);
			int j = getHeight(node.rightChild);
			return (i<j)?j+1:i+1;
		}
	}

	/**
	 * 获取二叉树的结点数
	 * @author Administrator
	 *
	 */
	public int getSize(){
		return getSize(root);
	}
	
	
	private int getSize(TreeNode node) {
		if(node == null){
			return 0;
		}else{
			return 1+getSize(node.leftChild)+getSize(node.rightChild);
		}
	}
	/**
	 * 前序遍历——非迭代
	 */
	
	public void nonPreOrder(TreeNode node){
		if(node == null){
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(node);
		while(!stack.isEmpty()){
			//出栈和进栈
			TreeNode n = stack.pop();//弹出根结点
			//压入子结点
			System.out.println("nonPreOrder data"+n.getData());
			if(n.rightChild!=null){
				stack.push(n.rightChild);
				
			}
			if(n.leftChild!=null){
				stack.push(n.leftChild);
			}
		}
	}
	/**
	 * 前序遍历
	 * @param node
	 */
	private void preOrder(TreeNode node) {
		if (node==null) {
			return;
		}else {
			System.out.print(node.getData());
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
		
	}
	/**
	 * 中序遍历
	 * @param node
	 */
	private void minOrder(TreeNode node) {
		if (node==null) {
			return;
		}else {
			minOrder(node.leftChild);
			System.out.print(node.getData());
			minOrder(node.rightChild);
		}
	}
	/**
	 * 后序遍历
	 * @param node
	 */
	private void postOrder(TreeNode node) {
		if (node==null) {
			return;
		}else {
			postOrder(node.leftChild);
			postOrder(node.rightChild);
			System.out.print(node.getData());
		}
	}
	
	/**
	 * 封装节点类
	 * @author houdo
	 *
	 */
	class TreeNode{
		int index;
		TreeNode parent;
		TreeNode leftChild;
		TreeNode rightChild;
		TreeNode data;
		public TreeNode(int index,  TreeNode data) {
			super();
			this.index = index;
			this.parent = null;
			this.leftChild = null;
			this.rightChild = null;
			this.data = data;
		}
		public TreeNode(int index2, String d) {
			// TODO Auto-generated constructor stub
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public TreeNode getParent() {
			return parent;
		}
		public void setParent(TreeNode parent) {
			this.parent = parent;
		}
		public TreeNode getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(TreeNode leftChild) {
			this.leftChild = leftChild;
		}
		public TreeNode getRightChild() {
			return rightChild;
		}
		public void setRightChild(TreeNode rightChild) {
			this.rightChild = rightChild;
		}
		public TreeNode getData() {
			return data;
		}
		public void setData(TreeNode data) {
			this.data = data;
		}
		
	}
	
}
