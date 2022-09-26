package com.reverseSum;

import java.util.Scanner;

public class EvenSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, odd = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num of row");
		int m=sc.nextInt();
		System.out.println("Enter num of col");
		int c=sc.nextInt();
		System.out.println("total number of row "+ m);
		System.out.println("total number of column "+ c);
		System.out.println("total"+ (c*m));
		int[][] arr= new int[m][c];


		for(int i=0;i<m;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();

			
		}
		
		for(int i=0;i<m;i++) {
			int count=0;
			for(int j=0;j<c;j++) {
			   if(arr[j][i]%2==0) {
				   count++;
//				
				}
				
			}
			System.out.println("the count is "+ count);
		}
		
	}

}
