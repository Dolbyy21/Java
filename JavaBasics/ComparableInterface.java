package com.JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
    int rollno, marks;
    String name;

    public Stud(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student"+ name +" rollno " + rollno + " marks "+marks;
    }
    @Override
    public int compareTo(Stud s){
        return name.length() > s.name.length() ? 1 :-1;
    }
}

public class ComparableInterface {
    public static void main(String[] args){
        List<Stud> studs = new ArrayList<>();

        studs.add(new Stud(1,"Dolby",77));
        studs.add(new Stud(2,"Doodle",67));
        studs.add(new Stud(3,"ABC",79));
        studs.add(new Stud(4,"VVVVVV",66));

        Collections.sort(studs,(i,j)->i.marks>j.marks?1:-1);    // Overrided the compareTo method with anonymous class

        for(Stud s : studs){
            System.out.println(s);
        }

    }
}
