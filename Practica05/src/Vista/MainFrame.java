package Vista;

import Controlador.Gestor;
import Modelo.Empleado;
import java.util.ArrayList;

public class MainFrame extends javax.swing.JFrame {

    // ArrayList para los empleados
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    // Panel Listado
    private Listado listado;
    // Panel para la navegación
    private Navegador navegador;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        // Cargamos los elementos en el array al inicio
        empleados = Gestor.extract("select * from empresa.empleado");
        // Panel Listado
        listado = new Listado();
        // Panel para la navegación
        navegador = new Navegador();
        // Comenzamos mostrando el listado
        this.setContentPane(listado);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuBarNavegación = new javax.swing.JMenu();
        menuBarListado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listado de empleados");
        setResizable(false);

        menuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuBarNavegación.setText("Navegación");
        menuBarNavegación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarNavegaciónMouseClicked(evt);
            }
        });
        menuBar.add(menuBarNavegación);

        menuBarListado.setText("Listado");
        menuBarListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarListadoMouseClicked(evt);
            }
        });
        menuBar.add(menuBarListado);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuBarListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarListadoMouseClicked
        // Si se selecciona el botón de Listado del menú, cambiamos al panel de
        // listado.
        this.setContentPane(listado);
        this.pack();
    }//GEN-LAST:event_menuBarListadoMouseClicked

    private void menuBarNavegaciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarNavegaciónMouseClicked
        // Si se selecciona el botón de Navegación del menú, cambiamos al panel de
        // navegación.
        this.setContentPane(navegador);
        this.pack();
    }//GEN-LAST:event_menuBarNavegaciónMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Windows Classic look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarListado;
    private javax.swing.JMenu menuBarNavegación;
    // End of variables declaration//GEN-END:variables

    static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}