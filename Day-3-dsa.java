class Main {
    public static boolean linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // wap to sum of all array element
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of all array element = " + sum);
        // search element
        if(linearSearch(arr, 40)){
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
    }
}
// class Main {
//     public static void main(String[] args) {
//         //2d array print
//         //wap to sum of all elemnts in an matrix
//         int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
//         for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
