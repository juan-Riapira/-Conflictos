package control;

import java.util.ArrayList;

import model.Persona;

public class PersonaControl {

    ArrayList<Persona> persona = new ArrayList<>();

    public void delete(String nombre) {
        persona.remove(nombre);

    }

    }

    public boolean addPerson(String name, int age) {

        Persona p1 = new Persona(name, age);
        if (p1 != null) {
            persona.add(p1);
            return true;

        }
        return false;
    }

    public Persona findPersona() {

    }
}
