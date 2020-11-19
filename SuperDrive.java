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
      // SuperArray test = new SuperArray();
      // //System.out.println(test.size());
      // test.add("First String");
      // test.add("Second String");
      // //System.out.println(test.size());
      // //System.out.println(test.get(1));
      // //System.out.println(test.set(1,"New Second String"));
      // test.add("Third String");
      // test.add("Fourth String");
      // test.add("Fifth String");
      // test.add("Sixth String");
      // test.add("Seventh String");
      // test.add("Eighth String");
      // test.add("Ninth String");
      // test.add("Tenth String");
      // //System.out.println(test.toString());
      // test.add("Eleventh String");
      // //System.out.println(test.toString());
      //
      // //System.out.println(test.isEmpty());
      // //System.out.println(test.toString());
      // //System.out.println(test.contains("Tenth String"));
      // test.add(9,"NEW Tenth String");
      // //System.out.println(test.toString());
      // test.remove(9);
      // //System.out.println(test.toString());
      // //System.out.println(test.indexOf("Tenth"));
      // //System.out.println(test.indexOf("Tenth String"));
      //
      // System.out.println();
      // System.out.println();
      // SuperArray test2 = new SuperArray();
      // test2.add("one");
      // test2.add("two");
      // test2.add("three");
      // test2.add("four");
      // test2.add("five");
      // test2.add("six");
      // test2.add("seven");
      // test2.add("eight");
      // test2.add("nine");
      // test2.add("ten");
      // //System.out.println(test2.toString());
      // //test2.remove(-1);
      // //System.out.println(test2.toString());
      // //System.out.println(test2.lastIndexOf("ten"));

      SuperArray test3 = new SuperArray();
      test3.add("one");
      test3.add("two");
      test3.add("three");
      test3.add("four");
      test3.add("five");
      test3.add("six");
      test3.add("seven");
      test3.add("eight");
      test3.add("nine");
      test3.add("ten");

      //System.out.println(test2.equals(test3));

      //System.out.println(test(test2));

      //System.out.println();
      //System.out.println();
      //System.out.println();
      //System.out.println();

      // try{
      //   SuperArray trying = new SuperArray(-1);
      // } catch (IllegalArgumentException e){
      //   System.out.println("Nice");
      // }catch (RuntimeException e){
      //   e.printStackTrace();
      //   System.out.println("Not Nice");
      // }
      //
      // try{
      //   test3.get(-1);
      // } catch (IndexOutOfBoundsException e){
      //   System.out.println("Cool");
      // } catch (RuntimeException e){
      //   System.out.println("Not Cool");
      // }
      //
      // try{
      //   test3.set(-1,"Error?");
      // }catch (IndexOutOfBoundsException e){
      //   System.out.println("Good");
      // }catch (RuntimeException e){
      //   System.out.println("Not Good");
      // }
      //
      // try{
      //   test3.add(-1, "Error?");
      // }catch (IndexOutOfBoundsException e){
      //   System.out.println("Yay");
      // }catch (RuntimeException e){
      //   System.out.println("Nay");
      // }
      //
      // try{
      //   test3.remove(-1);
      // }catch (IndexOutOfBoundsException e){
      //   System.out.println("Si");
      // }catch (RuntimeException e){
      //   System.out.println("No");
      // }
      test3.remove(2);
  }

  public static SuperArray test(SuperArray test2){
    SuperArray tester = new SuperArray(5);
    System.out.println(tester.set(1,test2.get(1)));
    System.out.println(tester.get(1));
    SuperArray newtester = tester;
    System.out.println(newtester.get(1));
    return newtester;
  }
}
