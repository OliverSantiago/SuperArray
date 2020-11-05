public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size(); i++){
        if(s.contains(s.get(i))){
          String x = s.get(i);
          while (s.contains(x)){
            s.remove(s.indexOf(x));
          }
          s.add(i, x);
      }
    }
  }

  //public static SuperArray findOverlap(SuperArray a, SuperArray b){
  //  for (int i = 0; i < a.size(); i++){
//
//    }
//  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
