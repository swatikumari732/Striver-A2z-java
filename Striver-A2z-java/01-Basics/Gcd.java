public class Gcd {
    static void findGcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("GCD:"+ a);

    }
    public static void main(String[] args) {
        int a=18;
        int b=12;
        findGcd(a,b);
    }
    
}
