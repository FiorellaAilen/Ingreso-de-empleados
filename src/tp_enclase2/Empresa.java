package tp_enclase2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    String razonSocial;
    int cuit;
    List <Empleado> empleados;

    public Empresa(String razonSocial, int cuit, List<Empleado> empleados) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<Empleado>();
    }
    
    public Empresa(){
        this.empleados = new ArrayList<Empleado>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
        
    }
    
    public void mostrarEmpleados(){
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.razonSocial);
        hash = 97 * hash + this.cuit;
        hash = 97 * hash + Objects.hashCode(this.empleados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.cuit != other.cuit) {
            return false;
        }
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        if (!Objects.equals(this.empleados, other.empleados)) {
            return false;
        }
        return true;
    }

    
    
}
