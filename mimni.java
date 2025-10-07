import  java.util.Scanner;
import java.util.Arrays;
public class mimni{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t -->0){ 
        int num = sc.nextInt();
        long[] arr = new long[num];
        long x=0;
         for(int i=0;i<num;i++){
           arr[i] = sc.nextInt();
           x+=arr[i];
        }
       
        boolean equal = true;
        for(int i=1;i<num;i++){
            if(arr[i-1] != arr[i]){
                equal = false;
                break;
            }

        }
            if(equal){
                System.out.println(x);
            }
            else if(num == 2){
                System.out.println(Math.max(arr[0],arr[1]));
            }
            else{
                System.out.println("-1");
            }
        }

            }
        }

    


