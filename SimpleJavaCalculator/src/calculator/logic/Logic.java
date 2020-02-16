package calculator.logic;

public class Logic {
	
    //It contains all the logic of our Application / Calculator.
    //Add/ substract/ multiply/ divide.

	private int result = 0;
    
    public int toAdd(int numA, int numB){
 
        result = numA + numB; 
        return result;
    }
    public int toSubtract(int numA, int numB){
 
        result = numA - numB;
        return result; 
    }
    public int multiply(int numA, int numB){

        result = numA * numB;
        return result; 
    }
    public int divide(int numA, int numB){
  
        result = numA / numB;
        return result; 
    }
}
