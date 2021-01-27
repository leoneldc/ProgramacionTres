
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeff
 */
public class citas extends javax.swing.JFrame {

    private static Connection con;
    private static final String url = "jdbc:mysql://localhost:3306/ProyectoMigracion";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";

    public void conector() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null) {
                //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e) {
            //JOptionPane.showMessageDialog(null, "Conexion Fallida");
        }
    }

    public void limpiar() {
        txtBoleta.setText("");
        txtRecibo.setText("");
        txtNombre.setText("");
        txtDpi.setText("");
        jlbBoleta.setText("");
        jlbComprobante.setText("");
        jLabel8.setText("");
    }

    public citas() {
        initComponents();
        
        jlbBoleta.setVisible(false);
        jlbComprobante.setVisible(false);
        jLabel8.setVisible(false);
        jlbDpi.setVisible(false);
        
        Inf_Personal ventana = new Inf_Personal();
        txtNombre.setText(ventana.gnombrec);
        txtDpi.setText(ventana.gdpi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBoleta = new javax.swing.JTextField();
        txtRecibo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDpi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jlbBoleta = new javax.swing.JLabel();
        jlbComprobante = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbDpi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No. Boleta:");

        jLabel2.setText("No. Recibo:");

        jLabel3.setText("Nombres:");

        jLabel5.setText("DPI:");

        txtNombre.setEditable(false);

        txtDpi.setEditable(false);

        jButton1.setText("AGENDAR CITA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlbBoleta.setText(".");

        jlbComprobante.setText(".");

        jLabel8.setText(".");

        jlbDpi.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbComprobante)
                    .addComponent(jlbBoleta)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbDpi)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbBoleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbComprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jlbDpi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String recibo1, boleta1, dpi1;
            String recibo2, boleta2, dpi2;

            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoMigracion", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into citas values(?,?,?,?,?)");

            Connection cn2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoMigracion", "root", "");
            PreparedStatement pst2 = cn2.prepareStatement("select * from banco where noBoleta = ?");

            Connection cn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoMigracion", "root", "");
            PreparedStatement pst3 = cn3.prepareStatement("select * from Renap where DPI = ?");

            //verifico si el recibo y boleta son los mismos de la BD banco
            pst2.setString(1, txtBoleta.getText().trim());
            pst3.setString(1, txtDpi.getText().trim());

            ResultSet rs = pst2.executeQuery();
            ResultSet rs2 = pst3.executeQuery();

            if (rs.next() && rs2.next()) {
                jlbBoleta.setText(rs.getString("noBoleta"));
                jlbComprobante.setText(rs.getString("noComprobante"));
                jlbDpi.setText(rs2.getString("DPI"));
            }

            boleta1 = txtBoleta.getText();
            recibo1 = txtRecibo.getText();
            dpi1 = txtDpi.getText();

            boleta2 = jlbBoleta.getText();
            recibo2 = jlbComprobante.getText();
            dpi2 = jlbDpi.getText();

            if (txtBoleta.getText().length() != 0 && txtRecibo.getText().length() != 0
                    && txtNombre.getText().length() != 0 && txtDpi.getText().length() != 0) {
                if (recibo1.equals(recibo2) && boleta1.equals(boleta2) && dpi1.equals(dpi2)) {
                    pst.setString(1, "0");
                    pst.setString(2, txtBoleta.getText().trim());
                    pst.setString(3, txtRecibo.getText().trim());
                    pst.setString(4, txtNombre.getText().trim());
                    pst.setString(5, txtDpi.getText().trim());
                    pst.executeUpdate();
                    limpiar();
                    agendarCita agendar = new agendarCita();
                    agendar.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique que los datos ingresados sean los correctos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos tienen que estar llenos.");
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlbBoleta;
    private javax.swing.JLabel jlbComprobante;
    private javax.swing.JLabel jlbDpi;
    private javax.swing.JTextField txtBoleta;
    private javax.swing.JTextField txtDpi;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRecibo;
    // End of variables declaration//GEN-END:variables
}
