/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.views;

/**
 *
 * @author julian
 */
public class AdminAlojamiento extends javax.swing.JInternalFrame {

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

        jLabel1.setText("Administrar Alojamiento");

        jbAlojamientoGuardar.setText("Guardar");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbBuscar))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jbAlojamientoGuardar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbAlojamientoModificar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbAlojamientoNuevo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbAlojamientoSalir)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                    .addComponent(jcbTipoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(133, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlojamientoGuardar)
                    .addComponent(jbAlojamientoModificar)
                    .addComponent(jbAlojamientoNuevo)
                    .addComponent(jbAlojamientoSalir))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbAlojamientoGuardar;
    private javax.swing.JButton jbAlojamientoModificar;
    private javax.swing.JButton jbAlojamientoNuevo;
    private javax.swing.JButton jbAlojamientoSalir;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbTipoAlojamiento;
    private javax.swing.JTextField jtfCiudadAlojamiento;
    private javax.swing.JTextField jtfNombreAlojamiento;
    // End of variables declaration//GEN-END:variables
}
