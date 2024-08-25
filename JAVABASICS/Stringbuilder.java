public class Stringbuilder {
    public static void main(String[] args) {

        //Reverse of String
        // StringBuilder sb=new StringBuilder("vinaykumar");
        
        // for(int i=0;i<=sb.length()/2;i++){
        //     int first=i;
        //     int last=sb.length()-i-1;

        //     char firstchar=sb.charAt(first);
        //     char lastchar=sb.charAt(last);

        //     sb.setCharAt(first, lastchar);
        //     sb.setCharAt(last, firstchar);
        // }

        // System.out.println("Reverse of String is "+ sb);

        //All methods for stringbuilder
        //Below are methods we can use to check if a character is present in a given string or not

        //Method 1
        String str = "Hello, world!";
        char ch = 'w';

        boolean containsChar = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                containsChar = true;
                break;
            }
        }

        System.out.println("Contains character: " + containsChar);

        //Method 2
        // String str = "Hello, world!";
        // char ch = 'w';

        // Use indexOf to check if the character is present
        // boolean containsChar1 = str.indexOf(ch) != -1;

        System.out.println("Contains character: " + containsChar);

        //
        // String str = "Hello, world!";
        // char ch = 'w';
        
        // Convert the character to a string and use contains
        // boolean containsChar2 = str.contains(Character.toString(ch));

        System.out.println("Contains character: " + containsChar);
        
        


    }
}
