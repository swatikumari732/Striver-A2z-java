import java.util.Scanner;
public class Sumofinteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter low value:");
         int low=sc.nextInt();
         System.out.println("enter high value:");
         int high=sc.nextInt();
         int sum=0;
         for(int i=low;i<=high;i++){
            sum =sum+i;
         }
         System.out.println("sum"+ sum);
    }
    
}
