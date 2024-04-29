public class overloding {

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args){
      overloding obj = new overloding();
      int sum1= obj.add(5,8);
      System.out.println("The Sum is" + sum1);
      int sum2 = obj.add(5,8,3);
      System.out.println("The sum is "+ sum2);
      double sum3= obj.add(5.5,3.3);
      System.out.println("Double is" + sum3 );
    }
}