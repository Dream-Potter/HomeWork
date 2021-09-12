public class Bubble{
    public static void main(String[] args) {
        int a[]=new int[]{48,5,89,80,81,23,45,16,2};
        System.out.println("未排序前为：");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+"  ");
        }
        int k=0;
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length-1-i;j++) {
                if(a[j]>a[j+1]) {
                    k=a[j+1];
                    a[j+1]=a[j];
                    a[j]=k;
                }
            }
        }
        System.out.println("\n冒泡排序后为：");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+"  ");
        }
    }
}