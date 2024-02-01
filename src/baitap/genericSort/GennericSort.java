package baitap.genericSort;

import baitap.bai2.Student;

import java.util.Arrays;
import java.util.Comparator;

public  class GennericSort {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "nam", 8);
        students[1] = new Student(2, "hung", 7);
        students[2] = new Student(3, "minh", 9);

//        genericBabulSort(students);
//        System.out.println(Arrays.toString(students));
//        genericBabulSort(students,Comparator.comparingDouble(Student::getScore));
//        System.out.println(Arrays.toString(students));
        genericInsrtionSort(students);
        System.out.println(Arrays.toString(students));


    }
   public static <T extends Comparable<T>> void genericBabulSort(T[] array){
       for (int i = 1; i < array.length; i++) {
           for (int j = 0; j < array.length-i; j++) {
               if (array[j].compareTo(array[j + 1]) > 0) {
                   T temp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = temp;
               }
           }
       }
    }
    public static <T> void genericBabulSort(T[] array, Comparator<T> comparator) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (comparator.compare(array[j],array[j+1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static <T extends Comparable<T>> void genericSelectionSort(T[] array){
        for (int i = 0; i < array.length-1; i++) {
            T temp=array[i];
            int index=i;
            for (int j = i+1; j < array.length; j++) {
                if (temp.compareTo(array[j])>0){
                    temp=array[j];
                    index=j;
                }
            }
            if (index!=i){
                array[index]=array[i];
                array[i]=temp;
            }
        }
    }
    public static <T extends Comparable<T>> void genericInsrtionSort(T[] list){
        for (int i = 1; i < list.length; i++) {
            T temp=list[i];
            int k;
            for (k = i-1; k >=0&&list[k].compareTo(temp)>0 ; k--) {
                list[k+1]=list[k];
            }
            list[k+1]=temp;
        }

    }
}
