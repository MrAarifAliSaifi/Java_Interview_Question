package aarif.com;
class Demo
{
    public int reverse(int num)
    {
        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }
}
public class Reverse_Integer {
    public static void main(String[] args) {
        Demo d1=new Demo();
        int check=d1.reverse(12345);
        System.out.println(check);

    }
}
