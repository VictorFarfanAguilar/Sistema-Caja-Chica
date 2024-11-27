/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sistemacajachica;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VICTOR
 */
public class ListaVentas extends javax.swing.JPanel {
DefaultTableModel modelo1 = new DefaultTableModel();
DefaultTableModel modelo2 = new DefaultTableModel();
DefaultTableModel modelo3 = new DefaultTableModel();
    /**
     * Creates new form ListaVentas
     * @param sumaIngresos
     */
    public ListaVentas() {
        initComponents();
        agregarModeloTabla();
        llenarTabla();
        agregarModeloTabla2();
        llenarTabla2();
        agregarModeloTabla3();
        llenarTabla3();

    }
    
    private void agregarModeloTabla(){
                modelo1.addColumn("fecha");
                modelo1.addColumn("comprobante");
                modelo1.addColumn("codigo");
                               modelo1.addColumn("concepto");
                modelo1.addColumn("personal");
                modelo1.addColumn("importe");
                modelo1.addColumn("operacion");
                modelo1.addColumn("detalle");

                

        
    }
    private void agregarModeloTabla2(){
                modelo2.addColumn("fecha");
                modelo2.addColumn("comprobante");
                modelo2.addColumn("codigo");
                modelo2.addColumn("concepto");
                modelo2.addColumn("personal");
                modelo2.addColumn("importe");
                modelo2.addColumn("operacion");
                modelo2.addColumn("detalle");   
    }
        
    private void agregarModeloTabla3(){
        modelo3.addColumn("Saldo inicial");
        modelo3.addColumn("Ingresos");
        modelo3.addColumn("Egresos");
        modelo3.addColumn("Saldo Final");
        
        
    }
    private void llenarTabla(){
        
       
            
        
        
        int cantidad = GestionadorCajaChica.listaVentasIngreso.size();
        for( int i=0; i<cantidad; i++){
            String fecha = GestionadorCajaChica.listaVentasIngreso.get(i).getFecha();
            String comprobante  = GestionadorCajaChica.listaVentasIngreso.get(i).getComprobante();
            String codigo = GestionadorCajaChica.listaVentasIngreso.get(i).getCodigo();
            String concepto = GestionadorCajaChica.listaVentasIngreso.get(i).getConcepto();
                        String personal = GestionadorCajaChica.listaVentasIngreso.get(i).getPersonal();
            String importe = String.valueOf(GestionadorCajaChica.listaVentasIngreso.get(i).getImporte());
            String operacion = GestionadorCajaChica.listaVentasIngreso.get(i).getOperacion();
            
            String detalle = GestionadorCajaChica.listaVentasIngreso.get(i).getDetalle();
            
            

            String [] listaVenta = {fecha,comprobante,codigo,concepto,personal,importe,operacion,detalle};
            modelo1.addRow(listaVenta);
            
        }
    }
    
    private void  llenarTabla3(){
        int cantidadFilasIngresos = tblVentaIngresos.getRowCount();
        int cantidadFilasEgresos = tblVentaEgresos.getRowCount();

        
        float sumaIngresos=0;
        float sumaEgresos=0;
        for ( int i=0; i<cantidadFilasIngresos; i++){
            
            sumaIngresos = sumaIngresos + Float.parseFloat(tblVentaIngresos.getValueAt(i, 5).toString());
        }
        for ( int i=0; i<cantidadFilasEgresos; i++){
            
            sumaEgresos = sumaEgresos + Float.parseFloat(tblVentaEgresos.getValueAt(i, 5).toString());
        }
        String inicial = "1000";
        String ingresos = Float.toString(sumaIngresos);
        String egresos = Float.toString(sumaEgresos);
        float total = Float.parseFloat(inicial)+sumaIngresos-sumaEgresos;
        String totalFinal = String.valueOf(total);
        
        String [] lista ={ inicial,ingresos,egresos,totalFinal};
        modelo3.addRow(lista);
        
        
        
        
    }
    
    private void llenarTabla2(){
         int cantidad = GestionadorCajaChica.listaVentasEgreso.size();
        for( int i=0; i<cantidad; i++){
            String fecha = GestionadorCajaChica.listaVentasEgreso.get(i).getFecha();
            String comprobante  = GestionadorCajaChica.listaVentasEgreso.get(i).getComprobante();
            String codigo = GestionadorCajaChica.listaVentasEgreso.get(i).getCodigo();
            String concepto = GestionadorCajaChica.listaVentasEgreso.get(i).getConcepto();
                        String personal = GestionadorCajaChica.listaVentasEgreso.get(i).getPersonal();
            String importe = String.valueOf(GestionadorCajaChica.listaVentasEgreso.get(i).getImporte());
            String operacion = GestionadorCajaChica.listaVentasEgreso.get(i).getOperacion();
            
            String detalle = GestionadorCajaChica.listaVentasIngreso.get(i).getDetalle();
            
            

            String [] listaVenta2 = {fecha,comprobante,codigo,concepto,personal,importe,operacion,detalle};
            modelo2.addRow(listaVenta2);
            
            
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentaIngresos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVentaEgresos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblResumen = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        bnbEliminarEgreso = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblVentaIngresos.setModel(modelo1);
        jScrollPane1.setViewportView(tblVentaIngresos);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE LAS VENTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblVentaEgresos.setModel(modelo2
        );
        jScrollPane2.setViewportView(tblVentaEgresos);

        tblResumen.setModel(modelo3
        );
        jScrollPane3.setViewportView(tblResumen);

        btnEliminar.setBackground(new java.awt.Color(0, 153, 255));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        bnbEliminarEgreso.setBackground(new java.awt.Color(0, 153, 255));
        bnbEliminarEgreso.setForeground(new java.awt.Color(255, 255, 255));
        bnbEliminarEgreso.setText("Eliminar");
        bnbEliminarEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbEliminarEgresoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 153, 255));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Crear PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Abrir pdf");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnEliminar)
                                .addGap(36, 36, 36)
                                .addComponent(btnEditar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(bnbEliminarEgreso)
                                .addGap(29, 29, 29)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 93, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnbEliminarEgreso)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        
        try{
            int fila = tblVentaIngresos.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(null, "seleecione una fila ");
                
            }else{
            String codigo = tblVentaIngresos.getValueAt(fila, 2).toString();
                   
                    modelo1.removeRow(tblVentaIngresos.getSelectedRow());
                GestionadorCajaChica.eliminarVentaIngreso(codigo);
            }
        }catch(Exception e){
            System.out.println("errores");
        }





        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void bnbEliminarEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbEliminarEgresoActionPerformed
        
try{
            int fila = tblVentaEgresos.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(null, "seleecione una fila ");
                
            }else{
            String codigo = tblVentaEgresos.getValueAt(fila, 2).toString();
                   
                    modelo2.removeRow(tblVentaEgresos.getSelectedRow());
                GestionadorCajaChica.eliminarVentaEgreso(codigo);
            }
        }catch(Exception e){
            System.out.println("errores");
        }// TODO add your handling code here:
    }//GEN-LAST:event_bnbEliminarEgresoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
AgregarMovimientoPanel editar =   new AgregarMovimientoPanel();
int filaSeleccionada = tblVentaIngresos.getSelectedRow();
if ( filaSeleccionada>=0){
    editar.setVisible(true);
    
}else{
    System.out.println("seleccione una fila ");
}






// TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
GestionadorCajaChica.crearPDF();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       GestionadorCajaChica.abir();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnbEliminarEgreso;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblResumen;
    private javax.swing.JTable tblVentaEgresos;
    private javax.swing.JTable tblVentaIngresos;
    // End of variables declaration//GEN-END:variables
}
