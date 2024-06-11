package Sistema;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;
    private double depositar, retirar;

    public CuentaAhorros(String titular, double saldo, double tasaInteres, double depositar, double retirar) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
        this.retirar = retirar;
        this.depositar = depositar;
    
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double TasaInteres) {
        this.tasaInteres = TasaInteres;
    }

    public double getDepositar() {

        return depositar;
        
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }


    @Override
    public void mostrarDetalles() {
        
        double total = getSaldo() + depositar - retirar;
  
        System.out.println("Cuenta de ahorros - Titular: " + getTitular() + ", saldo: " + getSaldo()
                + ", tasa de interes: "+tasaInteres+", Su deposito fue de: "+depositar+ ", Su retiro fue de: "+retirar+
                ", El total ingreso es de: " +total);
    }

}
