package interfazcarro;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.ERROR;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.swing.JOptionPane;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;

/**
 *
 * @author jesusgabriel
 */
public class Interfaz extends javax.swing.JFrame {

    private static final String automatico = "Z";
    private static final String luces = "Y";
    private static final String frenar = "5";
    private static final String acelerar = "1";
    private static final String Izq = "4";
    private static final String Der = "3";
    private static final String reversa = "2";
    private static final String direccionalIzquierda = "I";
    private static final String direccionalDerecha = "D";
    private static final String parqueo_l = "P";
    private static final String apagarLuz = "A";
    private static final String luz_frontal = "L";

    private OutputStream salida = null;
    SerialPort puertoSerial;
    private static String id="";
    public static String URL="";
    private static final int tiempo_espera = 2000; // milisegundos
    private static final int data_rate = 9600; // igual que en arduino

    public Interfaz( String i) throws Exception {
        id=i;
        System.out.println("id "+id);
        URL="btspp://"+id+":1;authenticate=false;encrypt=false;master=false";
        initComponents();
//        inicializarConexion();
        go();
        this.setTitle("CONTROL DEL CARRO"); //titulo del jframe
        this.setLocationRelativeTo(this); //centrar
        //this.setResizable(false); // no redimencionar
        this.setExtendedState(MAXIMIZED_BOTH); //en toda la pantalla
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/carro.png"));
        this.setIconImage(icono);
    }

    

    private void go() throws Exception {

        StreamConnection streamConnection = (StreamConnection) Connector.open(URL);
        
        salida = streamConnection.openOutputStream();
        InputStream is = streamConnection.openInputStream();
//        os.write("1".getBytes()); //'1' means ON and '0' means OFF
//        os.close();

    }

//    public void inicializarConexion() {
//        CommPortIdentifier puertoID = null;
//        Enumeration puertoEnum = CommPortIdentifier.getPortIdentifiers();
//        while (puertoEnum.hasMoreElements()) {
//            CommPortIdentifier actualPuertoID = (CommPortIdentifier) puertoEnum.nextElement();
//            if (puerto.equals(actualPuertoID.getName())) {
//                puertoID = actualPuertoID;
//                break;
//            }
//        }
//        if (puertoID == null) {
//            mostrarError("No hay conexión");
//            System.exit(ERROR);
//        }
//        try {
//            puertoSerial = (SerialPort) puertoID.open(this.getClass().getName(), tiempo_espera);
//            puertoSerial.setSerialPortParams(data_rate, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
//            salida = puertoSerial.getOutputStream();
//        } catch (Exception e) {
//            mostrarError(e.getMessage());
//            System.exit(ERROR);
//        }
//    }

    public void mostrarError(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void enviarDatos(String datos) {
        try {
            salida.write(datos.getBytes());
        } catch (Exception e) {
            mostrarError("Error");
            System.exit(ERROR);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBautomatico = new javax.swing.JButton();
        jBadelanteIzquierda = new javax.swing.JButton();
        jBadelante = new javax.swing.JButton();
        jBadelanteDerecha = new javax.swing.JButton();
        jBdetener = new javax.swing.JButton();
        jBatras = new javax.swing.JButton();
        jBapagarLuz = new javax.swing.JButton();
        jBdireccionalIzquierda = new javax.swing.JButton();
        jBestacionarias = new javax.swing.JButton();
        jBSeguidor_l = new javax.swing.JButton();
        jBdireccionalDerecha = new javax.swing.JButton();
        jBencenderLuz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL DEL CARRO");

        jBautomatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a_encendido.png"))); // NOI18N
        jBautomatico.setMaximumSize(new java.awt.Dimension(60, 60));
        jBautomatico.setMinimumSize(new java.awt.Dimension(60, 60));
        jBautomatico.setPreferredSize(new java.awt.Dimension(60, 60));
        jBautomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBautomaticoActionPerformed(evt);
            }
        });

        jBadelanteIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda.png"))); // NOI18N
        jBadelanteIzquierda.setMaximumSize(new java.awt.Dimension(60, 60));
        jBadelanteIzquierda.setMinimumSize(new java.awt.Dimension(60, 60));
        jBadelanteIzquierda.setPreferredSize(new java.awt.Dimension(60, 60));
        jBadelanteIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadelanteIzquierdaActionPerformed(evt);
            }
        });

        jBadelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arriba.png"))); // NOI18N
        jBadelante.setBorderPainted(false);
        jBadelante.setMaximumSize(new java.awt.Dimension(60, 61));
        jBadelante.setMinimumSize(new java.awt.Dimension(60, 61));
        jBadelante.setPreferredSize(new java.awt.Dimension(60, 60));
        jBadelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadelanteActionPerformed(evt);
            }
        });

        jBadelanteDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png"))); // NOI18N
        jBadelanteDerecha.setMaximumSize(new java.awt.Dimension(60, 60));
        jBadelanteDerecha.setMinimumSize(new java.awt.Dimension(60, 60));
        jBadelanteDerecha.setPreferredSize(new java.awt.Dimension(60, 60));
        jBadelanteDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadelanteDerechaActionPerformed(evt);
            }
        });

        jBdetener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apagar.jpg"))); // NOI18N
        jBdetener.setMaximumSize(new java.awt.Dimension(60, 60));
        jBdetener.setMinimumSize(new java.awt.Dimension(60, 60));
        jBdetener.setPreferredSize(new java.awt.Dimension(60, 60));
        jBdetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdetenerActionPerformed(evt);
            }
        });

        jBatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abajo.png"))); // NOI18N
        jBatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatrasActionPerformed(evt);
            }
        });

        jBapagarLuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/l_off.png"))); // NOI18N
        jBapagarLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBapagarLuzActionPerformed(evt);
            }
        });

        jBdireccionalIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dirIzq.png"))); // NOI18N
        jBdireccionalIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdireccionalIzquierdaActionPerformed(evt);
            }
        });

        jBestacionarias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parqueo.jpg"))); // NOI18N
        jBestacionarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBestacionariasActionPerformed(evt);
            }
        });

        jBSeguidor_l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fotoresistencia.png"))); // NOI18N
        jBSeguidor_l.setText("Seguidor de luz");
        jBSeguidor_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeguidor_lActionPerformed(evt);
            }
        });

        jBdireccionalDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dirDer.png"))); // NOI18N
        jBdireccionalDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdireccionalDerechaActionPerformed(evt);
            }
        });

        jBencenderLuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/luces.png"))); // NOI18N
        jBencenderLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBencenderLuzActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jBautomatico, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBapagarLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jBestacionarias, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBadelanteIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBdireccionalIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBatras, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jBadelante, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jBdetener, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jBencenderLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBadelanteDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBdireccionalDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSeguidor_l, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBestacionarias, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jBapagarLuz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBautomatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBadelante, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jBdetener, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBatras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jBdireccionalDerecha)
                                        .addGap(39, 39, 39)
                                        .addComponent(jBadelanteDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBencenderLuz)
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBdireccionalIzquierda)
                                        .addGap(37, 37, 37)
                                        .addComponent(jBadelanteIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jBSeguidor_l, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatrasActionPerformed
        enviarDatos(reversa);
    }//GEN-LAST:event_jBatrasActionPerformed

    private void jBautomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBautomaticoActionPerformed
        enviarDatos(automatico);
    }//GEN-LAST:event_jBautomaticoActionPerformed

    private void jBadelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadelanteActionPerformed
        enviarDatos(acelerar);
    }//GEN-LAST:event_jBadelanteActionPerformed

    private void jBadelanteIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadelanteIzquierdaActionPerformed
        enviarDatos(Izq);
    }//GEN-LAST:event_jBadelanteIzquierdaActionPerformed

    private void jBadelanteDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadelanteDerechaActionPerformed
        enviarDatos(Der);
    }//GEN-LAST:event_jBadelanteDerechaActionPerformed

    private void jBdetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdetenerActionPerformed
        enviarDatos(frenar);
    }//GEN-LAST:event_jBdetenerActionPerformed

    private void jBapagarLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBapagarLuzActionPerformed
        enviarDatos(apagarLuz);
    }//GEN-LAST:event_jBapagarLuzActionPerformed

    private void jBdireccionalIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdireccionalIzquierdaActionPerformed
        enviarDatos(direccionalIzquierda);
    }//GEN-LAST:event_jBdireccionalIzquierdaActionPerformed

    private void jBestacionariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBestacionariasActionPerformed
        enviarDatos(parqueo_l);
    }//GEN-LAST:event_jBestacionariasActionPerformed

    private void jBSeguidor_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeguidor_lActionPerformed
        enviarDatos(luces);
    }//GEN-LAST:event_jBSeguidor_lActionPerformed

    private void jBdireccionalDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdireccionalDerechaActionPerformed
        enviarDatos(direccionalDerecha);
    }//GEN-LAST:event_jBdireccionalDerechaActionPerformed

    private void jBencenderLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBencenderLuzActionPerformed
        enviarDatos(luz_frontal);
    }//GEN-LAST:event_jBencenderLuzActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        System.out.println(id);
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new Interfaz("b").setVisible(true);
//                } catch (Exception ex) {
//                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSeguidor_l;
    private javax.swing.JButton jBadelante;
    private javax.swing.JButton jBadelanteDerecha;
    private javax.swing.JButton jBadelanteIzquierda;
    private javax.swing.JButton jBapagarLuz;
    private javax.swing.JButton jBatras;
    private javax.swing.JButton jBautomatico;
    private javax.swing.JButton jBdetener;
    private javax.swing.JButton jBdireccionalDerecha;
    private javax.swing.JButton jBdireccionalIzquierda;
    private javax.swing.JButton jBencenderLuz;
    private javax.swing.JButton jBestacionarias;
    // End of variables declaration//GEN-END:variables
}
