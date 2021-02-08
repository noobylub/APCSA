
package com.company;
//THe way to import an array list
import com.sun.org.apache.xpath.internal.operations.Bool;

import  java.util.ArrayList;
class Car{
    int age;
    String name;
    public Car( String name, int age){
        this.name = name;
        this.age = age;
    }



}
class  arrayList{
    public static void main(String[] args){
        //arraylist is mutable, it can be changed
        //First import the arraylist, the imported class like a scanner
        Car Bumblebee = new Car("Camaro Yello",4);
        Car Honda = new Car("Honda City",4);
        ArrayList<Car> CarGarage = new ArrayList<Car>();
        CarGarage.add(Bumblebee);
        CarGarage.add(Honda);
        for(Car xy: CarGarage){
            System.out.print(xy.name);
        }
        //Integers
        ArrayList<Integer> buncOfNo = new ArrayList<Integer>();
        buncOfNo.add(68);
        buncOfNo.add(410);
        buncOfNo.add(59);
        System.out.println(buncOfNo);
        buncOfNo.remove(0);
        System.out.println(buncOfNo);

        //List of Strings
        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("Oniond");
        ingredients.add("Chicken");
        ingredients.add("Water");

        System.out.println(ingredients);
        ingredients.set(1,"Beef");
        System.out.println(ingredients);
        //Booleans
        ArrayList<Boolean>MaleOrNot = new ArrayList<Boolean>();
        MaleOrNot.add(false);
        MaleOrNot.add(true);
        System.out.println(MaleOrNot);
        MaleOrNot.remove(0);
        MaleOrNot.remove(0);
        System.out.println(MaleOrNot.isEmpty());
        //List of characters
        ArrayList<Character> chars = new ArrayList<Character>();
        chars.add('f');
        chars.add('u');
        System.out.println(chars);
        chars.add('n');
        System.out.println(chars);





















        //then we define it and initialize it
        //The type of arraylist is within the <> bracket
        //This is an empty list
        ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
        //Like javascript, you put it values
        firstArrayList.add(56);
        firstArrayList.add(65);
        //then you can have a get
        System.out.println(firstArrayList.get(1));
        //array list methods

        //size() like a length
        System.out.println(firstArrayList.size());

        //isEmpty();
        System.out.println(firstArrayList.isEmpty());

        //add(object a)
       firstArrayList.add(1,420);

        //ad(int index, object 0)

        //add(int index, object 0);

        firstArrayList.set(2,56);

        //get(int index) returns the one at the index, or gets it


        //remove(int index);
        System.out.println(firstArrayList);
        int y = firstArrayList.remove(0);
        //The remove method returns
        System.out.println(y);






    }
}