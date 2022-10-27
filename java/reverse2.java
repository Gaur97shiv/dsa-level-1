import java.util.*;
class reverse2
{
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int dig = 0;
      int y = n;
      while(y !=0){
        y = y / 10 ;
        dig++;
        }
        int div = (int)Math.pow(10, dig-1);
        while (div != 0){
          int x = n/div ;
          System.out.println(x);
          n = n%div ;
          div = div/10 ;
        }
      

      
  }
 }