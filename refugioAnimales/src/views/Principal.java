package views;

import database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;

public class Principal extends javax.swing.JPanel {
    
    // Conexión y variables relacionadas con la base de datos
    Connection conet;
    Statement st;
    ResultSet rs;
    int idc;
    
    // Constructor de la clase
    public Principal() {
        initComponents();
        conteoAnimales();
        conteoVoluntarios();
    }
    
    //metodos CRUD
    public void conteoAnimales() {
        String query = "SELECT COUNT(*) FROM animales;";

        try {
            conet = Conexion.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(query);
            
            
            if(rs.next()){
                String resultado = rs.getString(1);
                infoAnimal.setText(resultado);
            } else {
                infoAnimal.setText("0");
   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void conteoVoluntarios() {
        String query = "SELECT COUNT(*) FROM voluntarios;";

        try {
            conet = Conexion.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(query);
            
            
            if(rs.next()){
                String resultado = rs.getString(1);
                infoVoluntarios.setText(resultado);
            } else {
                infoVoluntarios.setText("0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getLabelInfoAnimal(){
         conteoAnimales();
    }
    public void getLabelInfoVoluntarios(){
        conteoVoluntarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelInfoANimal = new javax.swing.JPanel();
        infoAnimal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        panelInfoVoluntarios = new javax.swing.JPanel();
        infoVoluntarios = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 246));
        setToolTipText("datos");
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("¡Bienvenid@ a SatheCMS!");

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Sistema de gestión para refugio de animales");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/txtMenuPrincipal.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addGap(0, 126, Short.MAX_VALUE))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 730, 300));

        panelInfoANimal.setBackground(new java.awt.Color(33, 36, 46));

        infoAnimal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        infoAnimal.setForeground(new java.awt.Color(204, 204, 204));
        infoAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(186, 187, 190));
        jLabel4.setText("Animales");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelInfoANimalLayout = new javax.swing.GroupLayout(panelInfoANimal);
        panelInfoANimal.setLayout(panelInfoANimalLayout);
        panelInfoANimalLayout.setHorizontalGroup(
            panelInfoANimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoANimalLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panelInfoANimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoANimalLayout.createSequentialGroup()
                        .addComponent(infoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoANimalLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelInfoANimalLayout.setVerticalGroup(
            panelInfoANimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoANimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(panelInfoANimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 120, -1));

        dashboard.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(102, 102, 102));
        dashboard.setText("Dashboard");
        add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelInfoVoluntarios.setBackground(new java.awt.Color(33, 36, 46));

        infoVoluntarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        infoVoluntarios.setForeground(new java.awt.Color(204, 204, 204));
        infoVoluntarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(186, 187, 190));
        jLabel6.setText("Voluntarios");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelInfoVoluntariosLayout = new javax.swing.GroupLayout(panelInfoVoluntarios);
        panelInfoVoluntarios.setLayout(panelInfoVoluntariosLayout);
        panelInfoVoluntariosLayout.setHorizontalGroup(
            panelInfoVoluntariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoVoluntariosLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelInfoVoluntariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoVoluntariosLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoVoluntariosLayout.createSequentialGroup()
                        .addComponent(infoVoluntarios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        panelInfoVoluntariosLayout.setVerticalGroup(
            panelInfoVoluntariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoVoluntariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoVoluntarios, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(panelInfoVoluntarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel infoAnimal;
    private javax.swing.JLabel infoVoluntarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelInfoANimal;
    private javax.swing.JPanel panelInfoVoluntarios;
    // End of variables declaration//GEN-END:variables
}
