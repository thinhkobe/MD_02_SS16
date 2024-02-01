package baitap.bai1;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
         int[] arr=getArr();
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void bubbleSort(int[] arr){
        boolean nextPass=true;
        for (int i = 1; i < arr.length-1&&nextPass; i++) {
            nextPass=false;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
                nextPass=true;
            }
        }

    }
    private static void selactionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int currenMin=arr[i];
            int currenIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<currenMin){
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
    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int currenElement=arr[i];
            int k;
            for ( k = i-1; k >=0&&arr[k]>currenElement ; k--) {
                arr[k+1]=arr[k];
            }
            arr[k+1]=currenElement;
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
