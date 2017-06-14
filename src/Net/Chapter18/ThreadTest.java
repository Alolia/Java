package Net.Chapter18;

public class ThreadTest {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			MyThread myThread = new MyThread(i);
			myThread.start();
		}
	}

}



class MyThread extends Thread{
	private int value;
	
	public MyThread(int value){
		this.value = value;
	}
	
	@Override
	public void run(){
		try{
			Thread.sleep(2000);
			System.out.println(value);
		}catch(InterruptedException e){
			
		}
	}
}