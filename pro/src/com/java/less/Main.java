package com.java.less;

import com.java.class2.Bus;

public class Main {
    public static void main(String[] args) {
        Bus ourBus;
        Bus firstBus;
        Bus secondBus;
        ourBus = new Bus();
        firstBus = new Bus();
        secondBus = new Bus();

        ourBus.color = "Green";
        firstBus.color = "Yello";
        secondBus.color = "Gray";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }

}
