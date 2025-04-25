package View;

import Models.Persona;

public class ViewConsole {
    public void printArray(Persona[] personas){
        for (Persona p : personas){
            System.out.println(p);
        }
        System.out.println();
    }
}
