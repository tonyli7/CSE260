import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;
import java.util.TreeSet;
public class NonduplicateWords{
    public static void main(String[] args){
	TreeSet<String> words = new TreeSet<String>();
	
	File txtFile = new File("words.txt");
	Scanner scn = new Scanner(System.in);
	try{
	    scn = new Scanner(txtFile);
	}
	catch(FileNotFoundException e){
	    System.out.println("File not found");
	}

       String temp = "";
       while(temp != null){
	   String[] temp2;
	   
	   if (temp != ""){
	       temp2 = temp.split("\\s");
	   
	       for(String w: temp2){
	
		   if (!w.matches("") && w.matches("[a-zA-Z]+")){
		       words.add(w);
		   }
	       }
	   }
	   if (!scn.hasNextLine()){
	       break;
	   }
	   temp = scn.nextLine();
	   
       }
       System.out.println(words);
    }
}
