package views;

import database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Adopcion extends javax.swing.JPanel {

    // Conexión y variables relacionadas con la base de datos
    Connection conet;
    Statement st;
    ResultSet rs;
    int idc;

    // Modelo para la tabla
    DefaultTableModel modelo;

    // Constructor de la clase
    public Adopcion() {
        initComponents();
        consultar();
    }

    //metodos CRUD
    private void consultar() {
        String query = "SELECT * FROM adopciones";

        try {
            conet = Conexion.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(query);
            modelo = (DefaultTableModel) Tabla.getModel();
            modelo.setRowCount(0);
            Object[] mascota = new Object[4]; //numero de columna de la tabla
            while (rs.next()) {
                mascota[0] = rs.getInt("ID");
                mascota[1] = rs.getString("ID_ANIMAL");
                mascota[2] = rs.getString("ID_VOLUNTARIO");
                mascota[3] = rs.getString("FECHA_ADOPCION");
                modelo.addRow(mascota.clone());
            }
            Tabla.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void agregar() {
        String nombreCadena = txtNombre.getText();
        String razaCadena = txtRaza.getText();
        String claseCadena = txtClase.getText();
        String edadCadena = txtEdad.getText();
        String disponible = txtDisponibilidad.getText();

        try {
            if (nombreCadena.equals("") || razaCadena.equals("") || claseCadena.equals("") || edadCadena.equals("") || disponible.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, añada los datos");
                resetearFormulario();
            } else {

                String query = "INSERT into animales(nombre, raza, clase, edad, disponibilidad) values ('" + nombreCadena + "', '" + razaCadena + "', '" + claseCadena + "', '" + edadCadena + "', '" + disponible + "' )";
                conet = Conexion.getConnection();
                st = conet.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Nuevo registro agregado");
                //consultar();
                resetearFormulario();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void modificar() {
        String nombreCadena = txtNombre.getText();
        String razaCadena = txtRaza.getText();
        String claseCadena = txtClase.getText();
        String edadCadena = txtEdad.getText();
        String disponible = txtDisponibilidad.getText();

        try {
            if (nombreCadena.equals("") || razaCadena.equals("") || claseCadena.equals("") || edadCadena.equals("") || disponible.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el registro que deseas modificar");
                resetearFormulario();
            } else {

                String query = "UPDATE animales SET nombre='" + nombreCadena + "', raza='" + razaCadena + "', clase='" + claseCadena + "', edad='" + edadCadena + "', disponibilidad='" + disponible + "' WHERE ID=" + idc;
                conet = Conexion.getConnection();
                st = conet.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Registro modificado");
                //consultar();
                resetearFormulario();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void eliminar() {
        int fila = Tabla.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro");
                resetearFormulario();
            } else {
                String query = "delete from animales where id=" + idc;
                conet = Conexion.getConnection();
                st = conet.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                resetearFormulario();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void nuevo() {

        txtId.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtClase.setText("");
        txtEdad.setText("");
        txtDisponibilidad.setText("");
        txtId.requestFocus();

    }

    private void resetearFormulario() {
        txtId.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtClase.setText("");
        txtEdad.setText("");
        txtDisponibilidad.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        raza = new javax.swing.JLabel();
        clase = new javax.swing.JLabel();
        txtClase = new javax.swing.JTextField();
        edad = new javax.swing.JLabel();
        txtDisponibilidad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtEdad = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        edad1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        txtRaza1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("datos");
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha técnica"));

        jLabel1.setText("FOLIO:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtId.setEnabled(false);

        raza.setText("RAZA:");

        clase.setText("CLASE:");

        edad.setText("EDAD:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Responsable de adopción"));

        edad1.setText("E-MAIL:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombre.setText("NOMBRE:");

        nombre1.setText("APELLIDOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(edad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(nombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtRaza1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre)
                    .addComponent(nombre1)
                    .addComponent(txtRaza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(clase)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(213, 213, 213))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(raza, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(238, 238, 238)
                                .addComponent(edad))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raza)
                    .addComponent(edad))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 740, 260));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Adopciones pendientes:"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID_ANIMAL", "ID_VOLUNTARIO", "FECHA_ADOPCIÓN"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 740, 170));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Añadir");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Borrar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo)))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 740, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        consultar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
        consultar();
        nuevo();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        consultar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
        } else {
            idc = Integer.parseInt((String) Tabla.getValueAt(fila, 0).toString());
            String nombreCadena = (String) Tabla.getValueAt(fila, 1).toString();
            String razaCadena = (String) Tabla.getValueAt(fila, 2).toString();
            String claseCadena = (String) Tabla.getValueAt(fila, 3).toString();
            String edadCadena = (String) Tabla.getValueAt(fila, 4).toString();
            String disponible = (String) Tabla.getValueAt(fila, 5).toString();

            txtId.setText("" + idc);
            txtNombre.setText(nombreCadena);
            txtRaza.setText(razaCadena);
            txtClase.setText(claseCadena);
            txtEdad.setText("" + edadCadena);
            txtDisponibilidad.setText(disponible);

        }
    }//GEN-LAST:event_TablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel clase;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel edad1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel raza;
    private javax.swing.JTextField txtClase;
    private javax.swing.JTextField txtDisponibilidad;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtRaza1;
    // End of variables declaration//GEN-END:variables
}
