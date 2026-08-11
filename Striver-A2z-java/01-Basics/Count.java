public class Count {
    static void count(int num){
        int count =0;
        while(num>0){
            num=num/10;
            count++;

        }
        System.out.println("number of digit:" +count);
    }
    public static void main(String[] args) {
        int num = 4321;
        count(num);
    }
    
}
