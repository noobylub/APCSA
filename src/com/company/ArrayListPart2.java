package com.company;

import java.util.ArrayList;

class ArrayListPart2{
    public static void main(String[] args){
        ArrayList<Integer> hello = new ArrayList<Integer>();
        for(int x=0;x<12;x++){
            hello.add(x+1);
        }
        ArrayList<Integer> FirstHalf = new ArrayList<Integer>();
        for(int x=0;x<(hello.size()/2);x++){

            FirstHalf.add(hello.get(x));
        }
        System.out.println(FirstHalf);
        System.out.println(" ");
        ArrayList<Integer> SecondHalf = new ArrayList<Integer>();
        for(int x=hello.size()/2;x<hello.size();x++){
            SecondHalf.add(hello.get(x));
        }
        System.out.println(SecondHalf);


    }
}