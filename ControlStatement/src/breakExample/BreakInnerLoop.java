package breakExample;

public class BreakInnerLoop {

	public static void main(String[] args) {
		    for(int i=1;i<=3;i++) //outer loop
            {    
               for(int j=1;j<=3;j++)//inner loop  
                    {    
                        if(i==2&&j==2)
                        {     
                            break; //using break statement inside the inner loop 
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }   

	}

}
