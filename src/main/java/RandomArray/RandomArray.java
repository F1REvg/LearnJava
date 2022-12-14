package RandomArray;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = {rand.nextInt(100) -50, rand.nextInt(100) -50, rand.nextInt(100) -50, rand.nextInt(100) -50};
        System.out.println("Random array looks like: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("\n");
        Arrays.sort(arr);
        System.out.println("After using Arrays.sort we got sorted array. Now it looks like: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Now we need to get min and max element from our array. It will be first one and last one");
        int min = arr[0];
        System.out.println("Min = " + min);
        int max = arr[arr.length -1];
        System.out.println("Max = " + max);
    }
}
