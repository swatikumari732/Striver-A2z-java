public class Reverse {
    static void reverse(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
             rev=rev*10+digit;
             num=num/10;

        }
        System.out.println("digit reverse"+ rev);
    }
    public static void main(String[] args) {
        int num=4325;
        reverse(num);
    }
    
}
