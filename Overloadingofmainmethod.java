package aarif.com;
//method overloading is all about n number of method with the same name but different in aarguemnets in a class
public class Overloadingofmainmethod {
public static void main(String [] args)//this is our main method which is called by the jvm
{
    System.out.println("hello aarif ali saifi");
    main("aarif");
    main(12);
    main(12.3f);
    ;
}
    public static void main(String  args)
    {
        System.out.println("hello aarif ali saifi");
    }
    public static void main(int  args)
    {
        System.out.println("hello aarif ali saifi");
    }
    public static void main(float args)
    {
        System.out.println("hello aarif ali saifi");
    }
}
