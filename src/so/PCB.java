package so;

public class PCB {
    protected String stan;

    public PCB(String stan) {
        this.stan = stan;
    }
    
    public void ustawStan(String stan){
        this.stan=stan;
    }    

    void wypisz() {
        System.out.println("Stan: "+stan);
    }
}