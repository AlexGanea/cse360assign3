package cse360assign3;

public class Calculator extends AddingMachine {
	public Calculator() {
		super();
	}
	
	public void mult (int value){
		total*=value;
		result += "*" + value;
	}
	
	public void div(int value){
		total/=value;
		result += "/" + value;
		
		if (value == 0){
			total = 0;
		}
		
	}
	
	public void power(int value){
		total = total^value;
		result += "^" + value;
		
		if (value == 0){
			total = 0;
		}
	}
}
