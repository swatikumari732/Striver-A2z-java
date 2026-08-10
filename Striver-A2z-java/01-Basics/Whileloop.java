import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter d");
        int d=sc.nextInt();
        int num=d;
        int sum=0;
        int count=0;
        while(count<50){
            
            sum=sum+num;
            num=num+10;
            count++;
            
            
        }
        System.out.println("sum =:" +sum);

        
        
    }
    
}
