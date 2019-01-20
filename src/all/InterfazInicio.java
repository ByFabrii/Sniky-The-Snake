
package all;


public class InterfazInicio extends javax.swing.JFrame {


    public InterfazInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(600,600);
        this.setResizable(false);
        this.setVisible(true);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        comida3 = new javax.swing.JLabel();
        comida2 = new javax.swing.JLabel();
        comida1 = new javax.swing.JLabel();
        comida = new javax.swing.JLabel();
        cuerpo10 = new javax.swing.JLabel();
        cuerpo9 = new javax.swing.JLabel();
        cuerpo8 = new javax.swing.JLabel();
        cuerpo7 = new javax.swing.JLabel();
        cuerpo6 = new javax.swing.JLabel();
        cuerpo5 = new javax.swing.JLabel();
        cuerpo4 = new javax.swing.JLabel();
        cuerpo3 = new javax.swing.JLabel();
        cuerpo2 = new javax.swing.JLabel();
        cuerpo1 = new javax.swing.JLabel();
        cabeza = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(0, 102, 153));
        salir.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 130, 60));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Edwardian Script ITC", 2, 60)); // NOI18N
        jButton1.setText("Play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 270, 80));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Engravers MT", 2, 40)); // NOI18N
        Titulo.setForeground(java.awt.Color.darkGray);
        Titulo.setText("Sniky The Snake");
        Titulo.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 510, 50));

        comida3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\6.png")); // NOI18N
        getContentPane().add(comida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        comida2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\6.png")); // NOI18N
        getContentPane().add(comida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        comida1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\6.png")); // NOI18N
        getContentPane().add(comida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        comida.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\6.png")); // NOI18N
        getContentPane().add(comida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        cuerpo10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        cuerpo9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        cuerpo8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        cuerpo7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        cuerpo6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        cuerpo5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        cuerpo4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        cuerpo3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        cuerpo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 50, 60));

        cuerpo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\5.png")); // NOI18N
        getContentPane().add(cuerpo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        cabeza.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\1.png")); // NOI18N
        getContentPane().add(cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 60, 50));

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruben\\Documents\\NetBeansProjects\\SnikyTheSnake\\imagenes\\fondo.png")); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Juego ob = new Juego();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cabeza;
    private javax.swing.JLabel comida;
    private javax.swing.JLabel comida1;
    private javax.swing.JLabel comida2;
    private javax.swing.JLabel comida3;
    private javax.swing.JLabel cuerpo1;
    private javax.swing.JLabel cuerpo10;
    private javax.swing.JLabel cuerpo2;
    private javax.swing.JLabel cuerpo3;
    private javax.swing.JLabel cuerpo4;
    private javax.swing.JLabel cuerpo5;
    private javax.swing.JLabel cuerpo6;
    private javax.swing.JLabel cuerpo7;
    private javax.swing.JLabel cuerpo8;
    private javax.swing.JLabel cuerpo9;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
