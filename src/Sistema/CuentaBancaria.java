package Sistema;

public abstract class CuentaBancaria {

    private String titular;
    double saldo;

   

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;


    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    


    public void depositar (double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
        }
    }
    
    public void retirar (double cantidad){
        if(cantidad > 0){
            saldo -= cantidad;
        }
    }
    
    
    public abstract void mostrarDetalles();

}
