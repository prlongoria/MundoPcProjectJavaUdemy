package com.gm.mundopc;

import javax.management.monitor.Monitor;

public class Computer {
    private int idComputer;  //final?
    private  String nameComputer;
    private Display display;
    private Keyboard keyboard;
    private  Mouse mouse;

    private static int counterComputer;

    public Computer() {
    this.idComputer = ++Computer.counterComputer;
    }

    public Computer(String nameComputer, Display display, Keyboard keyboard, Mouse mouse) {
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

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
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
