import java.util.LinkedHashSet;
public class SetOperations{
    public static void main(String[] args){
	LinkedHashSet<String> a = new LinkedHashSet<String>();
	a.add("George");
	a.add("Jim");
	a.add("John");
	a.add("Blake");
	a.add("Kevin");
	a.add("Michael");

	LinkedHashSet<String> b = new LinkedHashSet<String>();
	b.add("George");
	b.add("Katie");
	b.add("Kevin");
	b.add("Michelle");
	b.add("Ryan");

	LinkedHashSet<String> cloneA = new LinkedHashSet<String>();
	LinkedHashSet<String> cloneB = new LinkedHashSet<String>();

	cloneA = (LinkedHashSet<String>)a.clone();
	cloneB = (LinkedHashSet<String>)b.clone();

	union(cloneA, cloneB);
	cloneA = (LinkedHashSet<String>)a.clone();
	cloneB = (LinkedHashSet<String>)b.clone();
	
	difference(cloneA,cloneB);

	cloneA = (LinkedHashSet<String>)a.clone();
	cloneB = (LinkedHashSet<String>)b.clone();
	intersection(cloneA, cloneB);
    }

    public static void union(LinkedHashSet<String> A, LinkedHashSet<String>B){
	for (String s: B){
	    A.add(s);
	}
	System.out.println(A);
    }

    public static void difference(LinkedHashSet<String> A, LinkedHashSet<String> B){
	for (String s: B){
	    A.remove(s);
	}
	System.out.println(A);
    }

    public static void intersection(LinkedHashSet<String> A, LinkedHashSet<String> B){
	LinkedHashSet<String> C = new LinkedHashSet<String>();
	for (String s: B){
	    if (A.contains(s)){
		C.add(s);
	    }
	}
	System.out.println(C);
    }
}
