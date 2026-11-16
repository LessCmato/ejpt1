package Poo;

public class Termometro {
    private double temperatura;
    public Termometro() {
        this.temperatura = 20;
    }
    public void subir(double grados) {
        this.temperatura += grados;
    }
    public void bajar(double grados) {
        this.temperatura -= grados;
    }
    public String estado() {
        return "Temperatura: " + temperatura + "C";
    }
    public static void main(String[] args) {
        Termometro t = new Termometro();
        System.out.println(t.estado());   
        t.subir(5);
        System.out.println(t.estado());  

        t.bajar(10);
        System.out.println(t.estado());   
    }
}