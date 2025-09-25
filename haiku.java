import java.util.*;
public class haiku{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String[] str = new String[3];
     for(int i=0;i<3;i++){
        str[i] = sc.nextLine();
     }
     boolean result = Yesorno(str);

     if(result){
        System.out.println("YES");

     }
     else{
        System.out.println("NO");

     }
}
public static boolean Yesorno(String[] str){
    int [] pattern = {5,7,5};
    for(int i=0;i<3;i++){ 
    String line = str[i] .toLowerCase();
    int val =0;
    for(int j=0;j<line.length();j++){
        char ch = line.charAt(j);
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            val++;
        }
 
    }
    if(val != pattern[i]){
        return false;
    }

    }
    return true;
}
}