import java.util.Arrays;
public class stringSorting {
  public static void main(String[] args){
    String[] strings={"banana","apple","grap","orang"};
    Arrays.sort(strings);
    System.out.println("sorted string");
    for(String str:strings){
        System.out.println(str);
    }
  }   
}
