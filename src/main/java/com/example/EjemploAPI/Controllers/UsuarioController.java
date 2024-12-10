package com.example.EjemploAPI.Controllers;

import com.example.EjemploAPI.Service.ServiceDireccion;
import com.example.EjemploAPI.dto.Request;
import com.example.EjemploAPI.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private ServiceDireccion serviceDireccion;

public UsuarioController(ServiceDireccion serviceDireccion){
    this.serviceDireccion = serviceDireccion;
}
    @PostMapping("/direccion")
    public Response obtenerDireccion(@RequestBody Request direccion) {
        return new Response();
        //return serviceDireccion.obtenerDireccion(nombre);
    }
}

