package Day4;
import java.util.Scanner;

public class ReadMultipleLinesUsingScanner {

    public static void main(String[] args) {
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Number of Lines");
        String[] inputOfStrings = new String[sc3.nextInt()];
        sc3.nextLine();
        
        for(int i = 0; i< inputOfStrings.length;i++) {
            inputOfStrings[i]= sc3.nextLine();
        }
        
        System.out.println("Your output is ");
        for(String s: inputOfStrings) {
            System.out.println(s);
        }
    }
}