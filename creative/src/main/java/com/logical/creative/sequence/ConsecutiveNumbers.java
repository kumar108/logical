package com.logical.creative.sequence;

public class ConsecutiveNumbers {
    long length;
    public static void main(String[] args) {

        int n=8;
        for(int i=2;i<=n;i++)
        {
            int count=0;
            for (int j=1;j<=i;j++){
               count=count*10+i;
            }
            System.out.println(count+",");
        }

    }
}
