package org.sniffy.motor;

import com.pi4j.component.motor.impl.GpioStepperMotorComponent;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class Motor {

    public static void test() throws Exception {
        System.out.println("V2");
        final GpioController gpio = GpioFactory.getInstance();
    }

}
