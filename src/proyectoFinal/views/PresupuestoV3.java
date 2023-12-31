/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.views;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectoFinal.AccessData.PaqueteData;
import proyectoFinal.Entidades.Paquete;


public class PresupuestoV3 extends javax.swing.JInternalFrame {
    
    private PaqueteData pd= new PaqueteData();
    
    public PresupuestoV3() {
        initComponents();
        jlEmailValido.setVisible(false);
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtOrigen = new javax.swing.JTextField();
        jtTransporte = new javax.swing.JTextField();
        jtAlojamiento = new javax.swing.JTextField();
        jtFIda = new javax.swing.JTextField();
        jtFVuelta = new javax.swing.JTextField();
        jtPasajeros = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtDestino = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbPaquete = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jlEmailValido = new javax.swing.JLabel();
        jtMonto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Consulta presupuestos");
        setPreferredSize(new java.awt.Dimension(580, 550));

        jtEmail.setToolTipText("");
        jtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEmailMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reserva60.png"))); // NOI18N

        jLabel3.setText("Origen");

        jLabel4.setText("Transporte");

        jLabel5.setText("Alojamiento");

        jLabel6.setText("Fecha ida");

        jLabel7.setText("Fecha regreso");

        jLabel8.setText("cantidad de pasajeros");

        jtOrigen.setEditable(false);

        jtTransporte.setEditable(false);

        jtAlojamiento.setEditable(false);
        jtAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAlojamientoActionPerformed(evt);
            }
        });

        jtFIda.setEditable(false);

        jtFVuelta.setEditable(false);

        jtPasajeros.setEditable(false);

        jLabel9.setText("Destino");

        jtDestino.setEditable(false);

        jLabel10.setText("Email");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jcbPaquete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPaqueteItemStateChanged(evt);
            }
        });
        jcbPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPaqueteActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lupa16.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jlEmailValido.setForeground(new java.awt.Color(255, 0, 0));
        jlEmailValido.setText("*ingrese un email valido");

        jtMonto.setEditable(false);

        jLabel11.setText("Importe total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(357, 357, 357)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jcbPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel9))))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                .addComponent(jtTransporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtFIda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtMonto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtFVuelta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtPasajeros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addComponent(jtOrigen, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtAlojamiento)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jLabel10)
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlEmailValido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(jbBuscar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtEmail)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEmailValido))
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFVuelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        setBounds(0, 0, 580, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        ImageIcon icono = new ImageIcon("src/Icons/cancelarPresupuesto32.png");
        if (jcbPaquete.getItemCount() > 0) {

            int op = JOptionPane.showConfirmDialog(null, "Una vez eliminado no se podra recuparar el presupuesto.\n¿Seguro desa eliminar presupuesto?",
                    "Eliminar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);
            if (op == 0) {
                Paquete p = (Paquete) jcbPaquete.getSelectedItem();
                pd.eliminarPaquete(p.getIdPaquete());
                jcbPaquete.removeAllItems();
                setTextFields();
                jtEmail.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningun paquete cargado");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rellene los campos correctamente");
        } else {
            if (emailValido()) { 
                jlEmailValido.setVisible(false);
                String email = jtEmail.getText().toLowerCase();
                if (comprobarEmail(email)){
                    cargarPaquetes(email);
                }else {
                    JOptionPane.showMessageDialog(this, "No se enconto paquete con ese email.");
                }
            }else{
                jlEmailValido.setVisible(true);
            }       
        }
         
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbPaqueteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPaqueteItemStateChanged
       
        if (jcbPaquete.getItemCount() > 0) {
            
            Paquete p = (Paquete) jcbPaquete.getSelectedItem();

            jtOrigen.setText(p.getOrigen().toString());
            jtDestino.setText(p.getDestino().toString());
            jtTransporte.setText(p.getPasaje().getTipoDeTransporte());
            jtAlojamiento.setText(p.getAlojamiento().getTipoAlojamiento() + " - " + p.getAlojamiento().getNombre());
            jtFIda.setText(p.getFechaIn().toString());
            jtFVuelta.setText(p.getFechaOut().toString());
            jtPasajeros.setText(p.getCantPasajeros() + "");
            jtMonto.setText(p.getMonto() + "");
        }
        
    }//GEN-LAST:event_jcbPaqueteItemStateChanged

    private void jtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmailMouseClicked
        jcbPaquete.removeAllItems();
        setTextFields();
    }//GEN-LAST:event_jtEmailMouseClicked

    private void jcbPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPaqueteActionPerformed

    }//GEN-LAST:event_jcbPaqueteActionPerformed

    private void jtAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAlojamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAlojamientoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Paquete> jcbPaquete;
    private javax.swing.JLabel jlEmailValido;
    private javax.swing.JTextField jtAlojamiento;
    private javax.swing.JTextField jtDestino;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtFIda;
    private javax.swing.JTextField jtFVuelta;
    private javax.swing.JTextField jtMonto;
    private javax.swing.JTextField jtOrigen;
    private javax.swing.JTextField jtPasajeros;
    private javax.swing.JTextField jtTransporte;
    // End of variables declaration//GEN-END:variables

   private boolean emailValido() {
        boolean valido = false;
        String email = jtEmail.getText().toLowerCase();
        
        if (email.contains("@")) {
            int pos = email.indexOf("@");
            int tam = email.length();

            if (email.substring(pos).endsWith(".com")) {
                if ((tam - pos) > 6) {
                    valido = true;
                }
            } else if (email.substring(pos, tam - 2).endsWith(".com.")) {
                if ((tam - pos) > 9) {
                    valido = true;
                }
            }
        }
        return valido;
    }
   
   private void cargarPaquetes(String email){
       for (Paquete p: pd.listaPaquete(email)){
           jcbPaquete.addItem(p);
       }
    }
   
    private boolean comprobarEmail(String email){
        boolean retorno=false;
        for(String e: pd.listaEmail()){
            if (e.equals(email)){
                retorno = true;
                break;
            }
  
        }
        return retorno;
    }
   
    private void setTextFields(){
    
        jtOrigen.setText("");
        jtDestino.setText("");
        jtTransporte.setText("");
        jtAlojamiento.setText("");
        jtFIda.setText("");
        jtFVuelta.setText("");
        jtPasajeros.setText("");
        jtMonto.setText("");

    }

    
}
