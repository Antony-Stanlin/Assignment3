
import java.util.Scanner;

public class Acronym {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=ob.nextLine();
        System.out.println(new Acronym().splits(s));
        ob.close();
    }
    String splits(String s){
        String str=(""+s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!isalphaDigit(s.charAt(i)) && i<s.length()-1)
                str+=s.charAt(i+1);
        }
        return str.toUpperCase();
    }
    boolean isalphaDigit(char c){
        if((c>='0'&& c<='9') || (c>='a'&&c<='z') || (c>='A'&&c<='Z'))
            return true;
        return false;
    }
}