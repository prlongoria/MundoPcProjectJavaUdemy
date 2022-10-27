package com.gm.mundopc;

public class Keyboard extends inputDevice{
    private int idKeyboard;
    private static int counterKeyboards;

    public Keyboard() {
        this.idKeyboard = ++Keyboard.counterKeyboards;

    }

    public Keyboard(String inputType, String brand) {
        this.inputType = inputType;
        this.brand = brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("idKeyboard=").append(idKeyboard);
        sb.append("counterKeyboards=").append(counterKeyboards);
        sb.append('}');
        return sb.toString();
    }
}
