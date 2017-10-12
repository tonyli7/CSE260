import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.NullPointerException;
import java.lang.Character;
import java.util.regex.Pattern;
public class Letters{
    public static void main(String[] args){
	HashMap<Character, Integer> v_count = new HashMap<Character, Integer>(5);

	v_count.put('a',0);
	v_count.put('e',0);
	v_count.put('i',0);
	v_count.put('o',0);
	v_count.put('u',0);

	Scanner scn_in = new Scanner(System.in);
	System.out.println("Enter a file: ");
	String file_name = scn_in.nextLine();
	try{
	    File txt_file = new File(file_name);
	  
	    Scanner scn_file = new Scanner(txt_file);
	    String temp;
	    int num_c = 0;
	    int num_v = 0;
	    scn_file.useDelimiter("(?<=.)");
	    while(scn_file.hasNext()){
		
		temp = scn_file.next();
		
		if (temp.matches("[a-zA-Z]")){
		    System.out.println(temp);
		    if (v_count.containsKey(Character.toLowerCase(temp.charAt(0)))){
			
			v_count.put(temp.charAt(0), v_count.get(temp.charAt(0)) + 1);
			num_v++;
		    }else if (temp.matches("[a-zA-Z]")){
			num_c++;
		    }
		}

		
	    }
	    
	    System.out.println(v_count);
	    System.out.println("Number of vowels: " + num_v);
	    System.out.println("Number of consonants: " + num_c);
		
	}catch (NullPointerException e){
	    System.out.println("Null.");
	}catch (FileNotFoundException e){
	    System.out.println(file_name + " was not found.2");
	}


    }
}
