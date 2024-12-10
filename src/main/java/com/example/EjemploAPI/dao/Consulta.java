package com.example.EjemploAPI.dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Repository;

@Repository
public class Consulta {

        @PersistenceContext
        private EntityManager entityManager;

        public String llamarProcedimiento(String nombre) {
            // Crear una consulta para el procedimiento almacenado
            StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("obtenerDireccion");

            // Registrar parámetros de entrada y salida
            storedProcedureQuery.registerStoredProcedureParameter("nombre", String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("direccion", String.class, ParameterMode.OUT);

            // Establecer valores de los parámetros de entrada
            storedProcedureQuery.setParameter("nombre", nombre);

            // Ejecutar el procedimiento almacenado
            storedProcedureQuery.execute();

            // Recuperar el parámetro de salida
            return (String) storedProcedureQuery.getOutputParameterValue("direccion");
        }
    }

