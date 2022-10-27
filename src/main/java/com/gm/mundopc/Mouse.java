package com.gm.mundopc;

public class Mouse extends inputDevice{

    private int idMouse;
    private static int counterMouses;

    private Mouse() {
        this.idMouse = ++Mouse.counterMouses;
    }

    private Mouse(String inputType, String brand) {

    this.inputType = inputType;
    this.brand = brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("idMouse=").append(idMouse);
        sb.append(", counterMouses=").append(counterMouses);
        sb.append('}');
        return sb.toString();
    }
}