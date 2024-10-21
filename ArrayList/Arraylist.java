import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>();

        for (int i = 0; i < 6; i++)
        {
            String s = console.nextLine();
            colors.add(s);
        }

        for (int i = 0; i < colors.size(); i++)
            System.out.println(colors.get(i));

        colors.add(0,"blue");
        System.out.println("Blue color added: " + colors);

        colors.set(2, "orange");
        System.out.println("After changing no.3: " + colors);

        colors.remove(2);
        System.out.println("After removing no.3: " + colors);

        System.out.println("Is there blue color: " + colors.contains("blue"));

        colors.sort(null);

        System.out.println("Fifth element: " + colors.get(5));

        ArrayList colors2 = (ArrayList)colors.clone();

        colors.sort( (a, b) -> { return b.compareTo(a); } );

        System.out.println("Sorted colors: " + colors2);
        System.out.println("Sorted backwards colors: " + colors);

        System.out.println("Are arraylisits equal: " + colors.equals(colors2));

        colors.clear();

        System.out.println("Are there no colors: " + colors.isEmpty());

        colors2.ensureCapacity(15);
        colors2.add("white");

        colors.trimToSize();
        System.out.println(colors2);
    }
}
