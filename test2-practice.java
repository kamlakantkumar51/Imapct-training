import java.util.*;
//1d array traversal
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//array size
        int arr[] = new int[n];
        
        int sum = 0;
        //take array element from the user
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //print
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            System.out.println(arr[i]+"");
        }
        System.out.println("sum of all elements in an array  = "+sum);


        //find largest element from an array
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("largest element from an array = "+max);
    }
}
//2d array
import java.util.*;
public class twoDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int sum = 0;
        int arr[][] = new int[rows][cols];

        //taking input from the user
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // //print
        //  for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         sum += arr[i][j];
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("sum of all elements in an array = "+sum);


        // //transpose of a matrix
        // for(int i=0;i<cols;i++){
        //     for(int j=0;j<rows;j++){
        //         System.out.print(arr[j][i] + " ");
        //     }
        //     System.out.println();
        // }
        //90 degree rotation
        //1:transpose the matrix
        for(int i=0;i<rows;i++){
            for(int j=i+1;j<cols;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //2:reverse the matrix
        for(int i=0;i<arr.length;i++){
            int start = 0;
            int end = arr.length-1;
            while(start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        //spiral matrix

        
    }
}

//spiral-matrix
import java.util.*;

public class spiral {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // User Input
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        System.out.println("Spiral Order:");

        while(top <= bottom && left <= right) {

            // Step 1: Left → Right
            for(int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Step 2: Top → Bottom
            for(int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Step 3: Right → Left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Step 4: Bottom → Top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
