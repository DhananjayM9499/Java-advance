package org.fi.utility;

class Node<T>    // Template / Generics
{
	Node<T> previous;
	Node<T> next;
	T data;
	
	
	public Node(T data) {
		super();
		this.data = data;
	}	
}
