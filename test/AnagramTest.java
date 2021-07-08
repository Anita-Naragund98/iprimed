
import java.util.Scanner;
import static java.lang.Math.abs;

public class AnagramTest {
	
	public int anagram(String firstString, String secondString) {
		
         int count1[] = new int[26];
         int count2[] = new int[26];
         int total=0;
         for(int i=0; i<26; i++)
         {
             count1[i]=0;
             count2[i]=0;
         }
         for (int i=0; i<firstString.length(); i++)
         {
             count1[firstString.charAt(i)-'a']++;
         }
         for (int i=0; i<secondString.length(); i++)
         {
             count2[secondString.charAt(i)-'a']++;
         }
         for(int i=0;i<26; i++)
         {
        	 total+=abs(count1[i]-count2[i]);
         }
		return total;
	}
	public static void main(String[] args) 
	  { 
	Scanner sc = new Scanner(System.in); 
	AnagramTest anagram=new AnagramTest();
	System.out.println("Enter the first string");
        String first = sc.next();
        System.out.println("Enter the second string");
        String second = sc.next();
        int count = anagram.anagram(first, second);
        System.out.println("Total count is:" +count);
	  } 

}



Output:
****************************************
*                                      *
*      Enter the first string          *
*      cde                             *
*      Enter the second string         *
*      abc                             *
*      Total count is:4                *
*                                      *
****************************************
*