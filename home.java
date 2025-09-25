import java.util.Scanner;
public class home{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        } 
        int count=0;
        int count2 =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=b){
                count++;
            }
            else{
                count2++;
            }
        }
        int val = count + (count2 * 2);
        System.out.println(val);
    } 
}