/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author juan
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private int edad;
    private String ciudad;

    /**
     *
     */
    public Persona() {
    }

    /**
     *
     * @param nombre
     * @param apellido
     * @param correo
     * @param edad
     * @param ciudad
     */
    public Persona(String nombre, String apellido, String correo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public String getFoto() {
        return ciudad;
    }

    /**
     *
     * @param foto
     */
    public void setFoto(String foto) {
        this.ciudad = foto;
    }
    
    
    
}
