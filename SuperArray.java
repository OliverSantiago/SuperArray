public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String [10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size<data.length){
    data[size]=element;
    size++;
  }else{
    resize();
    data[size]=element;
    size++;
    }
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String temp = data[index];
    data[index]=element;
    return temp;
  }

  private void resize(){
    String[] temp=new String[size+10];
    for (int i = 0; i < size; i++){
      temp[i]=data[i];
    }
    data = temp;
    size = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i]!=null){
        size++;
      }
    }
  }

  public boolean isEmpty(){
    //for (int i = 0; i < size; i++){
    //  if (data[i]!=null){
    //    return false;
    //  }
    //}
    //return true;
    return (size==0);
  }

  public void clear(){
    for (int i = 0; i < size; i++){
      data[i]=null;
    }
    data = new String[0];
    size = 0;
  }

  public String toString(){
    String answer = "[";
    for (int i = 0; i < size; i++){
        answer = answer + data[i];
        if (i != size-1){
          answer+=", ";
        }
      if (i == size-1){
        answer+="]";
      }
    }
    if (size == 0){
      answer+="]";
    }
    return answer;
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element){
    int place = 0;
    if (index < size){

      if (data[index]==null){
        data[index]=element;
      }else{
        String temp = data[index];
        data[index]=element;
        index++;
        while(data[index]!=null){
          String placer = temp;
          temp = data[index];
          data[index]=placer;
          index++;
        }
        String placer = temp;
        temp = data[index];
        data[index]=placer;
        index++;
      }
      size ++;
    }

  }

  public String remove(int index){
    String answer = "Error";
    if (index==size-1){
      data[index]=null;
      size = size - 1;
      return answer;
    }
    if (index<size){
      answer = data[index];
      while(data[index+1]!=null){
        data[index]=data[index+1];
        index++;
      }
      data[index]=data[index+1];
      size = size - 1;
    }
    return answer;
  }

  public int indexOf(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }

  public String[] toArray(){
    String[] FinalArray = new String[size];
    for (int i = 0; i < size; i++){
      FinalArray[i]=data[i];
    }
    return FinalArray;
  }

  public static void removeDuplicates(SuperArray s){

  }
}
