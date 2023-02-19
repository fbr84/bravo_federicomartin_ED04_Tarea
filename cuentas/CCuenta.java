package cuentas;
/** La clase CCuenta emula el comportamiento de una cuenta bancaria
 * 
 * @author fedeb
 * @version 1.0
 * @since 19/02/2023
 *
 **/
public class CCuenta {
	/**
	 * Atributos
	 */
    private String nombre;
	private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * @return Devuelve el nombre del titular de la cuenta
     */
    public String getNombre() {
		return nombre;
	}
    /**
     * @param nombre del titular a pasar como parametro
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return Devuelve el número de la cuenta bancaria
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta numero de cuenta a pasar como parametro
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * @return devuelve el saldo de la cuenta bancaria
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo de la cuenta a pasar como parametro
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return Devuelve el tipo de interes a aplicar
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * @param tipoInterés tipo de interes a pasar como parametro
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    /**
     * Constructor sin parametros
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con los parametros
     * @param nom String, Nombre del Titular
     * @param cue String, Número de la cuenta bancaria
     * @param sal double, Saldo de la cuenta bancaria
     * @param tipo double, Interés aplicado
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /** 
     * @return Saldo de cuenta bancaria
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * 
     * @param cantidad Indicará la cantidad a ingresar en la cuenta.
     * @throws Exception Sucede cuando el numero a ingresar es negativo.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * 
     * @param cantidad Indicará la cantidad a retirar de la cuenta.
     * @throws Exception Sucede cuando el numero es negativo o se haya indicado un valor superior al saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
