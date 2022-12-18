package org.fi.utility;

public class LinkedList<T> implements TraverseList<T>
{
	Node<T> start;
	Node<T> end;
	Node<T> current;
	int maxCount;
	
	public void add(T data)
	{
		Node<T> tmpNode = new Node<>(data);  // Type Inference
		
		if(start == null)
			start = end = current = tmpNode;
		else
		{
			tmpNode.previous = end;
			end.next = tmpNode;
			end = tmpNode;
		}
		maxCount++;
	}
	
	public void remove(int index)
	{
		
		
		if(index > maxCount-1 || start==null)
			return ;
		
		else if(start==end)
			start = end = current = null;
		
		else if(index==0)
		{
			start = start.next;
			start.previous = null;
		}
		else if(index == maxCount-1)
		{
			end = end.previous;
			end.next = null;
		}
		else
		{
			Node<T> tmpNode = start;
		// Dummy Loop
			for(int iTmp=0;iTmp<index;iTmp++,tmpNode=tmpNode.next);
			
			tmpNode.previous.next = tmpNode.next;
			tmpNode.next.previous = tmpNode.previous;
			
			tmpNode = null;
		}
		maxCount--;
		
	}
	
	public int getCount()
	{
		return maxCount;
	}
	
	public T getFirst()
	{
		if(start==null)
			return null;
		
		current = start;
		return current.data;
		
	}
	
	public T getNext()
	{
		if(start == null || current.next==null)
			return null;
		
		current = current.next;
		return current.data;		
	}
	
	public T getPrevious()
	{
		if(start==null || current.previous == null)
			return null;
		
		current = current.previous;
		return current.data;
	}
	
	public T getLast()
	{
		if(start==null)
			return null;
		
		current = end;
		return current.data;
	}
	
	
	
}
