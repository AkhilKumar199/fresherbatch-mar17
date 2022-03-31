package Day4;
//T - Type
class GenericsClass<T> {



  T obj;
  
  void add(T obj) {
      this.obj = obj;
  }
  
  T get() {
      return obj;
  }
}



public class LetsUseThisGenericsClass {



  public static void main(String[] args) {
      GenericsClass<Integer> intObj = new GenericsClass<>();
      intObj.add(123);
      System.out.println(intObj.get());
      
      GenericsClass<String> strObj = new GenericsClass<>();
      strObj.add("ABC");
      System.out.println(strObj.get());
      
      GenericsClass<Double> douObj = new GenericsClass<>();
      douObj.add(123.4D);
      System.out.println(douObj.get());
  }
}