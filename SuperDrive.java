import java.util.Arrays;
public class SuperDrive{
    public static void main(String[]args){
      SuperArray one = new SuperArray();
      SuperArray two = new SuperArray();
      two.add("Second Array");
      //System.out.println(one.size());
      System.out.println(Arrays.toString(one.printarray()));
      one.add("Hello");
      //System.out.println(Arrays.toString(one.printarray()));
      //System.out.println(one.get(9));
      //System.out.println(one.set(3,"Third"));
      //System.out.println(Arrays.toString(one.printarray()));
      //one.add("Hello");
      //System.out.println(Arrays.toString(one.printarray()));
      System.out.println(Arrays.toString(one.printarray()));
      System.out.println(one.add("Hello"));
      System.out.println(Arrays.toString(one.printarray()));
      System.out.println(one.isEmpty());
      one.clear();
      System.out.println(Arrays.toString(one.printarray()));
      System.out.println(two.toString());
  }
}
