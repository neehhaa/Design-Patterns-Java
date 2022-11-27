package DerekBanas.Polymorphism;

public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dug Hole.");
    }
    public Dog(){
        super();
        setSound("BARK");
    }

    private void bePrivate(){
        System.out.println("In a private method");
    }
    public void accessPrivate(){
        bePrivate();
    }
}
