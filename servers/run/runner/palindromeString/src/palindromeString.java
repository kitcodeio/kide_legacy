import java.io.*;

public class palindromeString
{
	public String rev(String a)
	{
		String b=new StringBuffer(a).reverse().toString();
		return b;
	}
	public int check(String a,String b)
	{
		if(a.equals(b))
		{
                        return 1;
		}
		else
		{
                        return 0;
	        }
       }

       public static void main() throws java.io.IOException{
         System.out.println("input a number"); 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String a= br.readLine();
         palindromeString obj = new  palindromeString();
         String b = obj.rev(a);
         int check= obj.check(a, b);
	 if(check == 1){
           System.out.println("palindrome");
         } else {
           System.out.println("not palindrome");
         } 
       }
}
