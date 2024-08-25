import java.util.*;
public class Functions {
    public static void enterNumbers(){
        Scanner scanner = new Scanner(System.in);
        int post=0;
        int negt=0;
        while (true) {
            System.out.println("Choose 1 to Enter an number");
            System.out.println("Choose 2 to exit");
            int choice=scanner.nextInt();
            if (choice==1) {
                int number=scanner.nextInt();
                if(number>0){
                    post++;
                }
                else if(number<0){
                    negt++;
                }
            }
            else{
                System.out.println("Positive numbers entered: "+post);
                System.out.println("Negative numbers entered: "+negt);
                return;
            }
            scanner.close();
        }
        
    }
    public static void main(String[] args) {
        enterNumbers();
    }
}
