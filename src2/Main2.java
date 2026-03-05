
public class Main2 {

    public static void main(String[] args) {

        //Oprettelse af 4 dyr, med alle 3 typer lavet:
        Animal l1 = new Lion("Leon", 100);
        Animal r1 = new Rabbit("Rebena", 200);
        Animal w1 = new Wolf("Kiko", 80);
        Animal r2 = new Rabbit("Moana", 120);

        Contest contest1 = new Contest(l1, w1);

        // Spil runder indtil én vinder
        while (l1.isActive() && w1.isActive()) {
            contest1.playRound();

            Animal winner = contest1.getWinner();
            System.out.println("Winner of this match: " + winner.getName());

        }
    }


}
