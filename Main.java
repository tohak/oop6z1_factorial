package oop6z1;

public class Main {

	public static void main(String[] args) {
		Thread[]arrayThread=new Thread[100];
for (int i = 0; i < arrayThread.length; i++) {	
	arrayThread[i]=  new Thread(new FactorialThread(i+1));	
}
for (int i = 0; i < arrayThread.length; i++) {
	arrayThread[i].start();
}
for (int i = 0; i < arrayThread.length; i++) {
	try {
		arrayThread[i].join();
	} catch (InterruptedException e) {		
		e.printStackTrace();
	}
}
System.out.println(Thread.currentThread().getName()+" is stop");
	}

}
