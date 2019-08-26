package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        Professor professor1 = new Professor("Zbigniew", "Mućko", 60);
        Doctor doctor1 = new Doctor("Marcin", "Jasiński", 45);
        Master master1 = new Master("Rafał", "Surmacz", 32);
        Lector lector1 = new Lector("Adam", "Małecki", 54);
        Charwoman charwoman1 = new Charwoman("Ania", "Sosnowska", 30);

        List<Employee> list = new ArrayList<>();
        list.add(professor1);
        list.add(doctor1);
        list.add(master1);
        list.add(lector1);
        list.add(charwoman1);

        for (Employee AllWorkers: list) {
            System.out.println(AllWorkers);
        }

    }
}
