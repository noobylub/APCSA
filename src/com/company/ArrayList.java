
package com.company;
//THe way to import an array list
import  java.util.ArrayList;

class  arrayList{
    public static void main(String[] args){
        //arraylist is mutable, it can be changed
        //First import the arraylist, the imported class like a scanner


        //then we define it and initialize it
        //The type of arraylist is within the <> bracket
        //This is an empty list
        ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
        //Like javascript, you put it values
        firstArrayList.add(56);
        firstArrayList.add(65);
        for(int x:firstArrayList){
            System.out.println(x);
        }

    }
}