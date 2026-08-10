import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks student:");
        int marks=sc.nextInt();
        System.out.println("marks of student"+ marks);
        if(marks>=90){
            System.out.print("A");
        
        }else if(marks>=70){
            System.out.print("B");

        }else if(marks>=50){
            System.out.print("C");
            }else if(marks>=35){
                System.out.print("D");
            }
            else{
                System.out.print("fail");
            }
        }

        
    }
    

    

