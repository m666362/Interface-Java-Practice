package org.richit.interface_library.Class;

import org.richit.interface_library.Interface.Info;

public class Person implements Info {
    @Override
    public Person showInfo() {
        System.out.println("Displaying from Person Class");
        return null;
    }
}
