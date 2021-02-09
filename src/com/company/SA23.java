package com.company;

class SA23{
    public String method1(char[][] TwoDarray){
        String str = "";
        for(char[]x:TwoDarray){
            for(char y:x){
                str+=y;
            }
        }
        return str;
    }
    public int[][] method2(int len){
        int keepCount = 1;
        int[][] TwoDArray = new int[len][];
        for(int x=0;x<TwoDArray.length;x++){
            int[] OneDArray = new int[x];
            for(int y=0;y<OneDArray.length;y++){
                OneDArray[y] = keepCount;
                keepCount++;

            }
            TwoDArray[x] = OneDArray;
        }
        return TwoDArray;
    }

    public static void main(String[] args){

        SA23 methods = new SA23();
        for(int x[]:methods.method2(4)){
            System.out.println(" ");
            for(int y:x){
                System.out.print(y);
            }
        }
    }
}