package SORTING;

public class Recursion {
    // public static int Sum(int[] arr,int index){
    //     if(index == arr.length){
    //         return 0;
    //     }
    //     int sum=arr[index];
    //     sum+=Sum(arr, index+1);
    //     return sum;

    // }
    // public static int Factorial(int n){
    //     if(n<=0){
    //         return 1;
    //     }
    //     return n*Factorial(n-1);
    // }
    public static void Fibonacci(int n,int a,int b){
        if(n==10){
            return;
        }
        int fib=a+b;
        System.out.println(fib);
        Fibonacci(n+1,b,fib);  
    }

    public static int CalPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n%2==0){
            return CalPow(x,n/2)*CalPow(x,n/2);
        }
        else{
            return CalPow(x,n/2)*CalPow(x,n/2)*x;
        }
        
    }

    public static void Hanoi(int n,String S,String H,String D){
        if(n==1){
            System.out.println("Move disk 1 from rod "+S+" to rod "+D);
            return;
        }
        Hanoi(n-1,S,D,H);
        System.out.println("Move disk "+n+" from rod "+S+" to rod "+D);
        Hanoi(n-1,H,S,D);
        
    }


    public static String Fun(String str){
        if(str.length()==1){
            return str;
        }
        return Fun(str.substring(1))+Character.toString(str.charAt(0));
        
    }
    public static void main(String args[]){
        int[] arr = {5, 2, 8, 1, 9};
        // System.out.println(Sum(arr, 0));
        // System.out.println(Factorial(10));
        // Fibonacci(0, 0, 1);
        // System.out.println(CalPow(2,5));
        // Hanoi(3,"A","B","C");
        System.out.println(Fun("Vinay Kumar"));
        
        
    }
}
