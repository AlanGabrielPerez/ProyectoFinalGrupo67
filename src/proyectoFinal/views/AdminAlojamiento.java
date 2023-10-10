/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.views;

import java.util.Arrays;
import javax.swing.JOptionPane;
import proyectoFinal.AccessData.AlojamientoData;
import proyectoFinal.Entidades.Alojamiento;

/**
 *
 * @author julian
 */
public class AdminAlojamiento extends javax.swing.JInternalFrame {
    
    private AlojamientoData aloja = new AlojamientoData();

    /**
     * Creates new form AdminAlojamiento
     */
    public AdminAlojamiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbAlojamientoGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbAlojamientoSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfNombreAlojamiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCiudadAlojamiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbAlojamientoModificar = new javax.swing.JButton();
        jbAlojamientoNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jcbTipoAlojamiento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxDesayuno = new javax.swing.JCheckBox();
        jCheckBoxAlmuerzo = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jtfImporteDiario = new javax.swing.JTextField();
        jCheckBoxCena = new javax.swing.JCheckBox();

        setClosable(true);

        jLabel1.setText("Administrar Alojamiento");

        jbAlojamientoGuardar.setText("Guardar");
        jbAlojamientoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlojamientoGuardarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");

        jbAlojamientoSalir.setText("Salir");

        jLabel2.setText("Alojamiento:");

        jtfNombreAlojamiento.setText("Nombre");

        jLabel3.setText("Lugar:");

        jtfCiudadAlojamiento.setText("Ciudad");
        jtfCiudadAlojamiento.setToolTipText("");

        jLabel4.setText("Categoria(Tipo):");

        jbAlojamientoModificar.setText("Modificar");

        jbAlojamientoNuevo.setText("Nuevo");

        jLabel5.setText("Alojamiento ID:");

        jTextField2.setText("Ingrese ID");

        jcbTipoAlojamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hostel", "Hotel", "Cabaña" }));

        jLabel6.setText("Tipo de Servicio:");

        jCheckBoxDesayuno.setText("Desayuno");
        jCheckBoxDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDesayunoActionPerformed(evt);
            }
        });

        jCheckBoxAlmuerzo.setText("Almuerzo");
        jCheckBoxAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAlmuerzoActionPerformed(evt);
            }
        });

        jLabel7.setText("Importe Diario:");

        jtfImporteDiario.setText("Importe");

        jCheckBoxCena.setText("Cena");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbAlojamientoGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbAlojamientoModificar)
                                .addGap(46, 46, 46)
                                .addComponent(jbAlojamientoNuevo)))
                        .addGap(32, 32, 32)
                        .addComponent(jbAlojamientoSalir)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfNombreAlojamiento))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfCiudadAlojamiento))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbTipoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(26, 26, 26)
                                        .addComponent(jCheckBoxDesayuno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfImporteDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jbBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxCena, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombreAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCiudadAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbTipoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBoxDesayuno)
                    .addComponent(jCheckBoxAlmuerzo)
                    .addComponent(jCheckBoxCena))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfImporteDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlojamientoGuardar)
                    .addComponent(jbAlojamientoModificar)
                    .addComponent(jbAlojamientoNuevo)
                    .addComponent(jbAlojamientoSalir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlojamientoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlojamientoGuardarActionPerformed
        if (jtfNombreAlojamiento.getText().isEmpty() || jtfCiudadAlojamiento.getText().isEmpty() || jcbTipoAlojamiento.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Rellene correctamente los campos");
            
        } else {
            
            Alojamiento alojamiento = new Alojamiento();
            
            alojamiento.setNombre(jtfNombreAlojamiento.getText());
            alojamiento.getCiudadDestino().setNombre(jtfCiudadAlojamiento.getText());
            alojamiento.setTipoAlojamiento((String) jcbTipoAlojamiento.getSelectedItem());
            if (jCheckBoxDesayuno != null && jCheckBoxAlmuerzo != null && jCheckBoxCena != null) {
                
                alojamiento.setServicio("Menu Completo");
                
            } else if (jCheckBoxDesayuno == null && jCheckBoxAlmuerzo != null && jCheckBoxCena != null) {
                
                alojamiento.setServicio("Almuerzo y Cena");
                
            } else if (jCheckBoxDesayuno != null && jCheckBoxAlmuerzo == null && jCheckBoxCena == null) {
                
                alojamiento.setServicio("Desayuno");
            } else if (jCheckBoxDesayuno == null && jCheckBoxAlmuerzo != null && jCheckBoxCena == null) {
                alojamiento.setServicio("Almuerzo");
                
            } else if (jCheckBoxDesayuno == null && jCheckBoxAlmuerzo == null && jCheckBoxCena != null) {
                alojamiento.setServicio("Cena");
                
            } else if (jCheckBoxDesayuno != null && jCheckBoxAlmuerzo == null && jCheckBoxCena != null) {
                alojamiento.setServicio("Desayuno y Cena");
                
            } else if (jCheckBoxDesayuno != null && jCheckBoxAlmuerzo != null && jCheckBoxCena == null) {
                
                alojamiento.setServicio("Desayuno y almuerzo");
            }
            
            aloja.guardarAlojamiento(alojamiento);
            
        }

    }//GEN-LAST:event_jbAlojamientoGuardarActionPerformed

    private void jCheckBoxDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDesayunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDesayunoActionPerformed

    private void jCheckBoxAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAlmuerzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAlmuerzoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxAlmuerzo;
    private javax.swing.JCheckBox jCheckBoxCena;
    private javax.swing.JCheckBox jCheckBoxDesayuno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbAlojamientoGuardar;
    private javax.swing.JButton jbAlojamientoModificar;
    private javax.swing.JButton jbAlojamientoNuevo;
    private javax.swing.JButton jbAlojamientoSalir;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbTipoAlojamiento;
    private javax.swing.JTextField jtfCiudadAlojamiento;
    private javax.swing.JTextField jtfImporteDiario;
    private javax.swing.JTextField jtfNombreAlojamiento;
    // End of variables declaration//GEN-END:variables
}
