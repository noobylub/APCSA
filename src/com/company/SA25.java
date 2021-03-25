package com.company;



import java.lang.reflect.Array;
import java.util.ArrayList;

class SA25{

    public ArrayList fibonacci(int len){
        ArrayList<Integer> returnArray = new ArrayList<>();
        //Three numbers that will be added
        int n=0;
        int x=1;
        int y=0;
        for(int xy =0;xy<len;xy++){
            returnArray.add(n);
            n=x+y;
            x=y;
            y=n;
        }
        return returnArray;
    }
    public ArrayList reversed(ArrayList<Double> aray){

        for(int i=aray.size()-1;i>=0;i--){
            //iterate backwards and add then remove at the same time
            aray.add(aray.get(i));
            aray.remove(i);
        }
        return aray;
    }
    public void sortBetween(ArrayList<Double> aray){
        ArrayList<Double> Positives = new ArrayList<>();
        ArrayList<Double> Negatives = new ArrayList<>();
        //if positive addd to the positive array if negative add to the negative array
        for(int x=0;x<aray.size();x++){
            if(aray.get(x)>=0){
                Positives.add(aray.get(x));
            }
            else if(aray.get(x)<0){
                Negatives.add(aray.get(x));
            }
        }
        System.out.println(Positives);
        System.out.println(Negatives);
    }
    public ArrayList posneg(ArrayList<Double> aray){
        //if positive add the pos to new array if negative the add neg to the array
        ArrayList<String> toReturn = new ArrayList<>();
        for(int i=0;i<aray.size();i++){
            if(aray.get(i)>=0){
                toReturn.add("Pos");
            }
            else if (aray.get(i)<0){
                toReturn.add("Neg");
            }

        }
        return toReturn;
    }
    public ArrayList minimum(ArrayList<Double> arrayToSort ){
        ArrayList<Double> sorted = new ArrayList<>();
        double min = arrayToSort.get(0);
        for(int x=0;x<arrayToSort.size();x++){
            for(int y=x+1;x<arrayToSort.size();y++){
                
            }
        }
        return sorted;
    }


    public static void main(String[] args){
        //All for testign
        SA25 methods = new SA25();
        System.out.println(methods.fibonacci(8));
        ArrayList<Double> hello = new ArrayList<>();
        hello.add(45.5);
        hello.add(456.32);
        hello.add(-3.54);
        hello.add(43.2);
        System.out.println(methods.reversed(hello));
        System.out.println(methods.minimum(hello));
    }
}