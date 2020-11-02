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
    data[size-1]=element;
    return true;
  }

  public String[] printarray(){
    return data;
  }
}
