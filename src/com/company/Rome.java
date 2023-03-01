package com.company;
public enum Rome {
    I("1"), II("2"), III("3"), IV("4"), V("5"), VI("6"),VII("7"),VIII("8"),IX("9"),X("10");

    private final String romeNum;

    Rome(String romeNum) {

        this.romeNum = romeNum;
    }
    public String getRomeNum() {
        return romeNum;
    }

    public String toString(){
        return romeNum;
    }

}
   // String[] rN = Rome.values();