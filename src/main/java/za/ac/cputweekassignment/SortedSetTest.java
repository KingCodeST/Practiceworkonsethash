package za.ac.cputweekassignment;


import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {


    public static void main(String[] args)
    {
        // create tree set from array colors
        String[] color ={"Yellow","Green","Black","Tan","Gray","White","Orange","red","Green"};

        SortedSet<String> tree= new TreeSet<String>(Arrays.asList(color));


        System.out.print("Sort set: ");
        printSet(tree); //output contents of tree


        //get headset based upon "orange"
        System.out.print("heatSet C\"orange\"):");
        printSet(tree.headSet("orange"));

        //get trailorSet based upon "orange"
        System.out.print("trailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));


        // get first and last elements
        System.out.printf("first: %s\n",tree.first());
        System.out.printf("last: %s\n",tree.last());




    }


    //output sortedSet using enhanced for statement
    private static void printSet(SortedSet<String>set)
    {
        for(String s:set)
        {
            System.out.printf("%s",s);

            System.out.println();
        }

    }

}
