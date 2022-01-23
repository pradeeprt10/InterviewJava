package JavaUtil;

public class MyBinarySearch {
	
	public static int binarySc(int[] arr, int first,int last,int key) {
		if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySc(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySc(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;
		}	
		

	public static void main(String[] args) {
	int[] input = {10,20,40,50,55,99};
	int pos = binarySc(input,0,input.length-1,99);
	
	if(pos==-1) {
		System.out.println("Not found");	
	}
	else {
		System.out.println("found at position "+(pos+1));	
	}
	

	}

}
