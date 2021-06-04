package com.example.HelloWorld;

public class HelloWorld { 
	/**
     * Main HelloWorld method.
     * @param args list of String arguments (names in this case).
     */
	public static void main(String[] args) {
		System.out.println(getMessage(args));
	}

	/**
     * Builds a message based on "names" passed to it.
     * @param args list of String arguments (names in this case).
     */
	private static String getMessage(String[] args){
		String message = "Hello ";
		if (args.length > 0){
			for (String arg:args){
				message = message + arg + ",";
			}
		} else {
			message = message + "anonymous user,";
		}
		message = message + " how are you?";

		return message;
	}
}