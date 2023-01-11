import java.util.*;

public class project {

    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        int cal;
        int quotient;
        int remainder;

        System.out.println("enter 2 number");
        Scanner r = new Scanner(System.in);
        System.out.println("enter first number:");
        n1 = r.nextInt();
        System.out.println("eneter second number");
        n2 = r.nextInt();
        System.out.println("select operator");

        System.out.println("1 - Add");
        System.out.println("2 - Substract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
      
       
        System.out.println("eneter operation number");
        Scanner s = new Scanner(System.in);
        n3 = s.nextInt();


        if(n3==1){
            cal = n1+n2;
            System.out.println("sum of two numbers"+ cal);

        }else if(n3==2){
            cal = n1-n2;
            System.out.println("Diffrence of two numbers"+cal);

        }else if(n3==3){
            cal = n1*n2;
            System.out.println("product of numbers:"+cal);
        }else if(n3==4){
            quotient=n1/n2;
            remainder=n1%n2;
            System.out.println("quotent of two numbers"+quotient);
            System.out.println("Remainder of two numbers"+remainder);
        }

        
    }
    
}
