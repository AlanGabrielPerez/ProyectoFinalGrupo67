/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.views;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectoFinal.AccessData.AlojamientoData;
import proyectoFinal.AccessData.CiudadData;
import proyectoFinal.Entidades.Alojamiento;
import proyectoFinal.Entidades.Ciudad;


public class AdminAlojamiento extends javax.swing.JInternalFrame {

    private AlojamientoData aloja = new AlojamientoData();
    private CiudadData ciu = new CiudadData();


    public AdminAlojamiento() {
        initComponents();
        agregarCiudad();
        TiposAlojamientos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcDesayuno = new javax.swing.JCheckBox();
        jcAlmuerzo = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jtImporte = new javax.swing.JTextField();
        jcCena = new javax.swing.JCheckBox();
        jcbCiudad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jrActivo = new javax.swing.JRadioButton();
        jrInactivo = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Administar alojamientos");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lupa16.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Lugar");

        jLabel4.setText("Categoria");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel5.setText(" ID");

        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDKeyTyped(evt);
            }
        });

        jLabel6.setText("Servicios ");

        jcDesayuno.setText("Desayuno");

        jcAlmuerzo.setText("Almuerzo");

        jLabel7.setText("Importe diario");

        jtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtImporteKeyTyped(evt);
            }
        });

        jcCena.setText("Cena");

        jLabel1.setText("Estado");

        jrActivo.setText("Activo");
        jrActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivoActionPerformed(evt);
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
                .addGap(35, 35, 35)
                .addComponent(jbGuardar)
                .addGap(53, 53, 53)
                .addComponent(jbModificar)
                .addGap(69, 69, 69)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jbBuscar))
                            .addComponent(jcbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jcDesayuno)
                                        .addGap(24, 24, 24)
                                        .addComponent(jcAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcCena, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtImporte)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrActivo)
                                .addGap(35, 35, 35)
                                .addComponent(jrInactivo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcDesayuno)
                    .addComponent(jcAlmuerzo)
                    .addComponent(jcCena))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jrActivo)
                    .addComponent(jrInactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbModificar)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        Alojamiento alojamiento = new Alojamiento();

        if (jcbCiudad.getItemCount()>1) {
            if (jtNombre.getText().isEmpty() || jcbTipo.getSelectedIndex()<0||jcbCiudad.getSelectedIndex()<0||jtImporte.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rellene correctamente los campos");
            } else {

                Ciudad c = (Ciudad) jcbCiudad.getSelectedItem();
                alojamiento.setCiudadDestino(c);
                
                alojamiento.setTipoAlojamiento((String) jcbTipo.getSelectedItem());  
                
                alojamiento.setEstado(jrActivo.isSelected());
                
                alojamiento.setNombre(jtNombre.getText());
                
                alojamiento.setImporteDiario(Double.parseDouble(jtImporte.getText()));
                                             
                setServiciosyCoste(alojamiento);
                
                ImageIcon agregar = new ImageIcon("src/Icons/agregar32.png");
                int op = JOptionPane.showConfirmDialog(null, "Seguro desea crear Alojamiento: "+datos(alojamiento),
                        "Crear alojamiento", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, agregar);
                if (op == 0) {
                    aloja.guardarAlojamiento(alojamiento);
                    jbNuevoActionPerformed(evt);
                }                
            }
            
        } else {
            int id = Integer.parseInt(jtID.getText());
            alojamiento= aloja.alojamientoId(id);
            
            alojamiento.setEstado(jrActivo.isSelected());                
            alojamiento.setNombre(jtNombre.getText());
             
            double importe = Double.parseDouble(jtImporte.getText());
            if (alojamiento.getImporteDiario() == importe) {
                if (alojamiento.getServicio().contains("Desayuno")) {
                    importe -= 500;
                }
                if (alojamiento.getServicio().contains("Almuerzo")) {
                    importe -= 500;
                }
                if (alojamiento.getServicio().contains("Cena")) {
                    importe -= 500;
                }
            }
            
            alojamiento.setImporteDiario(importe);              
            setServiciosyCoste(alojamiento);
            
            
            ImageIcon modificar = new ImageIcon("src/Icons/editar32.png");
            int op = JOptionPane.showConfirmDialog(null, "Seguro desea modificar el alojamiento id "+alojamiento.getIdAlojamiento()+": " + datos(alojamiento),
                    "Modificar alojamiento", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, modificar);
            if (op == 0) {
                aloja.modificarAlojamiento(alojamiento);
                jbNuevoActionPerformed(evt);
            }            
        }
    

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
      
    dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        jtID.setText("");
        jtNombre.setText("");
        
        jcDesayuno.setSelected(false);
        jcAlmuerzo.setSelected(false);
        jcCena.setSelected(false);
        
        jtImporte.setText("");
        jcAlmuerzo.setIcon(null);
        jcCena.setIcon(null);
        jcDesayuno.setIcon(null);
        jrActivo.setIcon(null);
        jrInactivo.setIcon(null);
        
        agregarCiudad();
        TiposAlojamientos();
        jcbCiudad.setSelectedIndex(-1);
        jcbTipo.setSelectedIndex(-1);
        
        jtID.setEditable(true);
        jtImporte.setEditable(true);
        jtNombre.setEditable(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        jtID.setEditable(false);
        jtImporte.setEditable(true);
        jtNombre.setEditable(true);
        jcAlmuerzo.setIcon(null);
        jcCena.setIcon(null);
        jcDesayuno.setIcon(null);
        jrActivo.setIcon(null);
        jrInactivo.setIcon(null);
                
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        if (jtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un id");
        }else {
            int id = Integer.parseInt(jtID.getText());
            if (comprobar(id) || comprobarInactivos(id)) {
                Alojamiento alojamiento = aloja.alojamientoId(id);
                
                jtNombre.setText(alojamiento.getNombre());
                jtNombre.setEditable(false);
                
                jcbCiudad.removeAllItems();
                jcbCiudad.addItem(alojamiento.getCiudadDestino());
                
                jcbTipo.removeAllItems();
                jcbTipo.addItem(alojamiento.getTipoAlojamiento());

                jcbCiudad.getModel().setSelectedItem(alojamiento.getCiudadDestino());
                jcbTipo.getModel().setSelectedItem(alojamiento.getTipoAlojamiento());

                jtImporte.setText(alojamiento.getImporteDiario() + "");
                jtImporte.setEditable(false);

                setServicios(alojamiento);
                setCasillas(alojamiento);
                
                if(!alojamiento.getCiudadDestino().isEstado()){
                    JOptionPane.showMessageDialog(this, "La ciudad de este alojamiento se encuentra inactiva.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "No se encontro alojamiento ID: " + id);
            }
        
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jrActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivoActionPerformed
        if (jrActivo.isSelected()) {
            jrInactivo.setSelected(false);
        }else {
            jrInactivo.setSelected(true);
            jrInactivoActionPerformed(evt);
        }
    }//GEN-LAST:event_jrActivoActionPerformed

    private void jrInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInactivoActionPerformed
       if (jrInactivo.isSelected()) {
            jrActivo.setSelected(false);
        }else{
            jrActivo.setSelected(true);
            jrActivoActionPerformed(evt);
        }
    }//GEN-LAST:event_jrInactivoActionPerformed

    private void jtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyTyped
           int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtIDKeyTyped

    private void jtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtImporteKeyTyped
        int key = evt.getKeyChar();
        boolean numero = ((key >= 48 && key <= 57) || key == 46);
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtImporteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcAlmuerzo;
    private javax.swing.JCheckBox jcCena;
    private javax.swing.JCheckBox jcDesayuno;
    private javax.swing.JComboBox<Ciudad> jcbCiudad;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JRadioButton jrActivo;
    private javax.swing.JRadioButton jrInactivo;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtImporte;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void agregarCiudad() {
        jcbCiudad.removeAllItems();
        
        for (Ciudad c : ciu.listarCiudad()) {
            jcbCiudad.addItem(c);
        }
    }

    private boolean comprobar(int id) {
        boolean ok = false;
        for (Alojamiento a : aloja.listaAlojamiento()) {
            if (a.getIdAlojamiento() == id) {

                ok = true;
                break;
            }
        }
        return ok;
    }

    private boolean comprobarInactivos(int id) {
        boolean ok = false;
        for (Alojamiento a2 : aloja.alojamientoInactivo()) {
            if (a2.getIdAlojamiento() == id) {
                ok = true;
                break;
            }
        }
        return ok;
    }

    private void TiposAlojamientos() {
        jcbTipo.removeAllItems();
        String[] tipos = {"Hostel", "Hotel", "Cabaña", "Departamento"};
        for (String t : tipos) {
            jcbTipo.addItem(t);
        }
    }

    private void setServicios(Alojamiento a) {
        ImageIcon casilla = new ImageIcon("src/Icons/casilla16.png");
        ImageIcon marcada = new ImageIcon("src/Icons/casillaMarcada16.png");

        if (a.getServicio().contains("Desayuno")) {
            jcDesayuno.setIcon(marcada);
        } else {
            jcDesayuno.setIcon(casilla);
        }
        if (a.getServicio().contains("Almuerzo")) {
            jcAlmuerzo.setIcon(marcada);
        } else {
            jcAlmuerzo.setIcon(casilla);
        }
        if (a.getServicio().contains("Cena")) {
            jcCena.setIcon(marcada);
        } else {
            jcCena.setIcon(casilla);
        }
       
        if(a.isEstado()){
            jrActivo.setIcon(marcada);
            jrInactivo.setIcon(casilla);            
        }else{
            jrActivo.setIcon(casilla);
            jrInactivo.setIcon(marcada);
        }
        
    }
    
    private void setCasillas(Alojamiento a){
        if (a.getServicio().contains("Desayuno")) {

            jcDesayuno.setSelected(true);
        } else {
            jcDesayuno.setSelected(false);
        }
        if (a.getServicio().contains("Almuerzo")) {
            jcAlmuerzo.setSelected(true);
        } else {
            jcAlmuerzo.setSelected(false);
        }
        if (a.getServicio().contains("Cena")) {
            jcCena.setSelected(true);
        } else {
            jcCena.setSelected(false);
        }
        
        jrActivo.setSelected(a.isEstado());
        

    }

    private void setServiciosyCoste(Alojamiento a) {
        String servicio = "";
        if (jcDesayuno.isSelected()) {
            servicio += ("Desayuno- ");
            a.setImporteDiario(a.getImporteDiario() + 500);
        }
        if (jcAlmuerzo.isSelected()) {
            servicio += (" Almuerzo- ");
            a.setImporteDiario(a.getImporteDiario() + 500);
        }
        if (jcCena.isSelected()) {
            servicio += (" Cena");
            a.setImporteDiario(a.getImporteDiario() + 500);
        }
        if (servicio.isEmpty()){
            servicio ="Sin servicios disponibles";
        }a.setServicio(servicio);

    }
    
    private String datos(Alojamiento a){
        String retorno="";
        retorno+="\nCategoria: "+a.getTipoAlojamiento();
        retorno+="\nNombre: "+a.getNombre();
        retorno+="\nLocalidad: "+a.getCiudadDestino().toString();
        retorno+="\nServicios: "+a.getServicio();
        retorno+="\nImporte diario: "+a.getImporteDiario();
        if(a.isEstado()){
            retorno+="\nEstado: Activo";
        }else{
            retorno+="\nEstado: Inactivo.";
        }     
        return retorno;
    }
}
