package baitap.bai2;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    int Id;
    String Name;
    double Score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        Id = id;
        Name = name;
        Score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Score=" + Score +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {
//        return Double.compare(this.Score,o.getScore());
        return o.getName().compareTo(this.Name) ;
    }

}
