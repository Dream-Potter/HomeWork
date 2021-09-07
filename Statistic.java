import java.util.Scanner;
public class Statistic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file= new String();
        System.out.println("请输入一串字母字符：");
        file=scanner.nextLine();
        char str[]=file.toCharArray();
        int count[]=new int[30];
        char ch[]=new char[30];
        int i=0,j=0,k=0;
        for(i=0;i<str.length;i++) {
            if((str[i]>=65&&str[i]<=90)||(str[i]>=97&&str[i]<=122)){
                for(j=0;j<count.length;j++) {
                    if(str[i]==ch[j]){
                        count[j]++;
                        break;
                    }
                }
                if(j>=count.length){
                    ch[k]=str[i];
                    count[k]=1;
                    k++;
                }
            }
        }
        for(i=0;count[i]!=0;i++) {
            System.out.println(ch[i]+"有"+count[i]+"个");
        }
    }
}