package model;

public class Transaction {
    private int amount;
    private String fecha;

    /**
     * Tipo de transacción
     * 1 Ingreso de dinero
     * 2 Retiro de dinero
     */
    private int type;

    /**
     * Metodo que cosntruye un objeto de la clase Transaccion <br>
     * 
     * @param amount valor del movimiento
     * @param fecha fecha en la cual se realiza el movimeinto
     * @param type tipo de movimiento, 1 == ingreso, 2 == retiro
     */

    private String description;
    /**
     * 
     * @param amount
     * @param fecha
     * @param type
     */

    
    public Transaction(int amount, String fecha, int type, String description) {
        super();
        this.amount = amount;
        this.fecha = fecha;
        this.type = type;
        this.description = description;
    }

    /**
     * Retorna el valor del movimiento
     * @return amount
     */

    public int getAmount() {
        return amount;
    }
    public String getFecha() {
        return fecha;
    }
    public int getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }

    public String toString() {
        return "Monto: $" + amount +",  Fecha: " + fecha +" Tipo: "+ ((type==1)? "Ingreso":"Egreso")+ ", Descripcion"
    }
}
