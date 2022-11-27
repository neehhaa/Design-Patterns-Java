package DerekBanas.Polymorphism;

public class WorkWithAnimals {
    int justANum = 10; //non-static field

    public void sayHello(){
        System.out.println("Hello");
    } //non-static method

    public static void main(String[] args) {

// System.out.println(justANum); cannot call non-static field.
// sayHello(); cannot call non-static method.

        Dog stella = new Dog();
        stella.setName("stella");

        Animal doggy = new Dog(); //will not contain new methods declared in Dog class
        Animal kitty = new Cat();

        System.out.println("Dog says : " + doggy.getSound());
        System.out.println("Cat says : " + kitty.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        speakAnimal(doggy);

        //doggy.digHole(); //doesn't work

        ((Dog)doggy).digHole(); //Type-Casting



        // PUBLIC AND PRIVATE METHODS

        //stella.bePrivate();
        stella.accessPrivate();

    }

    public static void speakAnimal(Animal randomAnimal){
        System.out.println("Animal says : " + randomAnimal.getSound());
    }

}
