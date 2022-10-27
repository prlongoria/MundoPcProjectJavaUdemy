package com.gm.mundopc;

public class inputDevice {
    protected   String inputType;
    protected String brand;

    protected inputDevice() {

    }

    protected inputDevice(String inputType, String brand) {
        this.inputType = inputType;
        this.brand = brand;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("inputDevice{");
        sb.append("inputType='").append(inputType).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
