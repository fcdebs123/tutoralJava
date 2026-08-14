abstract keywords in java
abstract keywords in java is used used when method of a class is not in used or don't know what to do with the current method.
while implementing abstract class the class which is inherited from the main class should made abstract and the method name should also made abstract
and as well as we cannot create a object of a abstract class and we have to create with the sub class which is child class
.

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

abstract class Car{
    public abstract void drive();
    public void music(){
        System.out.println("Music is playing");
    }
}
class wagonR extends Car{
    public void drive(){
        System.out.println("WagonR is driving");
    }
}



public class deemo {
    public static void main(String[] args) {
        wagonR obj=new wagonR();
        obj.drive();
        obj.music();

    }
}
_________________________________________________**********************************************__________________________________________________________
so we also can make two abstract class and iherited those abstract class in the third class but the object will call the third class as mentioned in the code
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void music(){
        System.out.println("Music is playing");
    }
}
abstract class wagonR extends Car {


    public void drive() {
        System.out.println("WagonR is driving");
    }
}
  class updatedWagonR extends wagonR{
      @Override
      public void fly() {
          System.out.println("flying");
      }
  }




public class deemo {
    public static void main(String[] args) {
        Car obj=new updatedWagonR();
        obj.drive();
        obj.music();
        obj.fly();

    }
}
