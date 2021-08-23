package practice.com;
import java.util.HashSet;
import java.util.Set;
public class DuplicateWordINString{
    public static void duplicate(String str)
    {
        Set<String> ser=new HashSet<String>();
        String arr[]=str.split(" ");
        for(String elements:arr)
        {
            if(ser.add(elements)==false) {
                System.out.println(elements);
            }

        }
    }
    public static void main(String[] args)
    {
         String str="Java is best for java practice";
         duplicate(str);
//        System.out.println(str);

    }

}
