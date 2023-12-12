package com.company;

import java.sql.SQLOutput;

public class Ch6_Prog4 {
    public static void main(String[] args) {
        /*Practice no.1
        float [] arr = {76.5f,65.4f,87.3f,98.2f,93.1f};
        float sum = 0;
        for(float element: arr){
            sum = sum+element;
        }
        System.out.println("The value of sum is: "+sum);
*/
         /*Practice no.2
        float [] arr = {76.5f,65.4f,87.3f,98.2f,93.1f};
        float num = 87.3f;
        boolean isInArray = false;
        for(float element: arr) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
            if(isInArray){
                System.out.println("The value is present in the array");
            }
            else{
                System.out.println("The value is not present in the array");
            }*/
        //Practice no.3
        /*float [] arr = {76.5f,65.4f,87.3f,98.2f,93.1f};
        float avg = 0;
        for(float element: arr){
            avg = avg+element;
        }
        System.out.println("The value of average marks is: "+avg/ arr.length);
*/
        //Practice no.4

        /*int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9},
                {10, 11, 12}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println();
            }*/
        // Practice no 5
        /*int [] arr = {6,5,4,3,2,1};
        int l = arr.length;
        int n  = Math.floorDiv(l, 2);
        int temp;
        for(int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.println(element);
        }*/

        //Practice N0.6
       /* int []arr = {122,34,56,98,87,77};
        int max = 0;
        for(int element:arr){
            if(element>max) {
                max = element;
            }
        }
        System.out.println(max); */

        //Practice No.7
        /*int arr[] = {12, 13, 2, 22, 34, 1,0};
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i])
            {
            min = arr[i];
            }
            System.out.println(min);
        }
        System.out.println("The minimum element is " + min);
*/
        //Practice N0.8

        /*boolean isSorted = false;
        int [] arr = {6,7,8,9,10,11};
        for(int i=0; i< arr.length; i++){
            if(arr[i]<arr[i+1]){
                isSorted = true;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }*/
    }
}