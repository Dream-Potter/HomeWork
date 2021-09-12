public class Insertion{
    public static void main(String[] args) {
        int a[]=new int[]{48,5,89,80,81,23,45,16,2};
        int i=0,j=0,k=0;
        System.out.println("未排序前为：");
        for (i=0;i<a.length;i++) {
            System.out.print(a[i]+"  ");
        }
        for(i=0;i<a.length;i++) {
            for(j=i;j>=1;j--) {
                if(a[j-1]>a[j]){
                    k=a[j-1];
                    a[j-1]=a[j];
                    a[j]=k;
                }
            }
        }
        System.out.println("\n插入排序后为：");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
}