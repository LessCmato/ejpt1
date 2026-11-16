package Poo;

public class Lampara {
    public boolean encendida = false;
    public void encender(){
        this.encendida = true;
    }
    public void apagar() {
        this.encendida= false;
    }
    public void mostrarEstado() {
        if (this.encendida) {
            System.out.println("La lámpara está encendida.");
        } else {
            System.out.println("La lámpara está apagada.");
        }
    }
    public static void main(String[] args) {
        Lampara lampara = new Lampara();
        lampara.mostrarEstado(); 
        lampara.encender();
        lampara.mostrarEstado(); 
        lampara.apagar();
        lampara.mostrarEstado(); 
    }
}