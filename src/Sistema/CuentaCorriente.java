package Sistema;

public class CuentaCorriente extends CuentaBancaria {

    private double sobregiro, depositar, retirar;

    public CuentaCorriente(String titular, double saldo, double sobregiro, double retirar) {
        super(titular, saldo);
        this.sobregiro = sobregiro;
        this.retirar = retirar;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }
    
    
    @Override
    public void mostrarDetalles() {
       
        
        double total = getSaldo() + sobregiro;
        
        if(retirar > total){
            
            System.out.println("No puedes retirar mas de: "+total);
                  
        }
               
        System.out.println("Cuenta de corriente - Titular: " + getTitular() + ", saldo: " + getSaldo()
                + ", limite de sobre giro: " +sobregiro+
                "ingrese valor a retirar: "+retirar+ "Su total es: "+total);
        }
       
     
    }


