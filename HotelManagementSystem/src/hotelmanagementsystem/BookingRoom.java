/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Savita
 */
public class BookingRoom extends javax.swing.JFrame {
 


    /**
     * Creates new form Booking
     */
    int RoomNo1;
    public BookingRoom(int RNO) 
    {
        initComponents();
        RoomNo1 = RNO;
              
            try 
            {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","1234");
            Statement stmt = conn.createStatement();
            String sql = "SELECT Room_No  FROM room where Room_No = "+RoomNo1;
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                RoomNo.setText(""+RoomNo1);
                
            }
                                
            }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,e);
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

        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Advance = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RoomType = new javax.swing.JComboBox();
        RoomNo = new javax.swing.JTextField();
        Charges = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        Gender = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        City = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        DDate = new com.toedter.calendar.JDateChooser();
        Mobile = new javax.swing.JTextField();
        ADate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Back = new javax.swing.JMenu();
        Home = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1360, 780));
        getContentPane().setLayout(null);

        jLabel9.setText("Room No.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 120, 80, 20);

        jLabel17.setText("Name");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(300, 160, 60, 20);
        getContentPane().add(Name);
        Name.setBounds(380, 150, 190, 30);

        jLabel19.setText("Charges Per Day: ");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(620, 420, 120, 20);

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        getContentPane().add(Address);
        Address.setBounds(380, 250, 250, 30);

        jLabel20.setText("Address");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(300, 260, 70, 20);

        jLabel21.setText("Sex");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(300, 200, 50, 20);

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        getContentPane().add(Age);
        Age.setBounds(730, 200, 130, 30);

        jLabel22.setText("Age");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(660, 200, 50, 20);

        jLabel23.setText("Arrival:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(300, 370, 70, 30);

        jLabel24.setText("Departure:");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(630, 370, 80, 20);

        Advance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvanceActionPerformed(evt);
            }
        });
        getContentPane().add(Advance);
        Advance.setBounds(730, 460, 80, 30);

        jLabel25.setText("Advance:");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(620, 460, 80, 30);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText("Booking Room");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 70, 153, 28);

        jLabel3.setText("Room Type    :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 130, 100, 20);

        RoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Double" }));
        RoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTypeActionPerformed(evt);
            }
        });
        getContentPane().add(RoomType);
        RoomType.setBounds(750, 120, 110, 30);

        RoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNoActionPerformed(evt);
            }
        });
        getContentPane().add(RoomNo);
        RoomNo.setBounds(380, 110, 100, 30);

        Charges.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1000", "2500" }));
        getContentPane().add(Charges);
        Charges.setBounds(730, 410, 80, 30);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 550, 90, 30);

        Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male ", "Female", "Other" }));
        getContentPane().add(Gender);
        Gender.setBounds(380, 190, 90, 30);

        jLabel2.setText("City:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 310, 50, 20);

        City.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mumbai ", "Delhi \t", "Bangalore", "Hyderabad", "Ahmedabad", "Chennai", "Kolkata", "Surat \t", "Pune \t", "Jaipur \t", "Lucknow ", "Kanpur \t", "Nagpur \t", "Indore \t", "Thane \t", "Bhopal \t", "Visakhapatnam", "Patna \t", "Ghaziabad", "Agra" }));
        getContentPane().add(City);
        City.setBounds(380, 300, 120, 30);

        jLabel4.setText("Mobile:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(660, 260, 60, 20);

        DDate.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(DDate);
        DDate.setBounds(730, 360, 140, 30);
        getContentPane().add(Mobile);
        Mobile.setBounds(730, 250, 130, 30);

        ADate.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(ADate);
        ADate.setBounds(380, 370, 150, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementsystem/Vastu-for-room-size.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel5.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel5.setPreferredSize(new java.awt.Dimension(1500, 938));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -80, 1366, 768);
        jLabel5.getAccessibleContext().setAccessibleName("");

        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jMenuBar1.add(Back);

        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(Home);

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenuBar1.add(Exit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int Room = Integer.parseInt(RoomNo.getText());
        String RoomTyp = RoomType.getSelectedItem().toString();
        int Ag = Integer.parseInt(Age.getText());
        PreparedStatement ps;
        Connection conn;
        try{
            Class.forName("java.sql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","1234");
            ps=conn.prepareStatement("insert into reservation (Room_No,Room_Type,Name,Address,City,Sex,Age,Mobile,Arrival,Departure,Charges,Advance) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, Room);
            ps.setString(2, RoomTyp);
            ps.setString(3, Name.getText());
            ps.setString(4, Address.getText());
            ps.setString(5, City.getSelectedItem().toString());
            ps.setString(6, Gender.getSelectedItem().toString());         
            ps.setInt(7,Ag);
            ps.setString(8, Mobile.getText());	            
            ps.setString(9,((JTextField)ADate.getDateEditor().getUiComponent()).getText());
            ps.setString(10,((JTextField)DDate.getDateEditor().getUiComponent()).getText());
            ps.setString(11,Charges.getSelectedItem().toString());
            ps.setString(12,Advance.getText());
            ps.executeUpdate();
            ps=conn.prepareStatement("UPDATE room SET  Booking = 'Booked',Room_Type = '"+RoomTyp+"' WHERE Room_No ="+Room);   
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Registered...!!");
            ps.close();
            conn.close();
            HomeMenu HM = new HomeMenu();
            HM.setVisible(true);
            this.setVisible(false);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,e);
            
        }
      
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomTypeActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        new RoomProcessing().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BackActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        HomeMenu HM = new HomeMenu();
        HM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_HomeActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ExitActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void RoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNoActionPerformed

    private void AdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdvanceActionPerformed

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
            java.util.logging.Logger.getLogger(BookingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingRoom(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ADate;
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Advance;
    private javax.swing.JTextField Age;
    private javax.swing.JMenu Back;
    private javax.swing.JComboBox Charges;
    private javax.swing.JComboBox City;
    private com.toedter.calendar.JDateChooser DDate;
    private javax.swing.JMenu Exit;
    private javax.swing.JComboBox Gender;
    private javax.swing.JMenu Home;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField RoomNo;
    private javax.swing.JComboBox RoomType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
