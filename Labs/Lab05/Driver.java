import java.util.Scanner;
public class Driver {
public static void main(String[] args){
        GenericStackExtendsArrayList<String> g = new GenericStackExtendsArrayList<String>();

        for (int i = 0; i < 5; i++) {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter a String: ");
                String s = reader.nextLine();
                g.push(s);
        }


        System.out.println(g);

        Max m = new Max();

        String[] l = new String[5];
        g.toArray(l);


        BinarySearch b = new BinarySearch();
        System.out.println(m.max(l));
        System.out.println(b.binarySearch(l, "Edward"));
}
}
