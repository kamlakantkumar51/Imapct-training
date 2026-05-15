//fibonacci
class Main {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        for(int i=1;i<=n;i++){
            System.out.print(a+ " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
//reverse
class Main {
    public static void main(String[] args) {
        int n = 1234;
        int digit=0;
        while(n >0){
            int rem = n%10;
            digit = digit*10+rem;
            n = n/10;
        }
        System.out.println(digit+" ");
    }
}

//palindrome
class Main {
    public static void main(String[] args) {
        int n = 124;
        int original = n;
        int digit=0;
        while(n >0){
            int rem = n%10;
            digit = digit*10+rem;
            n = n/10;
        }
        System.out.println(digit+" ");
        
        if(original == digit){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
//factorial
class Main {
    public static void main(String[] args) {
        int fact = 1;
        int n = 5;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
