
public class Main {
	public static void main(String[] args) throws InterruptedException { 
	     System.out.println("Main thread execution starts"); 
	
	     // Thread5 has the lowest priority
	     Starvation thread1 = new Starvation(); 
	     thread1.setPriority(10); 
	     Starvation thread2 = new Starvation(); 
	     thread2.setPriority(9); 
	     Starvation thread3 = new Starvation(); 
	     thread3.setPriority(8); 
	     Starvation thread4 = new Starvation(); 
	     thread4.setPriority(7); 
	     Starvation thread5 = new Starvation(); 
	     thread5.setPriority(6); 
	
	     thread1.start(); 
	     thread2.start(); 
	     thread3.start(); 
	     thread4.start(); 
	
	     //Thread5 has to wait for other threads to finish
	     thread5.start(); 
	
	     System.out.println("Main thread execution completes"); 
	} 
}
