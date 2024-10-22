import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=ob.nextLine();
        str=str.toUpperCase();
        Pangram p=new Pangram();
        Set<Character> s=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(p.isAlpha(str.charAt(i)))
                s.add(str.charAt(i));
        }
        if(s.size()==26)
            System.out.println("Given String is a Pangam");
        else
            System.out.println("Given String is not a Pangam");
        ob.close(); 
    }
    boolean isAlpha(char c){
        if(c>='A' && c<='Z')
            return true;
        return false;
    }
}
