
// Java program to demonstrate use of circular
// array using extra memory space
import java.util.*;
import java.lang.*;

public class CircularArray {

    // function to print circular list
    // starting from given index ind.
    public static void print(char a[], int n,
            int ind) {

        // print from ind-th index to
        // (n+i)th index.
        for (int i = ind; i < n + ind; i++) {
            System.out.println(a[(i % n)] + " " + i % n);
        }
    }

    // driver code
    public static void main(String argc[]) {
        char[] a = new char[]{'A', 'B', 'C',
            'D', 'E', 'F'};
        int n = 6;
        print(a, n, 3);
    }
}
