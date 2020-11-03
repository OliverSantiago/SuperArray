public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String [10];
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

  public String[] printarray(){
    return data;
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
    System.out.println(size);
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
        answer = answer + data[i]+Integer.toString(i);
        if (i != size-1){
          answer+=", ";
        }
      if (i == size-1){
        answer+="]";
      }
    }
    return answer;
  }
}
