import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        boolean flag=false;
        Scanner sc=new Scanner(System.in);//taking the inout from the user
        System.out.println("Please Enter your  number!!");
        int num=sc.nextInt();
        if(num==1||num==2)//checking the condition
        {
            System.out.println("the given numberis prime!!");
        }else {
            int half=num/2;
            for(int i=2;i<=half;i++)
            {
                if(num%i==0)
                {
                    flag=true;
                }
                break;
                }
            }
         if(flag==true)
        {
            System.out.println("not prime");
        }
        else {
            System.out.println( " prime");
        }
    }
}
