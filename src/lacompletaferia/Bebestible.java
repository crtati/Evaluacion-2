/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacompletaferia;

/**
 *
 * @author Taty
 */
public class Bebestible extends Producto {
    protected String litros;
    //Constructores
    public Bebestible() {
    }

    public Bebestible(String marca, String categoria, int precio, String litros) {
        super(marca, categoria, precio);
        this.litros = litros;
    }
    //Setters y Getters

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }
    //Metodos
    @Override
    public String toString(){
        return " Marca: "+getMarca() + " | " + "Tipo de animal: "+getLitros() + " | " + "Precio:"
                + getPrecio() + " | " + "Categoria: " + getCategoria();
    }
    @Override
    public double totalCompra(){
        double total = 0;
        Carrito car = new Carrito();
        return total = this.precio*car.contadorBebestibles;
    }
}
