package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class MyOtherApp {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ForMyOtherApp.main(null);

		ForMyOtherApp app = new ForMyOtherApp();
		app.testMethod();
	}
}
