import java.util.ArrayList;

public class Building {

    String name;
    ArrayList<Room> rooms;

    Building(String name){
        this.name = name; // Konstruktøren tager name
        rooms = new ArrayList<>();
    }

    void addRoom (Room room){
        rooms.add(room);
    }

    int getTotalLampCount(){
        int total = 0;

        for (Room room : rooms){
            total+= room.getLampCount();
        }
        return total;
    }

    int getTotalWatt() {
        int total = 0;

        for (Room room : rooms) {
            total += room.getTotalWatt();
        }
        return total;
    }

    void printBuilding(){
        System.out.println("Building name: " + name);

        for(Room room : rooms){
            room.printRoom();
            System.out.println();
        }

        System.out.println("Total of lamps in building: " + getTotalLampCount());
        System.out.println("Total of Watt in building: " + getTotalWatt());
    }
}
