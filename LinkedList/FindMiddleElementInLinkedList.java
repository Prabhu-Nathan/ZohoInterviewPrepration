class FindMiddleElementInLinkedList{
	public static void main(String arg[]){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		System.out.println(printMiddle(n1));
	}
	public static int  printMiddle(Node n1){
		Node slow=n1;
		Node  fast=n1;
		while(fast!=null && fast.next!=null){
			
			slow=slow.next;
			fast=fast.next.next;

		}
		return slow.data;
	}

	public static  class  Node{
		public Node next;
		public int data;
		Node(int data){
			this.data=data;
		}
		public String toString(){
			return this.data+" ";
		}
		public void setNext(Node next){
			this.next=next;
		}

	}
}
