package baitap.bai5;

import java.util.Arrays;

public class Sorting5 {
    public static void main(String[] args) {
        int[] array=getArr();
        System.out.println(Arrays.toString(array));
        babulSort(array);
        System.out.println("da xep"+ Arrays.toString(array));
    }
    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j;
            for ( j = i-1; j >=0&&arr[j]<temp ; j--) {
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }
    private static void babulSort(int[] arr){
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    private static void selactionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int currenMin=arr[i];
            int currenIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>currenMin){
                    currenMin=arr[j];
                    currenIndex=j;
                }
            }
            if (currenIndex!=i){
                arr[currenIndex]=arr[i];
                arr[i]=currenMin;
            }
        }

    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
