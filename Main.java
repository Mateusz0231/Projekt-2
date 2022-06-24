import java.util.Scanner;
class Main {
  public static long silnia(int n)
  {
    long s=1;
    
    for(int i=1;i<=n;i++)
    {
      s=s*i;
    }
    return s;
    
  }
  public static void main(String[] ) {
   System.out.println("Podaj dodatnią liczbę całkowitą");
    Scanner skaner = new Scanner(System.in);
    int n= skaner.nextInt();
    System.out.printf("Silnia z %d wynosi %d",n,silnia(n));
    
   
  }
}