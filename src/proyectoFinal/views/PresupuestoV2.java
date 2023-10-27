/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.views;

import java.awt.Component;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import proyectoFinal.AccessData.AlojamientoData;
import proyectoFinal.AccessData.PasajeData;
import proyectoFinal.Entidades.Alojamiento;
import proyectoFinal.Entidades.Ciudad;
import proyectoFinal.Entidades.Paquete;
import proyectoFinal.Entidades.Pasaje;
import static proyectoFinal.views.Principal.Desktop;
import static proyectoFinal.views.Presupuesto.paquete;

public class PresupuestoV2 extends javax.swing.JInternalFrame {

    private AlojamientoData ad = new AlojamientoData();
    private static DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int fila, int columna) {

            return false;
        }
    };

    public PresupuestoV2() {
        initComponents();
        Ciudad caba = new Ciudad("CABA", "Buenos Aires", "Argentina", true, LocalDate.of(2000, 11, 30), LocalDate.of(2000, 4, 1), LocalDate.of(2000, 12, 1)); 
        TiposAlojamientos();
        armarCabecera();
        jrPorProvincia.setSelected(true);
        cargarTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrPorCiudad = new javax.swing.JRadioButton();
        jrPorProvincia = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jbSiguiente = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtAlojamientoSelec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlDesayuno = new javax.swing.JLabel();
        jlAlmuerzo = new javax.swing.JLabel();
        jlCena = new javax.swing.JLabel();

        setClosable(true);

        jrPorCiudad.setText("Por Ciudad");
        jrPorCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrPorCiudadActionPerformed(evt);
            }
        });

        jrPorProvincia.setText("Por provincia");
        jrPorProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrPorProvinciaActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setText("Categoria");

        jbSiguiente.setText("Siguiente");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        jbAtras.setText("Atras");
        jbAtras.setPreferredSize(new java.awt.Dimension(83, 32));
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("- Seleccionar Alojamiento -");

        jtAlojamientoSelec.setEditable(false);

        jLabel4.setText("Alojamiento");

        jLabel5.setText("Servicios");

        jlDesayuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/casilla16.png"))); // NOI18N
        jlDesayuno.setText("Desayuno");

        jlAlmuerzo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/casilla16.png"))); // NOI18N
        jlAlmuerzo.setText("Almuerzo");

        jlCena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/casilla16.png"))); // NOI18N
        jlCena.setText("Cena");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jlCena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(332, 332, 332)
                        .addComponent(jbSiguiente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(jlAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtAlojamientoSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jrPorCiudad)
                        .addGap(101, 101, 101)
                        .addComponent(jrPorProvincia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrPorCiudad)
                    .addComponent(jrPorProvincia))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAlojamientoSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlDesayuno)
                    .addComponent(jlAlmuerzo)
                    .addComponent(jlCena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrPorProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrPorProvinciaActionPerformed
        if (jrPorProvincia.isSelected()) {
            jrPorCiudad.setSelected(false);
            cargarTabla();

        } else {
            jrPorCiudad.setSelected(true);
            cargarTabla();
        }
    }//GEN-LAST:event_jrPorProvinciaActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        Presupuesto ventana1 = new Presupuesto();
        abrirVentana(ventana1);
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        ProbarCodigo probar = new ProbarCodigo();
        abrirVentana(probar);
    }//GEN-LAST:event_jbSiguienteActionPerformed

    private void jrPorCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrPorCiudadActionPerformed
        if (jrPorCiudad.isSelected()) {
            jrPorProvincia.setSelected(false);
            cargarTabla();
        } else {
            jrPorProvincia.setSelected(true);
            cargarTabla();
        }

    }//GEN-LAST:event_jrPorCiudadActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        cargarTabla();
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int id = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
        Alojamiento a = ad.alojamientoId(id);
        
        jtAlojamientoSelec.setText(a.getNombre() + "(" + a.getTipoAlojamiento() + ") - " + a.getCiudadDestino());
        paquete.setAlojamiento(a);
        setServicios(a);
    }//GEN-LAST:event_jTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlAlmuerzo;
    private javax.swing.JLabel jlCena;
    private javax.swing.JLabel jlDesayuno;
    private javax.swing.JRadioButton jrPorCiudad;
    private javax.swing.JRadioButton jrPorProvincia;
    private javax.swing.JTextField jtAlojamientoSelec;
    // End of variables declaration//GEN-END:variables

    private void TiposAlojamientos() {
        String[] tipos = {"Hostel", "Hotel", "Cabaña", "Departamento"};
        jcbTipo.addItem("Ver todos");
        for (String t : tipos) {
            jcbTipo.addItem(t);
        }
    }

    private void armarCabecera() {
        modelo.setColumnCount(0);
        modelo.addColumn("id");
        modelo.addColumn("Tipo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Provincia");
        modelo.addColumn("Valor diario");

        jTable.setModel(modelo);

        modelo.addRow(new Object[]{"  ", "                      ", "                                   ", "                              ", "                            ", "                      "});
        resizeColumnWidth(jTable);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    }

    private void cargarTabla() {

        modelo.setRowCount(0);
        
        
        if (jrPorCiudad.isSelected()) {
            
            

            for (Alojamiento a : ad.listaAlojamiento()) {
                Ciudad c = a.getCiudadDestino();
                if (jcbTipo.getSelectedIndex() == 0) {
                    if (c.getNombre().equals(paquete.getDestino().getNombre())) {
                        modelo.addRow(new Object[]{a.getIdAlojamiento(), a.getTipoAlojamiento(), a.getNombre(), c.getNombre(), c.getProvincia(), "   " + a.getImporteDiario()});
                    }
                } else {
                    if (c.getNombre().equals(paquete.getDestino().getNombre()) && a.getTipoAlojamiento().equals((String) jcbTipo.getSelectedItem())) {
                        modelo.addRow(new Object[]{a.getIdAlojamiento(), a.getTipoAlojamiento(), a.getNombre(), c.getNombre(), c.getProvincia(), "   " + a.getImporteDiario()});
                    }
                }
                
                
            }
        } else {

            for (Alojamiento a : ad.listaAlojamiento()) {
                Ciudad c = a.getCiudadDestino();
                if (jcbTipo.getSelectedIndex() == 0) {
                    if (c.getProvincia().equals(paquete.getDestino().getProvincia())) {
                        modelo.addRow(new Object[]{a.getIdAlojamiento(), a.getTipoAlojamiento(), a.getNombre(), c.getNombre(), c.getProvincia(), "   " + a.getImporteDiario()});
                    }
                } else {
                    if (c.getProvincia().equals(paquete.getDestino().getProvincia()) && a.getTipoAlojamiento().equals((String) jcbTipo.getSelectedItem())) {
                        modelo.addRow(new Object[]{a.getIdAlojamiento(), a.getTipoAlojamiento(), a.getNombre(), c.getNombre(), c.getProvincia(), "   " + a.getImporteDiario()});
                    }
                }
            }
        }
    }

    private void resizeColumnWidth(JTable table) {

        TableColumnModel columnModel = table.getColumnModel();

        for (int column = 0; column < table.getColumnCount(); column++) {

            int width = 35;

            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
//        if (width > 300) {
//            width = 300;
//        }        
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    private void abrirVentana(JInternalFrame ventana) {
        Desktop.removeAll();
        Desktop.repaint();
        ventana.setVisible(true);
        Desktop.add(ventana);
        Desktop.moveToFront(ventana);

    }

    private void setServicios(Alojamiento a) {
        ImageIcon casilla = new ImageIcon("src/Icons/casilla16.png");
        ImageIcon marcada = new ImageIcon("src/Icons/casillaMarcada16.png");

        if (a.getServicio().contains("Desayuno")) {
            jlDesayuno.setIcon(marcada);
        } else {
            jlDesayuno.setIcon(casilla);
        }
        if (a.getServicio().contains("Almuerzo")) {
            jlAlmuerzo.setIcon(marcada);
        } else {
            jlAlmuerzo.setIcon(casilla);
        }
        if (a.getServicio().contains("Cena")) {
            jlCena.setIcon(marcada);
        } else {
            jlCena.setIcon(casilla);
        }
    }

}
