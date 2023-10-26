/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.views;

import java.awt.Desktop;
import static java.awt.SystemColor.desktop;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoFinal.AccessData.CiudadData;
import proyectoFinal.AccessData.PasajeData;
import proyectoFinal.Entidades.Ciudad;
import proyectoFinal.Entidades.Paquete;
import proyectoFinal.Entidades.Pasaje;
import static proyectoFinal.views.Principal.Desktop;

/**
 *
 * @author Pc
 */
public class Presupuesto extends javax.swing.JInternalFrame {
 CiudadData cd = new CiudadData();
 PasajeData pd = new PasajeData();
 public static Paquete paquete = new Paquete();
 private static DefaultTableModel modelo = new DefaultTableModel(){
 public boolean isCellEditable(int fila, int columna){
 return false;
 }
 };
    /**
     * Creates new form Presupuesto
     */
    public Presupuesto() {
        initComponents();
        cargarCiudades();
        construirCabecera();
        seteoFechas();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbOrigen = new javax.swing.JComboBox<>();
        jVuelta = new com.toedter.calendar.JDateChooser();
        jIda = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jtDestino = new javax.swing.JTextField();
        LebelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LebelTitulo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlFBaja = new javax.swing.JLabel();
        jlFMedia = new javax.swing.JLabel();
        jlFAlta = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("Origen: ");

        jLabel3.setText("Fecha de salida: ");

        jLabel4.setText("Hasta: ");

        jcbOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbOrigenItemStateChanged(evt);
            }
        });

        jIda.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jIdaPropertyChange(evt);
            }
        });

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Destinos posibles: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel6.setText("Ciudad desitino");

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });

        LebelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LebelTitulo.setText("- Seleccionar fecha -");

        LebelTitulo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LebelTitulo1.setText("- Seleccionar origen y destino -");

        jLabel2.setText("Inicio de temporadas(D/M):");

        jlFBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendario16.png"))); // NOI18N
        jlFBaja.setText("Baja:");

        jlFMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendario16.png"))); // NOI18N
        jlFMedia.setText("Media:");

        jlFAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendario16.png"))); // NOI18N
        jlFAlta.setText("Alta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(jlFBaja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(jlFMedia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(jlFAlta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LebelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jIda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jVuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LebelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(130, 130, 130))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LebelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVuelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jIda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LebelTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlFBaja)
                    .addComponent(jlFMedia)
                    .addComponent(jlFAlta))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (jVuelta.getDate() != null) {
                paquete.setFechaIn(jVuelta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fecha de ida");
            }
            if (jIda.getDate() != null) {
                paquete.setFechaOut(jIda.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fecha de regreso");
            }
        if (jVuelta.getDate() != null && jIda.getDate() != null && paquete.getDestino() != null && paquete.getPasaje() != null && paquete.getOrigen() != null) {
            Desktop.removeAll();
            Desktop.repaint();
            PresupuestoV2 presupuestoV2 = new PresupuestoV2();
            presupuestoV2.setVisible(true);
            Desktop.add(presupuestoV2);
            Desktop.moveToFront(presupuestoV2);
        } else {
        JOptionPane.showMessageDialog(this, "rellene correctamente los campos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
        jcbOrigen.removeAllItems();
        for (Ciudad c : cd.listarCiudad()) {
            if (jtBuscar.getText() != "") {
                if (c.getNombre().toLowerCase().startsWith(jtBuscar.getText())) {
                    jcbOrigen.addItem(c);
                }
            } else {
                jcbOrigen.addItem(c);
            }
        }
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jIdaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jIdaPropertyChange
        java.util.Date selectedDate = jIda.getDate();

        if (selectedDate != null) { //Si se selecciona una fecha
            jVuelta.setEnabled(true); //activar el dateChooser de vuelta

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selectedDate);
            calendar.add(Calendar.DAY_OF_MONTH, 1); // establece al dia siguiente del jdc IDA

            jVuelta.setMinSelectableDate(calendar.getTime()); //setea el minimo del jdc VUELTA

        }
    }//GEN-LAST:event_jIdaPropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int id = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        jtDestino.setText(pd.pasajeId(id).getIdPasaje() + ", " + pd.pasajeId(id).getTipoDeTransporte() + ", " + pd.pasajeId(id).getCiudadDestino() + ", " + pd.pasajeId(id).getImporte());
        mostrarFechas(pd.pasajeId(id).getCiudadDestino());
        paquete.setPasaje(pd.pasajeId(id));
        paquete.setDestino(pd.pasajeId(id).getCiudadDestino());
        paquete.setOrigen(pd.pasajeId(id).getCiudadOrigen());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jcbOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbOrigenItemStateChanged

        if (jcbOrigen.getItemCount() > 0) {
            Ciudad c = (Ciudad) jcbOrigen.getSelectedItem();
            cargarTable(c);
        }
    }//GEN-LAST:event_jcbOrigenItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LebelTitulo;
    private javax.swing.JLabel LebelTitulo1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jIda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jVuelta;
    private javax.swing.JComboBox<Ciudad> jcbOrigen;
    private javax.swing.JLabel jlFAlta;
    private javax.swing.JLabel jlFBaja;
    private javax.swing.JLabel jlFMedia;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtDestino;
    // End of variables declaration//GEN-END:variables
    
    
    private void cargarCiudades() {
        for (Ciudad c : cd.listarCiudad()) {
            jcbOrigen.addItem(c);

        }
    }

    private void construirCabecera() {
        modelo.setColumnCount(0);
        modelo.addColumn("id");
        modelo.addColumn("Transporte");
        modelo.addColumn("Destino");
        modelo.addColumn("Valor");

        jTable1.setModel(modelo);
    }

    private void cargarTable(Ciudad origen) {
        modelo.setRowCount(0);
        Ciudad ciu = (Ciudad) jcbOrigen.getSelectedItem();
        for (Pasaje p : pd.listarPasajes()) {
            if (p.isEstado() && p.getCiudadOrigen().getNombre().equals(ciu.getNombre())) {
                modelo.addRow(new Object[]{p.getIdPasaje(), p.getTipoDeTransporte(), p.getCiudadDestino(), p.getImporte()});
            }

        }
    }

    private void seteoFechas() {
        jVuelta.setEnabled(false);
        Calendar calendar = Calendar.getInstance();
        java.util.Date fechaActual = calendar.getTime();
        jIda.setMinSelectableDate(fechaActual);
    }

    private boolean comprobar(String nom) {
        boolean ok = false;
        for (Ciudad c : cd.listarCiudad()) {
            for (Ciudad c2 : cd.ciudadesInactivas()) {
                if (c.getNombre() == nom || c2.getNombre() == nom) {
                    ok = true;
                }
            }
            ok = true;
        }
        return ok;
    }
    
    private void mostrarFechas(Ciudad c){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM");
        
        jlFBaja.setText("Baja: "+c.getTemBaja().format(formato));
        jlFMedia.setText("Media: "+c.getTemMedia().format(formato));
        jlFAlta.setText("Alta: "+c.getTemAlta().format(formato));
    }
    
}
