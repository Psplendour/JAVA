package continueExample;

public class IneerLoopContinue {

	public static void main(String[] args) {
		  for(int i=1;i<=3;i++)//outer loop
        	{    
              for(int j=1;j<=3;j++) //inner loop 
              {    
                 if(i==2&&j==2)//using continue statement inside inner loop 
                 {    
                  continue;    
                 }    
                    System.out.println(i+" "+j);    
               }    
        }  
	}

}
