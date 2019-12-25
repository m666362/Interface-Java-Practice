package org.richit.interface_library.Main;

import org.richit.interface_library.Class.Machine;
import org.richit.interface_library.Class.Person;
import org.richit.interface_library.Interface.Info;

public class MyClass {

    static Person person1, person2;
    static Machine machine1, machine2;
    static Info info1, info2, info3;

    static void initObject(){

        person1 = new Person();
        machine1 = new Machine();
        info1 = new Info() {
            @Override
            public Person showInfo() {
                System.out.println("I do nothing");
                return null;
            }
        };

        person1 = new Person();
        info2 = new Machine();
        info3 = new Person();
    }

    public static void main(String[] args) {

        System.out.println("-----------------Project Open----------------");
        initObject();
        person1.showInfo();
        machine1.showInfo();
        info1.showInfo();

        info2.showInfo();
        info3.showInfo();



        System.out.println("-----------------Project End-----------------");
    }
    public void outputInfo(Info info){
        info.showInfo();
    }
}