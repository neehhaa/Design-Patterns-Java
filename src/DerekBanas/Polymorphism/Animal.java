package DerekBanas.Polymorphism;

public class Animal {
    private String name;
    private int weight;
    private String sound;


    //NAME

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }


    //WEIGHT

    public void setWeight(int newWeight){
        if (newWeight > 0){
            weight = newWeight;
        }else {
            System.out.println("Weight must be greater than 0 ");
        }
    }
    public int getWeight(){
        return weight;
    }

    //SOUND

    public void setSound(String newSound){
        sound = newSound;
    }
    public String getSound(){
        return sound;
    }
}
