package Vista;

import Controlador.Gestor;
import Modelo.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.ImageIcon;

/**
 * Clase para el Listado de empleados con un JList.
 *
 */
public class Navegador extends javax.swing.JPanel {

    private List<Empleado> empleados;
    private ListIterator iter;

    /**
     * Creates new form Listado
     */
    public Navegador() {
        initComponents();
        empleados = MainFrame.getEmpleados();
        iter = empleados.listIterator();
        if (iter.hasNext()) {
            mostrar((Empleado) iter.next());
        }
        cargarApellidos();
    }
    
    private void cargarApellidos() {
        FiltroDesplegable.removeAllItems();
        FiltroDesplegable.addItem("-");
        empleados.forEach(e -> {
            FiltroDesplegable.addItem(e.getApellido());
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        Número = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Sueldo = new javax.swing.JLabel();
        FechaAlta = new javax.swing.JLabel();
        SueldoMax1 = new javax.swing.JLabel();
        Anterior = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        FiltroDesplegable = new javax.swing.JComboBox<>();
        FiltroLabel = new javax.swing.JLabel();
        NúmeroTField = new javax.swing.JLabel();
        NombreTField = new javax.swing.JLabel();
        SueldoTField = new javax.swing.JLabel();
        FechaAltaTField = new javax.swing.JLabel();
        ApellidosTField = new javax.swing.JLabel();
        SueldoMaximoTField = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(490, 490));
        setPreferredSize(new java.awt.Dimension(490, 490));

        Imagen.setBorder(new javax.swing.border.MatteBorder(null));
        Imagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Imagen.setPreferredSize(new java.awt.Dimension(172, 172));

        Número.setText("Número: ");

        Nombre.setText("Nombre:");

        Apellidos.setText("Apellidos:");

        Sueldo.setText("Sueldo: ");

        FechaAlta.setText("Fecha de Alta:");

        SueldoMax1.setText("Sueldo máximo:");

        Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Datos/icons/prev.png"))); // NOI18N
        Anterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Datos/icons/next.png"))); // NOI18N
        Siguiente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        FiltroDesplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FiltroDesplegable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FiltroDesplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroDesplegableActionPerformed(evt);
            }
        });

        FiltroLabel.setText("Filtrar por apellidos:");

        NúmeroTField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NombreTField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SueldoTField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        FechaAltaTField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ApellidosTField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SueldoMaximoTField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Anterior)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Número, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(NombreTField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(SueldoTField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SueldoMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(NúmeroTField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FiltroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FiltroDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Siguiente)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApellidosTField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaAltaTField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SueldoMaximoTField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Número, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NúmeroTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FechaAltaTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NombreTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApellidosTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SueldoMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SueldoTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SueldoMaximoTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltroLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anterior)
                    .addComponent(Siguiente))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        if (!Siguiente.isEnabled()) {
            Siguiente.setEnabled(false);
        }

        if (iter.hasPrevious()) {
            mostrar((Empleado) iter.previous());
            if (!iter.hasPrevious()) {
                Anterior.setEnabled(false);
            }
        }
    }//GEN-LAST:event_AnteriorActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        if (!Anterior.isEnabled()) {
            Anterior.setEnabled(false);
        }

        if (iter.hasNext()) {
            mostrar((Empleado) iter.next());
            if (!iter.hasNext()) {
                Siguiente.setEnabled(false);
            }
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void FiltroDesplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroDesplegableActionPerformed
        filtrarApellido((String) FiltroDesplegable.getSelectedItem());
    }//GEN-LAST:event_FiltroDesplegableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel ApellidosTField;
    private javax.swing.JLabel FechaAlta;
    private javax.swing.JLabel FechaAltaTField;
    private javax.swing.JComboBox<String> FiltroDesplegable;
    private javax.swing.JLabel FiltroLabel;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NombreTField;
    private javax.swing.JLabel Número;
    private javax.swing.JLabel NúmeroTField;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel Sueldo;
    private javax.swing.JLabel SueldoMax1;
    private javax.swing.JLabel SueldoMaximoTField;
    private javax.swing.JLabel SueldoTField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void mostrar(Empleado e) {
        ImageIcon imagen = new ImageIcon("../fotos/" + e.getFoto());
        NúmeroTField.setText(String.valueOf(e.getNúmero()));
        FechaAltaTField.setText(e.getFechaAltaStr());
        NombreTField.setText(e.getNombre());
        ApellidosTField.setText(e.getApellido());
        SueldoTField.setText(String.valueOf(e.getSueldo()));
        SueldoMaximoTField.setText(String.valueOf(e.getSueldoMax()));
        Imagen.setIcon(imagen);
        
        if (iter.hasNext())
            Siguiente.setEnabled(true);
        else
            Siguiente.setEnabled(false);
        if (iter.hasPrevious())
            Anterior.setEnabled(true);
        else
            Anterior.setEnabled(false);
    }

    private void filtrarApellido(String ape) {
        if (ape != "-") {
            empleados = Gestor.extract("select * from empresa.empleado where apellido = '" 
                    + ape + "'");
        } else {
            empleados = Gestor.extract("select * from empresa.empleado");
        }
        
        iter = empleados.listIterator();
        if (iter.hasNext())
            mostrar((Empleado) iter.next());
    }
    
}