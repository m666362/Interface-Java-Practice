package org.richit.interface_library.Main;

import org.richit.interface_library.Class.Machine;
import org.richit.interface_library.Class.Person;
import org.richit.interface_library.Interface.Info;

public class MyClass {

    static Person person;
    static Machine machine;
    static Info info;

    static void initObject(){

        person = new Person();
        machine = new Machine();
        info = new Info() {
            @Override
            public void showInfo() {
                System.out.println("I do nothing");
            }
        };
    }

    public static void main(String[] args) {

        initObject();
        person.showInfo();
        machine.showInfo();
        info.showInfo();

    }

}