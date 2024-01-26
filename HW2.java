// @Author: github.com/zezeyze

/* this class represent all loops */
public class HW2 
{ 
  /* this method compares 2 sentences' letters until input value.*/
  public static boolean samePrefix(String string1, String string2, int x)
  {
    //if input value(x) is bigger than strings length, return false.
    if(x>string1.length())
    {
      return false;
    }
    // return until input value(x).
    for (int i= 0; i<x; i++)
    {     
     char c1 = string1.charAt(i);
     char c2 = string2.charAt(i);     
     /* returns false if different up to entered value.*/
     if(c1!=c2)
     {
     return false;     
     }
    }
     return true;   
  }
  
  /*this method deletes space until first letter*/
  public static String trimSpacesFromFront(String string)
  {
    StringBuilder build = new StringBuilder();   
    int j=0;
    char c = string.charAt(j);
    // if dont have any spaces direct build string.
    if(c!=' ')
    {
     for(;j<string.length(); j++)
     {
       c = string.charAt(j);
       build.append(c); 
     }
    }
    // if have spaces enter else.  
    else
    {
      //return until first letter, skip spaces.
      while(c==' ')
      { 
        c = string.charAt(j); 
        j=j+1;     
      } 
      //returns until the length of the strings length.
      for(int i=j-1 ;i<string.length(); i++)
      {
        //build all other characters after skip the leading spaces.
        c = string.charAt(i); 
        build.append(c);     
      } 
    }
    return build.toString(); 
  }
  
  /*this method repeat as many entered value*/
  public static String repeatChars(String string, int x)
  {
   StringBuilder build = new StringBuilder();
   int i;
   //returns until the length of the strings length.
   for(i=0; i<string.length(); i++)
   {
     char c = string.charAt(i);
     //returns until input value.
     for(int j=1; j<=x; j++)
     {
      build.append(c); 
     }
   }
   return build.toString(); 
  }
  
  /*this method counts words. */ 
  public static int countWords(String string)    
  {
   int i=0;
   int counter =0;
   //returns until the length of the strings length.
   for(i=0;i<string.length();i++)
   {
    char c = string.charAt(i); 
    
    //if there isn't space enter while loop.
    if (c!= ' ')
    {
     // return find space and index(i) is bigger than strings lengths -1.
     while(c!=' ' && i<string.length()-1)
     {
      i=i+1;
      c = string.charAt(i);
     }
     //increment the counter.
     counter++;
    }          
   }
   return counter;
  }
  
  /*this method compares the first string's letters 
   * in order with the letters of the second string's. */
  public static boolean subSequence(String string1, String string2)
  {  
   int counter=0;
   int k = 0;
   boolean blnIsFound = true;
   
   //returns until the length of the string1 length.
   for (int i=0; i<string1.length(); i++)
   {
     blnIsFound = true;
     char c1= string1.charAt(i); 
     //returns until the length of the string2 length.
     for (int j=k; j<string2.length() ; j++)
      {
        char c2= string2.charAt(j);
        // if string1 letters same as string2 increment counter, equate j to k, and return false exit the loop.
        if(string1.charAt(i)==string2.charAt(j)&& blnIsFound == true)
        {
          counter++;
          k=j; 
          blnIsFound = false;
        }       
     }
   }   
   //if string1's length same as counter return true.
   if(string1.length()==counter)
   {
    return true;
   }
   else
   {
    return false;
   }
  }
}
 
