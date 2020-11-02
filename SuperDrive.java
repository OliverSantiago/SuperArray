import java.util.Arrays;
public class SuperDrive{
    public static void main(String[]args){
      SuperArray one = new SuperArray();
      System.out.println(one.size());
      one.add("Hello");
      System.out.println(Arrays.toString(one.printarray()));
      System.out.println(one.get(9));
      System.out.println(one.set(3,"Third"));
      System.out.println(Arrays.toString(one.printarray()));
      one.add("Hello");
      System.out.println(Arrays.toString(one.printarray()));
  }
}
