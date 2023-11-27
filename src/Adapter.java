// Paso 1: Crear la interfaz de Pago
interface Pago {
    void realizarPago(double monto);
}

// Paso 2: Crear clases concretas para sistemas de pago
class TarjetaCredito {
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito procesado: " + monto);
    }
}

class PayPal {
    public void enviarPago(double monto) {
        System.out.println("Pago con PayPal enviado: " + monto);
    }
}

// Paso 3: Crear la clase Adaptador
class TarjetaCreditoAdapter implements Pago {
    private TarjetaCredito tarjetaCredito;

    public TarjetaCreditoAdapter(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    @Override
    public void realizarPago(double monto) {
        tarjetaCredito.procesarPago(monto);
    }
}

class PayPalAdapter implements Pago {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void realizarPago(double monto) {
        payPal.enviarPago(monto);
    }
}

// Clase para demostrar el uso del patrón Adapter
public class Adapter implements Patron {
    @Override
    public void ejecutarEjemplo(String[] args) {
        Pago pagoTarjeta = new TarjetaCreditoAdapter(new TarjetaCredito());
        pagoTarjeta.realizarPago(100.0);

        Pago pagoPayPal = new PayPalAdapter(new PayPal());
        pagoPayPal.realizarPago(200.0);
    }
}
