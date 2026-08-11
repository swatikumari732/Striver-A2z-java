public class Armstrong {
    static void isArmstrong(int n){
        int original =n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }
        if(original==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("not Armstrong number");
        }


    }
    public static void main(String[] args) {
        int n =153;
        isArmstrong(n);
    }
}
