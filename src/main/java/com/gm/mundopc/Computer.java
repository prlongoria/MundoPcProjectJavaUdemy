package com.gm.mundopc;

public class Computer {
    private final int idComputer;
    private  String nameComputer;
    private String display;
    private String keyboard;
    private  String mouse;

    private static int counterComputer;

    public Computer() {
    this.idComputer = ++Computer.counterComputer;
    }

    public Computer(String nameComputer, String display, String keyboard, String mouse) {
        this();
        this.nameComputer = nameComputer;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public String getNameComputer() {
        return nameComputer;
    }

    public void setNameComputer(String nameComputer) {
        this.nameComputer = nameComputer;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("idComputer=").append(idComputer);
        sb.append(", nameComputer='").append(nameComputer).append('\'');
        sb.append(", display=").append(display);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", mouse=").append(mouse);
        sb.append('}');
        return sb.toString();
    }
}
