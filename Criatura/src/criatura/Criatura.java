/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public abstract class Criatura {
    String nombre;
    protected int salud;
    protected int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public boolean estaViva() {
        return salud > 0;
    }

    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int dano);

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }
}
