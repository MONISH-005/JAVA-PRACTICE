import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j=0; j<n-i-1; j++)
                System.out.print(" ");
            for (int j=0; j<2*i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}


/* This program will execute diamond pattern.
This code helps you understand nested for loops for structured pattern printing, using mathematical logic (2 * i - 1) to control star counts dynamically. 
It reinforces loop control for increasing and decreasing sequences, demonstrating forward and reverse iteration to create symmetric design

OUTPUT
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *

    */
