import java.util.ArrayList;
//import java.util.stream;
import java.util.List;
import java.util.TreeSet;
import java.util.Comparator;
public class Aggregates{
  
    
   

   
    
    public static void main(String[] args){
	/*ArrayList<String> a = new ArrayList<String>();
	a.add("Bob");
	a.add("Bob");
	a.add("Dale");
	a.add("Cat");

	a.stream().filter(e->e.charAt(0) == 'B').forEach(e->System.out.println(e));
	*/
	//Blah b = new Blah();
	TreeSet<String> arguments = new TreeSet<String>(new Blah());
	for (String a: args){
	    
	    arguments.add(a);
	}
	System.out.println(arguments);
	
    }

    public static void myTrim(List<String> list){
    }

    
}

class Blah implements Comparator<String>{
    public int compare(String s1, String s2){
	if (s1.toLowerCase().equals(s2.toLowerCase())){
	    return 0;
	}else{
	    return -1;
	}
    }
	    
}
