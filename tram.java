import java.util.Scanner;
class tram{
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arra[] = new int[len];
        int arrb[] = new int[len];
        for(int i=0;i<len;i++){
            arra[i] = sc.nextInt();
            arrb[i] = sc.nextInt();
        }
        int val=0;
        int max=0;
        for(int i=0;i<len;i++){
            val -=arra[i] ;
             val +=arrb[i];
             if(val>max){
                max=val;
             }
        }
        System.out.println(max);



     }} 