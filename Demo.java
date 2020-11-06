public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size(); i++){
          String x = s.get(i);
          while (s.contains(x)){
            s.remove(s.indexOf(x));
          }
          s.add(i, x);
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray answer = new SuperArray();
    for (int i = 0; i < a.size(); i++){
      if(b.contains(a.get(i))){
        answer.add(a.get(i));
      }
    }
    System.out.println(answer.toString());
    removeDuplicates(answer);
    return answer;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    SuperArray a = new SuperArray(6);
    a.add("9");
    a.add("1");
    a.add("2");
    a.add("2");
    a.add("3");
    a.add("4");
    SuperArray b = new SuperArray(5);
    b.add("0");
    b.add("4");
    b.add("2");
    b.add("2");
    b.add("9");
    System.out.println(findOverlap(a,b).toString());

    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
