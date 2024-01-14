package controlador;

import java.awt.CardLayout;
import views.*;

public class Dashboard extends javax.swing.JFrame {

    private Principal ventanaPrincipal;
    private Inventario ventanaInventario;
    private Adopcion ventanaAdopcion;
    private CitaVeterinaria ventanaCita;
    private Voluntarios ventanaVoluntarios;
    private Eventos ventanaEventos;
    private Donaciones ventanaDonaciones;
    private CardLayout cardLayout;

    public Dashboard() {
        initComponents();
        ventanaPrincipal = new Principal();
        ventanaInventario = new Inventario();
        ventanaAdopcion = new Adopcion();
        ventanaCita = new CitaVeterinaria();
        ventanaVoluntarios = new Voluntarios();
        ventanaEventos = new Eventos();
        ventanaDonaciones = new Donaciones();
        cardLayout = new CardLayout();
        content.setLayout(cardLayout);
        content.add(ventanaPrincipal, "Principal");
        content.add(ventanaInventario, "Inventario");
        content.add(ventanaAdopcion, "Adopcion");
        content.add(ventanaCita, "Cita");
        content.add(ventanaVoluntarios, "Voluntarios");
        content.add(ventanaEventos, "Eventos");
        content.add(ventanaDonaciones, "Donaciones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnInventario = new javax.swing.JButton();
        btnVoluntarios = new javax.swing.JButton();
        btnEventos = new javax.swing.JButton();
        btnDonaciones = new javax.swing.JButton();
        btnCitaVeterinaria = new javax.swing.JButton();
        btnAdopciones = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDonaciones1 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        navText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(0, 51, 102));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        logo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 102, 0));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("Sathe");
        logo.setToolTipText("");
        logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnInventario.setText("Inventario");
        btnInventario.setBorder(null);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });

        btnVoluntarios.setText("Voluntarios");
        btnVoluntarios.setBorder(null);
        btnVoluntarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoluntarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoluntariosMouseClicked(evt);
            }
        });

        btnEventos.setText("Eventos");
        btnEventos.setBorder(null);
        btnEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEventosMouseClicked(evt);
            }
        });

        btnDonaciones.setText("Donaciones");
        btnDonaciones.setBorder(null);
        btnDonaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDonaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDonacionesMouseClicked(evt);
            }
        });

        btnCitaVeterinaria.setText("cita veterinaria");
        btnCitaVeterinaria.setBorder(null);
        btnCitaVeterinaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCitaVeterinaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitaVeterinariaMouseClicked(evt);
            }
        });

        btnAdopciones.setText("adopciones");
        btnAdopciones.setBorder(null);
        btnAdopciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdopciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdopcionesMouseClicked(evt);
            }
        });

        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(null);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEventos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoluntarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCitaVeterinaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdopciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDonaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCitaVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoluntarios, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDonaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        btnDonaciones1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Walter\\proyectos\\sathe\\refugioAnimales\\resources\\icon\\config.png")); // NOI18N
        btnDonaciones1.setText("Config");
        btnDonaciones1.setBorder(null);
        btnDonaciones1.setBorderPainted(false);
        btnDonaciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDonaciones1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDonaciones1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDonaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(menuLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(menuLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logo)
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDonaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        header.setBackground(new java.awt.Color(4, 53, 102));

        navText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navText.setForeground(new java.awt.Color(255, 255, 255));
        navText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navText.setText("Sistema de Gestión > Refugio de Animales");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(navText, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(194, 194, 194))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 51, 102), null, null));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mensaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(102, 102, 102));
        mensaje.setText("Bienvenidos");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 611, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        cardLayout.show(content, "Inventario");
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseClicked
        cardLayout.show(content, "Principal");
    }//GEN-LAST:event_btnPrincipalMouseClicked

    private void btnAdopcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdopcionesMouseClicked
        cardLayout.show(content, "Adopcion");
    }//GEN-LAST:event_btnAdopcionesMouseClicked

    private void btnCitaVeterinariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitaVeterinariaMouseClicked
        cardLayout.show(content, "Cita");
    }//GEN-LAST:event_btnCitaVeterinariaMouseClicked

    private void btnVoluntariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoluntariosMouseClicked
        cardLayout.show(content, "Voluntarios");
    }//GEN-LAST:event_btnVoluntariosMouseClicked

    private void btnEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMouseClicked
        cardLayout.show(content, "Eventos");
    }//GEN-LAST:event_btnEventosMouseClicked

    private void btnDonacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonacionesMouseClicked
        cardLayout.show(content, "Donaciones");
    }//GEN-LAST:event_btnDonacionesMouseClicked

    private void btnDonaciones1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonaciones1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDonaciones1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAdopciones;
    private javax.swing.JButton btnCitaVeterinaria;
    private javax.swing.JButton btnDonaciones;
    private javax.swing.JButton btnDonaciones1;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnVoluntarios;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel navText;
    // End of variables declaration//GEN-END:variables
}
