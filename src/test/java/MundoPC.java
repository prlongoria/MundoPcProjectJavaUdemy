import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        //creo objetos de los tipos que necesito:
        Display displayHP = new Display("HP", 13);
        Keyboard keyboardHP = new Keyboard("bluetooth", "HP");
        Mouse mouseHP = new Mouse("blootooth", "HP");

        Display displayLG = new Display("LG", 13);
        Keyboard keyboardLG = new Keyboard("bluetooth", "LG");
        Mouse mouseLG = new Mouse("bluetooth", "LG");

        Display displaySamsumg = new Display("Samsumg", 13);
        Keyboard keyboardSamsumg = new Keyboard("bluetooth", "Samsumg");
        Mouse mouseSamsumg = new Mouse("bluetooth", "Samsumg");

        Computer computer1 = new Computer("HP", displayHP, keyboardHP, mouseHP);
        Computer computer2 = new Computer("LG", displayLG, keyboardLG, mouseLG);

        Order order1 = new Order();
        order1.addComputer(computer1);
        order1.addComputer(computer2);
        order1.showOrder();

        Computer computer3 = new Computer("Samsumg", displaySamsumg, keyboardSamsumg, mouseSamsumg);

        Order order2 = new Order();
        order2.addComputer(computer3);
        order2.addComputer(computer2);
        order2.showOrder();
    }
}
