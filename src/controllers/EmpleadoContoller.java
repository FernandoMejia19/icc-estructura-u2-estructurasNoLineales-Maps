package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {
    private HashMap<Integer,Empleado>empleados;
    public EmpleadoContoller() {
        empleados=new HashMap<>();//inicializa empleados
    }
    public void addEmpleado(Empleado empleado){
        empleados.put(empleado.getId(),empleado);
    }
    public Empleado getEmpleado(int id){
        return empleados.get(id);
    }
    public void imprimirEmpleado(){
        ///System.out.println(empleados);
        for(Empleado emp:empleados.values()){
            System.out.println(emp);
        }
    }
}