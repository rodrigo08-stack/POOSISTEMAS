package pe.edu.upeu.sysventas.enums;

public enum TipoProducto {
    PRODUCTO("producto");
    PREPARADO("PREPARADO")
    SERVICIO("prepagardo");


    String descripcion;

    TipoProducto(String descripcion){
        this.descripcion=descripcion;

    }
}
