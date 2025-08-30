import java.util.*;

public class P2 {
    public static String determineGrade(int salary, int merit) {
        if (salary >= 500 && salary <= 649) {
            if (merit < 10) return "C";
            else if (merit >= 10 && merit < 20 && salary >= 600) return "B";
        } else if (salary >= 650 && salary <= 799) {
            if (salary >= 700 && merit >= 20) return "A";
        } else if (salary >= 700 && salary <= 899) {
            return "A";
        }
        return "Peasant";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary & Merit");
        int salary = sc.nextInt();
        int merit = sc.nextInt();
        System.out.println("Grade: " + determineGrade(salary, merit));
        sc.close();
    }
}
