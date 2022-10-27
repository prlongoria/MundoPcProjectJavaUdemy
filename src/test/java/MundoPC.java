import com.gm.mundopc.Computer;
import com.gm.mundopc.Order;

public class MundoPC {
    public static void main(String[] args) {
        Computer computer1 = new Computer("HP", "HP display", "HP Keyboard", "HP mouse");
        Computer computer2 = new Computer("LG", "LG display", "LG Keyboard", "LG mouse");

        Order order1 = new Order();
        order1.addComputer(computer1);
        order1.addComputer(computer2);
        order1.showOrder();

        Computer computer3 = new Computer("Samsumg", "Samsumg display", "Samsumg Keyboard", "Samsumg mouse");

        Order order2 = new Order();
        order2.addComputer(computer3);
        order2.addComputer(computer2);
        order2.showOrder();
    }
}
