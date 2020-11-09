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

  public static SuperArray zip(SuperArray a, SuperArray b){
    int maxi = a.size()+b.size();
    SuperArray answer = new SuperArray();
    boolean A = true;
    int indexA = 0;
    int indexB = 0;
    for (int i = 0; i < maxi; i++){
      if (A){
        if(indexA<a.size()){
          answer.add(a.get(indexA));
          indexA++;
        }
        A = false;
      }else{
        if (indexB<b.size()){
          answer.add(b.get(indexB));
          indexB++;
        }
        A = true;
      }
    }
    return answer;

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
    System.out.println(words);


    SuperArray one = new SuperArray();
    one.add("a");
    one.add("b");
    one.add("c");
    one.add("d");
    one.add("e");
    one.add("f");
    SuperArray two = new SuperArray();
    two.add("0");
    two.add("1");
    two.add("2");
    two.add("3");

    System.out.println(zip(one,two).toString());

  }
}
