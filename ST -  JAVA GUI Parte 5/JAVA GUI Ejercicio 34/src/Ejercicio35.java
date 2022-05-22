
import java.io.File;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ejercicio35 extends javax.swing.JFrame {

    public Ejercicio35() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtArchivo = new javax.swing.JTextField();
        Mostrarimagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarTexto = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLocation(new java.awt.Point(500, 350));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        txtArchivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 730, -1));

        Mostrarimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mostrarimagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Mostrarimagen.setName(""); // NOI18N
        Mostrarimagen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Mostrarimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 330, 280));

        MostrarTexto.setColumns(20);
        MostrarTexto.setLineWrap(true);
        MostrarTexto.setRows(5);
        MostrarTexto.setWrapStyleWord(true);
        jScrollPane1.setViewportView(MostrarTexto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 360, 280));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 80, 30));

        jButton3.setText("Guardar como");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 
                         JFileChooser explorador = new JFileChooser("C:/");
				explorador.setDialogTitle("Abrir documento...");
				explorador.setFileFilter(new FileNameExtensionFilter("Word (.doc y .docx)", "docx","doc"));
				explorador.setFileFilter(new FileNameExtensionFilter("Texto plano (.txt)", "txt"));
                                explorador.setFileFilter(new FileNameExtensionFilter("Imagenes (.jpg , .gif , .png y .bmp)", "JPG","GIF","PNG","BMP"));
                                
				int seleccion = explorador.showDialog(null, "Abrir!");

				switch(seleccion) {
				case JFileChooser.APPROVE_OPTION:
					{File archivo = explorador.getSelectedFile();
                                         File archivo1 = explorador.getSelectedFile(); 
                                         File archivo2 = explorador.getSelectedFile();
					String imagen = archivo.toString();
                                        String ruta = archivo1.getPath();
                                                                                
                                        
                                        // Para Mostrar Imagen Jlabel
                                        ImageIcon imag = new ImageIcon(imagen);  
                                        ImageIcon Icon = new ImageIcon(imag.getImage().getScaledInstance(Mostrarimagen.getWidth(), Mostrarimagen.getHeight(), Image.SCALE_DEFAULT)); 
                                        Mostrarimagen.setIcon(Icon);
                                        txtArchivo.setText(ruta);
                                        
                                        //Para Mostrar Texto JTextArea
                                        if (archivo2.exists()){
                                            Scanner datosFichero = null;
		    			try {
                                            datosFichero = new Scanner(archivo2);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
		    			String t="";
		    			while (datosFichero.hasNext()) {
		    				t=t+datosFichero.nextLine()+"\n";
                                        }
		    			MostrarTexto.setText(t);
                                        txtArchivo.setText(ruta);
		    			//datosFichero.close();
                                        }
                                        break;}
				}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        JFileChooser explorador = new JFileChooser("C:/");
	explorador.setDialogTitle("Guardar Como");
        explorador.setDialogType(JFileChooser.SAVE_DIALOG);
        explorador.setFileFilter(new FileNameExtensionFilter("Texto plano (.txt)", "txt"));
        
        int seleccion = explorador.showDialog(null, "Guardar");
        
        switch (seleccion) {
        
            case JFileChooser.APPROVE_OPTION:{    
                String a = explorador.getSelectedFile()+".txt";
                File  archivo = new File(a);
            try {
                   PrintWriter fichero;
                   fichero = new PrintWriter(archivo);
                   String t,t2="";
                   char car;
                   t=MostrarTexto.getText();
                   int cc,c;
                   cc=t.length();			
            for (c=0; c<cc; c++){
		car=t.charAt(c);				
                if (car=='\n'){					
                     t2=t2+'\r';
                }					
                  t2=t2+car;				
            }				
	fichero.print(t2);
        fichero.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio35.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
            }
                
        
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Ejercicio35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio35().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea MostrarTexto;
    private javax.swing.JLabel Mostrarimagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtArchivo;
    // End of variables declaration//GEN-END:variables
}
