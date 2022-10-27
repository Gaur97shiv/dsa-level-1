import java.util.*;
public class loop{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input ;
        do
        {
          int marks = sc.nextInt();
          if(marks>=90 && marks <=100 ){
          System.out.println("1st division");
          }
           else if(marks>=60 && marks<90){
            System.out.println("2nd division");
           }
           else if(marks>=35 && marks<60){
            System.out.println("3rd division");
           }
           else {
           System.out.println("fail");
           }
           System.out.println("want to continue (yes(1) or no(o))");
           input = sc.nextInt();
          
         } while(input == 1);
        } 
        
        } 
