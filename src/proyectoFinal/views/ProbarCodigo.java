package proyectoFinal.views;

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
        armarCabecera();
        cargarDatos(ejemplo);
         
         
         jTextPane.setEditable(false);
         jTextPane.setVisible(false);
         
         
         for (Ciudad c: ciu.listarCiudad()){
                jcbOrigen.addItem(c);
            }
         
         jdcVuelta.setEnabled(false);
         //Fecha actual
        Calendar calendar = Calendar.getInstance();
        java.util.Date fechaActual = calendar.getTime();
        jdcIda.setMinSelectableDate(fechaActual);
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jcbOrigen = new javax.swing.JComboBox<>();
        jtBuscar = new javax.swing.JTextField();
        jdcIda = new com.toedter.calendar.JDateChooser();
        jdcVuelta = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jtEmail = new javax.swing.JTextField();
        jtPasajeros = new javax.swing.JTextField();

        setClosable(true);

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
        jScrollPane1.setViewportView(jTable);

        jcbOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbOrigenItemStateChanged(evt);
            }
        });
        jcbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrigenActionPerformed(evt);
            }
        });

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });

        jdcIda.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcIdaPropertyChange(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane);

        jButton1.setText("Mostrar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtEmail.setText("Email");

        jtPasajeros.setText("pasajeros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jcbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jdcIda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(jdcVuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcVuelta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcIda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
       
        
        
        jcbOrigen.removeAllItems();
        
        if (jtBuscar.getText().isEmpty()){
            for (Ciudad c: ciu.listarCiudad()){
                jcbOrigen.addItem(c);
            }
        }else {
            for (Ciudad c: ciu.listarCiudad()){
                if (c.getNombre().toLowerCase().startsWith(jtBuscar.getText().toLowerCase())){
                    jcbOrigen.addItem(c);
                }
            }
        }
        
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jcbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrigenActionPerformed
     
    }//GEN-LAST:event_jcbOrigenActionPerformed

    private void jdcIdaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcIdaPropertyChange
      
        java.util.Date selectedDate = jdcIda.getDate();
           
         if (selectedDate != null){ //Si se selecciona una fecha
            jdcVuelta.setEnabled(true); //activar el dateChooser de vuelta
            
            Calendar calendar = Calendar.getInstance(); 
            calendar.setTime(selectedDate);             
            calendar.add(Calendar.DAY_OF_MONTH, 1); // establece al dia siguiente del jdc IDA
           
            jdcVuelta.setMinSelectableDate(calendar.getTime()); //setea el minimo del jdc VUELTA
         
         }
    }//GEN-LAST:event_jdcIdaPropertyChange

    private void jcbOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbOrigenItemStateChanged
       
        // APLICAR ESTO NO GENERA NULLPOINTER ASI
        
        if(jcbOrigen.getItemCount()>0){
            Ciudad c = (Ciudad) jcbOrigen.getSelectedItem();
            cargarJTable(c);
        }
        
        
        
    }//GEN-LAST:event_jcbOrigenItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextPane.setVisible(true);
        jTextPane.setText(armarPresupuesto(ejemplo));
       
    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextPane jTextPane;
    private javax.swing.JComboBox<Ciudad> jcbOrigen;
    private com.toedter.calendar.JDateChooser jdcIda;
    private com.toedter.calendar.JDateChooser jdcVuelta;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtPasajeros;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.setColumnCount(0);
        modelo.addColumn("id");
        modelo.addColumn("Transporte");
        modelo.addColumn("Destino");
        modelo.addColumn("Valor");
      
        
        jTable.setModel(modelo);
                   
        modelo.addRow(new Object[]{"            ","                             ","                                                                                    ","                           "});
        resizeColumnWidth(jTable);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    
    }

    private void cargarJTable(Ciudad origen){
        modelo.setRowCount(0);
        for (Pasaje p: pd.listarPasajes()){
            if (p.isEstado() && p.getCiudadOrigen().getNombre().equals(origen.getNombre())){
                modelo.addRow(new Object[]{p.getIdPasaje(),p.getTipoDeTransporte(),p.getCiudadDestino(),p.getImporte()});
            }
            
        }
    }
    
    private void resizeColumnWidth(JTable table) {
    
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
        
    }
    
//    public static boolean esCorreoElectronicoValido(String correo) {
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
//    }

    private void cargarDatos(Paquete p){
        p.setAlojamiento(ad.alojamientoId(1));
        p.setOrigen(ciu.ciudadId(6));
        p.setDestino(ciu.ciudadId(7));
        p.setPasaje(pd.pasajeId(11));
        p.setFechaIn(LocalDate.of(2023, Month.MARCH, 5));
        p.setFechaOut(LocalDate.of(2023, Month.MARCH, 15));       
    }
    
    private String armarPresupuesto(Paquete p){
        String presupuesto="";
        presupuesto+="\t\tPresupuesto\n";
        presupuesto+="\nEmail: "+jtEmail.getText();
        presupuesto+= "\tcantidad de personas:  "+jtPasajeros.getText();
        presupuesto+="\nFecha de salida :  "+p.getFechaIn();
        presupuesto+="\tHasta:  "+p.getFechaOut();
        presupuesto+="\nOrigen: "+p.getOrigen();
        presupuesto+="\nDestino: "+p.getDestino();
        
        
        
        return presupuesto;
    }
}
