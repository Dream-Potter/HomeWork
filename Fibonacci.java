public class Fibonacci{
    public static void main(String[] args){
        long f1=0L,f2=1L;
        int i=1;
        while(i<=30){
            System.out.println(f1);
            System.out.println(f2);
		    f1=f1+f2;
		    f2=f2+f1;
            i++;  
        }		  
    }
}