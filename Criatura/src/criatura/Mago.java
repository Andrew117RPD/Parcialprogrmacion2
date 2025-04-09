/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criatura;



class Mago extends Criatura {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerza;
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        objetivo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        salud -= dano;
        System.out.println(nombre + " recibe el hechizo. Salud restante: " + salud);
    }
}
