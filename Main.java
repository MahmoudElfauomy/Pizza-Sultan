import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Pizza pz = new Pizza("homsa", 150, true, Sizes.MEDIUM);
        Pizza PIZZO = new Pizza("AboElhwames", 250, true, Sizes.SMALL);
        ITEM it = new ITEM("KERRY", 100, true);
        System.out.println(PIZZO.TotalPrice());
        PIZZO.Add_Extras(Extras.CHEESE);
        System.out.println(PIZZO.TotalPrice());
    }
}

