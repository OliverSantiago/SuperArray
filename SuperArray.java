public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String [10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity<0){
      throw new IllegalArgumentException("Initial Capacity is negative");
    }
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
    if (index<0||index>=size()){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    return data[index];
  }

  public String set(int index, String element){
    if (index<0||index>=size()){
      throw new IndexOutOfBoundsException("Index is out of bounds, dummy");
    }
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
    if (index<0||index>size()){
      throw new IndexOutOfBoundsException("AH! Index is out of bounds");
    }
    if (size==data.length){
      resize();
    }
    String[] temp = new String [data.length];
    for(int i = 0; i < index; i++){
      temp[i]=data[i];
    }
    temp[index]=element;
    size++;
    for (int i = index; i < data.length - 1; i++){
      temp[i+1]=data[i];
    }
    data=temp;
  }


  public String remove(int index){
    if (index<0||index>=size()){
      throw new IndexOutOfBoundsException("Oh no! Index is out of bounds");
    }
    String answer = data[index];
    String[] temp = new String [data.length-1];
    for (int i = 0; i < index; i++){
      temp[i]=data[i];
    }
    for (int i = index; i < size-1; i++){
      temp[i]=data[i+1];
    }
    size -= 1;
    data=temp;
    return answer;
  }

  //trying out new remove instead of this below/////////////////////////////////
  public String remove2(int index){
    if (index<0||index>=size()){
      throw new IndexOutOfBoundsException("Oh no! Index is out of bounds");
    }
    String answer = "";
    if (index==size-1){
      answer = data[index];
      data[index]=null;
      size = size - 1;
      return answer;
    }
    if (index<size){
      answer = data[index];
      while(data[index+1]!=null){
        data[index]=data[index+1];
        index++;
        if (index>=size){
          resize();
        }
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
////////////////////////////////////////////////////////////////////////////////

  public String[] toArray(){
    String[] FinalArray = new String[size];
    for (int i = 0; i < size; i++){
      FinalArray[i]=data[i];
    }
    return FinalArray;
  }

  public int lastIndexOf(String value){
    String[] temp = new String[data.length];
    for (int i = 0; i < data.length; i++){
      temp[i]=data[i];
    }
    int index = 0;
    while (contains(value)){
      index = indexOf(value);
      remove(indexOf(value));
    }
    data=temp;
    return index;
  }

  public boolean equals(SuperArray other){
    for (int i = 0; i < size; i++){
      if (i < other.size()){
        if (data[i]!=other.get(i)){
          return false;
        }
      }else{
        return false;
      }
    }
    return true;
  }
}
