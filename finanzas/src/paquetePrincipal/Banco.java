package paquetePrincipal;
import java.util.List;

public class Banco {
    private List<Sucursal> sucursales;
    private List<Empleado> empleados;
    private List<Cliente> clientes;

    public Banco(List<Sucursal> sucursales, List<Empleado> empleados, List<Cliente> clientes) {
        this.sucursales = sucursales;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
