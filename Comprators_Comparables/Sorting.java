package Comprators_Comparables;

public class Sorting {

    public static void main(String[] args) {
        Cars[] arr = new Cars[5];

        arr[0] = new Cars(200, 10, "Red");
        arr[1] = new Cars(2060, 1040, "Rddweed");
        arr[2] = new Cars(2100, 150, "fgdsd");
        arr[3] = new Cars(20050, 120, "Rdefed");
        arr[4] = new Cars(20, 180, "Refrfd");
        Display(arr);
    }

    // abhe address print hoga abb hamko tostring method ovrride krwana hoga for
    // print cars details in cars class

    // public static void Display(Cars[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // }

    public static void Display(Cars[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
