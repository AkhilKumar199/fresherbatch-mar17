package Day4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//text - parse - file - input stream
public class ScannerAPIInJava {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("C:\\Users\\HomeServer\\Desktop\\Akhil Capgemini\\Practise programs\\Day4\\AssertionExample.txt"));
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        
        String s2 = "Scanner - which can read anything";
        Scanner sc2 = new Scanner(s2);
        
        System.out.println(sc2.hasNext());
        System.out.println(sc2.nextLine());
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please enter your name, age and salary?");
        String name = sc3.next();
        System.out.println("Name is " + name);
        int age = sc3.nextInt();
        System.out.println("Age is " + age);
        double salary = sc3.nextDouble();
        System.out.println("Salary is " + salary);
        sc.close();
        sc2.close();
        sc3.close();
    }

 

}