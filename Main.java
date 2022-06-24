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
  public static void main(String[] args) {
   System.out.println("Podaj dodatnią liczbę całkowitą");
    Scanner skaner = new Scanner(System.in);
    int n= skaner.nextInt();
    System.out.printf("Silnia z %d wynosi %d",n,silnia(n));
    

    //Wyznaczenie silni działa prawidłowo do 20 
 //Poniżej jest program na wyszukanie wartości który niestety nie zadziałał
    
   // Scanner a =new Scanner(System.in);
   //int t = a.nextInt();
  
   // for (int i = 0; i<t; i++) {
       
        //Scanner b = new Scanner(System.in);
        // int liczba = a.nextInt();
      
        // s = obliczSilnia(liczba);
 
        
       // while (silnia/10*10==silnia) {
      //      silnia /= 10;
       // }
 
        
 //       System.out.println(silnia%10);
  //  }
 
    
    
  }
}