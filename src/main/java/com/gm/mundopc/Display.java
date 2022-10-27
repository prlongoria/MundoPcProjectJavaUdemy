package com.gm.mundopc;

public class Display {
    private int idDisplay;
    private  String brandDisplay;
    private double sizeDisplay;
    private static int counterDisplays;

    private Display() {
        this.idDisplay = ++Display.counterDisplays;
    }

    public Display(String brandDisplay, double sizeDisplay) {
        this. brandDisplay = brandDisplay;
        this.sizeDisplay = sizeDisplay;
    }

    public int getIdDisplay() {
        return idDisplay;
    }

    public void setIdDisplay(int idDisplay) {
        this.idDisplay = idDisplay;
    }

    public String getBrandDisplay() {
        return brandDisplay;
    }

    public void setBrandDisplay(String brandDisplay) {
        this.brandDisplay = brandDisplay;
    }

    public double getSizeDisplay() {
        return sizeDisplay;
    }

    public void setSizeDisplay(double sizeDisplay) {
        this.sizeDisplay = sizeDisplay;
    }

    public static int getCounterDisplays() {
        return counterDisplays;
    }

    public static void setCounterDisplays(int counterDisplays) {
        Display.counterDisplays = counterDisplays;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Display{");
        sb.append("idDisplay=").append(idDisplay);
        sb.append(", brandDisplay='").append(brandDisplay).append('\'');
        sb.append(", sizeDisplay=").append(sizeDisplay);
        sb.append('}');
        return sb.toString();
    }
}
