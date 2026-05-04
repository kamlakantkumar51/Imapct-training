
class Main {
    public static void main(String[] args) {
        
        // System.out.print(2+'A');
        // System.out.println();
        // System.out.println(2+2.2);
        //REVISING THE CONCEPT OF VARIABLES AND DATA TYPE

        int a = 10;
        char b  = 'a';
        boolean c = true;
        float f = 123.231f;
        double d = 123.123;
        String s = "asus tuf";
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        
        // System.out.println(1+1);
        // System.out.println('a'+1);
        // System.out.println('a'+1+"a"+123);
        // System.out.println('a'+1+"a"+true);
        
        //error : cant add boolean
        // System.out.println(true+false);
        // System.out.println(true + "false");

        //increment......decrement operator...
        int n = 5;
        //pre increment
        System.out.println(n);
        System.out.println(n++);
        System.out.println(n);

        //post increment
        System.out.println(n);
        System.out.println(++n);
        System.out.println(n);

        //pre decrement
        System.out.println(n);
        System.out.println(n--);
        System.out.println(n);

        //post decrement
        System.out.println(n);
        System.out.println(--n);
        System.out.println(n);


        //WAP TO FIND THE MINIMUM OF THREE NUMBER BY USING CONDITIONAL OPERATOR
        
class Main {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        int n3 = 8;
        // if(n2 > n1 && n3 > n1){
        //     System.out.println(n1);
        // }
        
        int min = (n1<n2)?(n1<n3 ? n1:n3):(n2<n3?n2:n3);
        System.out.println(min);
    }
}
        
    }
}
