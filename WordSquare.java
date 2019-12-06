import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Computer {
    
    List<String> Words;
  
  
  Computer(String[] args) {
    Words = new ArrayList<String>();
    for(int i = 0; i < args.length;i++)
    {
        
         Words.add(args[i]);
        
    }
   
  }
 
  void Seperate () {
    
     for(int i = 0; i < Words.size();i++)
    {
        if(Character.compare(Words.get(i).charAt(Words.get(i).length()-1),',') == 0 )
        {
            String temp = Words.get(i);
            Words.remove(i);
            Words.add(i,temp.substring(0, temp.length() - 1));
        }
         
    }
    //for(int i = 0; i < Words.size();i++)
    
    //{
     //  System.out.println(Words.get(i));
        
   // }
    
  }
  
  void checkIfSquare()
  
  {
      
      
      List<String> temp =  new ArrayList<String>(); 
      int n = 1;
      int m = 0;
      
      for(int i = 0; i < Words.size();i++ )
      
      {
          temp.add(Words.get(i));
          for(int j = 0; j < Words.size(); j++)
          
          {
              if(Character.compare(Words.get(i).charAt(n) , Words.get(j).charAt(m)) == 0 && Words.get(i).equals(Words.get(j)) == false)
              {
                  boolean alreadyIn = false;
                  for(int k = 0; k < temp.size(); k++)
                  {
                      
                      if(Words.get(j).equals(temp.get(k)) ==  true)
                      {
                          
                          alreadyIn = true;
                      }
                      
                  }
                  //System.out.println(Words.get(j));
                  if(alreadyIn == false)
                  {
                   temp.add(Words.get(j));
                   n++;
                   j=0;
                   
                  }
                  
              }
             if(Words.get(i).length() == temp.size())
              {  
                 break;
              }
              
          }

          if(Words.get(i).length() == temp.size())
          
          {
             String word = "";
             int counter = 0;
          
             for(int r = 1; r < temp.size(); r++)
             
             {
                 
                 for(int o = 0; o < temp.size(); o++)
                 
                 {
                     word = word + temp.get(o).charAt(r);
                     
                 }
                  
                 if(temp.get(r).equals(word) == true)
                 {
                     
                     counter++;
                 }
                 
                    word= "";
                 
             }
             if(counter+1 == temp.size())
             {
                 for(int r = 0; r < temp.size(); r++)
              {
                  System.out.println(temp.get(r));
             }
                 
             }
             else 
             {
                 
                 for(int j = 0; j < temp.size(); j++)
                 {
                     
                     for(int l = 0; l < temp.size(); l++)
                     {
                         
                         if(Character.compare(temp.get(j).charAt(0),temp.get(l).charAt(0)  ) == 0)
                         
                         {
                            Collections.swap(temp, j, l);
                             
                                           word = "";
              counter = 0;
          
             for(int r = 1; r < temp.size(); r++)
             
             {
                 
                 for(int o = 0; o < temp.size(); o++)
                 
                 {
                     word = word + temp.get(o).charAt(r);
                     
                 }
                  
                 if(temp.get(r).equals(word) == true)
                 {
                     
                     counter++;
                 }
                 
                    word= "";
                 
             }
             if(counter+1 == temp.size())
             {
                 for(int r = 0; r < temp.size(); r++)
              {
                  System.out.println(temp.get(r));
             }
                 
             }
                             
                             
                             
                         }
                         
                     }
                     
                 }
                 
             }
            
              
          }
          temp.clear();
          n=1;
     
          
          
      }
      
      
  }
  
   void CheckSquare()
  
  {
  
  
  
  }
  
 
}

public class MainClass
{
    public static void main (String[] args)
    {
        Computer my = new Computer(args);
        my.Seperate();
        my.checkIfSquare();
    }
}