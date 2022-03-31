package Day4;
import java.util.ArrayList;
import java.util.List;

 

public class GenericsForCollections {
    
    public static void main(String[] args) {
        
        //With Generics
        //Angular Bracket/Diamond Operator
        List<Integer> listInt = new ArrayList<>();
        //listInt.add("123");
        listInt.add(123);
        //TypeCasting - not required
        int a1 = listInt.get(0); 
        //Type Safety is there
        System.out.println(a1);
        
        
        
        //Without Generics
        List listInt2 = new ArrayList();
        //listInt.add("123");
        listInt2.add(1234);listInt2.add("ABC");
        
        int a = (int) listInt2.get(0); //TypeCasting
        System.out.println(a);
    }

 

}