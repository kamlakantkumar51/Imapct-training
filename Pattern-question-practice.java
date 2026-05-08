import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Pattern question practice:");
        
        //square pattern
        System.out.println("square pattern");
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Triangle pattern");
        //triangle pattern
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //reverse triangle
        System.out.println("Reverse triangle pattern");
        for(int i = n;i>=1;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //number triangle
        System.out.println("number triangle pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              System.out.print(j+" ");   
            }
            System.out.println();
        }
        
        //Reverse number triangle pattern
        System.out.println("Reverse triangle pattern");
        for(int i = n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " " );
            }
            System.out.println();
        }
        //floyds triangle
        System.out.println("floyd's triangle pattern");
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        //(0,1)triangle
        System.out.println("0-1 triangle pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) %2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        //butterfly pattern
        System.out.println("Butter-fly-pattern");
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    for(int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
    }
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
for(int i = n; i >= 1; i--) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    for(int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
    }
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

//I will have to practice also
//solid rhombus
//PYRAMID PATTERN
//DIAMOND PATTERN
//
    }
}
