package baitap.bai3;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        insertionSort(arr);
        System.out.println("mảng đã xếp "+ Arrays.toString(arr));
    }
    public static void babulSort(String[]arrayString){
        for (int i = 1; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString.length-i; j++) {
                if (arrayString[j].compareTo(arrayString[j + 1]) > 0){
                    String temp=arrayString[j+1];
                    arrayString[j+1]=arrayString[j];
                    arrayString[j]=temp;
                }
            }
        }
    }
    public static void selectionSort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            String temp=arr[i];
            int index=i;
            for (int j = 1+i; j < arr.length; j++) {
                if (arr[j].compareTo(temp)<0){
                    temp=arr[j];
                    index=j;
                }
            }
            if (index!=i){
                arr[index]=arr[i];
                arr[i]=temp;
            }

        }
    }
    public static void insertionSort(String[]arr){
        for (int i = 1; i < arr.length; i++) {
            String temp=arr[i];
            int k;
            for ( k = i-1; k >=0&&arr[k].compareTo(temp)>0 ; k--) {
                arr[k+1]=arr[k];
            }
            arr[k+1]=temp;

        }
    }
}
