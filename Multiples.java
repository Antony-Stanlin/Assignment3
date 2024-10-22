import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Multiples {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        System.out.print("Enter level number: ");
        int limit=ob.nextInt();  

        System.out.print("Enter the number of magical numbers: ");
        int n=ob.nextInt();
        int a[]=new int[n];

        Set<Integer> s=new HashSet<>();

        System.out.print("Enter the magical numbers one by one: ");
        for(int i=0;i<n;i++){
            a[i]=ob.nextInt();
            int multi=a[i];
            while(multi<limit){
                s.add(multi);
                multi+=a[i];
            }
        }

        int total=0;
        for(int i:s){
            total+=i;
        }
        //System.out.println(s);
        System.out.println(total);
        ob.close();
    }
}
