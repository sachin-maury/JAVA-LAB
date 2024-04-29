class Animal{
     public void makesound(){
        System.out.println("Animal s make sound");
     }
}
class Dog extends Animal{
    public void bark(){
      System.out.println("Dog is barking");  
    }
    public void wagTail(){
      System.out.println("Dog is wag tail ");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal animal =new Animal();
        Dog dog = new Dog();
        animal.makesound();
        dog.bark();
        dog.wagTail();
    }
}
