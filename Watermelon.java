import java.util.Scanner;
public class Watermelon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float kg = sc.nextInt();
       
        if(kg %2 == 0 && kg>2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}