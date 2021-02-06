package com.company;

class SA21{
    public int[][] numberOne(int n){
        //initialize two d array
        int[][] twoDarray = new int[n][n];
        //for the numbers within the 2d array
        int no = 1;
        for(int x=0;x<twoDarray.length;x++){

            //putting the numbers  within each one
            for(int j=0;j<twoDarray[x].length;j++){

                twoDarray[x][j] = no++;
            }
        }
        return twoDarray;
    }
    public int max2D(int[][] twoDarray){
        //the maximum
        int max = twoDarray[0][0];
        for(int[]x:twoDarray){
            for(int j:x){
                if(j>max){
                    max=j;
                }
            }
        }
        return max;
    }
    public int sum2D(int[][] twoDarray){
        //the sum of all
        int sum =0;
        //iterate to sum all
        for(int[]x:twoDarray){
            for(int j:x){
                sum+=j;
            }
        }
        return  sum;
    }
    public int[] sumRow(int[][] twoDarray){
        int[] sumRow = new int[twoDarray.length];
        for(int x=0;x< twoDarray.length;x++){
            int oneSum = 0;
            for(int j=0;j<twoDarray[x].length;j++){
                oneSum += twoDarray[x][j];

            }
            sumRow[x] = oneSum;
        }
        return sumRow;
    }




    public static void main(String[] args){
        SA21 methods = new SA21();
        int[][] x = methods.numberOne(2);
        for(int[]y:x){
            System.out.println(" ");
            for(int print:y){

                System.out.print(print + " ");
            }
        }
        System.out.println();
        System.out.println(methods.max2D(x));

        for(int r:methods.sumRow(x)){
            System.out.print(r);
        }


    }
}