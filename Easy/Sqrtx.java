class Sqrtx{
    
    public static int mySqrt(int x){
        System.out.println(x);
        if(x <= 1){
            return x;
        }
        
        long start = 2;
        while(start * start < x && start <= x/2.0){
            start++;
        }

        if(start * start == x){
            return (int)start;
        }else{
            return (int)--start;
        }
    }

    public static void main(String[] args){
        int result = 0;
        if((result = mySqrt(4)) == 2){
            System.out.println("Testcase 1 Passed (x=4, r=2)\n");
        }else{
            System.out.println("Testcase 1 Failed (x=4, r=2)\n" + result + " was returned\n");
        }

        if((result = mySqrt(8)) == 2){
            System.out.println("Testcase 2 Passed (x=8, r=2)\n");
        }else{
            System.out.println("Testcase 2 Failed (x=8, r=2)\n" + result + " was returned\n");
        }

        if((result = mySqrt(5)) == 2){
            System.out.println("Testcase 3 Passed (x=5, r=2)\n");
        }else{
            System.out.println("Testcase 3 Failed (x=5, r=2)\n" + result + " was returned\n");
        }

        if((result = mySqrt(2147483647)) == 46340){
            System.out.println("Testcase 4 Passed (x=2147483647, r=46340)\n");
        }else{
            System.out.println("Testcase 1 Failed (x=2147483647, r=46340)\n" + result + " was returned\n");
        }
    }
}