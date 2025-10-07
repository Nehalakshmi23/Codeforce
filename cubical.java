import java.util.Scanner;
public class cubical{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        System.out.println(" ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();
        if(x1 == y1 || x2 == y2 || x3 == y3){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}