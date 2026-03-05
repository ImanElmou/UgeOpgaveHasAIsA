public class Main {


    public static void main (String[] args){

        Building b = new Building("Office");

        Room r1 = new Room("IT-Room");
        Room r2 = new Room("FinanceRoom");
        Room r3 = new Room("MediaRoom");

        r1.addLamp(2);
        r1.addWindow(1);

        r2.addLamp(2);
        r2.addWindow(1);

        r3.addLamp(2);
        r3.addWindow(1);

        b.addRoom(r1);
        b.addRoom(r2);
        b.addRoom(r3);

        b.printBuilding();

    }

}
