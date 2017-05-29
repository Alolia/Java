package Net.Chapter14;

public class ArrayLinkedListTest {

	public static void main(String[] args) {
		int [] arrary = new int[]{
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20	
		};
		System.out.println(arrary[6]);
		Linked next = new Linked();
		Linked first=next;
		next.setValue(0);
		
		for (int i=1;i<=10;i++){
			Linked linked =new Linked();
			linked.setValue(i);
			linked.setNext(next);
			next=linked;
		}
		first = first.getNext();
		System.out.println(first);
	}

}


class Linked {
	private int value;
	private Linked next;
	
	public void setValue = setValue(int value);
	
	
	public getValue(){
		return Value;
	}
}