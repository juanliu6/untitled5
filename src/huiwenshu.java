import java.util.Arrays;
import java.util.Scanner;

public class huiwenshu {
    public static void main(String[] args) {
        System .out .println("输入一个数");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        String s=x+"";
        char []charArr=s.toCharArray();
        char []chars =new char[s.length() ];
        for (int i=0;i<charArr.length ;i++ ){
            chars [i]=charArr [charArr .length-i-1 ];
        }
        String s1=new String(chars );
        System.out .println(Arrays.equals(charArr  , s1.toCharArray())) ;

    }
}
