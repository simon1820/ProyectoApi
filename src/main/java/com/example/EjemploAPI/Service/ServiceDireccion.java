package com.example.EjemploAPI.Service;

import com.example.EjemploAPI.dao.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDireccion {
    @Autowired
    private Consulta consulta;

    public String obtenerDireccion(String nombre) {
        return consulta.llamarProcedimiento(nombre);
    }
}
