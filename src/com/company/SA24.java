package com.company;

import java.util.ArrayList;

class SA24MAIN{
    public ArrayList method1(ArrayList<Character> array){
        //I dont get this, for some reason the max is lower, I dont know why
        // and the counte is not adding by 2
        for(int i=0;i<array.size();i+=2){
            array.remove(i);
        }
        return array;
    }
    public ArrayList method2(ArrayList<String> array){
        //create new arraylist 
        ArrayList<String> ToReturn = new ArrayList<String>();
        //iterate backward and put it into new array
        for(int i=array.size()-1;i>=0;i--){
            ToReturn.add(array.get(i));
        }
        return ToReturn;
    }
    public ArrayList method3(ArrayList<Double> array){
        for(int i=0;i<array.size();i++){
            //iterate through and multiply each one 
            array.set(i, array.get(i)*2);
        }
        return array;
    }
    public ArrayList method4(int max){
        ArrayList<Character> toReturn = new ArrayList<Character>();
        //add the first letter 
        char content = 'a';
        toReturn.add(content);
        for(int x=1;x<max;x++){
            //then if divisible by 2 add in the beggining 
            content++;
            if(x%2==0){
                toReturn.add(0,content);
            }
            //if not add in the end
            else if(x%2!=0){
                toReturn.add(content);
            }
        }
        return toReturn;
    }
    public static void main(String[] args){
        //all just testing
        SA24MAIN methods = new SA24MAIN();
        ArrayList<Character> charo = new ArrayList<Character>();
        charo.add('a');
        charo.add('b');
        charo.add('c');
        charo.add('d');
        charo.add('e');

        System.out.println(methods.method1(charo));
        System.out.println(" ");
        System.out.println(" ");
        ArrayList<String> stringo = new ArrayList<String>();
        stringo.add("Hello1");
        stringo.add("Hello2");
        stringo.add("Hello3");
        stringo.add("Hello4");
        stringo.add("Hello5");
        stringo.add("Hello6");
        System.out.println(methods.method2(stringo));
        ArrayList<Double> dobel = new ArrayList<Double>();
        dobel.add(65.2);
        dobel.add(54.2);
        dobel.add(5.2);
        dobel.add(452.2);
        dobel.add(443.2);
        dobel.add(45.32);
        System.out.println(methods.method3(dobel));

        System.out.println();
        System.out.println(methods.method4(6));
    }
}
