import java.util.Random;
public class Array{
    public static void main(String[] args){
        Random r = new Random();
        int a[]=new int[20];
        int i=0,j=0,k=0,sum=0;
        System.out.println("����20��Ԫ��Ϊ��");
        for(i=0;i<20;i++){
            a[i]=r.nextInt(382)+77;
            sum=sum+a[i];
            System.out.println(a[i]);
        }
        for(i=0;i<20;i++){
            for(j=i+1;j<20;j++){
                if(a[i]<a[j]){
                    k=a[j];
                    a[j]=a[i];
                    a[i]=k;
                }
            }
        }
        double average=sum/20.0;
        System.out.println("�����ֵΪ"+a[0]+" ��СֵΪ"+a[19]);
        System.out.println("ƽ��ֵΪ"+average+" Ԫ��֮��Ϊ"+sum);
    }
}