package com.company;

class SA23{
    public String method1(char[][] TwoDarray){
        //Basically ad onto an empty string
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
        //Create two d array
        int[][] TwoDArray = new int[len+1][];

        for(int x=0;x<TwoDArray.length;x++){
            //Then create a 1d array then add on to the 2d array
            int[] OneDArray = new int[x];
            for(int y=0;y<OneDArray.length;y++){
                //put the values of keepcount into the 1d array
                OneDArray[y] = keepCount;
                keepCount++;

            }
            //then put into two d array
            TwoDArray[x] = OneDArray;
        }
        return TwoDArray;
    }
    public int[][] method3(int[][] TwoDArray){
        int[][] Other2DArray = new int[TwoDArray.length][];

        for(int x=0;x<Other2DArray.length;x++){

            int[] array = new int[TwoDArray[x].length*2];

            for(int y=0;y<array.length;y++){
                //if iteration is divisible by 2 then add a 0
                if(y%2!=0){
                    array[y] =0;
                }
                //if not then add the values by dividing it by two
                else if(y%2==0){
                    array[y]= TwoDArray[x][y/2];
                }
            }
            Other2DArray[x] = array;
        }
        return Other2DArray;
    }
    //Below asumes that it is a sqaure
    public int[] method4(int[][] TwoDArray){
        int[] h = new int[TwoDArray.length];
        for(int x=0;x< TwoDArray.length;x++){
            int sum = 0;
            for(int y=0;y< TwoDArray[x].length;y++){
                //column major traversal here
                sum+=TwoDArray[y][x];
            }
            h[x] = sum;
        }
        return h;
    }

    public static void main(String[] args){
    SA23 method = new SA23();
    int[][] h = {{4,5,6},{4,3,4},{4,5,3}};
    char[][] characters = {{'h','e','l'}, {'p',','}};

        System.out.println(method.method1(characters));
        for(int[] x:method.method2(4)){
            System.out.println(" ");
            for(int y:x){
                System.out.print(y);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        int[][] xt = {{4,3,5}, {4,3,4}};
        for(int[] x:method.method3(xt)){
            System.out.println(" ");
            for(int y:x){
                System.out.print(y);
            }
        }


        System.out.println(" ");
        System.out.println(" ");
    int[] hk = method.method4(h);
        for(int x:hk){
            System.out.print(x);
        }
    }
}