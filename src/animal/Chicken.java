package animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken: cluck-cluck";
    }
    public String howtoEat(){
        return "could be fried";
    }
}
