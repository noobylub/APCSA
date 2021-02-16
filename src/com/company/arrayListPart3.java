package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class ArrayListPractice{
    public ArrayList<Integer> hello(ArrayList<ArrayList> hello ){
        ArrayList<Integer> theNumbers = new ArrayList<>();
        ArrayList<Integer> summedUp = new ArrayList<>();
        for(int x=0;x<hello.size();x++){
            ArrayList<Integer> withinArray = hello.get(x);
            String number ="";
            for(int xy:withinArray){
                number+=xy;
            }

            theNumbers.add(Integer.parseInt(number));
        }
        int sum=0;
        for(int x:theNumbers){
            sum+=x;
        }
        ArrayList<Integer> lastone = new ArrayList<>();
        while(sum>0){
            lastone.add(0,sum%10);
            sum = sum/10;
        }


        return lastone;
    }


    //Part 2
    public ArrayList<ArrayList> splitting(ArrayList<Integer> why){
        ArrayList<Integer> firstHalf = new ArrayList<>();
        ArrayList<Integer> secondHalf = new ArrayList<>();
        for(int x=0;x<why.size()/2;x++){
            firstHalf.add(why.get(x));
        }
        for(int x=why.size()/2;x<why.size();x++){
            secondHalf.add(why.get(x));
        };
        ArrayList<ArrayList> toReturn = new ArrayList<>();
        toReturn.add(firstHalf);
        toReturn.add(secondHalf);
        return toReturn;
    }
    public static void main(String[] args){
        ArrayListPractice methods = new ArrayListPractice();
        ArrayList<Integer> h = new ArrayList<>();
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(7);
        h.add(8);
        ArrayList<Integer> y = new ArrayList<>();
        y.add(5);
        y.add(5);
        y.add(5);
        y.add(5);
        ArrayList<ArrayList> arraylist = new ArrayList<>();
        arraylist.add(h);
        arraylist.add(y);
        System.out.println(methods.hello(arraylist));
        System.out.println(methods.splitting(h));



    }
}