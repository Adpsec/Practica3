/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uv.org.practica3;

/**
 *
 * @author kali
 */
public class Practica3 {

    public static void main(String[] args) {
//        claseAhija cah = new claseAhija();
//        cah.imprimir();

        claseA ca = null;
        
        ca = new claseAhija();
        ca.imprimir();
        
        ca = new claseAhija2();
        ca.imprimir();
        
        ca = new claseA() {
            @Override
            public void msg() {
                System.out.println("Hola en clase anonima");
            }
        };
        ca.imprimir();
    }
}
