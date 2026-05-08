class Main {
    public static void main(String[] args) {
        int n = 4;
        //square pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //triangle pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //inversion triangle
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("number triangle pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              System.out.print(j+" ");   
            }
            System.out.println();
        }
        
     
        System.out.println("floyd's triangle pattern");
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
        //1
        //3 5
        //7 9 11
        //13 15 17 19
          System.out.println("triangle pattern");
        // int num = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        
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

        //write a java method to calculate the volume of the cuboid
        //with arg with return type
        //with arg with no return type
        //no args with return type
        //no areg with no return type
        
        int l = 5;
        int b = 10;
        int h = 20;
        int ans = l * b* h;
        System.out.println("volume of the cuboid = "+ans);
        
    }
}
