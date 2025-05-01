package com.mycompany.garage;

public class Vehículo {
    private String id;
    private String tipo;
    private String color;
    private String placa;
    private String modelo;
    private String marca;
    private String lunasPolarizadas; // "Sí", "No" o "No se"

    public Vehículo (){
    
    }

    public Vehículo(String id, String tipo, String color, String placa, String modelo, String marca, String lunasPolarizadas) {
        this.id = id;
        this.tipo = tipo;
        this.color = color;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.lunasPolarizadas = lunasPolarizadas;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLunasPolarizadas() {
        return lunasPolarizadas;
    }

    public void setLunasPolarizadas(String lunasPolarizadas) {
        this.lunasPolarizadas = lunasPolarizadas;
    }

    @Override
    public String toString() {
        return "Veh\u00edculo{" + "id=" + id + ", tipo=" + tipo + ", color=" + color + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", lunasPolarizadas=" + lunasPolarizadas + '}';
    }
    
    public boolean validarCampos() {
        if (tipo.isEmpty() || placa.isEmpty() || color.isEmpty() || 
            modelo.isEmpty() || marca.isEmpty() || lunasPolarizadas.isEmpty()) {
            return false;
        }
        return true;
    }
}
