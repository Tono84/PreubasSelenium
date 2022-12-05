/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocalidad;

import javax.swing.JOptionPane;

/**
 *
 * @author joses
 */
public class Menu {

    private byte opcion;
    
    private ChromeTest c= new ChromeTest();


    public void mostrarMenu() {

        String opciones = "***MENÚ PRINCIPAL***\n\n";

        opciones += "1. Prueba de Caso 2  \n";
        opciones += "2. Prueba de Caso 4  \n";
        opciones += "3. Prueba de Caso 5  \n";
        opciones += "4. Prueba de Caso 7  \n";
        opciones += "5. Salir\n";
        opciones += "Digite su opción:";

        while (opcion != 5) {
            
            opcion = Byte.parseByte(JOptionPane.showInputDialog(null, opciones));

            switch (opcion) {
                case 1 -> {
                    c.prueba1();
                }
                case 2 -> {
                    c.prueba2();
                }
                case 3 -> {
                    c.prueba3();
                }
                case 4 -> {
                    c.prueba4();
                }
                case 5 -> {
                    System.exit(0);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "¡Opción incorrecta!");
                }
            }

        }

    }
}
