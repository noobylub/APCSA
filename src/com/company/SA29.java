
package com.company;

import java.util.ArrayList;

class SA29{
    //recursive sum
    public int sum(int n, int sum){
        if(n==0){
            return sum;
        }
        return sum((n-1), (sum+=n));
    }
    //product
    public int prod(ArrayList<Integer> x, int product){
        if(x.size()==0){
            return product;
        }
        return x.remove(0)*prod(x,product);
    }
    //remove duplicate
    public String removeDup(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.substring(0,1).equals(s.substring(1,2)))
            return removeDup(s.substring(1));
        else
            return s.substring(0,1)+ removeDup(s.substring(1));

    }
    //power of recursively 
    public int powerOf(int x, int y){
        if(y<=1){
            return x;
        }
        return x*powerOf(x,(y-1));
    }
    //Modulus
    public int modulus(int x, int y){
        if(x-y<y){
            return x-y;
        }
        return modulus((x-y), y);
    }
    //Binary to decimal I think this is what you are asking us?
    public int bintoDec(int binary, int k){
        if(binary==0){
            return 0;
        }
        return (int)(binary%10*Math.pow(2,k)+bintoDec(binary/10,k+1));
    }
    public int z(ArrayList<Integer> myList){
        if(myList.size()<2){
            return 0;
        }
        else if(myList.get(0)+1==myList.get(1)){
            myList.remove(0);
            return 1+z(myList);
        }
        else{
            myList.remove(0);
            return z(myList);
        }
    }
    public int strCount(String str, String sub) {
        System.out.println(str.substring(0,sub.length()).equals(sub));
        if(str.length()==sub.length()){
            if(str==sub){
                return 1;
            }
            return 0;
        }
        if(str.substring(0,sub.length())==sub){
            return 1+ strCount(str.substring(1), sub);
        }
        return strCount(str.substring(1), sub);
    }


    public static void main(String[] args){
        String s = "Buddyy";
        SA29 method = new SA29();

        System.out.println(method.strCount("catcowcat", "cat"));

    }
}