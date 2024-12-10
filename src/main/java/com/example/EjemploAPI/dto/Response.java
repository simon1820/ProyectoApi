package com.example.EjemploAPI.dto;

public class Response {
    private String nombre;
    private String dirreccion;
    private String correo;

    public Response() {
    }

    public Response(String nombre, String dirreccion, String correo) {
        this.nombre = nombre;
        this.dirreccion = dirreccion;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
