// @Author: github.com/zezeyze

import org.junit.*;
import static org.junit.Assert.*;

/* Test class for HW2's methods.*/
public class HW2Junit {
 
  // Test the samePrefix method.
  @Test
  public void testSamePrefix()
  { 
    assertTrue(HW2.samePrefix("zehra", "ton", 0));//Test 0    
    assertTrue(HW2.samePrefix("zehra", "zincir", 1));// Test 1,      
    assertFalse(HW2.samePrefix("this is a test", "this is a test", 100));// Test many     
    assertFalse(HW2.samePrefix("this is a test", "This is a trial", 4));//Test first     
    assertTrue(HW2.samePrefix("this is a test", "this is a trial", 11));// Test middle     
    assertTrue(HW2.samePrefix("this is a test", "this is a test", 14));// Test last   
  }
  
  // Test the trimsSpacesFromFront method.
  @Test
   public void testTrimSpacesFromFront()
   {
    
    assertEquals("ZehraY�ld�r�m", HW2.trimSpacesFromFront("ZehraY�ld�r�m")); //Test 0         
    assertEquals("ZehraY�ld�r�m",HW2.trimSpacesFromFront(" ZehraY�ld�r�m")); // Test 1,           
    assertEquals("Zehra   Y�ld�r�m",HW2.trimSpacesFromFront("          Zehra   Y�ld�r�m"));// Test many           
    assertEquals("Goodday!",HW2.trimSpacesFromFront("   Goodday!"));//Test first          
    assertEquals("What   a   wonderful   day!!!!",HW2.trimSpacesFromFront(" What   a   wonderful   day!!!!"));// Test middle             
    assertEquals("Howareyou???   ",HW2.trimSpacesFromFront("Howareyou???   "));// Test last   
  }
  
  // Test the repeatChars method.
  @Test
   public void testRepeatChars()
   {
     assertEquals("",HW2.repeatChars("Zehra", 0));//Test 0
     assertEquals("Zehra Y�ld�r�m .",HW2.repeatChars("Zehra Y�ld�r�m .", 1));//Test 1
     assertEquals("ZZZZZeeeeehhhhhrrrrraaaaa     YYYYY�����lllllddddd�����rrrrr�����mmmmm     .....",HW2.repeatChars("Zehra Y�ld�r�m .", 5)); //Test many
   }
  
  //Test the countWords method.
  @Test
  public void testCountWords()
  {   
   assertEquals(0, HW2.countWords("             "));//Test 0   
   assertEquals(1,HW2.countWords(" Hi "));//Test 1   
   assertEquals(10, HW2.countWords("One fish, two fish, red fish , blue fish !"));//Test many   
   assertEquals(1,HW2.countWords("   ZehraY�ld�r�m"));//Test first
   assertEquals(8, HW2.countWords("Actions speak louder than words ! ? ?!"));// Test middle   
   assertEquals(1, HW2.countWords("Xyz!?   ")); // Test last    
  }
  
  //Test the subSequence method.
  @Test
  public void testSubSequence()
  {
   assertFalse(HW2.subSequence(" ","enchanted"));//Test 0
   assertTrue(HW2.subSequence("a","all too well"));//Test 1
   assertTrue(HW2.subSequence("efeci","perfectly fine"));//Test many     
   assertTrue(HW2.subSequence("abo", "about chocolate")); //Test first
   assertTrue(HW2.subSequence("rnbu", "acorn bud"));// Test middle   
   assertFalse(HW2.subSequence("bdu", "acorn bud"));//Test last
  }   
}