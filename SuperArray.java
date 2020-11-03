public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String [10];
    size = data.length;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(data[size-1]==null){
    data[size-1]=element;
  }else{
    resize();
    data[size-1]=element;
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
      if (data[i]!=null){
      temp[i]=data[i];}
    }
    data = temp;
    size = data.length;
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
    size = data.length;
  }

  public String toString(){
    String answer = "[";
    for (int i = 0; i < size; i++){
      if (data[i]!=null){
        answer = answer + data[i]+Integer.toString(i);
        if (i != size-1){
          answer+=", ";
        }
      }
      if (i == size-1){
        answer+="]";
      }
    }
    return answer;
  }
}
