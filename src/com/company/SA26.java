package com.company;

import sun.misc.GC;

import java.util.ArrayList;

class SA26{
    public ArrayList<ArrayList> method1(String str){

        ArrayList<ArrayList> toReturn = new ArrayList<>();
        //Splits the array first, the insert them into an arraylist
        String[] splitted = str.split("\\.");
        for(int i=0;i< splitted.length;i++){

            ArrayList<String> toPutInto = new ArrayList<>();
            //Splits up the words within and inserts them to array that is within another array lsit
            String[] finalSplit = splitted[i].split(" ");
            for(int j=0;j< finalSplit.length;j++){

                toPutInto.add(finalSplit[j]);
            }
            toReturn.add(toPutInto);

        }
        return toReturn;
    }
    public ArrayList<String> sorting (ArrayList<String> strArr){
        //Basically seleciton sort but with the first character of the array list
        for(int i=0;i<strArr.size();i++){
           int minIndex = i;
           for(int j=i;j<strArr.size();j++){
               if(strArr.get(minIndex).charAt(0)>strArr.get(j).charAt(0)){
                   minIndex = j;
               }

           }
            String temporary = strArr.get(i);
            strArr.set(i, strArr.get(minIndex));
            strArr.set(minIndex, temporary);

        }
        return strArr;
    }
    public ArrayList<Integer> frequency(ArrayList<Integer> intarr){
        ArrayList<Integer> toReturn = new ArrayList<>();
        //checks an element firts
        for(int i=0;i<intarr.size();i++){
            int element = intarr.get(i);
            int count = 0;
            //another iterations that counts the frequency, and add it to the array
            for(int j=0;j<intarr.size();j++){
                if(element == intarr.get(j)){
                    count++;
                }
            }
            toReturn.add(count);
        }
        return toReturn;
    }
    public double convertBinary(ArrayList<Boolean> bool){
        //method to get either 0 or 1
        double binary = 0;
        ArrayList<Integer> bin = new ArrayList<>();
        for(boolean x:bool){
            if(x==true){
                bin.add(1);
            }
            if(x==false){
                bin.add(0);
            }
        }
        System.out.println("The binary is:" + bin);
        //the the binary
        //Where I learned binary https://www.rapidtables.com/convert/number/binary-to-decimal.html
        //But basically iterate through and apply equation and add it into there
        for(int i=0;i<bin.size();i++){
            binary+=bin.get(i)*Math.pow(2, (bin.size()-1)-i);
        }
        return binary;
    }
    public double GCD(double x, double y){
        //Gets the GCD
        int GCD = -1;
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                GCD = i;
            }
        }
        return GCD;
    }
    public double multipleGCD(ArrayList<Double> helo){
        boolean keepgoing = true;
        while(keepgoing){
            if(helo.size()==1){
                keepgoing=false;
            }
            else{
                System.out.println(helo);
                helo.set(0, GCD(helo.get(0),helo.get(1)));
                helo.remove(1);
            }

        }
        return helo.get(0);

    }
    public static void main(String[] args){
        SA26 method = new SA26();
        System.out.println(method.method1("Hell is where.We do not want to go"));
        ArrayList<String> h = new ArrayList<>();
        h.add("Hello");
        h.add("Bot");
        h.add("Cought;");

        h.add("Ayy");
        System.out.println(method.sorting(h));

        ArrayList<Integer> y = new ArrayList<>();
        y.add(5);
        y.add(3);
        y.add(5);
        y.add(5);
        y.add(4);
        y.add(3);
        System.out.println(method.frequency(y));
        ArrayList<Boolean> x = new ArrayList<>();
        x.add(false);
        x.add(false);
        x.add(true);
        x.add(true);
        x.add(false);
        System.out.println( method.convertBinary(x));
        ArrayList<Double> k = new ArrayList<>();
        k.add(64.0);
        k.add(16.0);
        k.add(72.0);
        k.add(40.0);
        System.out.println(method.multipleGCD(k));



    }
}