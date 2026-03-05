public class Contest{

    //2 Animal felter og variable= round:
    private Animal a1;
    private Animal a2;
    private int rounds;

    public Contest(Animal a1, Animal a2){
        this.a1= a1;
        this.a2= a2;
        rounds = 0;
    }

    public void playRound(){
        if (!a1.isActive() || !a2.isActive()){
            System.out.println("One of the animals are eliminated. ");
            return;
        }
      rounds++;
    }

    int attack1 = a1.attack();
    int attack2 = a2.attack();


// mine get og set metoder ville ikke virke :/
   /* a2.setEnergy(a2.getEnergy()- attack1);
    a1.setEnergy(a1.getEnergy()- attack2);*/

//Den lader mig ikke lavet system.out.println();


    public Animal getWinner() {
        if (a1.isActive() && !a2.isActive()) {
            return a1;
        } else if (!a1.isActive() && a2.isActive()) {
            return a2;
        } else if (!a1.isActive() && !a2.isActive()) {
            return null; // Begge ude → uafgjort
        } else {
            return null; // Begge stadig aktive → ingen vinder endnu
        }
    }

}
