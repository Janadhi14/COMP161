public class Fibonacci{

  public static void main(String[] args){
  fib(377);

  }
public static String fib(int x){
  int a = 1;
  int b = 1;
  int c = 0;
  
  System.out.println("1");
  System.out.println("1");
  while(c < x){
    c = a + b;
    b = a;
    a = c;
  }
    System.out.println(c);
  }
  return ("done");
}

}a