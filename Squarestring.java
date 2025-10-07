import java.util.Scanner;
public class Squarestring{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] str = new String[num]; 
        for(int i=0;i<num;i++){
            str[i] = sc.nextLine().trim();
           int n = str[i].length();
                if (n % 2 == 0) {
                String a = str[i].substring(0, n/2);
                String b = str[i].substring(n/2);
                System.out.println(a.equals(b) ? "YES" : "NO");
            } else {
                System.out.println("NO");

                }
            
        }
    }
}