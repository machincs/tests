package tests;

public class Main {
	public static void main(String[] args) {
		new Thread( ()-> System.out.println("Printing from the Runnable")).start();
	}
}



