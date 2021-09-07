import java.util.Random;
public class Array{
    public static void main(String[] args){
        Random r = new Random();
        int a[]=new int[20];
        int i=0,j=0,k=0,sum=0;
        System.out.println("数组20个元素为：");
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
        System.out.println("其最大值为"+a[0]+" 最小值为"+a[19]);
        System.out.println("平均值为"+average+" 元素之和为"+sum);
    }
}