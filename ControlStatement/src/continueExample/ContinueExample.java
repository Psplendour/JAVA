package continueExample;
//The continue statement is used in loop control structure when you need to jump to the next iteration of the loop immediately
/*
 The Java continue statement is used to continue the loop. It continues the current flow of the program 
 and skips the remaining code at the specified condition.In case of an inner loop, it continues the inner loop only.
 */
public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){  
	        if(i==5){  
	            //using continue statement  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(i);  
	    }  
     }
}
//After reaching continue it directly goes to the iterate loop