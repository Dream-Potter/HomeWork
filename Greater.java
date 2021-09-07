import java.util.Random;
public class Greater{
    public static void main(String[] args){
        int array[]=new int[20];
        Random r=new Random();
        int i=0,sum=0,count=0;
        System.out.println("数组有20个元素：");
        for(i=0; i<20; i++){
            array[i]=r.nextInt(300);
            System.out.println(array[i]);
            sum=array[i]+sum;
        }
        double average=sum/20.0;
        System.out.println("其中大于平均值的元素有:");
        for(i=0; i<20; i++){
            if(average<array[i]){
            count++;
            System.out.println(array[i]);
            }
        }
        System.out.println("一共有"+count+"个");
    }
}