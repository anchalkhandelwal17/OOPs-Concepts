package com.javaProject;

// creating custom exception class

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) throws CustomException{

        try{
//            String s = "abc";
//            System.out.println(s.charAt(8));
            throw new CustomException("Custom exception message.");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("As this statement is in finally block so it will always execute.");
        }
    }
}
