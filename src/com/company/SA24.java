package com.company;

import java.util.ArrayList;

class SA24MAIN{
    public ArrayList method1(ArrayList<Character> array){
        System.out.println(array);
        for(int i=0;i< array.size();i+=2){
            System.out.print(i);
            array.remove(i);
        }
        return array;
    }
    public ArrayList method2(ArrayList<String> array){
        ArrayList<String> ToReturn = new ArrayList<String>();
        for(int i=array.size()-1;i>=0;i--){
            ToReturn.add(array.get(i));
        }
        return ToReturn;
    }
    public ArrayList method3(ArrayList<Double> array){
        for(int i=0;i<array.size();i++){
            array.set(i, array.get(i)*2);
        }
        return array;
    }
    public ArrayList method4(int max){
        ArrayList<Character> toReturn = new ArrayList<Character>();
        char content = 'a';
        toReturn.add(content);
        for(int x=1;x<max;x++){
            content++;
            if(x%2==0){
                toReturn.add(0,content);
            }
            else if(x%2!=0){
                toReturn.add(content);
            }
        }
        return toReturn;
    }
    public static void main(String[] args){
        SA24MAIN methods = new SA24MAIN();
        ArrayList<Character> charo = new ArrayList<Character>();
        charo.add('1');
        charo.add('2');
        charo.add('3');
        charo.add('4');
        charo.add('5');
        charo.add('6');

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