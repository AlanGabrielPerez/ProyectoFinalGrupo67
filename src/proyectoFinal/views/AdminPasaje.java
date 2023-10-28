
package proyectoFinal.views;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectoFinal.AccessData.CiudadData;
import proyectoFinal.AccessData.PasajeData;
import proyectoFinal.Entidades.Ciudad;
import proyectoFinal.Entidades.Pasaje;


public class AdminPasaje extends javax.swing.JInternalFrame {

    private CiudadData ciu = new CiudadData();
    private PasajeData psDt = new PasajeData();
    
    
    public AdminPasaje() {
        initComponents();
        cargarTipoTrasporte();
        cargarCiudades();
        setComponentes();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbOrigen = new javax.swing.JComboBox<>();
        jcbDestino = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtImporte = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEstado = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jrActivo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jrInactivo = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Administrar pasajes");

        jcbOrigen.setMaximumSize(new java.awt.Dimension(250, 26));
        jcbOrigen.setMinimumSize(new java.awt.Dimension(250, 26));
        jcbOrigen.setPreferredSize(new java.awt.Dimension(250, 26));
        jcbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrigenActionPerformed(evt);
            }
        });

        jcbDestino.setMaximumSize(new java.awt.Dimension(250, 26));
        jcbDestino.setMinimumSize(new java.awt.Dimension(250, 26));
        jcbDestino.setPreferredSize(new java.awt.Dimension(250, 26));
        jcbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDestinoActionPerformed(evt);
            }
        });

        jLabel1.setText("Ciudad de origen");

        jLabel2.setText("Ciudad de destino");

        jLabel3.setText("Tipo de trasporte");

        jLabel4.setText("Importe");

        jtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtImporteKeyTyped(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbEstado.setText("Dar de baja");
        jbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstadoActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado");

        jrActivo.setText(" Activo  ");
        jrActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivoActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        jtID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDActionPerformed(evt);
            }
        });
        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDKeyTyped(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lupa16.png"))); // NOI18N
        jbBuscar.setToolTipText("Buscar");
        jbBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrInactivo.setText("Inactivo");
        jrInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrInactivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Guardar)
                        .addGap(42, 42, 42)
                        .addComponent(jbEliminar)
                        .addGap(35, 35, 35)
                        .addComponent(jbEstado)
                        .addGap(47, 47, 47)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrActivo)
                                .addGap(18, 18, 18)
                                .addComponent(jrInactivo))
                            .addComponent(jcbDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtID)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrActivo)
                    .addComponent(jrInactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbEstado)
                    .addComponent(jbSalir))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        if (!jtID.getText().isEmpty()) {
            int id = Integer.parseInt(jtID.getText());
            
            if (comprobar(id)) {  
                Pasaje p = psDt.pasajeId(id);
                Ciudad origen = p.getCiudadOrigen();
                Ciudad destino = p.getCiudadDestino();

                jcbTipo.setSelectedItem((String) p.getTipoDeTransporte());
                jcbOrigen.getModel().setSelectedItem(p.getCiudadOrigen());
                jcbDestino.getModel().setSelectedItem(p.getCiudadDestino());
                jtImporte.setText(p.getImporte() + "");
                if (p.isEstado()) {
                    jrActivo.setSelected(true);
                    jrActivoActionPerformed(evt);
                } else {
                    jrInactivo.setSelected(true);
                    jrInactivoActionPerformed(evt);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontro pasaje con id: " + id);
                setComponentes();
            }
        }


    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbOrigenActionPerformed

    private void jtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtIDKeyTyped

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        
        if (camposVacios()) {
            JOptionPane.showMessageDialog(this, "Rellene los campos correcmente");
        } else {
            Pasaje pasaje = setPasaje();
            double importe = Double.parseDouble(jtImporte.getText());
            if (existePasaje(pasaje)) {
                
                if (importe == pasaje.getImporte()) {
                    JOptionPane.showMessageDialog(this, "El pasaje ya existe");
                } else {
                    ImageIcon modificar = new ImageIcon("src/Icons/editar32.png");
                    int op = JOptionPane.showConfirmDialog(null, "Seguro desea modificar el pasaje: " + stringDatos() +" nuevo valor: $"+ importe,
                            "Modificar valor del pasaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, modificar);
                    if (op == 0) {
                        pasaje.setImporte(importe);
                        psDt.modificarPasaje(pasaje);
                    }
                }
            } else {
                ImageIcon agregar = new ImageIcon("src/Icons/agregar32.png");
                int op = JOptionPane.showConfirmDialog(null, "Seguro desea crear Pasaje: " + stringDatos()+ " valor $"+importe,
                        "Crear pasaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, agregar);
                if (op == 0) {
                    psDt.crearPasaje(pasaje);
                }
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void jtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtImporteKeyTyped
        int key = evt.getKeyChar();
        boolean numero = ((key >= 48 && key <= 57) || key == 46);
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtImporteKeyTyped

    private void jrActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivoActionPerformed
        if (jrActivo.isSelected()) {
            jrInactivo.setSelected(false);
            jbEstado.setText("Dar de baja");
        }else {
            jrInactivo.setSelected(true);
            jrInactivoActionPerformed(evt);
        }

    }//GEN-LAST:event_jrActivoActionPerformed

    private void jrInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInactivoActionPerformed
        if (jrInactivo.isSelected()) {
            jrActivo.setSelected(false);
            jbEstado.setText("     Activar     ");
        }else{
            jrActivo.setSelected(true);
            jrActivoActionPerformed(evt);
        }
    }//GEN-LAST:event_jrInactivoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        ImageIcon icono = new ImageIcon("src/Icons/errorDatabase32.png");
        if (camposVacios()) {
            JOptionPane.showMessageDialog(this, "Los campos deben estar completos");
        } else {
            Pasaje pasaje = setPasaje();
            if (existePasaje(pasaje)) {
                int op = JOptionPane.showConfirmDialog(null, "Seguro desea eliminar el Pasaje: "+stringDatos()
                  +" de la base de datos.","Eliminar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);
                if (op == 0) {
                    psDt.eliminarPasaje(pasaje.getIdPasaje());
                    setComponentes();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe pasaje");
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstadoActionPerformed
       if (camposVacios()){
           JOptionPane.showMessageDialog(this, "Los campos deben estar completos");
       }else{
           Pasaje pasaje = setPasaje();
            if (existePasaje(pasaje)) {
                if(pasaje.isEstado()==jrActivo.isSelected()){
                    if (jrActivo.isSelected()){
                        psDt.activarPasaje(pasaje.getIdPasaje(), false);
                        JOptionPane.showMessageDialog(this, "Pasaje: "+ stringDatos() +" fue dado de baja.");
                    }else{
                         psDt.activarPasaje(pasaje.getIdPasaje(), true);
                         JOptionPane.showMessageDialog(this, "Pasaje: "+stringDatos()+" fue activado.");
                    }
                }else{
                    if (jrActivo.isSelected()){
                        JOptionPane.showMessageDialog(this, "El pasaje: "+stringDatos()+" ya esta dado de baja.");
                    }else{
                        JOptionPane.showMessageDialog(this, "El pasaje: "+stringDatos()+" ya esta activo.");
                    }
                }
                jtID.setText(pasaje.getIdPasaje()+"");
                jbBuscarActionPerformed(evt);
                
                
            }else{
                JOptionPane.showMessageDialog(this, "No existe pasaje");
            }
       
       }
    }//GEN-LAST:event_jbEstadoActionPerformed

    private void jcbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDestinoActionPerformed

    private void jtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbEstado;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Ciudad> jcbDestino;
    private javax.swing.JComboBox<Ciudad> jcbOrigen;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JRadioButton jrActivo;
    private javax.swing.JRadioButton jrInactivo;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtImporte;
    // End of variables declaration//GEN-END:variables

    private void cargarTipoTrasporte() {
        String[] tipos = {"Avion", "Taxi", "Omnibus", "Combi", "Tren","Buquebus"};

        for (String t : tipos) {
            jcbTipo.addItem(t);
        }

    }

    private void cargarCiudades() {
        for (Ciudad c : ciu.listarCiudad()) {
            jcbOrigen.addItem(c);
            jcbDestino.addItem(c);

        }
    }

    private boolean comprobar(int id) {
        boolean existe = false;

        for (Pasaje p : psDt.listarPasajes()) {
            if (p.getIdPasaje() == id) {
                existe = true;
            }
        }
        return existe;
    }

    private boolean existePasaje(Pasaje p) {

        String tipo = p.getTipoDeTransporte();
        String Origen = p.getCiudadOrigen().getNombre();
        String Destino = p.getCiudadDestino().getNombre();
        boolean existe = false;

        for (Pasaje pasa : psDt.listarPasajes()) {

            String pasTipo = pasa.getTipoDeTransporte();
            String pasOrigen = pasa.getCiudadOrigen().getNombre();
            String pasDestino = pasa.getCiudadDestino().getNombre();

            if (pasTipo.equals(tipo) && pasOrigen.equals(Origen) && pasDestino.equals(Destino)) {
                existe = true;
                p.setEstado(pasa.isEstado());
                p.setIdPasaje(pasa.getIdPasaje());
                p.setImporte(pasa.getImporte());
                break;
            }
        }

        return existe;
    }

    private Pasaje setPasaje() {
        Pasaje p = new Pasaje();
        p.setTipoDeTransporte((String) jcbTipo.getSelectedItem());
        p.setCiudadDestino((Ciudad) jcbDestino.getSelectedItem());
        p.setCiudadOrigen((Ciudad) jcbOrigen.getSelectedItem());
        p.setImporte(Double.parseDouble(jtImporte.getText()));
        p.setEstado(jrActivo.isSelected());

        return p;
    }

    private void setComponentes() {

        jcbTipo.setSelectedIndex(-1);
        jcbOrigen.setSelectedIndex(-1);
        jcbDestino.setSelectedIndex(-1);
        jrActivo.setSelected(true);
        jtImporte.setText("0.0");
    }

    private boolean camposVacios() {
        boolean vacios = false;
        String tipo = (String) jcbTipo.getSelectedItem();
        Ciudad destino = (Ciudad) jcbDestino.getSelectedItem();
        Ciudad origen = (Ciudad) jcbOrigen.getSelectedItem();
        String importe = jtImporte.getText();

        if (importe.isEmpty() || destino == null || origen == null || tipo == null) {
            vacios = true;
        }
        return vacios;
    }
    
    private String stringDatos(){
        
        String tipo = (String) jcbTipo.getSelectedItem();
        Ciudad destino = (Ciudad) jcbDestino.getSelectedItem();
        Ciudad origen = (Ciudad) jcbOrigen.getSelectedItem();
        
        return tipo +" con destino " +destino.getNombre()+","+destino.getProvincia()
                        +"\ndesde "+origen.getNombre()+", "+origen.getProvincia();        
    }
}
