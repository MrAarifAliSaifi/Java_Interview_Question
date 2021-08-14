package aarif.com;
class palin {
    public void Plindrom(int num) {
        int rev = 0, pal = 0;
        int num1=num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        if (rev == num1) {
            System.out.println("palindrome!!");
        } else {
            System.out.println("Not palindrome!!!");
        }
    }
}
public class Palindrome {
    public static void main(String[] args) {
        palin obj=new palin();
        obj.Plindrom(121);
    }
}
