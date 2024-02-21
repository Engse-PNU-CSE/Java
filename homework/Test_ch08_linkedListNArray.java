package com.ruby.java.homework;

class Node {
	int data;
	Node link;

	public Node(int data) {
		this.data = data;
		link = null;
	}
}

class LinkedList {
	Node first;

	// 리스트에 순차 추가
	void append(int data) {
		Node p = first, q = null;
		Node newNode = new Node(data);
		if (p == q)
			first = newNode;
		else {
			Node next = p;
			while (next.link != q) next = next.link;
			next.link = newNode;
		}
	}

	void showList() {
		Node p = first;
		if (p == null)
			System.out.print("There are not resisted Data");
		else {
			Node next = p;
			while (next != null) {
				if (next.data < 10) System.out.print(" ");
				System.out.print(next.data + " ");
				next = next.link;
			}
		}
		System.out.println();
	}
	void insert(int data) {
		Node newNode = new Node(data);
		if(data == 1) {
			newNode.link=first;
			first=newNode;
		}
		else {
			Node next = first;
			while(next != null) {
				if(data < next.link.data) break;
				next=next.link;
			}
			newNode.link=next.link;
			next.link=newNode;
		}
	}

	void insert2(int data, int index) {
		Node newNode = new Node(data);
		if(index-1 == 0) {
			newNode.link=first;
			first=newNode;
		}
		else {
			Node next = first;
			for(int i = 0; i < index-2; i++) next=next.link;
			newNode.link=next.link;
			next.link=newNode;
		}
		
	}

}

public class Test_ch08_linkedListNArray {
	static int getList(int[] data) {
		int count = 0;
		int mid = data.length / 2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5;
			count++;
		}
		return count;
	}

	static void showList(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	static int insertList(int[] data, int count, int x) {
		int index=0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] < x) index = i;
			else break;
		}
		for(int i = data.length - 1; i > index; i--) data[i] = data[i - 1];
		data[index+1] = x;
		return count + 1;
	}
	static int insertList2(int[] data, int count, int x, int index) {
		for (int i = data.length - 1; i >= index; i--)
			data[i] = data[i - 1];
		data[index - 1] = x;
		return count + 1;
	}
	static void setList(int[] data, int count, int x) {
		data[count]=x;
	}

	public static void main(String[] args) {
		int[] list = new int[10];
//		int[] listInfo = new int[10];//배열에 리스트 값 저장
		int count = 0;

		try {
			System.out.println("배열로 리스트::");
			count = getList(list);
			showList(list);
			count = insertList(list, count, 3);
			showList(list);
			count = insertList(list, count, 7);
			showList(list);
			count = insertList2(list, count, 77, 5);
			showList(list);
			count = insertList2(list,  count, 20, 123);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Insert Wrong Index: " + e1.getMessage());
		}

		System.out.println("객체로 리스트::");
		LinkedList ll = new LinkedList();
		try {
			ll.showList(); 
			ll.append(5);
			ll.append(10);
			ll.append(15);
			ll.append(20);
			ll.append(25);
			ll.showList();
			ll.insert(1);
			ll.showList();
			ll.insert(9);
			ll.showList();
			ll.insert(3);
			ll.showList();
			ll.insert(7);
			ll.showList();
			ll.insert2(100, 6);
			ll.showList();
			ll.insert2(1, 123);
			ll.showList();
		}
		catch(NullPointerException e) {
			System.out.println("Insert Wrong Index: " + e.getMessage());
		}
	}
}

