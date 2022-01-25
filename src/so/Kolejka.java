package so;

import java.util.LinkedList;
import java.util.Queue;

public class Kolejka {
    private final Queue<PCB> procesy=new LinkedList<>();
    
    public void dodaj(PCB pcb){
        procesy.add(pcb);
    }
    public void usuń(){
        procesy.remove();
    }
    public void wypisz(){
        for(PCB pcb:procesy){
            System.out.println("Stan: "+pcb.stan);
        }
    }
}