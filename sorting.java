//bubble sort 
class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

//selection sort
class Solution {
    void selectionSort(int[] arr) {
        // code here
        
         for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}

//insertion sort
class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
}

//merge sort 
import java.util.*;
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int arr[],int start,int end){
        if(start >= end){
            return;
        }
        int mid = (start)+(end-start)/2;
        //left part
        mergeSort(arr,start,mid);
        //right part
        mergeSort(arr,mid+1,end);

        //merge both parts
        merge(arr,start,mid,end);
    }
    public void merge(int arr[],int start,int mid,int end){
        int temp[] = new int[end-start+1];
        int left = start;
        int right = mid+1;
        int k = 0;
        while(left <=mid && right <= end){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }else{
                temp[k++] = arr[right++];
            }
        }
        //remaining left part
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        //remaining right part
        while(right <= end){
            temp[k++] = arr[right++];
        }
        for(int i=0;i<temp.length;i++){
            arr[start+i] = temp[i];
        }
    }
}
//quick sort
class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high){
            return;
        }
        int pivotidx = partition(arr,low,high);
        quickSort(arr,low,pivotidx-1);
        quickSort(arr,pivotidx+1,high);
        
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        //last element
        int pivotidx = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivotidx){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivotidx;
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }
}
