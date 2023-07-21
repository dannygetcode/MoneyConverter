package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import clases.Conexion;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;

public class Licencia extends javax.swing.JFrame {

    public Licencia() {

        initComponents();
        setSize(986, 655);
        setResizable(false);
        setTitle("Terminos y Condiciones");
        setLocationRelativeTo(null);

        ImageIcon imageIcon = new ImageIcon("src/images/LicenciaFondo.jpg");
        Icon icono = new ImageIcon(imageIcon.getImage().getScaledInstance(jLabel_WallPaper.getWidth(),
                jLabel_WallPaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_WallPaper.setIcon(icono);
        this.repaint();

        jTextArea1.setEditable(false);
        jButton_continuar.setEnabled(false);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton_continuar) {
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setVisible(true);
        } else if (e.getSource() == jButton_noacepto) {
            this.setVisible(false);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Logo.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton_continuar = new javax.swing.JButton();
        jButton_noacepto = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel_Footer = new javax.swing.JLabel();
        jLabel_WallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("   \n\n        A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE BANK OF ALURA CORPORATION.\n        B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS.\n        C.  BANK OF ALURA CORPORATION NO ES RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n        D.  BANK OF ALURA CORPORATION NO ES RESPONSABLE DE LAS DESICIONES QUE TOME FINANCIERAMENTE.\n\n        LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE\n        (BANK OF ALURA CORP. Y LOS DESARROLLADORES DE SOFTWARE), NO SE RESPONSABILIZAN DEL USO QUE\n        HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. SE RECOMIENDA CONSULTAR CON UN ASESOR FINANCIERO O\n        EXPERTO PARA QUE TOME CUALQUIER DESICION QUE DECIDA LLEVAR A CABO. ESTA LICENCIA SOLO TIENE\n        ACCESO A LOS DATOS HISTORICOS HASTA EL 19 DE JULIO DEL 2023.\n\n        PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (Yo Acepto)\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 840, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TÉRMINOS Y CONDICIONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jButton_continuar.setText("Continuar");
        jButton_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_continuarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        jButton_noacepto.setText("No Acepto");
        getContentPane().add(jButton_noacepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        jCheckBox1.setText("Yo Acepto");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        jLabel_Footer.setText("Creado por Daniel Chía, Copyright ©℗®™ - 2023  ");
        getContentPane().add(jLabel_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));
        getContentPane().add(jLabel_WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (jCheckBox1.isSelected()) {
            jButton_continuar.setEnabled(true);
            jButton_noacepto.setEnabled(false);
        } else {
            jButton_continuar.setEnabled(false);
            jButton_noacepto.setEnabled(true);

        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_continuarActionPerformed

        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton_continuarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Licencia().setVisible(true);
            }
        });
    }

    private void setImageLabel() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_continuar;
    private javax.swing.JButton jButton_noacepto;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Footer;
    private javax.swing.JLabel jLabel_WallPaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
