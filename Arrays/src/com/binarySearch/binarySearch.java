package com.binarySearch;



	public class binarySearch {
		

		    public static  void main(String[] args){


		        int[] arr = {3,6,9,13,15};
		        int key = 12;
		        int arrlength = arr.length;
		        binarySearch(arr,0,key,arrlength);
		    }

		private static void binarySearch(int[] arr, int i, int key, int arrlength) {
				// TODO Auto-generated method stub
				
			

		
		        int length = 0;
				int start = 0;
				
		        		int midValue1 = (start+length)/2;
		        while(start<=length){

		            if(arr[midValue1]<key){

		                start = midValue1 + 1;
		            } else if(arr[midValue1]==key){
		                System.out.println("Element is found at index :"+midValue1);
		                break;
		            }else {

		                length=midValue1-1;
		            }
		            midValue1 = (start+length)/2;
		        }
		            if(start>length){

		                System.out.println("Element is not found");
		            }

		}

		



}
