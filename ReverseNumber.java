package aarif.com;
class rev{
    public  void  swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);
    }
}

public class ReverseNumber {
    public static void main(String[] args) {
        rev obj =new rev();
    obj.swap(12,13);

    }
}
