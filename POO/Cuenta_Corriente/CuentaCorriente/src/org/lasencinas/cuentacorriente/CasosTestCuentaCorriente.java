
package org.lasencinas.cuentacorriente;

public class CasosTestCuentaCorriente {
    public static void main(String[] args) {
    CuentaCorriente cuentaCorrienteMarcosEmbargadaBanco = new CuentaCorriente("Marcos", "Monjon","Calvia", "66666666666",true);
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getNombreCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getApellidosCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getDireccionCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getTelefonoCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getNifCliente());
  }
}
