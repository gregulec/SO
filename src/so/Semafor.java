package so;

public class Semafor {
    private final String nazwa;
    private int wartość;
    private final Kolejka procesy=new Kolejka();

    public Semafor(int wartość, String nazwa) {
        this.wartość = wartość;
        this.nazwa = nazwa;
    }
    public void czekaj(PCB pcb){
        System.out.println("Operacja wait na "+nazwa+" semaforze");
        System.out.println("Wartość "+nazwa+" semafora: "+wartość);
        wartość=wartość-1;
        System.out.println("Wartość "+nazwa+" semafora: "+wartość);
        if(wartość<0){
            procesy.dodaj(pcb);        //   dodanie PCB do kolejki
            pcb.ustawStan("WAITING");  //   ustawienie stanu procesu na waiting
            System.out.println("Kolejka pod "+nazwa+" semaforem:");
            procesy.wypisz();    
        }
        System.out.println();
    }
    public void sygnalizuj(PCB pcb){
        System.out.println("Operacja signal na "+nazwa+" semaforze");
        System.out.println("Wartość "+nazwa+" semafora: "+wartość);        
        wartość=wartość+1;
        System.out.println("Wartość "+nazwa+" semafora: "+wartość);        
        if(wartość<=0){
            procesy.usuń();
            System.out.println("Kolejka pod "+nazwa+" semaforem:");
            procesy.wypisz();           //   usunięcie PCB z kolejki
            pcb.ustawStan("READY");     //   ustawienie stanu procesu na ready    
            System.out.println("Stan procesu usuniętego z kolejki:");
            pcb.wypisz();
        }
        System.out.println();
    }
}