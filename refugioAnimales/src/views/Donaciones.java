package views;

import database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Donaciones extends javax.swing.JPanel {

    // Conexión y variables relacionadas con la base de datos
    Connection conet;
    Statement st;
    ResultSet rs;
    int idc;

    // Modelo para la tabla
    DefaultTableModel modelo;

    // Constructor de la clase
    public Donaciones() {
        initComponents();
        consultar();
    }

    //metodos CRUD
    private void consultar() {
        String query = "SELECT * FROM donaciones";

        try {
            conet = Conexion.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(query);
            modelo = (DefaultTableModel) Tabla.getModel();
            modelo.setRowCount(0);
            Object[] mascota = new Object[5]; //numero de columna de la tabla
            while (rs.next()) {
                mascota[0] = rs.getInt("ID");
                mascota[1] = rs.getString("FECHA");
                mascota[2] = rs.getString("DONANTE");
                mascota[3] = rs.getString("MONTO");
                mascota[4] = rs.getString("COMENTARIO");

                modelo.addRow(mascota.clone());
            }
            Tabla.setModel(modelo);

        } catch (Exception e) {
        }
    }
/*
    //Métodos CRUD
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
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("datos");
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registros Actuales:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA", "DONANTE", "MONTO", "COMENTARIO"
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 740, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
      /*  int fila = Tabla.getSelectedRow();
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

        }*/
    }//GEN-LAST:event_TablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
