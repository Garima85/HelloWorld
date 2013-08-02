/**
 * 
 */
package com.src.helloworld;

/** * 
 * @version 1.0
 * 
 */
public class SpringCoreHelloWorld {
	private String message = null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
	public void sayHello() {
		System.out.println("first change in existing file");
		System.out.println(getMessage());
	}
}
