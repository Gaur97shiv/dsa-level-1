import java.util.*;
class trapti
{
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x ;
      do
      {
        int marks = sc.nextInt();

      if(marks>90){
        System.out.println("exellent");

      }else if(marks>80){
      System.out.println("very gud");

      }else if(marks>70){
        System.out.println("good");

      }
      else{
        System.out.println("fail");
      }
      System.out.println("continue (yes(1) otherwise no(0))");
      x = sc.nextInt();
    } 
    while(x == 1);    

      

     }
}