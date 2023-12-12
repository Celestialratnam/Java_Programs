package com.company;

public class Ch5_Prog2 {
    public static void main(String[] args) {
        /*int n = 1;
        for (int i = 10; i >= n; i--) {
            System.out.println(2 * i - 1);
        }
            for (int i = 0; i <= 10; i++) {
                if (i == 7) {
                    System.out.println(" Ending loop");
                    continue;
                }
                System.out.print("\t"+ i);
            }
        }*/
        int i = 1;
        while (i <= 15) {
            System.out.println(i);
            if (i == 12) {
                System.out.println("Ending the loop");
                continue;
            }
            i++;
        }
        /*int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
               }
            System.out.println(i);
        }while (i<=15);
    }*/
    }
}
