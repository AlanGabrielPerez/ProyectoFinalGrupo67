package proyectoFinal.views;

import java.awt.Color;
import java.awt.Component;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import proyectoFinal.AccessData.AlojamientoData;
import proyectoFinal.AccessData.CiudadData;
import proyectoFinal.AccessData.PasajeData;
import proyectoFinal.Entidades.Ciudad;
import proyectoFinal.Entidades.Paquete;
import proyectoFinal.Entidades.Pasaje;


public class ProbarCodigo extends javax.swing.JInternalFrame {

    CiudadData ciu = new CiudadData();
    PasajeData pd = new PasajeData();
    AlojamientoData ad = new AlojamientoData();
    Paquete ejemplo = new Paquete();
    
        private static DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int fila, int columna) {

            return false;
        }
    };
        
        
    public ProbarCodigo() {
        initComponents();

        cargarDatos(ejemplo);        
        
        jrIda.setSelected(true);
        jlEmailValido.setVisible(false);
        jTextPane.setEditable(false);        
        jTextPane.setVisible(false);      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jtEmail = new javax.swing.JTextField();
        jtPasajeros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrIda = new javax.swing.JRadioButton();
        jrVuelta = new javax.swing.JRadioButton();
        jlEmailValido = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlPresupuesto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);

        jScrollPane2.setViewportView(jTextPane);

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtEmail.setForeground(Color.GRAY);
        jtEmail.setText("ejemplo@domino.com");
        jtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEmailMouseClicked(evt);
            }
        });
        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        jtPasajeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPasajerosKeyTyped(evt);
            }
        });

        jLabel1.setText("Email de contacto");

        jLabel2.setText("Cantidad de pasajeros");

        jrIda.setText("Solo ida");
        jrIda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIdaActionPerformed(evt);
            }
        });

        jrVuelta.setText("Ida y vuelta");
        jrVuelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrVueltaActionPerformed(evt);
            }
        });

        jlEmailValido.setForeground(new java.awt.Color(255, 51, 51));
        jlEmailValido.setText("*Ingrese un email valido");

        jlPresupuesto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlPresupuesto.setText("Presupuesto");

        jButton2.setText("  Atras  ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Comfirmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPresupuesto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jrIda)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrVuelta)
                                    .addGap(58, 58, 58))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlEmailValido, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIda)
                            .addComponent(jrVuelta)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jlEmailValido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPresupuesto)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jtPasajeros.getText().isEmpty() || jtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rellene los campos correctamente");
        } else {
            if (emailValido()) {
                
                jTextPane.setText(armarPresupuesto(ejemplo));
                jTextPane.setVisible(true);
               
                jlEmailValido.setVisible(false);
            }else{
                jlEmailValido.setVisible(true);
            }       
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jrIdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIdaActionPerformed
        if (jrIda.isSelected()){
            jrVuelta.setSelected(false);
        }else{
            jrVuelta.setSelected(true);
        }
    }//GEN-LAST:event_jrIdaActionPerformed

    private void jrVueltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrVueltaActionPerformed
        if(jrVuelta.isSelected()){
            jrIda.setSelected(false);
        }else{
            jrIda.setSelected(true);
        }
    }//GEN-LAST:event_jrVueltaActionPerformed

    private void jtPasajerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPasajerosKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtPasajerosKeyTyped

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmailMouseClicked
        if (jtEmail.getForeground()==Color.GRAY) {       
            jtEmail.setText("");
            jtEmail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtEmailMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane;
    private javax.swing.JLabel jlEmailValido;
    private javax.swing.JLabel jlPresupuesto;
    private javax.swing.JRadioButton jrIda;
    private javax.swing.JRadioButton jrVuelta;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtPasajeros;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
/*        modelo.setColumnCount(0);
        modelo.addColumn("id");
        modelo.addColumn("Transporte");
        modelo.addColumn("Destino");
        modelo.addColumn("Valor");
      
        
        jTable.setModel(modelo);
                   
        modelo.addRow(new Object[]{"            ","                             ","                                                                                    ","                           "});
        resizeColumnWidth(jTable);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
*/    
    }

    private void cargarJTable(Ciudad origen){
 /*       modelo.setRowCount(0);
        for (Pasaje p: pd.listarPasajes()){
            if (p.isEstado() && p.getCiudadOrigen().getNombre().equals(origen.getNombre())){
                modelo.addRow(new Object[]{p.getIdPasaje(),p.getTipoDeTransporte(),p.getCiudadDestino(),p.getImporte()});
            }
            
        }
*/
    }
    
    private void resizeColumnWidth(JTable table) {
/*    
    TableColumnModel columnModel = table.getColumnModel();
   
    for (int column = 0; column < table.getColumnCount(); column++) {
        
        int width = 35; //Min Width
        
        for (int row = 0; row < table.getRowCount(); row++) {
          
            TableCellRenderer renderer = table.getCellRenderer(row, column);
            Component comp = table.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width + 1, width);

         }

        
        columnModel.getColumn(column).setPreferredWidth(width);
    }
*/        
    }
    
    public static boolean esCorreoElectronicoValido(String correo) {
//        // Patrón para validar direcciones de correo electrónico
//        String patron = "^[A-Za-z0-9+_.-]+@(.+)$";
//        
//        // Compilar el patrón
//        Pattern pattern = Pattern.compile(patron);
//        
//        // Crear un objeto Matcher
//        Matcher matcher = pattern.matcher(correo);
//        
//        // Verificar si el correo coincide con el patrón
//        return matcher.matches();
//    }

//    public static void main(String[] args) {
//        String correo1 = "usuario@example.com";
//        String correo2 = "correoinvalido";
//        
//        if (esCorreoElectronicoValido(correo1)) {
//            System.out.println(correo1 + " es un correo electrónico válido.");
//        } else {
//            System.out.println(correo1 + " no es un correo electrónico válido.");
//        }
//        
//        if (esCorreoElectronicoValido(correo2)) {
//            System.out.println(correo2 + " es un correo electrónico válido.");
//        } else {
//            System.out.println(correo2 + " no es un correo electrónico válido.");
//        }
   return false;
    }

    private void cargarDatos(Paquete p){
        p.setAlojamiento(ad.alojamientoId(1));
        p.setOrigen(ciu.ciudadId(6));
        p.setDestino(ciu.ciudadId(7));
        p.setPasaje(pd.pasajeId(11));
        p.setFechaIn(LocalDate.of(2023, Month.MARCH, 5));
        p.setFechaOut(LocalDate.of(2023, Month.MARCH, 15));       
    }
    
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
            } else if (email.substring(pos, tam - 3).endsWith(".com")) {
                if ((tam - pos) > 9) {
                    valido = true;
                }
            }
        }
        return valido;
    }

    private String armarPresupuesto(Paquete p){
        String presupuesto="";
        presupuesto+="Email: "+jtEmail.getText();
        presupuesto+="\n\ncantidad de personas:  "+jtPasajeros.getText();
        presupuesto+="\n\nFecha de salida :  "+p.getFechaIn();
        presupuesto+="\n\nFecha de vuelta:  "+p.getFechaOut();
        presupuesto+="\n\nOrigen: "+p.getOrigen();
        presupuesto+="\n\nDestino: "+p.getDestino();
        presupuesto+="\n\nTrasporte: "+p.getPasaje().getTipoDeTransporte();
        if(jrIda.isSelected()){
            presupuesto+="  - Solo ida";
        }else{
            presupuesto+=" - Ida y vuelta";
        }
        presupuesto+="\n\nAlojamiento: "+p.getAlojamiento().getTipoAlojamiento()+" - "+p.getAlojamiento().getNombre();
        presupuesto+="\n\nValor total: ";
        
        return presupuesto;
    }
}
