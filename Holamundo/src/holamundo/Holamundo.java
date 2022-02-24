/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Yael
 */
public class Holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo");
        Persona per1 = new Persona();
        per1.setNombre("Yael MV");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("Hamburgesa hawaiana");

        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre: " + per2.getNombre());
        per2.comer("Pizza hawaiana");

        Automovil bocho = new Automovil();
        bocho.setMarca("VW");
        System.out.println("Marca: " + bocho.getMarca());
        bocho.setSubMarca("Sedan");
        System.out.println("Submarca: " + bocho.getSubMarca());
        bocho.setModelo(1970);
        System.out.println("Modelo: " + bocho.getModelo());
        bocho.setColor(Color.blue);
        System.out.println("Color: " + bocho.getColor());

        Automovil mustang = new Automovil();
        mustang.setMarca("Ford");
        System.out.println("Marca: " + mustang.getMarca());
        mustang.setSubMarca("Mustang");
        System.out.println("Submarca: " + mustang.getSubMarca());
        mustang.setModelo(2010);
        System.out.println("Modelo: " + mustang.getModelo());
        mustang.setColor(Color.yellow);
        System.out.println("Color: " + mustang.getColor());

        Automovil akura = new Automovil();
        akura.setMarca("Akura");
        System.out.println("Marca: " + akura.getMarca());
        akura.setSubMarca("NSX");
        System.out.println("Submarca: " + akura.getSubMarca());
        akura.setModelo(2013);
        System.out.println("Modelo: " + akura.getModelo());
        akura.setColor(Color.gray);
        System.out.println("Color: " + akura.getColor());
    }

}
