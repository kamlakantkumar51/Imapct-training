class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ "");
        }
        //wap to find the sum of all array element
        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print("The sum of all array elment = "+sum);
    }
}
