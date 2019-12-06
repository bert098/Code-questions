import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.Math; 

class Computer {
    

  
  
  Computer() {}

    void Find_squares(int [] A)
    {
        int first; 
        int second;
        int result;
        double sqr;
        boolean found = false; 
        List Words = new ArrayList();
        for(int i = 0; i < A.length; i++)
        {
            first = A[i]*A[i];
            for(int j = i + 1; j < A.length; j++)
            {
                
                second =  A[j]*A[j];
                result = first + second; 
                sqr = Math.pow(result,0.5);
                
                
                if(sqr == (int)sqr)
                {
                   
                    for(int r = 0;   r< A.length; r++)
                    {
                        //System.out.println(A[r]);
                        if(A[r] == (int)sqr && A[r] != A[i])
                        {
                            // System.out.println(A[r]);
                             // System.out.println(A[i]);
                            Words.add(A[i]);
                            Words.add(A[j]);
                            Words.add((int)sqr);
                            found = true;
                            break;
                        }
                       
                    }
                    
                    break;
                }
                
                
            }
            
            if(found == true)
            {
                break;
            }
        }
        
        for(int i = 0; i < Words.size();i++ )
        {
            System.out.print(Words.get(i) + ", ");
        }
    }
    
    
}
    
   

public class MainClass
{
    public static void main (String[] args)
    {
       Computer my = new Computer();
        int[] A = new int[]{ 5, 1, 6, 13, 12};
        my.Find_squares(A);
    }
}