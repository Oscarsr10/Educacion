/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educacion;

/**
 *
 * @author Oscar
 */
public class Educacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        persona1.setNombre("Pepe");
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Paco");
        estudiante1.setInstituto("IES Iliberis");
        EstudianteInternacional estudianteInternacional1 = new EstudianteInternacional();
        estudianteInternacional1.setNombre("Nagatomo");
        estudianteInternacional1.setInstituto("King Sejong");
        estudianteInternacional1.setPais("Corea");
        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Raul");
        profesor1.setAsignatura("ISO");
        System.out.println(persona1.getNombre());
        System.out.println(estudiante1.getNombre());
        System.out.println(estudianteInternacional1.getNombre());
        System.out.println(profesor1.getNombre());
        
    }
    
}
