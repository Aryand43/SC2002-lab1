import java.util.*;
public class P3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double convert = 1.82;
        System.out.println("Enter start, end and increment values");
        int start = sc.nextInt(); 
        int end = sc.nextInt(); 
        int inc = sc.nextInt(); 
        if(start > end || inc <= 0){
            System.out.println("Error input!");
            return; 
        }
        System.out.println("\nFOR LOOP:");
        System.out.printf("%-5s %-6s\n", "US$", "S$");
        System.out.println("--------------");
        for(int usd = start ; usd <= end; usd+=inc){
            double sgd = usd * 1.82; 
            System.out.printf("%-5d %-6.2f\n", usd, sgd);    
        }
        System.out.println("\nWHILE LOOP:");
        System.out.printf("%-5s %-6s\n", "US$", "S$");
        System.out.println("--------------");
        int usd = start;
        while(usd <= end){
            double sgd = usd * 1.82; 
            System.out.printf("%-5d %-6.2f\n", usd, sgd);   
            usd+=inc; 
        }
        System.out.println("\nDO-WHILE LOOP:");
        System.out.printf("%-5s %-6s\n", "US$", "S$");
        System.out.println("--------------");
        usd = start;
        do {
            double sgd = usd * 1.82; 
            System.out.printf("%-5d %-6.2f\n", usd, sgd);   
            usd+=inc; 
        } while(usd <= end);
        sc.close(); 
    }
}