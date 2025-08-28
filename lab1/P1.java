import java.util.*;
public class P1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (A) for Action, (C) for Comedy, (D) for Drama");
        char input = sc.next().charAt(0);
        switch(input){
            case 'A':
            case 'a':
                System.out.println("Action movie Fan");
                break;
            case 'C':
            case 'c':
                System.out.println("Comedy movie Fan");
                break;
            case 'D':
            case 'd':
                System.out.println("Drama movie Fan");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        sc.close();
    }
}