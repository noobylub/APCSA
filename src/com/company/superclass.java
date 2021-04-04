package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;

class Human{
    private String name;
    private int age;
    private int height;

    //another constructor
    public Human(String n){
        this.name = n;
        this.age = 16;
        this.height = 160;
    }

    //overlaoding the constructor
    public Human(String name, int age, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public void display() {
        System.out.println("Name is "+ name );
        System.out.println("Age is "+ age);
        System.out.println("Height is "+ height);

    }
    //getter and setter methods
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void getOlder(){
        this.age++;

    }
}
class Student extends Human{
    private int grade;

    //always call the super class
    //super is like the parent class
    public Student(String name, int age, int height,  int g){
        super(name, age, height);
        this.grade = g;
    }
    public boolean willGrad(){
        return this.grade>60;
    }


    public void display() {
        super.display();
        System.out.println("");
    }
}
class Senior extends Student{
    private String college;
    public Senior(String name, int age, int height,  int g, String college){
        super(name, age, height, g);
        this.college = college;
    }
}


class   superclass{
    public static void main(String[] args) {
        Human me = new Human("Muhammad",16, 160 );
        Human Robert = new Student("Robeto", 23,150,150);
        Human JOHNCENA = new Senior("JOHNCENA",20,184, 92,"WWE");
        System.out.println(me.getName());
        Senior anotherYou = new Senior("Person", 19,160,89,"Boston");
        ArrayList<Human> bunchofPeople = new ArrayList<Human>();
        bunchofPeople.add(me);
        bunchofPeople.add(Robert);
        bunchofPeople.add(JOHNCENA);

        for(Human H:bunchofPeople){
            H.display();
        }
    }
}