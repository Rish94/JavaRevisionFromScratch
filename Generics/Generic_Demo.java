package Generics;

public class Generic_Demo {

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 6, 1, 4, 1, 2, 5 };
        display(arr);
        String[] ar = { "DS", "Sd", "RAm" };
        display(ar);
    }

    public static <T> void display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
