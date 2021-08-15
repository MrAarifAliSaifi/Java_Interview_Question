package aarif.com;
public class Armstrong_Number {
    public  static void Armstrong(int num)
    {
        int rev=0;
        int cube=0;
        int sum=0;
        int temp=num;
        while(num!=0)
        {
            rev=num%10;
            cube=rev*rev*rev;
            sum=sum+cube;
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("yes!!"+"this number is armstring");
        }
        else{
            System.out.println("this no is not armstrong");
    }
    }
    public static void main(String[] args) {
        Armstrong(141);
    }
}
