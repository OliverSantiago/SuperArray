import java.util.Arrays;
public class SuperDrive{
    public static void main(String[]args){
      //SuperArray one = new SuperArray();
      //SuperArray two = new SuperArray();
      //two.add("Second Array");
      //System.out.println(one.size());
      //System.out.println(Arrays.toString(one.printarray()));
      //one.add("Hello");
      //System.out.println(Arrays.toString(one.printarray()));
      //System.out.println(one.get(9));
      //System.out.println(one.set(3,"Third"));
      //System.out.println(Arrays.toString(one.printarray()));
      //one.add("Hello");
      //System.out.println(Arrays.toString(one.printarray()));
      //System.out.println(Arrays.toString(one.printarray()));
      //System.out.println(one.add("Hello"));
      //System.out.println(Arrays.toString(one.printarray()));
      //System.out.println(one.isEmpty());
      //one.clear();
      //System.out.println(Arrays.toString(one.printarray()));
      //System.out.println(two.toString());
      SuperArray test = new SuperArray();
      System.out.println(test.size());
      System.out.println(test.add("First String"));
      System.out.println(test.add("Second String"));
      System.out.println(test.size());
      System.out.println(test.get(1));
      System.out.println(test.set(1,"New Second String"));
      System.out.println(test.add("Third String"));
      System.out.println(test.add("Fourth String"));
      System.out.println(test.add("Fifth String"));
      System.out.println(test.add("Sixth String"));
      System.out.println(test.add("Seventh String"));
      System.out.println(test.add("Eighth String"));
      System.out.println(test.add("Ninth String"));
      System.out.println(test.add("Tenth String"));
      System.out.println(Arrays.toString(test.printarray()));
      System.out.println(test.add("Eleventh String"));
      System.out.println(Arrays.toString(test.printarray()));

      System.out.println(test.isEmpty());
      System.out.println(test.toString());
      System.out.println(test.contains("Tenth String"));
      test.add(9,"NEW Tenth String");
      System.out.println(Arrays.toString(test.printarray()));
      test.remove(9);
      System.out.println(Arrays.toString(test.printarray()));
      System.out.println(test.indexOf("Tenth"));
      System.out.println(test.indexOf("Tenth String"));
      
  }
}
