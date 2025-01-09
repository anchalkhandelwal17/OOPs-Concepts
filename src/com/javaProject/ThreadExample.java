package com.javaProject;

import java.awt.*;

// program to create 5 threads
// extending the thread class
class myThread extends Thread{

    // creating a variable so that a particular thread can be named
    private String threadName;

    public myThread(String threadName){
        this.threadName = threadName;
    }

    // overriding the run method of the Thread class
    // to provide it's working
    @Override
    public void run(){
        System.out.println(threadName + " is running");
    }
}


public class ThreadExample {
    public static void main(String[] args){

        // looping over to create 5 threads
        for(int i=1; i<=5; i++){
            myThread thread = new myThread("Thread " + i);
            thread.start();
        }
    }
}
