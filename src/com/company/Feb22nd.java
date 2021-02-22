package com.company;

import java.util.ArrayList;

class classwork{



    public ArrayList<String> sorting(ArrayList<String> str){
        for(int i=0;i<str.size();i++){
            int minIndex = i;
            //We are selectign everytime the lowest value out of all, and setting it to the latest one
            for(int j=i;j<str.size();j++){

                if(str.get(minIndex).length() > str.get(j).length()){
                    minIndex = j;
                }
            }
            //Then storing to the latest one
            String temporary = str.get(i);
            str.set(i, str.get(minIndex));
            str.set(minIndex, temporary);

        }
        return str;
    }
    public ArrayList<Integer> commonOne(int[] int1, int[] int2){
        ArrayList<Integer> hello = new ArrayList<>();
        for(int i=0;i<int1.length;i++){
            for(int j=0;j<int2.length;j++){
                if(int1[i]==int2[j]){
                    hello.add(int1[i]);
                }
            }
        }
        //Removing duplicates
        ArrayList<Integer> nonDuplicate = new ArrayList<>();
        for(int i=0;i<hello.size();i++){
            if(!nonDuplicate.contains(hello.get(i))){
                nonDuplicate.add(hello.get(i));
            }
        }
        return nonDuplicate;
    }
    public static void main (String[] args){
        ArrayList<String> h = new ArrayList<>();

        h.add("One");
        h.add("Three");
        h.add("Five");
        h.add("Supercalifragilisticexpialodocous");
        classwork method = new classwork();
        System.out.println(method.sorting(h));
        int[] g = {4,3,2,45};
        int[] j = {4,33,2,2,44};
        System.out.println(method.commonOne(g,j));
    }
    //ArrayList is different in the sense that the length can be changed, and you can add elements within it.
}