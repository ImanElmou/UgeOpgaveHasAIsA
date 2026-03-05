//Superklasse
public abstract class Animal {

    String name;
    int energy;


    Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }
String getName(){
        return name;
}
public int getEnergy(){
        return energy;
}
public void setEnergy(int energy){
        this.energy = energy;
}

    boolean isActive() {
        return energy > 0;

    }

    /*int attack() {
        return 0;
    }*/

    public abstract int attack();


    @Override
    public String toString() {
        return getClass().getSimpleName() + name + "(energy: " + energy + ")";

    }
}