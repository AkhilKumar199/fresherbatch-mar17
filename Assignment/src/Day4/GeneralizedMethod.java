package Day4;
public class GeneralizedMethod {

	 

    public static void main(String[] args) {
        
        Integer[] intArr = {1,3,4,6,7,9,8,32,4};
        Character[] chArr = {'z','a','x','b','q'};
        
        System.out.println("Print Integer Array - ");
        printBothArrays(intArr);
        
        System.out.println("Print Character Array - ");
        printBothArrays(chArr);
    }
    
    //Elements - You have to declare that type - method sig 
    static <E> void printBothArrays(E[] elements) {
        
        for(E indiEle: elements) {
            System.out.print(indiEle + " ");
        }
        
        System.out.println();
    }
}