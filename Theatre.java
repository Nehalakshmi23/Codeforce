import java.util.*;
public class Theatre{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long m = sc.nextInt(); 
    long n = sc.nextInt(); 
    long a = sc.nextInt(); 
    
    long div1 = (long)Math.ceil((double)m/a);
    long div2 = (long)Math.ceil((double)n/a);
    long ans = div1*div2;
    System.out.println(ans);
}
}