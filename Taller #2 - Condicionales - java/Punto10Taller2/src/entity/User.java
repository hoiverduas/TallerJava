package entity;

import repository.IuserRepository;

public class User {


    private  String nombreUsuario;
    private String numeroCuenta;
    private String clave;


    private Integer saldo;

    public User(String numeroCuenta, String clave, String nombreUsuario, Integer saldo) {
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
        this.nombreUsuario = nombreUsuario;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "User{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", clave='" + clave + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
