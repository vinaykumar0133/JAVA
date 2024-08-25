import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //solid rectangle
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <=4; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println("");
        // }
        // System.out.println("Enter First Number");
        // int r=sc.nextInt();
        // System.out.println("Enter First Number");
        // int c=sc.nextInt();
        //Hollow Rectangle
        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=cols;j++){
        //        if(i==1||j==1||i==rows||j==cols){
        //         System.out.print("*"+" ");
        //        } 
        //        else{
        //         System.out.print("  ");
        //        }
        //     }
        //     System.out.println();
        // }

        //Half pyramid
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         if(j<=i){
        //             System.out.print("*"+" ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Inverted Half pyramid
      //   int temp=1;
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //          System.out.print(temp+"  ");
        //          temp++;
        //     }
        //     System.out.println("  ");
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //          if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0){
        //             System.out.print(1+" ");
        //          }
        //          else{
        //             System.out.print(0+" ");
        //          }
        //     }
        //     System.out.println();
        // }

        int count=1;

        // for(int i=1;i<=n;i++){
        //     if(i<n/2){
        //          for(int k=1;k<=i;k++){
        //             System.out.print("*");
        //          }
        //          for(int k=1;k<=n-2*i;k++){
        //             System.out.print(" ");
        //          }
        //          for(int k=1;k<=i;k++){
        //             System.out.print("*");
        //          }

        //        System.out.println("  ");
        //         }
        //         else if(n/2<i-1){
        //             for(int k=1;k<=n-i+1;k++){
        //                 System.out.print("*");
        //              }
        //              for(int k=1;k<=2*count;k++){
        //                 System.out.print(" ");
        //              }
        //              for(int k=1;k<=n-i+1;k++){
        //                 System.out.print("*");
        //              }
        //              count++;
        //            System.out.println("  ");
        //         }
        //         else{
        //             for(int k=1;k<=n;k++){
        //                 System.out.print("*");
        //             }
        //             System.out.println();
        //         }
                
        // }

        for(int i=1;i<=n;i++){
            if(i<n/2){
                 for(int k=1;k<=i;k++){
                    System.out.print("*");
                 }
                 for(int k=1;k<=n-2*i;k++){
                    System.out.print(" ");
                 }
                 for(int k=1;k<=i;k++){
                    System.out.print("*");
                 }

               System.out.println("  ");
                }
                else if(n/2<i){
                    for(int k=1;k<=n-i+1;k++){
                        System.out.print("*");
                     }
                     for(int k=1;k<=2*count;k++){
                        System.out.print(" ");
                     }
                     for(int k=1;k<=n-i+1;k++){
                        System.out.print("*");
                     }
                     count++;
                   System.out.println("  ");
                }
                else{
                    for(int k=1;k<=n;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                
        }

        sc.close();
        
    }
}
