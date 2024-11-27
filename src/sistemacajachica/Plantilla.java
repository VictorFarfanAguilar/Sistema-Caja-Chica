/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacajachica;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author VICTOR
 */
public class Plantilla {
    ArrayList<Venta> listaVentasIngreso;
    ArrayList<Venta> listaVentasEgreso;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public Plantilla( ArrayList<Venta> listaVentasIngreso,ArrayList<Venta> listaVentasEgreso){
        this.listaVentasIngreso=listaVentasIngreso;
        this.listaVentasEgreso=listaVentasEgreso;
        documento = new Document();
        titulo = new Paragraph("SISTEMA CAJA CHICA FARVIC");
        
        
    }
    
    public void crearPlantilla(){
        try{
            archivo = new FileOutputStream("victor.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);
            
            documento.add(Chunk.NEWLINE);
            Paragraph texto = new Paragraph("LISTA VENTAS INGRESO");
            Paragraph texto2 = new Paragraph("LISTA VENTAS EGRESO");

            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            texto2.setAlignment(Element.ALIGN_JUSTIFIED);

            documento.add(texto);
                        documento.add(Chunk.NEWLINE);
PdfPTable tabla = new PdfPTable(7);
tabla.setWidthPercentage(100);

PdfPTable tabla2 = new PdfPTable(7);
tabla2.setWidthPercentage(100);

PdfPCell fecha = new PdfPCell(new Phrase("fecha"));
PdfPCell comprobante = new PdfPCell(new Phrase("comprobante"));
PdfPCell codigo = new PdfPCell(new Phrase("codigo"));

PdfPCell concepto = new PdfPCell(new Phrase("concepto"));
PdfPCell personal = new PdfPCell(new Phrase("personal"));
PdfPCell importe = new PdfPCell(new Phrase("importe"));
PdfPCell operacion = new PdfPCell(new Phrase("operacion"));
tabla.addCell(fecha);
tabla.addCell(comprobante);
tabla.addCell(codigo);
tabla.addCell(concepto);
tabla.addCell(personal);
tabla.addCell(importe);
tabla.addCell(operacion);

for(int i=0; i<listaVentasIngreso.size();i++){
    
    tabla.addCell(listaVentasIngreso.get(i).getFecha());
    tabla.addCell(listaVentasIngreso.get(i).getComprobante());
    tabla.addCell(listaVentasIngreso.get(i).getCodigo());
    tabla.addCell(listaVentasIngreso.get(i).getConcepto());
    tabla.addCell(listaVentasIngreso.get(i).getPersonal());
    tabla.addCell(String.valueOf(listaVentasIngreso.get(i).getImporte()));
    
    tabla.addCell(listaVentasIngreso.get(i).getOperacion());
    
}
tabla2.addCell(fecha);
tabla2.addCell(comprobante);
tabla2.addCell(codigo);
tabla2.addCell(concepto);
tabla2.addCell(personal);
tabla2.addCell(importe);
tabla2.addCell(operacion);
for(int i=0; i<listaVentasEgreso.size();i++){
    
    tabla2.addCell(listaVentasEgreso.get(i).getFecha());
    tabla2.addCell(listaVentasEgreso.get(i).getComprobante());
    tabla2.addCell(listaVentasEgreso.get(i).getCodigo());
    tabla2.addCell(listaVentasEgreso.get(i).getConcepto());
    tabla2.addCell(listaVentasEgreso.get(i).getPersonal());
    tabla2.addCell(String.valueOf(listaVentasEgreso.get(i).getImporte()));
    
    tabla2.addCell(listaVentasEgreso.get(i).getOperacion());
    
}







documento.add(tabla);
documento.add(Chunk.NEWLINE);
documento.add(texto2);
documento.add(Chunk.NEWLINE);
documento.add(tabla2);
documento.close();
            System.out.println("archivo creado correctamente");
            
        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());
            
        }catch(DocumentException e){
                        System.err.println(e.getMessage());

        }
       
    }
    
}
