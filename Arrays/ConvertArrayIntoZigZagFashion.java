
/*
Amazon
source url :https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1/?category[]=Arrays&company[]=Amazon&page=2&query=category[]Arrayscompany[]Amazonpage2

problem statement:
Given an array Arr (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion. The converted array should be in form a < b > c < d > e < f. The relative order of elements is same in the output i.e you have to iterate on the original array only.

Example 1:

Input:
N = 7
Arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1
Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1


Input:
N = 4
Arr[] = {1, 4, 3, 2}
Output: 1 4 2 3
Explanation: 1 < 4 > 2 < 3

*/
import java.util.Arrays;  

class zigZagArray{
static int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};
public static void main(String args[]){
//int[] arr={4, 3, 7, 8, 6, 2, 1};

zigzag();

System.out.println(Arrays.toString(arr));

	}

public static void zigzag(){

Boolean flag=true;//flag for flp flop
int temp=0;
for(int i=0;i<arr.length-1;i++){

if(flag){

if(arr[i]>arr[i+1]){
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}

}
else{

if(arr[i]<arr[i+1]){
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}

}
flag=!flag; //flip flop

}



}

}

















