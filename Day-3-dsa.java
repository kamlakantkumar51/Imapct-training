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
