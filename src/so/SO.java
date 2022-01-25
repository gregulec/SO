package so;

public class SO {
    PCB pcb = new PCB("START");
    
    public void zaczekaj(Semafor semafor){
        semafor.czekaj(pcb);
    }
    public void zasygnalizuj(Semafor semafor){
        semafor.sygnalizuj(pcb);
    }
    public static void main(String[] args) {
        Semafor semafor1= new Semafor(0,"I");
        Semafor semafor2= new Semafor(1,"II");
        SO proces1=new SO();
        SO proces2=new SO();
        
        proces1.zaczekaj(semafor1);
        proces2.zaczekaj(semafor1);
        
    }   
}