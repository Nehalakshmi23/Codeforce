import java.util.*;
public class Tale{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int val=sc.nextInt();
     
     for (int k=0;k<val;k++){
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        
        int max=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     
        for (int j=0;j<n-1;j++){
            if (arr[j]>arr[j+1]){
                max=Math.max(max,arr[j]);
            }
        }
        System.out.println(max);}
}
}