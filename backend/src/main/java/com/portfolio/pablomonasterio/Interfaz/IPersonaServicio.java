/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.pablomonasterio.Interfaz;

import com.portfolio.pablomonasterio.Entidad.Persona;
import java.util.List;

/**
 *
 * @author PABLO
 */
public interface IPersonaServicio {
    //Traer una lista de usuarios
    public List<Persona> getPersona();
    
    //Guardar un usuario
    public void savePersona(Persona persona);
    
    //Eliminar un usuario, primero lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar un usuario por id
    public Persona findPersona(Long id);
       
}
