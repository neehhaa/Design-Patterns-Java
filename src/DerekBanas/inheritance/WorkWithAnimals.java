package DerekBanas.inheritance;

import DerekBanas.inheritance.Dog;

public class WorkWithAnimals {

    public static void main(String[] args) {

        Dog stella = new Dog();

        stella.setName("stella");
        System.out.println(stella.getName());

        stella.digHole();
        stella.setWeight(-1);

        int randomNum = 10;

        stella.changeVar(randomNum);

        System.out.println("after method call : " + randomNum);

        changeObjectName(stella);
        System.out.println(stella.getName());

    }

    public static void changeObjectName(Dog stella){
        stella.setName("Bruno");
    }
}
