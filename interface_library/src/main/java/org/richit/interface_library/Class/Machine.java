package org.richit.interface_library.Class;

import org.richit.interface_library.Interface.Info;

public class Machine implements Info {
    @Override
    public void showInfo() {
        System.out.println("Displaying from Machine Class");
    }
}
