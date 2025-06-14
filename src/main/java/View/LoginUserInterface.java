package View;
import Config.ApplicationThemeUtility;
import java.net.URL;
import javax.swing.ImageIcon;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 *
 * @author TrishaQuismundo
 */
public class LoginUserInterface extends javax.swing.JFrame {
    /**
     * Creates new form LoginView
     */
    public LoginUserInterface() {
        initComponents();
      
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundLayeredPane = new javax.swing.JLayeredPane();
        mainPanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        loginActionMenu = new javax.swing.JComboBox<>();
        usernameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        loginActionLbl = new javax.swing.JLabel();
        toggleShowPassword = new javax.swing.JToggleButton();
        companyLbl = new javax.swing.JLabel();
        dateTimeLbl = new javax.swing.JLabel();
        LocalDateTime myDateObj = LocalDateTime.now();
        TxtDateTime = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login to MotorPH Payroll");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1339, 832));
        setName("loginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        backgroundLayeredPane.setName("backgroundLayeredPane"); // NOI18N

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 255)));
        mainPanel.setName("mainPanel"); // NOI18N

        usernameField.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(0, 0, 51));
        usernameField.setToolTipText("Enter your username");
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        usernameField.setCaretColor(new java.awt.Color(102, 0, 102));
        usernameField.setName("usernameField"); // NOI18N
        usernameField.setOpaque(true);

        passwordField.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        passwordField.setText("jPasswordField1");
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        passwordField.setName("passwordField"); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 51, 153));
        loginBtn.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setName("loginBtn"); // NOI18N

        loginActionMenu.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        loginActionMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login Only", "Time-in + Login" }));
        loginActionMenu.setAutoscrolls(true);
        loginActionMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        loginActionMenu.setName("loginActionMenu"); // NOI18N

        usernameLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        usernameLbl.setLabelFor(usernameField);
        usernameLbl.setText("Username:");
        usernameLbl.setName("usernameLbl"); // NOI18N

        passwordLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        passwordLbl.setLabelFor(passwordField);
        passwordLbl.setText("Password:");
        passwordLbl.setName("passwordLbl"); // NOI18N

        loginActionLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        loginActionLbl.setLabelFor(loginActionMenu);
        loginActionLbl.setText("Action:");
        loginActionLbl.setName("loginActionLbl"); // NOI18N

        toggleShowPassword.setText("show");
        toggleShowPassword.setName("toggleShowPassword"); // NOI18N

        companyLbl.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        companyLbl.setForeground(new java.awt.Color(0, 0, 102));
        companyLbl.setText("MotorPH Payroll");
        companyLbl.setName("companyLbl"); // NOI18N

        dateTimeLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        dateTimeLbl.setText("Date & Time:");
        dateTimeLbl.setName("dateTimeLbl"); // NOI18N

        DateTimeFormatter dateAndClockFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = myDateObj.format(dateAndClockFormat);
        TxtDateTime.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        TxtDateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtDateTime.setText(formattedDate);
        TxtDateTime.setName("TxtDateTime"); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginActionLbl)
                    .addComponent(usernameLbl)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                            .addComponent(passwordLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toggleShowPassword))
                        .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                        .addComponent(loginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginActionMenu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyLbl))
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(dateTimeLbl)
                        .addGap(224, 224, 224))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(companyLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateTimeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(usernameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(toggleShowPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loginActionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginActionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        backgroundLayeredPane.setLayer(mainPanel, javax.swing.JLayeredPane.MODAL_LAYER);
        backgroundLayeredPane.add(mainPanel);
        mainPanel.setBounds(440, 60, 530, 680);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradientWaveBG.png"))); // NOI18N
        backgroundImage.setName("backgroundImage"); // NOI18N
        backgroundLayeredPane.add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1339, 832);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLayeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLayeredPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    public static void main(String args[]) {
        
        //Sets the Look and Feel from the ApplicationThemeUtility Class
        ApplicationThemeUtility.setIntelliJ();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new LoginUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxtDateTime;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLayeredPane backgroundLayeredPane;
    private javax.swing.JLabel companyLbl;
    private javax.swing.JLabel dateTimeLbl;
    private javax.swing.JLabel loginActionLbl;
    private javax.swing.JComboBox<String> loginActionMenu;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JToggleButton toggleShowPassword;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
