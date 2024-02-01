package baitap.bai6;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void main(String[] args) {
        int[] arr=getArr();
        System.out.println("mảng ban đầu"+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("mảng đã xắp xếp"+ Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j;
            for ( j = i-1; j >=0&&arr[j]<temp ; j--) {
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
            System.out.println("mảng sắp xếp lần "+i+ Arrays.toString(arr));
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
