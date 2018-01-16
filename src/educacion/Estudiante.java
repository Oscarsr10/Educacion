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
public class Estudiante extends Persona {
    
    private String instituto;
    private double curso;

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getCurso() {
        return curso;
    }

    public void setCurso(double curso) {
        this.curso = curso;
    }
    
}
