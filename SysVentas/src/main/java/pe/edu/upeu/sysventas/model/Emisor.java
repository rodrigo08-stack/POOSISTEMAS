package pe.edu.upeu.sysventas.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emisor {
    long  idEmisor;
    String ruc;
    String nombreComercial;
    String ubigeo;
    String domocilioFiscal;
    String urbanizacion;
    String deparatamento;
    String provincia ;
    String distrito;
}
