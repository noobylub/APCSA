package com.company;
import java.util.ArrayList;

class ArrayListAlgorithm{
    public int ArraySeach(ArrayList<String> array, String compare){
       for(int x=0;x<array.size();x++){
           if(array.get(x)==compare){
               return x;
           }
       }
       return -1;
    }
    public ArrayList<Integer> SelectionSort(ArrayList<Integer> array){
        //Sort array by continuously looking for the minimum value
        //After you find the minimum then you swap the
        //Why array length to -1, because it must already be sorted correctly
        for(int i=0;i<array.size()-1;i++){
            //Sets the minimum index the minimum value
            int minIndex = i;
            //Then iterate thorugh the element AFTER the previously iterated
            for(int j=i+1;j<array.size();j++){
                //If the element is smaller, then set it as the minimum index
                if(array.get(minIndex)>array.get(j)) {
                    minIndex = j;
                }
            }
            //Then set it to the latest element there
            int temporary = array.get(i);
            array.set(i, array.get(minIndex));
            //This is basically moving the element
            array.set(minIndex,temporary);
        }
        return array;
    }
    public int[] sortArray(int[] array){
        for(int x=0;x<array.length;x++){
            int minIndex = x;
            for(int j=x+1;j<array.length;j++){
                if(array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            int temporary = array[x];
            //Sets it into the latest addition
            array[x] = array[minIndex];
            array[minIndex] = temporary;
            array[minIndex] = temporary;
        }
        return array;
    }
    public static void main(String[] args){
        ArrayList<Integer> hello = new ArrayList<>();
        hello.add(56);
        hello.add(45);
        hello.add(34);
        hello.add(34);
        ArrayListAlgorithm methods = new ArrayListAlgorithm();
        System.out.println(methods.SelectionSort(hello));
        ArrayList<String> buncofStrings = new ArrayList<>();
        buncofStrings.add("Hello");
        buncofStrings.add("There");
        buncofStrings.add("Friends");
        System.out.println(methods.ArraySeach(buncofStrings,"Hello"));
    }
}