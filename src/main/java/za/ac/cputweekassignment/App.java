package za.ac.cputweekassignment;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     String[] colors ={"red","white","blue","green","gray","orange","tan","white","Cyan","peach","gray","orange"};


        List<String> list= Arrays.asList(colors);

        System.out.printf("List: %s\n",list);

        //eliminate duplicates than print the unique values
        printNonDuplicates(list);



      }
      //Create a set from a collection eliminate duplicates
      public static  void printNonDuplicates(Collection<String> values)
      {
          Set<String> set =new HashSet<String>(values);

          for(String value: set)
              System.out.printf("%s\n",value);

          System.out.println();

      }
}
