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
 
   
{

  long k=1;
  long j=1;
	
	while(j <= n)
	{
		k *= j;
		while(k%10 == 0)
			k = k/10;
		k = k%10;
		j++;
		
	}
	System.out.printf("   Ostatnia niezerowa cyfra silni to %d",k);
}
}
    
  }
