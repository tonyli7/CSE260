import java.util.ArrayList;
//import java.util.stream;
import java.util.List;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.ListIterator;
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

	ArrayList<String> list1 = new ArrayList<String>();

	list1.add("  Bob   ");
	list1.add("Adam  ");
	list1.add("  Dave");
	list1.add("dasdasd");
	list1.add("a");
	list1.add(" ");

	System.out.println(list1);
	myTrim(list1);
	System.out.println(list1);
    }

    public static void myTrim(List<String> list){
	ListIterator<String> itr = list.listIterator();

	while(itr.hasNext()){
	    String temp = itr.next().trim();
	    itr.remove();
	    itr.add(temp);
	}
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
