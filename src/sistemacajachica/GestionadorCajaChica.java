 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacajachica;

import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author VICTOR
 */
public class GestionadorCajaChica {
    
    public  static ArrayList< Personal> persona = new ArrayList();
            public static ArrayList<Venta> listaVentasIngreso = new ArrayList<>();
                        public static ArrayList<Venta> listaVentasEgreso = new ArrayList<>();

       public static void agregarPersonal( Personal personal){
        persona.add(personal);
        }
        public static void agregarVentaIngreso(Venta unaVenta){
            listaVentasIngreso.add(unaVenta);
            
        }
        public static void agregarVentaEgreso(Venta unaVenta){
            listaVentasEgreso.add(unaVenta);
            
        }
    
    
    
   
    
   public static void eliminarPersonal( String codigo ){
       for(int i=0; i<persona.size();i++){
           
           if(persona.get(i).getCodigo().equals(codigo)){
               persona.remove(i);
           }
           
       }
       
       
       
   }
   public static void eliminarVentaIngreso( String codigo ){
       for(int i=0; i<listaVentasIngreso.size();i++){
           
           if(listaVentasIngreso.get(i).getCodigo().equals(codigo)){
               listaVentasIngreso.remove(i);
           }
           
       }
   }
    public static void eliminarVentaEgreso( String codigo ){
       for(int i=0; i<listaVentasEgreso.size();i++){
           
           if(listaVentasEgreso.get(i).getCodigo().equals(codigo)){
               listaVentasEgreso.remove(i);
           }
           
       }
      
    }
    
    public static void editarVentaIngreso(Venta v){
        for ( int i=0; i<listaVentasIngreso.size();i++){
             if(listaVentasIngreso.get(i).getCodigo().equals(v.getCodigo())){
                 listaVentasIngreso.get(i).setComprobante(v.getComprobante());
                 listaVentasIngreso.get(i).setConcepto(v.getConcepto());
                 listaVentasIngreso.get(i).setDetalle(v.getDetalle());
                 listaVentasIngreso.get(i).setFecha(v.getFecha());
                 listaVentasIngreso.get(i).setImporte(v.getImporte());
                 listaVentasIngreso.get(i).setOperacion(v.getOperacion());

             }
            
            
        }
        
        
        
    }
      public static void editarVentaEgreso(Venta v){
        for ( int i=0; i<listaVentasEgreso.size();i++){
             if(listaVentasEgreso.get(i).getCodigo().equals(v.getCodigo())){
                 listaVentasEgreso.get(i).setComprobante(v.getComprobante());
                 listaVentasEgreso.get(i).setConcepto(v.getConcepto());
                 listaVentasEgreso.get(i).setDetalle(v.getDetalle());
                 listaVentasEgreso.get(i).setFecha(v.getFecha());
                 listaVentasEgreso.get(i).setImporte(v.getImporte());
                 listaVentasEgreso.get(i).setOperacion(v.getOperacion());

             }
            
            
        }
        
        
        
    }
      public static void crearPDF(){
         Plantilla plantilla = new Plantilla(listaVentasIngreso,listaVentasEgreso);  
         plantilla.crearPlantilla();
      }
      public static void abir(){
    try{
        File path = new File("victor.pdf");
        Desktop.getDesktop().open(path);
    }catch(Exception ex){
        System.out.println("atencion");
    }
      
}
}

   

