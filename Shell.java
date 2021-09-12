public class Shell{
    public static void main(String[] args){
        int a[]=new int[]{48,5,89,80,81,23,45,16,2};
        System.out.println("未排序前为：");
        int i=0,j=0,k=0,temp=0,increment=a.length;
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
        while(true){
            i=0;
            increment=(increment+1)/2;
            while(i<increment){
                for(j=i;j<a.length-increment;j+=increment){
                    for(k=j+increment;k>=increment;k-=increment){
                        if(a[k]<a[k-increment]){
                            temp=a[k];
                            a[k]=a[k-increment];
                            a[k-increment]=temp;
                        }
                    }
                }
                i++;
            }
            if(increment==1)break;
        }
        System.out.println("\n希尔排序后为：");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
}