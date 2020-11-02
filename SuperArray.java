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
    if(data[size-1]!=null){
    data[size-1]=element;
  }else{
    resize();
    data[data.length-1]=element;
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
  }
}
