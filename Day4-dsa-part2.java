class Main {
    public static void main(String[] args) {
        //for loop
        // for(int i=1;i<=5;i++){
        //     System.out.println(i + " ");
        // }
        
        //while loop
        int i=1;
        while(i<=10){
            if(i%2 ==0){
              System.out.println(i + " ");   
            }
            i++;
        }
        
        //do while loop
        // int i=1;
        // do{
        //     System.out.println(i + " ");
        //     i++;
        // }while(i<=5);
        
        
    }
}



public class Main {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); 
    }
    public static void main(String[] args) {
        //int n = 5;
        // System.out.println(factorial(n));
        int num = 5789;
        while(num > 0){
            int digit = num%10;
            System.out.println(digit);
            //int sum = sum+digit;
            num = num/10;
        }
    }
}
