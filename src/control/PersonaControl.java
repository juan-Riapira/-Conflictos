package control;

import java.util.ArrayList;

import model.Persona;

public class PersonaControl {

    ArrayList<Persona> persona = new ArrayList<>();

    public boolean addPerson(String name, int age) {

        Persona p1 = new Persona(name, age);
        if (p1 != null) {
            persona.add(p1);
            return true;

        }
        return false;
    }
}
