import java.io.*;

public class PigLatin{
	
    public static void main(String args[]) throws IOException{
        BufferedReader br = null;
	br = new BufferedReader(new InputStreamReader(System.in));
	String s="",str="";
	int i=0,l=0;
	char c=' ';
	System.out.println("Enter the word:");
	s=br.readLine();
	s=s.toLowerCase();
	//=========== Write your code within the block ===========//
	l=s.length();
	//========================================================//
	
	//IGNORE
	System.out.println(l);
	//END
    }

}