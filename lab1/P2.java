import java.util.*;
public class P2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary & Merit");
        int salary = sc.nextInt(); 
        int merit = sc.nextInt(); 
        if (salary >= 500 && salary <= 649){
            if (merit < 10){
                System.out.println("Grade: C");
            }
            else if (merit >= 10 && merit < 20 && salary >= 600){
                System.out.println("Grade: B");
            }
        } else if (salary >= 650 && salary <= 799){
            if(salary >= 700 && merit >=20){
                System.out.println("Grade: A");
            }
        } else if (salary >= 700 && salary <= 899){
            System.out.println("Grade: A");
        }
        else {
            System.out.println("Peasant");
        }
        sc.close();
    }
}