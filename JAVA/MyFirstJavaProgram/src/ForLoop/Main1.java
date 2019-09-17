package ForLoop;
//The for Statement in Java (for loops)

//-->In For loop initiation of variable,condition and increment all are mention in the small bracket
//-->In while loop all above are at different place
public class Main1 {

	public static void main(String[] args) {
		int[] myintarray={14,21,35,24,25};
		
		/*
		 *int index=0;
		 while(index<5)
		 {
		   System.out.println(myintarray[index]);
		   index++;
		 }
		 */
		
	       for(int index=0;index<5;index++)
		{
			System.out.println(myintarray[index]);
		}
	       
	   System.out.println("----------------------------------------------------------");  //For separating the output of both the for loop  
	   //Other declaration of ForLoop only in case of Array.It take all the elements of the array
	   //for(element : arrayName)
	       for(int element : myintarray)
	       {
	    	   System.out.println(element);
	       }
	       }
	}
