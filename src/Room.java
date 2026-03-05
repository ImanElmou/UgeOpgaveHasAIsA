import java.util.ArrayList;

public class Room {

    String name;
    ArrayList<Lamp> lamps;
    ArrayList<Window> window;

   public Room (String name){
       this.name = name; // tager name
       lamps = new ArrayList<>();
       window = new ArrayList<>();
    }

    void addLamp(Lamp lamp){
       lamps.add(lamp);
    }

    void addWindow(Window window){ // opgaven ville ikke fungere
        windows.add(window); // ville kun virke hvis jeg tilføjer det samme i klassen window.

    }

    int getLampCount() {
        return lamps.size();
    }

    int getTotalWatt(){
       int sumOfWatt = 0 ;

       for (Lamp lamp : lamps){
           sumOfWatt+=lamp.getWatt();
       }
       return sumOfWatt;
    }

    int getTotalWindowArea(){
       int total = 0;

        Window[] windows = new Window[0]; // systemet ville ikke virke uden.
        for (Window window : windows){
          total+=window.getArealCm2();
       }
       return total;
    }

    void printRoom(){

        System.out.println("Room: " + name);
        System.out.println("Number of lamps: " + getLampCount());
        System.out.println("Total watt: " + getTotalWatt());
        System.out.println("Total window area: " + getTotalWindowArea());

    }





}
