import java.util.Scanner;
public class CommonFactor{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入两个数：");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        if(a<b){
            c=a;
            a=b;
            b=c;
        }
        System.out.println("其最大公因数为：");
        while(true){
            c=b;
            b=a%b;
            a=c;
            if(b==0){
                System.out.println(c);
                break;
            }
        }
    }
}