package examples;

// Copyright: http://www.java2novice.com/junit-examples/test-annotation/

public class MyEvenOdd {
 
    public MyEvenOdd() {
    	
    }
	public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}