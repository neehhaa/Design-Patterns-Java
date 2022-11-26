package DerekBanas.inheritance;

import DerekBanas.inheritance.Animal;

public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dug Hole");
    }

    public Dog(){
        super();

        setSound("Bark");
    }

    public void changeVar(int randomNum){
        randomNum = 12;

        System.out.println("number in method : " + randomNum);
    }
}
