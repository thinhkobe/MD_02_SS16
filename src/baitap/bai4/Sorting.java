package baitap.bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<FootBallTeam> teams=new ArrayList<>();
        teams.add(new  FootBallTeam(1,13,30,"hà nội"));
        teams.add(new FootBallTeam(2,13,33,"đà nẵng "));
        teams.add(new FootBallTeam(3,13,25,"TpHCM"));
//        insertionSort(teams);
//        System.out.println("mảng sau khi sort"+ Arrays.toString(teams));

    }

    public static void babulSort(FootBallTeam[] teams){
        boolean check = true;
        for (int i = 1; check && i < teams.length; i++) {
            check=false;
            for (int j = 0; j < teams.length-i; j++) {
                if (teams[j].getScore()<teams[j+1].getScore()){
                    FootBallTeam temp=teams[j+1];
                    teams[j+1]=teams[j];
                    teams[j]=temp;
                    check=true;
                }
            }
        }
    }
    public static void selectionSort(FootBallTeam[] teams){
        for (int i = 0; i < teams.length; i++) {
            FootBallTeam temp=teams[i];
            int index=i;
            for (int j = 1+i; j < teams.length; j++) {
                if (teams[j].getScore()>temp.getScore()){
                    temp=teams[j];
                    index=j;
                }
            }
            if (index !=i){
                teams[index]=teams[i];
                teams[i]=temp;
            }
        }
    }
    public static void insertionSort(FootBallTeam[] teams){
        for (int i = 1; i < teams.length; i++) {
            FootBallTeam temp=teams[i];
            int j;
            for ( j = i-1; j >=0&&teams[j].getScore()<temp.getScore() ; j--) {
                teams[j+1]=teams[j];
            }
            teams[j+1]=temp;
        }
    }

}
