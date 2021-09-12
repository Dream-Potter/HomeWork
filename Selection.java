public class Selection{
    public static void main(String[] args){
        int a[]=new int[]{48,5,89,80,81,23,45,16,2};
        System.out.println("未排序前为：");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+"  ");
        }
        int k=0;
        for(int i=0;i<a.length;i++) {
            for(int j=i;j<a.length;j++) {
                if(a[i]>a[j]){
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;
                }
            }
        }
        System.out.println("\n选择排序后为：");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+"  ");
        }
    }
}