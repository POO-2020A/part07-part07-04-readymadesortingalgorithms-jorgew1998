import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[]  numbers = {8, 3, 7, 9, 1, 2, 4};
        Main.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] names = {"jorge", "washington", "alba"};
        Main.sort(names);
        System.out.println(Arrays.toString(names));

        ArrayList<Integer> numbersTwo = new ArrayList<>();
        numbersTwo.add(9);
        numbersTwo.add(5);
        numbersTwo.add(3);
        numbersTwo.add(15);
        Main.sortIntegers(numbersTwo);
        System.out.println(numbersTwo);


        ArrayList<String> namesTwo = new ArrayList<>();
        namesTwo.add("venegas");
        namesTwo.add("kathy");
        namesTwo.add("alba");
        namesTwo.add("jimena");
        Main.sortStrings(namesTwo);
        System.out.println(namesTwo);
    }
    
    public static void sort(int[] array) {
    Arrays.sort(array);
  }

  public static void sort(String[] array) {
    Arrays.sort(array);
    
  }

  public static void sortIntegers(ArrayList<Integer> integers) {
    Collections.sort(integers);
  }

  public static void sortStrings(ArrayList<String> strings) {
    Collections.sort(strings);
  }

}
