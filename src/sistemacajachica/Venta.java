/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacajachica;

/**
 *
 * @author VICTOR
 */
public class Venta {
    
    String fecha; 
    String comprobante; 
    String codigo; 
    String concepto; 
    String personal; 
    float importe; 
    String operacion; 
    String detalle; 

    public Venta(String fecha, String comprobante, String codigo, String concepto, String personal, float importe, String operacion, String detalle) {
        this.fecha = fecha;
        this.comprobante = comprobante;
        this.codigo = codigo;
        this.concepto = concepto;
        this.personal = personal;
        this.importe = importe;
        this.operacion = operacion;
        this.detalle = detalle;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
    
}
