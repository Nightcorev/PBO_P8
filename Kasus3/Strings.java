package com.mycompany.Kasus3;
import java.util.Scanner;

/*@author Fikri*/
public class Strings {
    public static void main(String[] args) {
        String[] strList;
        int size = 0; // Initialize size to 0

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many strings do you want to sort?? ");
        size = scan.nextInt();
        scan.nextLine(); // Consume the newline character
        strList = new String[size];

        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            strList[i] = scan.nextLine();
        }

        Sorting.insertionSort(strList); // Use insertionSort for descending order
        System.out.println("\nYour strings in sorted order (descending)...");
        for (int i = 0; i < size; i++) {
            System.out.println(strList[i]);
        }
    }
}
