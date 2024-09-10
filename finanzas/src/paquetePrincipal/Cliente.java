
package paquetePrincipal;

import java.util.List;

public class Cliente {
    private String codigo;
    private String nombre;
    private String direccion;
    private List<Cuenta> cuentas;

    public Cliente(String codigo, String nombre, String direccion, List<Cuenta> cuentas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = cuentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}

