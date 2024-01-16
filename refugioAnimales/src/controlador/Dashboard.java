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
        barraMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPrincipal = new javax.swing.JButton();
        btnEventos = new javax.swing.JButton();
        btnDonaciones = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnAdopciones = new javax.swing.JButton();
        btnCitaVeterinaria = new javax.swing.JButton();
        btnVoluntarios = new javax.swing.JButton();
        barraMenu1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        navText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(246, 246, 246));

        menu.setBackground(new java.awt.Color(33, 36, 46));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        logo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(241, 147, 1));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("Sathe");
        logo.setToolTipText("");
        logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        barraMenu.setBackground(new java.awt.Color(39, 41, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 77, 192));
        jLabel1.setText("General");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout barraMenuLayout = new javax.swing.GroupLayout(barraMenu);
        barraMenu.setLayout(barraMenuLayout);
        barraMenuLayout.setHorizontalGroup(
            barraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        barraMenuLayout.setVerticalGroup(
            barraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btnPrincipal.setBackground(new java.awt.Color(186, 187, 190));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(186, 187, 190));
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPrincipal.setBorderPainted(false);
        btnPrincipal.setContentAreaFilled(false);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.setDefaultCapable(false);
        btnPrincipal.setFocusPainted(false);
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseMoved(evt);
            }
        });
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseClicked(evt);
            }
        });
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        btnEventos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnEventos.setForeground(new java.awt.Color(186, 187, 190));
        btnEventos.setText("Eventos");
        btnEventos.setBorder(null);
        btnEventos.setBorderPainted(false);
        btnEventos.setContentAreaFilled(false);
        btnEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEventos.setFocusPainted(false);
        btnEventos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEventosMouseClicked(evt);
            }
        });

        btnDonaciones.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnDonaciones.setForeground(new java.awt.Color(186, 187, 190));
        btnDonaciones.setText("Finanzas");
        btnDonaciones.setBorder(null);
        btnDonaciones.setBorderPainted(false);
        btnDonaciones.setContentAreaFilled(false);
        btnDonaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDonaciones.setFocusPainted(false);
        btnDonaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDonaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDonacionesMouseClicked(evt);
            }
        });
        btnDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonacionesActionPerformed(evt);
            }
        });

        btnInventario.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(186, 187, 190));
        btnInventario.setText("Animales");
        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.setFocusPainted(false);
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });

        btnAdopciones.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnAdopciones.setForeground(new java.awt.Color(186, 187, 190));
        btnAdopciones.setText("Adopciones");
        btnAdopciones.setBorder(null);
        btnAdopciones.setBorderPainted(false);
        btnAdopciones.setContentAreaFilled(false);
        btnAdopciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdopciones.setFocusPainted(false);
        btnAdopciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdopciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdopcionesMouseClicked(evt);
            }
        });

        btnCitaVeterinaria.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnCitaVeterinaria.setForeground(new java.awt.Color(186, 187, 190));
        btnCitaVeterinaria.setText("Cita Veterinarias");
        btnCitaVeterinaria.setBorder(null);
        btnCitaVeterinaria.setBorderPainted(false);
        btnCitaVeterinaria.setContentAreaFilled(false);
        btnCitaVeterinaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCitaVeterinaria.setFocusPainted(false);
        btnCitaVeterinaria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCitaVeterinaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitaVeterinariaMouseClicked(evt);
            }
        });

        btnVoluntarios.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnVoluntarios.setForeground(new java.awt.Color(186, 187, 190));
        btnVoluntarios.setText("Personas");
        btnVoluntarios.setBorder(null);
        btnVoluntarios.setBorderPainted(false);
        btnVoluntarios.setContentAreaFilled(false);
        btnVoluntarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoluntarios.setFocusPainted(false);
        btnVoluntarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVoluntarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoluntariosMouseClicked(evt);
            }
        });

        barraMenu1.setBackground(new java.awt.Color(39, 41, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(83, 77, 192));
        jLabel2.setText("Gestión");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout barraMenu1Layout = new javax.swing.GroupLayout(barraMenu1);
        barraMenu1.setLayout(barraMenu1Layout);
        barraMenu1Layout.setHorizontalGroup(
            barraMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        barraMenu1Layout.setVerticalGroup(
            barraMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(barraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(barraMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVoluntarios, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCitaVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDonaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logo)
                .addGap(31, 31, 31)
                .addComponent(barraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(barraMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoluntarios, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCitaVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDonaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        header.setBackground(new java.awt.Color(255, 255, 255));

        navText.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navText.setForeground(new java.awt.Color(102, 102, 102));
        navText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navText.setText("Sistema de Gestión > Refugio de Animales");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(navText, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
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

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseClicked
        cardLayout.show(content, "Principal");
        ventanaPrincipal.conteoAnimales();
        ventanaPrincipal.conteoVoluntarios();
    }//GEN-LAST:event_btnPrincipalMouseClicked

    private void btnAdopcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdopcionesMouseClicked
        cardLayout.show(content, "Adopcion");
    }//GEN-LAST:event_btnAdopcionesMouseClicked

    private void btnCitaVeterinariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitaVeterinariaMouseClicked
        cardLayout.show(content, "Cita");
    }//GEN-LAST:event_btnCitaVeterinariaMouseClicked

    private void btnDonacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonacionesMouseClicked
        cardLayout.show(content, "Donaciones");
    }//GEN-LAST:event_btnDonacionesMouseClicked

    private void btnEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMouseClicked
        cardLayout.show(content, "Eventos");
    }//GEN-LAST:event_btnEventosMouseClicked

    private void btnVoluntariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoluntariosMouseClicked
        cardLayout.show(content, "Voluntarios");
    }//GEN-LAST:event_btnVoluntariosMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        cardLayout.show(content, "Inventario");
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed

    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnPrincipalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseMoved
        btnPrincipal.setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_btnPrincipalMouseMoved

    private void btnDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonacionesActionPerformed

    }//GEN-LAST:event_btnDonacionesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel barraMenu;
    private javax.swing.JPanel barraMenu1;
    private javax.swing.JButton btnAdopciones;
    private javax.swing.JButton btnCitaVeterinaria;
    private javax.swing.JButton btnDonaciones;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnVoluntarios;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel navText;
    // End of variables declaration//GEN-END:variables
}
