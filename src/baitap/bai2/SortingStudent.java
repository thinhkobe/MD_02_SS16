package baitap.bai2;

import java.util.Arrays;

public class SortingStudent {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "nam", 8);
        students[1] = new Student(2, "hung", 7);
        students[2] = new Student(3, "minh", 9);

        Student[] newStudents = bubbleSort(students);
        System.out.println(Arrays.toString(newStudents));
    }

    public static Student[] insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student currentStudent = students[i];
            int k;
            for (k = i - 1; k >= 0 && students[k].getScore() > currentStudent.getScore(); k--) {
                students[k + 1] = students[k];
            }
            students[k + 1] = currentStudent;
        }
        return students;
    }

    public static Student[] selectionSort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            Student minScore = students[i];
            int minIdex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getScore() < minScore.getScore()) {
                    minScore = students[j];
                    minIdex = j;
                }
            }
            if (minIdex != i) {
                students[minIdex] = students[i];
                students[i]=minScore;
            }
        }
        return students;
    }
    public static Student[] bubbleSort(Student[] students){
        boolean check=true;
        for (int i = 1; check && i < students.length; i++) {
            check=false;
            for (int j = 0; j <students.length-i; j++) {
                if (students[j].getScore()>students[j+1].getScore()){
                    Student temp=students[j+1];
                    students[j+1]=students[j];
                    students[j]=temp;
                    check=true;
                }
            }
        }
        
        return students;
    }
}
