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
    public int[][] method3(int[][] TwoDArray){
        int[][] Other2DArray = new int[TwoDArray.length][];
        for(int x=0;x<Other2DArray.length;x++){
            int[] array = new int[x*2];
            for(int y=0;y<array.length;y++){
                if(y%2!=0){
                    array[y] =0;
                }
                else if(y%2==0){
                    array[y]= TwoDArray[x][y/2];
                }
            }
            Other2DArray[x] = array;
        }
        return Other2DArray;
    }
    public int[] method4(int[][] TwoDArray){
        int[] h = new int[TwoDArray.length];
        for(int x=0;x< TwoDArray.length;x++){
            int sum = 0;
            for(int y=0;y< TwoDArray[x].length;y++){
                sum+=TwoDArray[y][x];
            }
            h[x] = sum;
        }
        return h;
    }

    public static void main(String[] args){
    SA23 n = new SA23();
    int[][] h = {{4,5,6},{4,3,4}};
    int[] hk = n.method4(h);
        for(int x:hk){
            System.out.println(x);
        }
    }
}