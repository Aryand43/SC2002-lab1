import java.util.*; 
public class P4 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the height");
        int h = sc.nextInt(); 
        if(h <= 0){
            System.out.println("Error Input!");
        }
        for(int i = 1; i <= h ;i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("AA");
                }
                else {
                    System.out.print("BB");
                }
            }
            System.out.println(); 
        }
        sc.close();
    }
}