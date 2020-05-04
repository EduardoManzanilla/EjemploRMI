/*
 *
 * add
 * comit
 * pull
 * merge
 * resolve
 * comit
 * push
 *
 */
package ejrmi;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Manzanilla
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        estatura = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setText("Nombre");
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        edad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edad.setText("Edad");
        edad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edadFocusLost(evt);
            }
        });
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });

        peso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        peso.setText("Peso");
        peso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pesoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesoFocusLost(evt);
            }
        });
        peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoKeyTyped(evt);
            }
        });

        estatura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estatura.setText("Estatura");
        estatura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                estaturaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                estaturaFocusLost(evt);
            }
        });
        estatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estaturaKeyTyped(evt);
            }
        });

        user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user.setText("Usuario");
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });

        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass.setText("Contraseña");
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edadFocusLost
       if(edad.getText().trim().toLowerCase().equals("Edad") || edad.getText().trim().toLowerCase().equals("")){
          edad.setText("Edad");
      }   // TODO add your handling code here:
    }//GEN-LAST:event_edadFocusLost

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        if(nombre.getText().trim().toLowerCase().equals("Nombre") || nombre.getText().trim().toLowerCase().equals("")){
          nombre.setText("Nombre");
      }  // TODO add your handling code here:
    }//GEN-LAST:event_nombreFocusLost

    private void pesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesoFocusLost
         if(peso.getText().trim().toLowerCase().equals("Peso") || peso.getText().trim().toLowerCase().equals("")){
          peso.setText("Peso");
      } // TODO add your handling code here:
    }//GEN-LAST:event_pesoFocusLost

    private void estaturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estaturaFocusLost
     if(estatura.getText().trim().toLowerCase().equals("Estatura") || estatura.getText().trim().toLowerCase().equals("")){
          estatura.setText("Estatura");
      }
    }//GEN-LAST:event_estaturaFocusLost

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
       if(user.getText().trim().toLowerCase().equals("Usuario") || user.getText().trim().toLowerCase().equals("")){
          user.setText("Usuario");
      }
    }//GEN-LAST:event_userFocusLost

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
     if(pass.getText().trim().toLowerCase().equals("Contraseña") || pass.getText().trim().toLowerCase().equals("")){
          pass.setText("Contraseña");
      }
    }//GEN-LAST:event_passFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //botón para enviar el registro a la base de datos
      
        try{
           String ip= "192.168.0.7";
           // Registry reg = LocateRegistry.getRegistry("192.168.43.165", 1098);
            Registry miRegistro = LocateRegistry.getRegistry(ip, 1099);
            Calculadora c =(Calculadora)miRegistro.lookup("Calculadora");
            
            if(nombre.getText().equals("Nombre") || edad.getText().equals("Edad") || peso.getText().equals("Peso") ||
                    estatura.getText().equals("Estatura") || user.getText().equals("Usuario") || pass.getText().equals("Contraseña")){
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
            } else{
              String texto="";
              int eda= Integer.parseInt(edad.getText());
              float pes=Float.parseFloat(peso.getText());
              float estatu= Float.parseFloat(estatura.getText());
              
              if( c.sub(user.getText())){
                JOptionPane.showMessageDialog(null, "El usuario ya esta registrado, intente con otro usuario");
                user.setText("Usuario");
              }else{
                if(c.add(nombre.getText(), eda, pes, estatu, user.getText(), pass.getText())){
                    JOptionPane.showMessageDialog(null, "Registro Satisfactorio");
                        Login log = new Login();
                        log.setVisible(true);
                        log.pack();
                        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                 }else{
                    JOptionPane.showMessageDialog(null, "No se pudo registrar. INTENTELO MAS TARDE");
                }     
             }
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Servidor no encontrado, intentelo de nuevo" +e);
           // System.out.println(ex); 
    	}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Login log = new Login();
       log.setVisible(true);
       log.pack();
       log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyTyped
        // TODO add your handling code here:
         char validar = evt.getKeyChar();       
         if(Character.isLetter(validar)){// validacion de no letras
             getToolkit().beep();
             evt.consume();
         }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
                 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                 || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
                 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){//validacion de no carateres especiales
            
             getToolkit().beep();
             evt.consume();
         }
    }//GEN-LAST:event_edadKeyTyped

    private void nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusGained
         if(nombre.getText().equals("Nombre")){
          nombre.setText("");
          }
    }//GEN-LAST:event_nombreFocusGained

    private void edadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edadFocusGained
     if(edad.getText().equals("Edad")){
          edad.setText("");
        } 
    }//GEN-LAST:event_edadFocusGained

    private void pesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesoFocusGained
        if(peso.getText().equals("Peso")){
          peso.setText("");
          }
    }//GEN-LAST:event_pesoFocusGained

    private void estaturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estaturaFocusGained
        if(estatura.getText().equals("Estatura")){
          estatura.setText("");
        }    }//GEN-LAST:event_estaturaFocusGained

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
       if(user.getText().equals("Usuario")){
          user.setText("");
          }
    }//GEN-LAST:event_userFocusGained

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        if(pass.getText().equals("Contraseña")){
          pass.setText("");
          }
    }//GEN-LAST:event_passFocusGained

    private void pesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoKeyTyped
       char validar = evt.getKeyChar();       
         if(Character.isLetter(validar)){// validacion de no letras
             getToolkit().beep();
             evt.consume();
         }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=45 || (int)evt.getKeyChar()==47
                 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                 || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
                 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){//validacion de no carateres especiales
            
             getToolkit().beep();
             evt.consume();
         }
    }//GEN-LAST:event_pesoKeyTyped

    private void estaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estaturaKeyTyped
        char validar = evt.getKeyChar();       
         if(Character.isLetter(validar)){// validacion de no letras
             getToolkit().beep();
             evt.consume();
         } else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=45 ||  (int)evt.getKeyChar()==47
                 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                 || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
                 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){//validacion de no carateres especiales
            
             getToolkit().beep();
             evt.consume();
         }
    }//GEN-LAST:event_estaturaKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
       char validar = evt.getKeyChar();       
         if(Character.isDigit(validar)){// validacion de no numeros
             getToolkit().beep();
             evt.consume();
         }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
                 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                 || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
                 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=129
                 || (int)evt.getKeyChar()==161  || (int)evt.getKeyChar()==191
                 || (int)evt.getKeyChar()==176  || (int)evt.getKeyChar()==172
                 )
         {//validacion de no carateres especiales
            
             getToolkit().beep();
             evt.consume();
         }
         System.out.println((int)evt.getKeyChar());
    }//GEN-LAST:event_nombreKeyTyped

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edad;
    private javax.swing.JTextField estatura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
