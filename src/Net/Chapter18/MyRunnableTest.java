package Net.Chapter18;

public class MyRunnableTest {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			new Thread(new MyRunnable()).start();
		}
	}

}


class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		try{
			Thread.sleep(1000);
			System.out.println("½é¸öÊÇ" + getClass());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	
}