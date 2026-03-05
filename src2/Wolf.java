import java.util.Random;

public class Wolf extends Animal {

    Random random = new Random();

    Wolf (String name, int energy){
       super(name,energy);

    }

    @Override
    public int attack() {
        return random.nextInt(10) + 10; // Math.random kunne også bruges.
    }


}
