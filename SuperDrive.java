import java.util.Arrays;
public class SuperDrive{
    public static void main(String[]args){
      SuperArray one = new SuperArray();
      System.out.println(one.size());
      one.add("Hello");
      System.out.println(Arrays.toString(one.printarray()));
  }
}
