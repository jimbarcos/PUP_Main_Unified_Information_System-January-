package Classes;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    
    // Constructor
    public Home() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        jTabbedPane1.setSelectedIndex(0); // to show the page of Home
    }

    // Initialize form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelSTEvaluation = new javax.swing.JPanel();
        jRBYes1 = new javax.swing.JRadioButton();
        jRBNo1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRBYes2 = new javax.swing.JRadioButton();
        jRBNo2 = new javax.swing.JRadioButton();
        jRBYes3 = new javax.swing.JRadioButton();
        jRBNo3 = new javax.swing.JRadioButton();
        jRBYes4 = new javax.swing.JRadioButton();
        jRBNo4 = new javax.swing.JRadioButton();
        jRBYes5 = new javax.swing.JRadioButton();
        jRBNo5 = new javax.swing.JRadioButton();
        jRBYes6 = new javax.swing.JRadioButton();
        jRBNo6 = new javax.swing.JRadioButton();
        jRBYes7 = new javax.swing.JRadioButton();
        jRBNo7 = new javax.swing.JRadioButton();
        jRBYes8 = new javax.swing.JRadioButton();
        jRBNo8 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTFMath = new javax.swing.JTextField();
        jTFFilipino = new javax.swing.JTextField();
        jTFEnglish = new javax.swing.JTextField();
        jTFArts = new javax.swing.JTextField();
        jTFScience = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jCBNcae = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jTFGenAve = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTFAcademic = new javax.swing.JTextField();
        jTFSports = new javax.swing.JTextField();
        jTFTVL = new javax.swing.JTextField();
        jLabelNextArrow = new javax.swing.JLabel();
        jCBAcadRating = new javax.swing.JCheckBox();
        jPanelSTEvaluation_1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabelBackArrow1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jRB1_3 = new javax.swing.JRadioButton();
        jRB1_1 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jRB1_2 = new javax.swing.JRadioButton();
        jRB2_1 = new javax.swing.JRadioButton();
        jRB2_2 = new javax.swing.JRadioButton();
        jRB2_3 = new javax.swing.JRadioButton();
        jRB3_1 = new javax.swing.JRadioButton();
        jRB3_2 = new javax.swing.JRadioButton();
        jRB3_3 = new javax.swing.JRadioButton();
        jRB4_1 = new javax.swing.JRadioButton();
        jRB4_2 = new javax.swing.JRadioButton();
        jRB4_3 = new javax.swing.JRadioButton();
        jRB5_1 = new javax.swing.JRadioButton();
        jRB5_2 = new javax.swing.JRadioButton();
        jRB5_3 = new javax.swing.JRadioButton();
        jRB6_1 = new javax.swing.JRadioButton();
        jRB6_2 = new javax.swing.JRadioButton();
        jRB6_3 = new javax.swing.JRadioButton();
        jRB7_1 = new javax.swing.JRadioButton();
        jRB7_2 = new javax.swing.JRadioButton();
        jRB7_3 = new javax.swing.JRadioButton();
        jRB8_1 = new javax.swing.JRadioButton();
        jRB8_2 = new javax.swing.JRadioButton();
        jRB8_3 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelNextArrow2 = new javax.swing.JLabel();
        jPanelSTEvaluation_2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabelNextArrow3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jRB9_3 = new javax.swing.JRadioButton();
        jRB9_1 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jRB9_2 = new javax.swing.JRadioButton();
        jRB10_1 = new javax.swing.JRadioButton();
        jRB10_2 = new javax.swing.JRadioButton();
        jRB10_3 = new javax.swing.JRadioButton();
        jRB11_1 = new javax.swing.JRadioButton();
        jRB11_2 = new javax.swing.JRadioButton();
        jRB11_3 = new javax.swing.JRadioButton();
        jRB12_1 = new javax.swing.JRadioButton();
        jRB12_2 = new javax.swing.JRadioButton();
        jRB12_3 = new javax.swing.JRadioButton();
        jRB13_1 = new javax.swing.JRadioButton();
        jRB13_2 = new javax.swing.JRadioButton();
        jRB13_3 = new javax.swing.JRadioButton();
        jRB14_1 = new javax.swing.JRadioButton();
        jRB14_2 = new javax.swing.JRadioButton();
        jRB14_3 = new javax.swing.JRadioButton();
        jRB15_1 = new javax.swing.JRadioButton();
        jRB15_2 = new javax.swing.JRadioButton();
        jRB15_3 = new javax.swing.JRadioButton();
        jRB16_1 = new javax.swing.JRadioButton();
        jRB16_2 = new javax.swing.JRadioButton();
        jRB16_3 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelNextArrow4 = new javax.swing.JLabel();
        jPanelSTEvaluation_3 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabelNextArrow5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jRB17_3 = new javax.swing.JRadioButton();
        jRB17_1 = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jRB17_2 = new javax.swing.JRadioButton();
        jRB18_1 = new javax.swing.JRadioButton();
        jRB18_2 = new javax.swing.JRadioButton();
        jRB18_3 = new javax.swing.JRadioButton();
        jRB19_1 = new javax.swing.JRadioButton();
        jRB19_2 = new javax.swing.JRadioButton();
        jRB19_3 = new javax.swing.JRadioButton();
        jRB20_1 = new javax.swing.JRadioButton();
        jRB20_2 = new javax.swing.JRadioButton();
        jRB20_3 = new javax.swing.JRadioButton();
        jRB21_1 = new javax.swing.JRadioButton();
        jRB21_2 = new javax.swing.JRadioButton();
        jRB21_3 = new javax.swing.JRadioButton();
        jRB22_1 = new javax.swing.JRadioButton();
        jRB22_2 = new javax.swing.JRadioButton();
        jRB22_3 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jButtonRessults = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanelSTEvaluation_4 = new javax.swing.JPanel();
        jLabelResultTrack2 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabelHUMMS = new javax.swing.JLabel();
        jLabelSTEM = new javax.swing.JLabel();
        jLabelABM = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabelPERFORMING_ARTS22 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabelPERFORMING_ARTS = new javax.swing.JLabel();
        jLabelFILM_PRODUCTION = new javax.swing.JLabel();
        jLabelANIMATION = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabelSPORTS_OFFICIATING = new javax.swing.JLabel();
        jLabelSPORTS_COACHING = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabelHOME_ECONOMICS = new javax.swing.JLabel();
        jLabelICT = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabelINDUSTRIAL_ARTS = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabelResultStrand = new javax.swing.JLabel();
        jLabelResultSportsTrack = new javax.swing.JLabel();
        jLabelResultAcadTrack = new javax.swing.JLabel();
        jLabelResultArtsTrack = new javax.swing.JLabel();
        jLabelResultTVLTrack = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(136, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<-");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(136, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 994, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        jPanel2.setBackground(new java.awt.Color(136, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(1080, 90));
        jPanel2.setMinimumSize(new java.awt.Dimension(1080, 90));
        jPanel2.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Polytechnic University of the Philippines");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sta.Mesa, Manila, Philippines");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image-50x50.jpg"))); // NOI18N
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setName(""); // NOI18N

        jComboBox1.setBackground(new java.awt.Color(136, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "History", "Mission and Vision", "Achievements", "Facilities", "Adminission", "Scholarship", "Colleges", "Department Clubs", "Senior High", "Strand and Track Evaluation", "PUP Fun Facts", "Account Information", "Log out" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addContainerGap(206, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image-1080x480.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jTabbedPane1.addTab("tab2", jPanelHome);

        jPanelSTEvaluation.setBackground(new java.awt.Color(245, 245, 245));
        jPanelSTEvaluation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRBYes1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup1.add(jRBYes1);
        jRBYes1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBYes1.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes1.setText("Yes");
        jRBYes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 32, -1, -1));

        jRBNo1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup1.add(jRBNo1);
        jRBNo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNo1.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo1.setLabel("No");
        jRBNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 32, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("8. Do you intend to pursue Sports Related Track?");
        jPanelSTEvaluation.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 415, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("- Enter your Grade 10 Academic Performance -");
        jPanelSTEvaluation.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 40, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("2. Do you intend to work in the ICT industry?");
        jPanelSTEvaluation.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("3. Do you intend to pursue Industrial Arts?");
        jPanelSTEvaluation.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("4. Do you have interest at Home Economics?");
        jPanelSTEvaluation.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("5. Is it okay for you to spend years in College?");
        jPanelSTEvaluation.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("6. Do you intend to pursue Academic Related Track?");
        jPanelSTEvaluation.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("7. Do you intend to pursue Arts Related Track?");
        jPanelSTEvaluation.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 40));

        jRBYes2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup2.add(jRBYes2);
        jRBYes2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBYes2.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes2.setText("Yes");
        jRBYes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 87, -1, -1));

        jRBNo2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup2.add(jRBNo2);
        jRBNo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNo2.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo2.setLabel("No");
        jRBNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 87, -1, -1));

        jRBYes3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup3.add(jRBYes3);
        jRBYes3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBYes3.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes3.setText("Yes");
        jRBYes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 142, -1, -1));

        jRBNo3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup3.add(jRBNo3);
        jRBNo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNo3.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo3.setLabel("No");
        jRBNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 142, -1, -1));

        jRBYes4.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup4.add(jRBYes4);
        jRBYes4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBYes4.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes4.setText("Yes");
        jRBYes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes4ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 197, -1, -1));

        jRBNo4.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup4.add(jRBNo4);
        jRBNo4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNo4.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo4.setLabel("No");
        jRBNo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo4ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 197, -1, -1));

        jRBYes5.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup5.add(jRBYes5);
        jRBYes5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBYes5.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes5.setText("Yes");
        jRBYes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes5ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 252, -1, -1));

        jRBNo5.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup5.add(jRBNo5);
        jRBNo5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNo5.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo5.setLabel("No");
        jRBNo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo5ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 252, -1, -1));

        jRBYes6.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup6.add(jRBYes6);
        jRBYes6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBYes6.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes6.setText("Yes");
        jRBYes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes6ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jRBNo6.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup6.add(jRBNo6);
        jRBNo6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNo6.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo6.setLabel("No");
        jRBNo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo6ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jRBYes7.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup7.add(jRBYes7);
        jRBYes7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBYes7.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes7.setText("Yes");
        jRBYes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes7ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 367, -1, -1));

        jRBNo7.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup7.add(jRBNo7);
        jRBNo7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNo7.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo7.setLabel("No");
        jRBNo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo7ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 367, -1, -1));

        jRBYes8.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup8.add(jRBYes8);
        jRBYes8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBYes8.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes8.setText("Yes");
        jRBYes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes8ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 423, -1, -1));

        jRBNo8.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup8.add(jRBNo8);
        jRBNo8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNo8.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo8.setLabel("No");
        jRBNo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo8ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 423, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanelSTEvaluation.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, 480));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("1. Do you intend to pursue College?");
        jPanelSTEvaluation.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("GEN. AVE");
        jPanelSTEvaluation.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(136, 0, 0));
        jLabel18.setText("NCAE RESULTS - PERCENTILE RANK");
        jPanelSTEvaluation.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("MATH");
        jPanelSTEvaluation.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("ENGLISH");
        jPanelSTEvaluation.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("• ACADEMIC TRACK");
        jPanelSTEvaluation.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("SCIENCE");
        jPanelSTEvaluation.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, -1, 30));

        jTFMath.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFMath.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMathActionPerformed(evt);
            }
        });
        jTFMath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMathKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFMath, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 100, -1));

        jTFFilipino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFFilipino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFFilipino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFilipinoActionPerformed(evt);
            }
        });
        jTFFilipino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFFilipinoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFFilipinoKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFFilipino, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 100, -1));

        jTFEnglish.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFEnglish.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEnglishActionPerformed(evt);
            }
        });
        jTFEnglish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFEnglishKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 100, -1));

        jTFArts.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFArts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFArts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFArtsActionPerformed(evt);
            }
        });
        jTFArts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFArtsKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFArts, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 100, -1));

        jTFScience.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFScience.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFScience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFScienceActionPerformed(evt);
            }
        });
        jTFScience.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFScienceKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFScience, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 100, -1));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanelSTEvaluation.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 420, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(136, 0, 0));
        jLabel23.setText("ACADEMIC RATING");
        jPanelSTEvaluation.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 20, -1, 30));

        jCBNcae.setBackground(new java.awt.Color(245, 245, 245));
        jCBNcae.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBNcae.setText("Don't Include this on evaluation");
        jCBNcae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNcaeActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jCBNcae, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 450, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("FILIPINO");
        jPanelSTEvaluation.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, 30));

        jTFGenAve.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFGenAve.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFGenAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFGenAveActionPerformed(evt);
            }
        });
        jTFGenAve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFGenAveKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFGenAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 100, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("• TVL TRACK");
        jPanelSTEvaluation.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("• ARTS & DESIGN TRACK");
        jPanelSTEvaluation.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("• SPORTS TRACK");
        jPanelSTEvaluation.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, 30));

        jTFAcademic.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFAcademic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFAcademic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAcademicActionPerformed(evt);
            }
        });
        jTFAcademic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAcademicKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFAcademic, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 100, -1));

        jTFSports.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFSports.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFSports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSportsActionPerformed(evt);
            }
        });
        jTFSports.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFSportsKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFSports, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 100, -1));

        jTFTVL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFTVL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTVLActionPerformed(evt);
            }
        });
        jTFTVL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTVLKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFTVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 100, -1));

        jLabelNextArrow.setBackground(new java.awt.Color(245, 245, 245));
        jLabelNextArrow.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabelNextArrow.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNextArrow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow.setText("-->");
        jLabelNextArrow.setOpaque(true);
        jLabelNextArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrowMouseExited(evt);
            }
        });
        jPanelSTEvaluation.add(jLabelNextArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 440, -1, -1));

        jCBAcadRating.setBackground(new java.awt.Color(245, 245, 245));
        jCBAcadRating.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBAcadRating.setText("Don't Include this on evaluation");
        jCBAcadRating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBAcadRatingMouseClicked(evt);
            }
        });
        jCBAcadRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAcadRatingActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jCBAcadRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 165, -1, -1));

        jTabbedPane1.addTab("tab1", jPanelSTEvaluation);

        jPanelSTEvaluation_1.setBackground(new java.awt.Color(245, 245, 245));
        jPanelSTEvaluation_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("8. Do you have an interest at Sports Officiating?");
        jPanelSTEvaluation_1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, -1, 40));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(136, 0, 0));
        jLabel42.setText("LIKELY");
        jPanelSTEvaluation_1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, 30));

        jLabelBackArrow1.setBackground(new java.awt.Color(245, 245, 245));
        jLabelBackArrow1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabelBackArrow1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelBackArrow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBackArrow1.setText("<--");
        jLabelBackArrow1.setOpaque(true);
        jLabelBackArrow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackArrow1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBackArrow1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBackArrow1MouseExited(evt);
            }
        });
        jPanelSTEvaluation_1.add(jLabelBackArrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("1. Do you intend to pursue Accountancy, Business, and Management (ABM)?");
        jPanelSTEvaluation_1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 40));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("2. Do you intend to pursue Science, Technology, Engineering and Mathematics (STEM)?");
        jPanelSTEvaluation_1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("3. Do you intend to pursue Humanities and Social Science (HUMMS)?");
        jPanelSTEvaluation_1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("4. Do you want to pursue or are you great at Animation?");
        jPanelSTEvaluation_1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, 40));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("5. Do you have an interest at Performing Arts (Dance, Music, Theatre Arts)?");
        jPanelSTEvaluation_1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, -1, 40));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("6. Do you have an interest at Film Production?");
        jPanelSTEvaluation_1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, 40));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("7. Do you have an interest at being an Athlete or Sport Coach?");
        jPanelSTEvaluation_1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, -1, 40));

        jRB1_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup9.add(jRB1_3);
        jRB1_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB1_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB1_3.setText("3");
        jRB1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 65, -1, -1));

        jRB1_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup9.add(jRB1_1);
        jRB1_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB1_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB1_1.setText("1");
        jRB1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 65, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(136, 0, 0));
        jLabel43.setText("RATE EVALUATION");
        jPanelSTEvaluation_1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(136, 0, 0));
        jLabel44.setText("NOT LIKELY");
        jPanelSTEvaluation_1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 20, -1, 30));

        jRB1_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup9.add(jRB1_2);
        jRB1_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB1_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB1_2.setText("2");
        jRB1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 65, -1, -1));

        jRB2_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup10.add(jRB2_1);
        jRB2_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB2_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB2_1.setText("1");
        jRB2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 115, -1, -1));

        jRB2_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup10.add(jRB2_2);
        jRB2_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB2_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB2_2.setText("2");
        jRB2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 115, -1, -1));

        jRB2_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup10.add(jRB2_3);
        jRB2_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB2_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB2_3.setText("3");
        jRB2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 115, -1, -1));

        jRB3_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup11.add(jRB3_1);
        jRB3_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB3_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB3_1.setText("1");
        jRB3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB3_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 165, -1, -1));

        jRB3_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup11.add(jRB3_2);
        jRB3_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB3_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB3_2.setText("2");
        jRB3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB3_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 165, -1, -1));

        jRB3_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup11.add(jRB3_3);
        jRB3_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB3_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB3_3.setText("3");
        jRB3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB3_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 165, -1, -1));

        jRB4_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup12.add(jRB4_1);
        jRB4_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB4_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB4_1.setText("1");
        jRB4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB4_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 215, -1, -1));

        jRB4_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup12.add(jRB4_2);
        jRB4_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB4_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB4_2.setText("2");
        jRB4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB4_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 215, -1, -1));

        jRB4_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup12.add(jRB4_3);
        jRB4_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB4_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB4_3.setText("3");
        jRB4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB4_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 215, -1, -1));

        jRB5_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup13.add(jRB5_1);
        jRB5_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB5_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB5_1.setText("1");
        jRB5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB5_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 265, -1, -1));

        jRB5_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup13.add(jRB5_2);
        jRB5_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB5_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB5_2.setText("2");
        jRB5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB5_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 265, -1, -1));

        jRB5_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup13.add(jRB5_3);
        jRB5_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB5_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB5_3.setText("3");
        jRB5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB5_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 265, -1, -1));

        jRB6_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup14.add(jRB6_1);
        jRB6_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB6_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB6_1.setText("1");
        jRB6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB6_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB6_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 315, -1, -1));

        jRB6_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup14.add(jRB6_2);
        jRB6_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB6_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB6_2.setText("2");
        jRB6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB6_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB6_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 315, -1, -1));

        jRB6_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup14.add(jRB6_3);
        jRB6_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB6_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB6_3.setText("3");
        jRB6_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB6_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB6_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 315, -1, -1));

        jRB7_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup15.add(jRB7_1);
        jRB7_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB7_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB7_1.setText("1");
        jRB7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB7_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB7_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 365, -1, -1));

        jRB7_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup15.add(jRB7_2);
        jRB7_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB7_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB7_2.setText("2");
        jRB7_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB7_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB7_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 365, -1, -1));

        jRB7_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup15.add(jRB7_3);
        jRB7_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB7_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB7_3.setText("3");
        jRB7_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB7_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB7_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 365, -1, -1));

        jRB8_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup16.add(jRB8_1);
        jRB8_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB8_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB8_1.setText("1");
        jRB8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB8_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB8_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 415, -1, -1));

        jRB8_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup16.add(jRB8_2);
        jRB8_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB8_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB8_2.setText("2");
        jRB8_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB8_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB8_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 415, -1, -1));

        jRB8_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup16.add(jRB8_3);
        jRB8_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB8_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB8_3.setText("3");
        jRB8_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB8_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB8_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 415, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanelSTEvaluation_1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 10, 480));

        jLabelNextArrow2.setBackground(new java.awt.Color(245, 245, 245));
        jLabelNextArrow2.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabelNextArrow2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNextArrow2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow2.setText("-->");
        jLabelNextArrow2.setOpaque(true);
        jLabelNextArrow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrow2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrow2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrow2MouseExited(evt);
            }
        });
        jPanelSTEvaluation_1.add(jLabelNextArrow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 440, -1, -1));

        jTabbedPane1.addTab("tab1", jPanelSTEvaluation_1);

        jPanelSTEvaluation_2.setBackground(new java.awt.Color(245, 245, 245));
        jPanelSTEvaluation_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("16. Do you have an interest at Business Process Outsourcing? ");
        jPanelSTEvaluation_2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, -1, 40));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(136, 0, 0));
        jLabel45.setText("LIKELY");
        jPanelSTEvaluation_2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, 30));

        jLabelNextArrow3.setBackground(new java.awt.Color(245, 245, 245));
        jLabelNextArrow3.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabelNextArrow3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNextArrow3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow3.setText("<--");
        jLabelNextArrow3.setOpaque(true);
        jLabelNextArrow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrow3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrow3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrow3MouseExited(evt);
            }
        });
        jPanelSTEvaluation_2.add(jLabelNextArrow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("9. Do you have an interest at Hotel and Restaurant Servicing?");
        jPanelSTEvaluation_2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 40));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("10. Do you have an interest at Tourism Servicing?");
        jPanelSTEvaluation_2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, 40));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("11. Do you have an interest at Food Production?");
        jPanelSTEvaluation_2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, 40));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("12. Do you have an interest at Health Care Services?");
        jPanelSTEvaluation_2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, 40));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("13. Do you have an interest at Emergency Medical Services?");
        jPanelSTEvaluation_2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, -1, 40));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("14. Do you have an interest at Computer Programming?");
        jPanelSTEvaluation_2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, 40));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("15. Do you have an interest at Computer System Servicing?");
        jPanelSTEvaluation_2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, -1, 40));

        jRB9_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup17.add(jRB9_3);
        jRB9_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB9_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB9_3.setText("3");
        jRB9_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB9_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB9_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 65, -1, -1));

        jRB9_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup17.add(jRB9_1);
        jRB9_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB9_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB9_1.setText("1");
        jRB9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB9_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB9_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 65, -1, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(136, 0, 0));
        jLabel47.setText("RATE EVALUATION");
        jPanelSTEvaluation_2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(136, 0, 0));
        jLabel48.setText("NOT LIKELY");
        jPanelSTEvaluation_2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 20, -1, 30));

        jRB9_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup17.add(jRB9_2);
        jRB9_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB9_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB9_2.setText("2");
        jRB9_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB9_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB9_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 65, -1, -1));

        jRB10_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup18.add(jRB10_1);
        jRB10_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB10_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB10_1.setText("1");
        jRB10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB10_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB10_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 115, -1, -1));

        jRB10_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup18.add(jRB10_2);
        jRB10_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB10_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB10_2.setText("2");
        jRB10_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB10_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB10_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 115, -1, -1));

        jRB10_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup18.add(jRB10_3);
        jRB10_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB10_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB10_3.setText("3");
        jRB10_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB10_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB10_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 115, -1, -1));

        jRB11_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup19.add(jRB11_1);
        jRB11_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB11_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB11_1.setText("1");
        jRB11_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB11_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB11_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 165, -1, -1));

        jRB11_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup19.add(jRB11_2);
        jRB11_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB11_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB11_2.setText("2");
        jRB11_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB11_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB11_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 165, -1, -1));

        jRB11_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup19.add(jRB11_3);
        jRB11_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB11_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB11_3.setText("3");
        jRB11_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB11_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB11_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 165, -1, -1));

        jRB12_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup20.add(jRB12_1);
        jRB12_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB12_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB12_1.setText("1");
        jRB12_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB12_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB12_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 215, -1, -1));

        jRB12_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup20.add(jRB12_2);
        jRB12_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB12_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB12_2.setText("2");
        jRB12_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB12_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB12_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 215, -1, -1));

        jRB12_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup20.add(jRB12_3);
        jRB12_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB12_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB12_3.setText("3");
        jRB12_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB12_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB12_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 215, -1, -1));

        jRB13_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup21.add(jRB13_1);
        jRB13_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB13_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB13_1.setText("1");
        jRB13_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB13_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB13_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 265, -1, -1));

        jRB13_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup21.add(jRB13_2);
        jRB13_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB13_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB13_2.setText("2");
        jRB13_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB13_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB13_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 265, -1, -1));

        jRB13_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup21.add(jRB13_3);
        jRB13_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB13_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB13_3.setText("3");
        jRB13_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB13_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB13_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 265, -1, -1));

        jRB14_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup22.add(jRB14_1);
        jRB14_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB14_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB14_1.setText("1");
        jRB14_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB14_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB14_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 315, -1, -1));

        jRB14_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup22.add(jRB14_2);
        jRB14_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB14_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB14_2.setText("2");
        jRB14_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB14_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB14_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 315, -1, -1));

        jRB14_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup22.add(jRB14_3);
        jRB14_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB14_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB14_3.setText("3");
        jRB14_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB14_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB14_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 315, -1, -1));

        jRB15_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup23.add(jRB15_1);
        jRB15_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB15_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB15_1.setText("1");
        jRB15_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB15_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB15_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 365, -1, -1));

        jRB15_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup23.add(jRB15_2);
        jRB15_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB15_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB15_2.setText("2");
        jRB15_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB15_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB15_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 365, -1, -1));

        jRB15_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup23.add(jRB15_3);
        jRB15_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB15_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB15_3.setText("3");
        jRB15_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB15_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB15_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 365, -1, -1));

        jRB16_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup24.add(jRB16_1);
        jRB16_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB16_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB16_1.setText("1");
        jRB16_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB16_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB16_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 415, -1, -1));

        jRB16_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup24.add(jRB16_2);
        jRB16_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB16_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB16_2.setText("2");
        jRB16_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB16_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB16_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 415, -1, -1));

        jRB16_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup24.add(jRB16_3);
        jRB16_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB16_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB16_3.setText("3");
        jRB16_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB16_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_2.add(jRB16_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 415, -1, -1));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanelSTEvaluation_2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 10, 480));

        jLabelNextArrow4.setBackground(new java.awt.Color(245, 245, 245));
        jLabelNextArrow4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabelNextArrow4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNextArrow4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow4.setText("-->");
        jLabelNextArrow4.setOpaque(true);
        jLabelNextArrow4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrow4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrow4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrow4MouseExited(evt);
            }
        });
        jPanelSTEvaluation_2.add(jLabelNextArrow4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 440, -1, -1));

        jTabbedPane1.addTab("tab1", jPanelSTEvaluation_2);

        jPanelSTEvaluation_3.setBackground(new java.awt.Color(245, 245, 245));
        jPanelSTEvaluation_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(136, 0, 0));
        jLabel50.setText("LIKELY");
        jPanelSTEvaluation_3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, 30));

        jLabelNextArrow5.setBackground(new java.awt.Color(245, 245, 245));
        jLabelNextArrow5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabelNextArrow5.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNextArrow5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow5.setText("<--");
        jLabelNextArrow5.setOpaque(true);
        jLabelNextArrow5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrow5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrow5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrow5MouseExited(evt);
            }
        });
        jPanelSTEvaluation_3.add(jLabelNextArrow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("17. Do you have an interest at Drafting Technology?");
        jPanelSTEvaluation_3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 40));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("18. Do you have an interest at Automotive Servicing?");
        jPanelSTEvaluation_3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, 40));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("19. Do you have an interest at Electronic Products Assembly & Services?");
        jPanelSTEvaluation_3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, 40));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("20. Do you have an interest at Electrical Installation & Maintenance?");
        jPanelSTEvaluation_3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, 40));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("21. Do you have an interest at Construction Technology?");
        jPanelSTEvaluation_3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, -1, 40));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(136, 0, 0));
        jLabel56.setText("as they know more what they want for themselves. ");
        jPanelSTEvaluation_3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 40));

        jRB17_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup25.add(jRB17_3);
        jRB17_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB17_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB17_3.setText("3");
        jRB17_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB17_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB17_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 65, -1, -1));

        jRB17_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup25.add(jRB17_1);
        jRB17_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB17_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB17_1.setText("1");
        jRB17_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB17_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB17_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 65, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(136, 0, 0));
        jLabel58.setText("RATE EVALUATION");
        jPanelSTEvaluation_3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(136, 0, 0));
        jLabel59.setText("NOT LIKELY");
        jPanelSTEvaluation_3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 20, -1, 30));

        jRB17_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup25.add(jRB17_2);
        jRB17_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB17_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB17_2.setText("2");
        jRB17_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB17_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB17_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 65, -1, -1));

        jRB18_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup26.add(jRB18_1);
        jRB18_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB18_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB18_1.setText("1");
        jRB18_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB18_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB18_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 115, -1, -1));

        jRB18_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup26.add(jRB18_2);
        jRB18_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB18_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB18_2.setText("2");
        jRB18_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB18_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB18_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 115, -1, -1));

        jRB18_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup26.add(jRB18_3);
        jRB18_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB18_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB18_3.setText("3");
        jRB18_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB18_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB18_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 115, -1, -1));

        jRB19_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup27.add(jRB19_1);
        jRB19_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB19_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB19_1.setText("1");
        jRB19_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB19_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB19_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 165, -1, -1));

        jRB19_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup27.add(jRB19_2);
        jRB19_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB19_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB19_2.setText("2");
        jRB19_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB19_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB19_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 165, -1, -1));

        jRB19_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup27.add(jRB19_3);
        jRB19_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB19_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB19_3.setText("3");
        jRB19_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB19_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB19_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 165, -1, -1));

        jRB20_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup28.add(jRB20_1);
        jRB20_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB20_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB20_1.setText("1");
        jRB20_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB20_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB20_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 215, -1, -1));

        jRB20_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup28.add(jRB20_2);
        jRB20_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB20_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB20_2.setText("2");
        jRB20_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB20_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB20_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 215, -1, -1));

        jRB20_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup28.add(jRB20_3);
        jRB20_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB20_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB20_3.setText("3");
        jRB20_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB20_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB20_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 215, -1, -1));

        jRB21_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup29.add(jRB21_1);
        jRB21_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB21_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB21_1.setText("1");
        jRB21_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB21_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB21_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 265, -1, -1));

        jRB21_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup29.add(jRB21_2);
        jRB21_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB21_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB21_2.setText("2");
        jRB21_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB21_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB21_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 265, -1, -1));

        jRB21_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup29.add(jRB21_3);
        jRB21_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB21_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB21_3.setText("3");
        jRB21_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB21_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB21_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 265, -1, -1));

        jRB22_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup30.add(jRB22_1);
        jRB22_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB22_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB22_1.setText("1");
        jRB22_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB22_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB22_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 315, -1, -1));

        jRB22_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup30.add(jRB22_2);
        jRB22_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB22_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB22_2.setText("2");
        jRB22_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB22_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB22_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 315, -1, -1));

        jRB22_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup30.add(jRB22_3);
        jRB22_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB22_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB22_3.setText("3");
        jRB22_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB22_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB22_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 315, -1, -1));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanelSTEvaluation_3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 10, 480));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("22. Do you have an interest at Welding Technology?");
        jPanelSTEvaluation_3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, 40));

        jButtonRessults.setBackground(new java.awt.Color(136, 0, 0));
        jButtonRessults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonRessults.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRessults.setText("Generate Results");
        jButtonRessults.setBorder(null);
        jButtonRessults.setFocusable(false);
        jButtonRessults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRessultsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRessultsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRessultsMouseExited(evt);
            }
        });
        jButtonRessults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRessultsActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jButtonRessults, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 380, 290, 50));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(136, 0, 0));
        jLabel60.setText("Notice: This Evaluation should not be taken seriously. It is the");
        jPanelSTEvaluation_3.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 40));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(136, 0, 0));
        jLabel61.setText("Respondent's  final decision and passion that will matter the most, ");
        jPanelSTEvaluation_3.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 395, -1, 40));

        jTabbedPane1.addTab("tab1", jPanelSTEvaluation_3);

        jPanelSTEvaluation_4.setBackground(new java.awt.Color(245, 245, 245));
        jPanelSTEvaluation_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelResultTrack2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabelResultTrack2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResultTrack2.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultTrack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, 40));

        jLabel69.setBackground(new java.awt.Color(245, 245, 245));
        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(136, 0, 0));
        jLabel69.setText("RESULTS");
        jPanelSTEvaluation_4.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 30));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 51, 51));
        jLabel73.setText("your discretion.");
        jPanelSTEvaluation_4.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 200, 90));

        jPanel8.setBackground(new java.awt.Color(245, 245, 245));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel71.setBackground(new java.awt.Color(245, 245, 245));
        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 51));
        jLabel71.setText("> HUMMS Strand -");

        jLabel75.setBackground(new java.awt.Color(245, 245, 245));
        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(51, 51, 51));
        jLabel75.setText("> STEM Strand -");

        jLabel76.setBackground(new java.awt.Color(245, 245, 245));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(51, 51, 51));
        jLabel76.setText("> ABM Strand -");

        jLabelHUMMS.setBackground(new java.awt.Color(245, 245, 245));
        jLabelHUMMS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHUMMS.setForeground(new java.awt.Color(219, 166, 37));
        jLabelHUMMS.setText("--");

        jLabelSTEM.setBackground(new java.awt.Color(245, 245, 245));
        jLabelSTEM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSTEM.setForeground(new java.awt.Color(219, 166, 37));
        jLabelSTEM.setText("--");

        jLabelABM.setBackground(new java.awt.Color(245, 245, 245));
        jLabelABM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelABM.setForeground(new java.awt.Color(219, 166, 37));
        jLabelABM.setText("--");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHUMMS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSTEM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelABM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabelHUMMS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabelSTEM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabelABM))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanelSTEvaluation_4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 90));

        jLabel74.setBackground(new java.awt.Color(245, 245, 245));
        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(219, 166, 37));
        jLabel74.setText(" TECHNICAL-VOCATIONAL-LIVELIHOOD  TRACK =");
        jPanelSTEvaluation_4.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, 40));

        jLabel77.setBackground(new java.awt.Color(245, 245, 245));
        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(219, 166, 37));
        jLabel77.setText("ACADEMIC TRACK =");
        jPanelSTEvaluation_4.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        jLabelPERFORMING_ARTS22.setBackground(new java.awt.Color(245, 245, 245));
        jLabelPERFORMING_ARTS22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel78.setBackground(new java.awt.Color(245, 245, 245));
        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 51, 51));
        jLabel78.setText("> Performing Arts -");

        jLabel79.setBackground(new java.awt.Color(245, 245, 245));
        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(51, 51, 51));
        jLabel79.setText("1. Dance");

        jLabel80.setBackground(new java.awt.Color(245, 245, 245));
        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 51, 51));
        jLabel80.setText("2. Music");

        jLabel81.setBackground(new java.awt.Color(245, 245, 245));
        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 51, 51));
        jLabel81.setText("3. Theatre Arts");

        jLabel82.setBackground(new java.awt.Color(245, 245, 245));
        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("> Film Production -");

        jLabel83.setBackground(new java.awt.Color(245, 245, 245));
        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 51, 51));
        jLabel83.setText("> Animation -");

        jLabelPERFORMING_ARTS.setBackground(new java.awt.Color(245, 245, 245));
        jLabelPERFORMING_ARTS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPERFORMING_ARTS.setForeground(new java.awt.Color(219, 166, 37));
        jLabelPERFORMING_ARTS.setText("--");

        jLabelFILM_PRODUCTION.setBackground(new java.awt.Color(245, 245, 245));
        jLabelFILM_PRODUCTION.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFILM_PRODUCTION.setForeground(new java.awt.Color(219, 166, 37));
        jLabelFILM_PRODUCTION.setText("--");

        jLabelANIMATION.setBackground(new java.awt.Color(245, 245, 245));
        jLabelANIMATION.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelANIMATION.setForeground(new java.awt.Color(219, 166, 37));
        jLabelANIMATION.setText("--");

        javax.swing.GroupLayout jLabelPERFORMING_ARTS22Layout = new javax.swing.GroupLayout(jLabelPERFORMING_ARTS22);
        jLabelPERFORMING_ARTS22.setLayout(jLabelPERFORMING_ARTS22Layout);
        jLabelPERFORMING_ARTS22Layout.setHorizontalGroup(
            jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPERFORMING_ARTS))
                            .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFILM_PRODUCTION))))
                    .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelANIMATION)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jLabelPERFORMING_ARTS22Layout.setVerticalGroup(
            jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabelPERFORMING_ARTS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabelFILM_PRODUCTION))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabelANIMATION))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSTEvaluation_4.add(jLabelPERFORMING_ARTS22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, -1));

        jLabel84.setBackground(new java.awt.Color(245, 245, 245));
        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(219, 166, 37));
        jLabel84.setText("ARTS & DESIGN TRACK =");
        jPanelSTEvaluation_4.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 40));

        jPanel10.setBackground(new java.awt.Color(245, 245, 245));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel85.setBackground(new java.awt.Color(245, 245, 245));
        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(51, 51, 51));
        jLabel85.setText("> Sports Officiating -");

        jLabel86.setBackground(new java.awt.Color(245, 245, 245));
        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(51, 51, 51));
        jLabel86.setText("> Sports Coaching -");

        jLabelSPORTS_OFFICIATING.setBackground(new java.awt.Color(245, 245, 245));
        jLabelSPORTS_OFFICIATING.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSPORTS_OFFICIATING.setForeground(new java.awt.Color(219, 166, 37));
        jLabelSPORTS_OFFICIATING.setText("--");

        jLabelSPORTS_COACHING.setBackground(new java.awt.Color(245, 245, 245));
        jLabelSPORTS_COACHING.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSPORTS_COACHING.setForeground(new java.awt.Color(219, 166, 37));
        jLabelSPORTS_COACHING.setText("--");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSPORTS_OFFICIATING)
                    .addComponent(jLabelSPORTS_COACHING))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabelSPORTS_OFFICIATING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabelSPORTS_COACHING)))
        );

        jPanelSTEvaluation_4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 220, 60));

        jLabel87.setBackground(new java.awt.Color(245, 245, 245));
        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(219, 166, 37));
        jLabel87.setText("SPORTS TRACK =");
        jPanelSTEvaluation_4.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, 40));

        jPanel11.setBackground(new java.awt.Color(245, 245, 245));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel88.setBackground(new java.awt.Color(245, 245, 245));
        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(51, 51, 51));
        jLabel88.setText("> Home Economics Strand -");

        jLabel89.setBackground(new java.awt.Color(245, 245, 245));
        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(51, 51, 51));
        jLabel89.setText("1. Hotel & Restaurant Servicing");

        jLabel90.setBackground(new java.awt.Color(245, 245, 245));
        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(51, 51, 51));
        jLabel90.setText("2. Tourism Servicing");

        jLabel91.setBackground(new java.awt.Color(245, 245, 245));
        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(51, 51, 51));
        jLabel91.setText("3. Food Production");

        jLabel92.setBackground(new java.awt.Color(245, 245, 245));
        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(51, 51, 51));
        jLabel92.setText("4. Health Care Services");

        jLabel93.setBackground(new java.awt.Color(245, 245, 245));
        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(51, 51, 51));
        jLabel93.setText("5. Emergency Medical Services");

        jLabel94.setBackground(new java.awt.Color(245, 245, 245));
        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(51, 51, 51));
        jLabel94.setText("> ICT Strand -");

        jLabel95.setBackground(new java.awt.Color(245, 245, 245));
        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("1. Computer Programming");

        jLabel96.setBackground(new java.awt.Color(245, 245, 245));
        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(51, 51, 51));
        jLabel96.setText("2. Computer System Servicing");

        jLabel97.setBackground(new java.awt.Color(245, 245, 245));
        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(51, 51, 51));
        jLabel97.setText("3. Business Process Outsourcing");

        jLabel98.setBackground(new java.awt.Color(245, 245, 245));
        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(51, 51, 51));
        jLabel98.setText("* Other Strand/s are not included *");
        jLabel98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel98.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelHOME_ECONOMICS.setBackground(new java.awt.Color(245, 245, 245));
        jLabelHOME_ECONOMICS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHOME_ECONOMICS.setForeground(new java.awt.Color(219, 166, 37));
        jLabelHOME_ECONOMICS.setText("--");

        jLabelICT.setBackground(new java.awt.Color(245, 245, 245));
        jLabelICT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelICT.setForeground(new java.awt.Color(219, 166, 37));
        jLabelICT.setText("--");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelHOME_ECONOMICS))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelICT))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabelHOME_ECONOMICS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jLabelICT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelSTEvaluation_4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 290, 280));

        jPanel13.setBackground(new java.awt.Color(245, 245, 245));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel99.setBackground(new java.awt.Color(245, 245, 245));
        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(51, 51, 51));
        jLabel99.setText("> Industrial Arts Strand -");

        jLabel100.setBackground(new java.awt.Color(245, 245, 245));
        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(51, 51, 51));
        jLabel100.setText("1. Drafting Technology");

        jLabel101.setBackground(new java.awt.Color(245, 245, 245));
        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(51, 51, 51));
        jLabel101.setText("2. Automotive Servicing");

        jLabel102.setBackground(new java.awt.Color(245, 245, 245));
        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 51, 51));
        jLabel102.setText("3. Electronic Products Services");

        jLabel103.setBackground(new java.awt.Color(245, 245, 245));
        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(51, 51, 51));
        jLabel103.setText("4. Electrical Maintenance");

        jLabel104.setBackground(new java.awt.Color(245, 245, 245));
        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(51, 51, 51));
        jLabel104.setText("5. Construction Technology");

        jLabel105.setBackground(new java.awt.Color(245, 245, 245));
        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(51, 51, 51));
        jLabel105.setText("6. Welding Technology");

        jLabelINDUSTRIAL_ARTS.setBackground(new java.awt.Color(245, 245, 245));
        jLabelINDUSTRIAL_ARTS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelINDUSTRIAL_ARTS.setForeground(new java.awt.Color(219, 166, 37));
        jLabelINDUSTRIAL_ARTS.setText("--");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelINDUSTRIAL_ARTS))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jLabelINDUSTRIAL_ARTS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanelSTEvaluation_4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 220, 160));

        jPanel12.setBackground(new java.awt.Color(136, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanelSTEvaluation_4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1230, 10));

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(136, 0, 0));
        jLabel107.setText("Information: ");
        jPanelSTEvaluation_4.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 110, 90));

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(51, 51, 51));
        jLabel108.setText("Shown are the Points");
        jPanelSTEvaluation_4.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 180, 90));

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 51, 51));
        jLabel109.setText("Accumulated based on the");
        jPanelSTEvaluation_4.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 200, 90));

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(51, 51, 51));
        jLabel110.setText("evaluation. Don't take the");
        jPanelSTEvaluation_4.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 200, 90));

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(51, 51, 51));
        jLabel111.setText("results seriously, the");
        jPanelSTEvaluation_4.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 200, 90));

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 51, 51));
        jLabel112.setText("final decision is still in ");
        jPanelSTEvaluation_4.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 200, 90));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(136, 0, 0));
        jLabel70.setText("Suggestion:");
        jPanelSTEvaluation_4.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 40));

        jLabelResultStrand.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabelResultStrand.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResultStrand.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultStrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, 40));

        jLabelResultSportsTrack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelResultSportsTrack.setForeground(new java.awt.Color(136, 0, 0));
        jLabelResultSportsTrack.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultSportsTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 50, 40));

        jLabelResultAcadTrack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelResultAcadTrack.setForeground(new java.awt.Color(136, 0, 0));
        jLabelResultAcadTrack.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultAcadTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 60, 40));

        jLabelResultArtsTrack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelResultArtsTrack.setForeground(new java.awt.Color(136, 0, 0));
        jLabelResultArtsTrack.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultArtsTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, 40));

        jLabelResultTVLTrack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelResultTVLTrack.setForeground(new java.awt.Color(136, 0, 0));
        jLabelResultTVLTrack.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultTVLTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 50, 40));

        jLabel113.setBackground(new java.awt.Color(245, 245, 245));
        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(51, 51, 51));
        jLabel113.setText("99");
        jPanelSTEvaluation_4.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 143, -1));

        jTabbedPane1.addTab("tab1", jPanelSTEvaluation_4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 1080, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int result = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to log out?",
        "Log Out Confirmation",
        JOptionPane.YES_NO_OPTION
        );

        if (result == JOptionPane.YES_OPTION) {
            SignIn retrieve = new SignIn();
            retrieve.pack();
            retrieve.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setBackground(new Color(136, 0, 0));
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabel1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setBackground(new Color(255, 255, 255));
        jLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabel1.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String strSelected = jComboBox1.getSelectedItem().toString();
        
        if (strSelected.equals("Strand and Track Evaluation")){
            jTabbedPane1.setSelectedIndex(1); // to show the page of ST_Evaluation
 
        } else if (strSelected.equals("Home")){
            jTabbedPane1.setSelectedIndex(0); // to show the page of Home
        }
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int result = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to exit?",
        "Exit Confirmation",
        JOptionPane.YES_NO_OPTION
        );

        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setBackground(new Color(136, 0, 0));
        jLabel7.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabel7.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBackground(new Color(255, 255, 255));
        jLabel7.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabel7.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jRBYes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes1ActionPerformed

    private void jRBNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo1ActionPerformed

    private void jRBYes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes2ActionPerformed

    private void jRBNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo2ActionPerformed

    private void jRBYes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes3ActionPerformed

    private void jRBNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo3ActionPerformed

    private void jRBYes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes4ActionPerformed

    private void jRBNo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo4ActionPerformed

    private void jRBYes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes5ActionPerformed

    private void jRBNo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo5ActionPerformed

    private void jRBYes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes6ActionPerformed

    private void jRBNo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo6ActionPerformed

    private void jRBYes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes7ActionPerformed

    private void jRBNo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo7ActionPerformed

    private void jRBYes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes8ActionPerformed

    private void jRBNo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo8ActionPerformed

    private void jTFMathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMathActionPerformed

    private void jTFFilipinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFilipinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFilipinoActionPerformed

    private void jTFEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEnglishActionPerformed

    private void jTFArtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFArtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFArtsActionPerformed

    private void jTFScienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFScienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFScienceActionPerformed

    private void jCBNcaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNcaeActionPerformed
        if (jCBNcae.isSelected()){
            jTFAcademic.setEnabled(false);
            jTFSports.setEnabled(false);
            jTFTVL.setEnabled(false);
            jTFArts.setEnabled(false);
        } else{
            jTFAcademic.setEnabled(true);
            jTFSports.setEnabled(true);
            jTFTVL.setEnabled(true);
            jTFArts.setEnabled(true);
        }
    }//GEN-LAST:event_jCBNcaeActionPerformed

    private void jTFGenAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFGenAveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFGenAveActionPerformed

    private void jTFAcademicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAcademicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAcademicActionPerformed

    private void jTFSportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSportsActionPerformed

    private void jTFTVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTVLActionPerformed

    private void jCBAcadRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAcadRatingActionPerformed
        if (jCBAcadRating.isSelected()){
            jTFFilipino.setEnabled(false);
            jTFEnglish.setEnabled(false);
            jTFGenAve.setEnabled(false);
            jTFScience.setEnabled(false);
            jTFMath.setEnabled(false);
        } else{
            jTFFilipino.setEnabled(true);
            jTFEnglish.setEnabled(true);
            jTFGenAve.setEnabled(true);
            jTFScience.setEnabled(true);
            jTFMath.setEnabled(true);
        }
    }//GEN-LAST:event_jCBAcadRatingActionPerformed

    private void jLabelNextArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrowMouseClicked
        String filText = jTFFilipino.getText(), engText = jTFEnglish.getText(), genText = jTFGenAve.getText(), mathText = jTFMath.getText(), sciText = jTFScience.getText();
        String AcadText = jTFAcademic.getText(), SportsText = jTFSports.getText(), TVLText = jTFTVL.getText(), ArtsText = jTFArts.getText();
        
        boolean choice_made = buttonGroup1.getSelection() != null && buttonGroup2.getSelection() != null && buttonGroup3.getSelection() != null && buttonGroup4.getSelection() != null && buttonGroup5.getSelection() != null && buttonGroup6.getSelection() != null && buttonGroup7.getSelection() != null && buttonGroup8.getSelection() != null;
        boolean grades_input = filText.isEmpty() || engText.isEmpty() || genText.isEmpty() || mathText.isEmpty() || sciText.isEmpty();
        boolean NCAE_input = AcadText.isEmpty() || SportsText.isEmpty() || TVLText.isEmpty() || ArtsText.isEmpty();
        boolean valid_grade = false, valid_NCAE = false;
        
        if (jCBAcadRating.isSelected()){
            grades_input = false;
            valid_grade = true;
        } else{
            int intConvertFil = filText.isEmpty() ? 0 : Integer.parseInt(filText);
            int intConvertEng = engText.isEmpty() ? 0 : Integer.parseInt(engText);
            int intConvertGen = genText.isEmpty() ? 0 : Integer.parseInt(genText);
            int intConvertMath = mathText.isEmpty() ? 0 : Integer.parseInt(mathText);
            int intConvertSci = sciText.isEmpty() ? 0 : Integer.parseInt(sciText);
            
            if ((intConvertFil < 60 || intConvertFil > 100) || (intConvertEng < 60 || intConvertEng > 100) || (intConvertGen < 60 || intConvertGen > 100) || (intConvertMath < 60 || intConvertMath > 100) || (intConvertSci < 60 || intConvertSci > 100)){
                JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s (Range of Input is 60-100 only), please check again.","Incomplete/Invalid Response",JOptionPane.ERROR_MESSAGE);
                return;
            } else{
                valid_grade = true;
            }
        }
        
        if (jCBNcae.isSelected()){
            NCAE_input = false;
            valid_NCAE = true;
        } else{
            int intConvertAcads = AcadText.isEmpty() ? 0 : Integer.parseInt(AcadText);
            int intConvertSports = SportsText.isEmpty() ? 0 : Integer.parseInt(SportsText);
            int intConvertTVL = TVLText.isEmpty() ? 0 : Integer.parseInt(TVLText);
            int intConvertArts = ArtsText.isEmpty() ? 0 : Integer.parseInt(ArtsText);
            
            if ((intConvertAcads < 60 || intConvertAcads > 100) || (intConvertSports< 60 || intConvertSports > 100) || (intConvertTVL < 60 || intConvertTVL > 100) || (intConvertArts < 60 || intConvertArts > 100)){
                JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s (Range of Input is 60-100 only), please check again.","Incomplete/Invalid Response",JOptionPane.ERROR_MESSAGE);
                return;
            } else{
                valid_NCAE = true;
            }
        }
        
        // VERIFICATION
        if (choice_made == true && grades_input == false && NCAE_input == false && valid_grade == true && valid_NCAE == true){
            jTabbedPane1.setSelectedIndex(2);
        } else{
            JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s (Range of Input is 60-100 only), please check again.","Incomplete/Invalid Response",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_jLabelNextArrowMouseClicked

    private void jLabelNextArrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrowMouseEntered
        jLabelNextArrow.setBackground(new Color(245, 245, 245));
        jLabelNextArrow.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelNextArrow.setForeground(new Color(136, 0, 0));
    }//GEN-LAST:event_jLabelNextArrowMouseEntered

    private void jLabelNextArrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrowMouseExited
        jLabelNextArrow.setBackground(new Color(245, 245, 245));
        jLabelNextArrow.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelNextArrow.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelNextArrowMouseExited

    private void jTFFilipinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFilipinoKeyPressed

    }//GEN-LAST:event_jTFFilipinoKeyPressed

    private void jTFFilipinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFilipinoKeyTyped
        String strChecker = jTFFilipino.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFFilipinoKeyTyped

    private void jTFEnglishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFEnglishKeyTyped
        String strChecker = jTFEnglish.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFEnglishKeyTyped

    private void jTFGenAveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFGenAveKeyTyped
        String strChecker = jTFGenAve.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFGenAveKeyTyped

    private void jTFScienceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFScienceKeyTyped
        String strChecker = jTFScience.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFScienceKeyTyped

    private void jTFMathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMathKeyTyped
        String strChecker = jTFMath.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFMathKeyTyped

    private void jTFAcademicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAcademicKeyTyped
        String strChecker = jTFAcademic.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFAcademicKeyTyped

    private void jTFSportsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFSportsKeyTyped
        String strChecker = jTFSports.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFSportsKeyTyped

    private void jTFTVLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTVLKeyTyped
        String strChecker = jTFTVL.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFTVLKeyTyped

    private void jTFArtsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFArtsKeyTyped
        String strChecker = jTFArts.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFArtsKeyTyped

    private void jLabelBackArrow1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackArrow1MouseExited
        jLabelBackArrow1.setBackground(new Color(245, 245, 245));
        jLabelBackArrow1.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelBackArrow1.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelBackArrow1MouseExited

    private void jLabelBackArrow1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackArrow1MouseEntered
        jLabelBackArrow1.setBackground(new Color(245, 245, 245));
        jLabelBackArrow1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelBackArrow1.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelBackArrow1MouseEntered

    private void jLabelBackArrow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackArrow1MouseClicked
        jTabbedPane1.setSelectedIndex(1);
        
        
    }//GEN-LAST:event_jLabelBackArrow1MouseClicked

    private void jRB1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB1_3ActionPerformed

    private void jRB1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB1_1ActionPerformed

    private void jRB1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB1_2ActionPerformed

    private void jRB2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB2_1ActionPerformed

    private void jRB2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB2_2ActionPerformed

    private void jRB2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB2_3ActionPerformed

    private void jRB3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB3_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB3_1ActionPerformed

    private void jRB3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB3_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB3_2ActionPerformed

    private void jRB3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB3_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB3_3ActionPerformed

    private void jRB4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB4_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB4_1ActionPerformed

    private void jRB4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB4_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB4_2ActionPerformed

    private void jRB4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB4_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB4_3ActionPerformed

    private void jRB5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB5_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB5_1ActionPerformed

    private void jRB5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB5_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB5_2ActionPerformed

    private void jRB5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB5_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB5_3ActionPerformed

    private void jRB6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB6_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB6_1ActionPerformed

    private void jRB6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB6_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB6_2ActionPerformed

    private void jRB6_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB6_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB6_3ActionPerformed

    private void jRB7_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB7_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB7_1ActionPerformed

    private void jRB7_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB7_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB7_2ActionPerformed

    private void jRB7_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB7_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB7_3ActionPerformed

    private void jRB8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB8_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB8_1ActionPerformed

    private void jRB8_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB8_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB8_2ActionPerformed

    private void jRB8_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB8_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB8_3ActionPerformed

    private void jLabelNextArrow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow2MouseClicked
        boolean choice_made = buttonGroup9.getSelection() != null && 
                buttonGroup10.getSelection() != null && 
                buttonGroup11.getSelection() != null && 
                buttonGroup12.getSelection() != null && 
                buttonGroup13.getSelection() != null && 
                buttonGroup14.getSelection() != null && 
                buttonGroup15.getSelection() != null && 
                buttonGroup16.getSelection() != null;
        
        if (choice_made == true){
            jTabbedPane1.setSelectedIndex(3);
        } else{
            JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s, please check again.","Incomplete Response",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jLabelNextArrow2MouseClicked

    private void jLabelNextArrow2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow2MouseEntered
        jLabelNextArrow2.setBackground(new Color(245, 245, 245));
        jLabelNextArrow2.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelNextArrow2.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelNextArrow2MouseEntered

    private void jLabelNextArrow2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow2MouseExited
        jLabelNextArrow2.setBackground(new Color(245, 245, 245));
        jLabelNextArrow2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelNextArrow2.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelNextArrow2MouseExited

    private void jLabelNextArrow3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow3MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabelNextArrow3MouseClicked

    private void jLabelNextArrow3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow3MouseEntered
        jLabelNextArrow3.setBackground(new Color(245, 245, 245));
        jLabelNextArrow3.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelNextArrow3.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelNextArrow3MouseEntered

    private void jLabelNextArrow3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow3MouseExited
        jLabelNextArrow3.setBackground(new Color(245, 245, 245));
        jLabelNextArrow3.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelNextArrow3.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelNextArrow3MouseExited

    private void jRB9_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB9_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB9_3ActionPerformed

    private void jRB9_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB9_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB9_1ActionPerformed

    private void jRB9_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB9_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB9_2ActionPerformed

    private void jRB10_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB10_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB10_1ActionPerformed

    private void jRB10_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB10_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB10_2ActionPerformed

    private void jRB10_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB10_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB10_3ActionPerformed

    private void jRB11_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB11_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB11_1ActionPerformed

    private void jRB11_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB11_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB11_2ActionPerformed

    private void jRB11_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB11_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB11_3ActionPerformed

    private void jRB12_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB12_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB12_1ActionPerformed

    private void jRB12_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB12_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB12_2ActionPerformed

    private void jRB12_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB12_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB12_3ActionPerformed

    private void jRB13_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB13_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB13_1ActionPerformed

    private void jRB13_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB13_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB13_2ActionPerformed

    private void jRB13_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB13_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB13_3ActionPerformed

    private void jRB14_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB14_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB14_1ActionPerformed

    private void jRB14_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB14_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB14_2ActionPerformed

    private void jRB14_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB14_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB14_3ActionPerformed

    private void jRB15_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB15_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB15_1ActionPerformed

    private void jRB15_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB15_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB15_2ActionPerformed

    private void jRB15_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB15_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB15_3ActionPerformed

    private void jRB16_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB16_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB16_1ActionPerformed

    private void jRB16_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB16_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB16_2ActionPerformed

    private void jRB16_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB16_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB16_3ActionPerformed

    private void jLabelNextArrow4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow4MouseClicked
        boolean choice_made = buttonGroup17.getSelection() != null && 
                buttonGroup8.getSelection() != null && 
                buttonGroup19.getSelection() != null && 
                buttonGroup20.getSelection() != null && 
                buttonGroup21.getSelection() != null && 
                buttonGroup22.getSelection() != null && 
                buttonGroup23.getSelection() != null && 
                buttonGroup24.getSelection() != null;
        
        if (choice_made == true){
            jTabbedPane1.setSelectedIndex(4);
        } else{
            JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s, please check again.","Incomplete Response",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelNextArrow4MouseClicked

    private void jLabelNextArrow4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow4MouseEntered
        jLabelNextArrow4.setBackground(new Color(245, 245, 245));
        jLabelNextArrow4.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelNextArrow4.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelNextArrow4MouseEntered

    private void jLabelNextArrow4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow4MouseExited
        jLabelNextArrow4.setBackground(new Color(245, 245, 245));
        jLabelNextArrow4.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelNextArrow4.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelNextArrow4MouseExited

    private void jLabelNextArrow5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow5MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabelNextArrow5MouseClicked

    private void jLabelNextArrow5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow5MouseEntered
        jLabelNextArrow5.setBackground(new Color(245, 245, 245));
        jLabelNextArrow5.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelNextArrow5.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelNextArrow5MouseEntered

    private void jLabelNextArrow5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow5MouseExited
        jLabelNextArrow5.setBackground(new Color(245, 245, 245));
        jLabelNextArrow5.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelNextArrow5.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelNextArrow5MouseExited

    private void jRB17_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB17_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB17_3ActionPerformed

    private void jRB17_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB17_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB17_1ActionPerformed

    private void jRB17_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB17_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB17_2ActionPerformed

    private void jRB18_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB18_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB18_1ActionPerformed

    private void jRB18_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB18_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB18_2ActionPerformed

    private void jRB18_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB18_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB18_3ActionPerformed

    private void jRB19_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB19_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB19_1ActionPerformed

    private void jRB19_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB19_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB19_2ActionPerformed

    private void jRB19_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB19_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB19_3ActionPerformed

    private void jRB20_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB20_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB20_1ActionPerformed

    private void jRB20_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB20_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB20_2ActionPerformed

    private void jRB20_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB20_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB20_3ActionPerformed

    private void jRB21_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB21_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB21_1ActionPerformed

    private void jRB21_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB21_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB21_2ActionPerformed

    private void jRB21_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB21_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB21_3ActionPerformed

    private void jRB22_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB22_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB22_1ActionPerformed

    private void jRB22_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB22_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB22_2ActionPerformed

    private void jRB22_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB22_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB22_3ActionPerformed

    private void jButtonRessultsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRessultsMouseEntered
        // TODO add your handling code here:
        jButtonRessults.setBackground(new java.awt.Color(102, 0, 0));
    }//GEN-LAST:event_jButtonRessultsMouseEntered

    private void jButtonRessultsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRessultsMouseExited
        // TODO add your handling code here:
        jButtonRessults.setBackground(new java.awt.Color(136,0,0));
    }//GEN-LAST:event_jButtonRessultsMouseExited

    private void jButtonRessultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRessultsActionPerformed
        
        
    
    }//GEN-LAST:event_jButtonRessultsActionPerformed
    private void ResetST (){ // This resets the choices in the S&T Evaluation
       buttonGroup1.clearSelection();
       buttonGroup2.clearSelection();
       buttonGroup3.clearSelection();
       buttonGroup4.clearSelection();
       buttonGroup5.clearSelection();
       buttonGroup6.clearSelection();
       buttonGroup7.clearSelection();
       buttonGroup8.clearSelection();
       buttonGroup9.clearSelection();
       buttonGroup10.clearSelection();
       buttonGroup11.clearSelection();
       buttonGroup12.clearSelection();
       buttonGroup13.clearSelection();
       buttonGroup14.clearSelection();
       buttonGroup15.clearSelection();
       buttonGroup16.clearSelection();
       buttonGroup17.clearSelection();
       buttonGroup18.clearSelection();
       buttonGroup19.clearSelection();
       buttonGroup20.clearSelection();
       buttonGroup21.clearSelection();
       buttonGroup22.clearSelection();
       buttonGroup23.clearSelection();
       buttonGroup24.clearSelection();
       buttonGroup25.clearSelection();
       buttonGroup26.clearSelection();
       buttonGroup27.clearSelection();
       buttonGroup28.clearSelection();
       buttonGroup29.clearSelection();
       buttonGroup30.clearSelection();
     
       jTFFilipino.setText(null);
       jTFEnglish.setText(null);
       jTFGenAve.setText(null);
       jTFScience.setText(null);
       jTFMath.setText(null);
       jTFSports.setText(null);
       jTFTVL.setText(null);
       jTFAcademic.setText(null);
       jTFArts.setText(null);
       
       jCBAcadRating.setSelected(false);
       jCBNcae.setSelected(false);
    }
    private void jButtonRessultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRessultsMouseClicked
       // process first before resetting
        boolean choice_made = buttonGroup25.getSelection() != null && 
                buttonGroup26.getSelection() != null && 
                buttonGroup27.getSelection() != null && 
                buttonGroup28.getSelection() != null && 
                buttonGroup29.getSelection() != null && 
                buttonGroup30.getSelection() != null;
        
        if (choice_made == true){
            // set of points for Strand & Track
            int intTVL_score = 0, intACAD_score = 0, intSPORTS_score = 0, intARTS_score = 0;
            int intABM = 0, intSTEM = 0, intHUMMS = 0, intANIMATION = 0, intPERFORMING_ARTS = 0, intFILM_PRODUCTION = 0, intSPORTS_COACHING = 0, intSPORTS_OFFICIATING = 0, intHOME_ECONOMICS = 0, intICT = 0, intINDUSTRIAL = 0;


            //get grades and NCAE
            String filText = jTFFilipino.getText(), engText = jTFEnglish.getText(), genText = jTFGenAve.getText(), mathText = jTFMath.getText(), sciText = jTFScience.getText();
            String AcadText = jTFAcademic.getText(), SportsText = jTFSports.getText(), TVLText = jTFTVL.getText(), ArtsText = jTFArts.getText();
            
            //grades
            int intConvertFil = filText.isEmpty() ? 0 : Integer.parseInt(filText);
            int intConvertEng = engText.isEmpty() ? 0 : Integer.parseInt(engText);
            int intConvertGen = genText.isEmpty() ? 0 : Integer.parseInt(genText);
            int intConvertMath = mathText.isEmpty() ? 0 : Integer.parseInt(mathText);
            int intConvertSci = sciText.isEmpty() ? 0 : Integer.parseInt(sciText);
            
            //NCAE
            int intConvertAcads = AcadText.isEmpty() ? 0 : Integer.parseInt(AcadText);
            int intConvertSports = SportsText.isEmpty() ? 0 : Integer.parseInt(SportsText);
            int intConvertTVL = TVLText.isEmpty() ? 0 : Integer.parseInt(TVLText);
            int intConvertArts = ArtsText.isEmpty() ? 0 : Integer.parseInt(ArtsText);
            
            // Pointing System Begins for Grades & NCAE
            if (!jCBAcadRating.isSelected()){
                if (intConvertFil >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
                if (intConvertEng >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
                if (intConvertGen >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
                if (intConvertMath >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
                if (intConvertSci >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
            }
            
            if (!jCBNcae.isSelected()){
                intACAD_score += intConvertAcads / 10;
                intTVL_score += intConvertSports / 10;
                intSPORTS_score += intConvertTVL / 10;
                intARTS_score += intConvertArts / 10;
            }
            
            // Pointing System Begins for Radio Buttons
            //#1
            if (jRBYes1.isSelected()){
                intACAD_score += 3;
                intARTS_score += 2;
                intTVL_score += 2;
            } else if (jRBNo1.isSelected()){
                intTVL_score += 3;
                intSPORTS_score += 2;
            }
            
            //#2
            if (jRBYes2.isSelected()){
                intTVL_score += 3;
                intACAD_score += 2;
            } else if (jRBNo2.isSelected()){
                intARTS_score += 2;
                intSPORTS_score += 2;
            }
            
            //#3
            if (jRBYes3.isSelected()){
                intTVL_score += 3;
                intACAD_score += 2;
            }
            
            //#4
            if (jRBYes4.isSelected()){
                intTVL_score += 2;
            }
            
            //#5
            if (jRBYes5.isSelected()){
                intACAD_score += 3;
                intARTS_score += 2;
                intTVL_score += 1;
                intSPORTS_score += 2;
            }
            
            //#6
            if (jRBYes6.isSelected()){
                intACAD_score += 2;
            }
            
            //#7
            if (jRBYes7.isSelected()){
                intARTS_score += 5;
            }
            
            //#8
            if (jRBYes8.isSelected()){
                intSPORTS_score += 3;
            }
            
            //#9
            if (jRB1_1.isSelected()){
                intABM += 3;
            } else if (jRB1_2.isSelected()){
                intABM += 9;
            } else if (jRB1_3.isSelected()){
                intABM += 15;
            }
                        
            //#10
            if (jRB2_1.isSelected()){
                intSTEM += 3;
            } else if (jRB2_2.isSelected()){
                intSTEM  += 9;
            } else if (jRB2_3.isSelected()){
                intSTEM  += 15;
            }
            
            //#11
            if (jRB3_1.isSelected()){
                intHUMMS += 3;
            } else if (jRB3_2.isSelected()){
                intHUMMS  += 9;
            } else if (jRB3_3.isSelected()){
                intHUMMS  += 15;
            }
            
            //#12
            if (jRB4_1.isSelected()){
                intANIMATION += 3;
            } else if (jRB4_2.isSelected()){
                intANIMATION  += 9;
            } else if (jRB4_3.isSelected()){
                intANIMATION  += 15;
            }
            
            //#13
            if (jRB5_1.isSelected()){
                intPERFORMING_ARTS += 3;
            } else if (jRB5_2.isSelected()){
                intPERFORMING_ARTS += 9;
            } else if (jRB5_3.isSelected()){
                intPERFORMING_ARTS  += 15;
            }
            
            //#14
            if (jRB6_1.isSelected()){
                intFILM_PRODUCTION += 3;
            } else if (jRB6_2.isSelected()){
                intFILM_PRODUCTION += 9;
            } else if (jRB6_3.isSelected()){
                intFILM_PRODUCTION  += 15;
            }
            
            //#15
            if (jRB7_1.isSelected()){
                intSPORTS_COACHING += 3;
            } else if (jRB7_2.isSelected()){
                intSPORTS_COACHING += 9;
            } else if (jRB7_3.isSelected()){
                intSPORTS_COACHING  += 15;
            }
            
            //#16
            if (jRB8_1.isSelected()){
                intSPORTS_OFFICIATING += 3;
            } else if (jRB8_2.isSelected()){
                intSPORTS_OFFICIATING += 9;
            } else if (jRB8_3.isSelected()){
                intSPORTS_OFFICIATING  += 15;
            }
            
            //----- HOME ECO
            //#17
            if (jRB9_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB9_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB9_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //#18
            if (jRB10_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB10_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB10_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //#19
            if (jRB11_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB11_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB11_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //#20
            if (jRB12_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB12_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB12_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //#21
            if (jRB13_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB13_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB13_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //---- ICT
            //#22
            if (jRB14_1.isSelected()){
                intICT += 1;
            } else if (jRB14_2.isSelected()){
                intICT += 3;
            } else if (jRB14_3.isSelected()){
                intICT  += 5;
            }
            
            //#23
            if (jRB15_1.isSelected()){
                intICT += 1;
            } else if (jRB15_2.isSelected()){
                intICT += 3;
            } else if (jRB15_3.isSelected()){
                intICT  += 5;
            }
            
            //#24
            if (jRB16_1.isSelected()){
                intICT += 1;
            } else if (jRB16_2.isSelected()){
                intICT += 3;
            } else if (jRB16_3.isSelected()){
                intICT  += 5;
            }
            
            // ---- INDUSTRIAL
            //#25
            if (jRB17_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB17_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB17_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#26
            if (jRB18_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB18_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB18_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#27
            if (jRB19_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB19_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB19_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#28
            if (jRB20_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB20_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB20_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#29
            if (jRB21_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB21_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB21_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#30
            if (jRB22_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB22_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB22_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            
            /* ----- BALANCING (when scores of strand match within the other, there will be an equally incrementation of scores)
                    intTVL_score += ;
                    intACAD_score += ;
                    intARTS_score += ;
                    intSPORTS_score += ;
            */
            
            if ((intACAD_score == intARTS_score) || (intACAD_score == intTVL_score) || (intACAD_score == intSPORTS_score)){
                intACAD_score += 3;
            }
            
            if ((intARTS_score == intTVL_score) || (intARTS_score == intSPORTS_score)){
                intARTS_score += 2;
            }
            
            if ((intTVL_score == intSPORTS_score)){
                intTVL_score += 1;
            }
            
            // RESULT VERFICATION & DISPLAYING
            String strResultStrand = "-", strResultTrack = "-";
            
            if ((intACAD_score > intARTS_score) && (intACAD_score > intTVL_score) && (intACAD_score > intSPORTS_score)){
                strResultTrack = "ACADEMIC TRACK";
                
                if (intABM > intSTEM && intABM > intHUMMS){
                    strResultStrand = "Accountancy, Business, and Management Strand";
                    intABM += 1;
                } else if (intABM == intSTEM){
                    strResultStrand = "Accountancy, Business, and Management Strand";
                    intABM += 1;
                } else if (intABM == intHUMMS){
                    strResultStrand = "Humanities and Social Science Strand";
                    intHUMMS += 1;
                } else if (intHUMMS == intSTEM){
                    strResultStrand = "Humanities and Social Science Strand";
                    intHUMMS += 1;
                }
                
                if (intSTEM > intABM && intSTEM > intHUMMS){
                    strResultStrand = "Science, Technology, Engineering and Mathematics Strand";
                }else if (intHUMMS > intABM && intHUMMS > intSTEM){
                    strResultStrand = "Humanities and Social Science Strand";
                }
                
            } else if ((intARTS_score > intACAD_score) && (intARTS_score > intTVL_score) && (intARTS_score > intSPORTS_score)){
                strResultTrack = "ARTS & DESIGN TRACK";
                
                if (intANIMATION > intFILM_PRODUCTION && intANIMATION > intPERFORMING_ARTS){
                    strResultStrand = "Animation Strand";
                } else if (intANIMATION == intFILM_PRODUCTION){
                    strResultStrand = "Animation Strand";
                    intANIMATION += 1;
                } else if (intFILM_PRODUCTION == intPERFORMING_ARTS){
                    strResultStrand = "Film Production Strand";
                    intFILM_PRODUCTION += 1;
                } else if (intPERFORMING_ARTS == intANIMATION){
                    strResultStrand = "Performing Arts Strand";
                    intPERFORMING_ARTS += 1;
                }
                
                if (intFILM_PRODUCTION > intANIMATION && intFILM_PRODUCTION > intPERFORMING_ARTS){
                    strResultStrand = "Film Production Strand";
                }
                if (intPERFORMING_ARTS > intANIMATION && intPERFORMING_ARTS > intFILM_PRODUCTION){
                    strResultStrand = "Performing Arts Strand";
                }
            } else if ((intTVL_score > intACAD_score) && (intTVL_score > intARTS_score) && (intTVL_score > intSPORTS_score)){
                strResultTrack = "TECHNICAL-VOCATIONAL-LIVELIHOOD TRACK";
                
                if (intHOME_ECONOMICS > intICT && intHOME_ECONOMICS > intINDUSTRIAL) {
                    strResultStrand = "Home Economics Strand";
                } else if (intHOME_ECONOMICS == intICT) {
                    strResultStrand = "Information and Communications Technology Strand";
                    intICT += 1;
                } else if (intICT == intINDUSTRIAL) {
                    strResultStrand = "Industrial Arts Strand";
                    intINDUSTRIAL += 1;
                } else if (intINDUSTRIAL == intHOME_ECONOMICS) {
                    strResultStrand = "Home Economics Strand";
                    intHOME_ECONOMICS += 1;
                }

                if (intICT > intHOME_ECONOMICS && intICT > intINDUSTRIAL) {
                    strResultStrand = "Information and Communications Technology Strand";
                }

                if (intINDUSTRIAL > intHOME_ECONOMICS && intINDUSTRIAL > intICT) {
                    strResultStrand = "Industrial Arts Strand";
                }
            } else if ((intSPORTS_score > intACAD_score) && (intSPORTS_score > intARTS_score) && (intSPORTS_score > intTVL_score)){
                strResultTrack = "SPORTS TRACK";
               
                if (intSPORTS_COACHING > intSPORTS_OFFICIATING){
                    strResultStrand = "Sports Coaching Strand";
                } else if (intSPORTS_COACHING < intSPORTS_OFFICIATING){
                    strResultStrand = "Sports Officiating Strand";
                } else if (intSPORTS_COACHING == intSPORTS_OFFICIATING){
                    strResultStrand = "Sports Officiating Strand";
                    intSPORTS_OFFICIATING += 1;
                }
            }
            //DISPLAY
            /* 
                    intTVL_score += ;
                    intACAD_score += ;
                    intARTS_score += ;
                    intSPORTS_score += ;
            */
            // FINAL RESULT
            jLabelResultStrand.setText(strResultStrand);
            jLabelResultTrack2.setText(strResultTrack);
            
            // MAIN TRACKS
            jLabelResultAcadTrack.setText(String.valueOf(intACAD_score));
            jLabelResultArtsTrack.setText(String.valueOf(intARTS_score));
            jLabelResultTVLTrack.setText(String.valueOf(intTVL_score));
            jLabelResultSportsTrack.setText(String.valueOf(intSPORTS_score));
            
            // ACADEMIC TRACK
            jLabelHUMMS.setText(String.valueOf(intHUMMS));
            jLabelSTEM.setText(String.valueOf(intSTEM));
            jLabelABM.setText(String.valueOf(intABM));
            
            // ARTS & DESIGN TRACK
            jLabelPERFORMING_ARTS.setText(String.valueOf(intPERFORMING_ARTS));
            jLabelFILM_PRODUCTION.setText(String.valueOf(intFILM_PRODUCTION));
            jLabelANIMATION.setText(String.valueOf(intANIMATION));
            
            // TVL TRACK
            jLabelHOME_ECONOMICS.setText(String.valueOf(intHOME_ECONOMICS));
            jLabelICT.setText(String.valueOf(intICT));
            jLabelINDUSTRIAL_ARTS.setText(String.valueOf(intINDUSTRIAL));
            
            // SPORTS TRACK
            jLabelSPORTS_COACHING.setText(String.valueOf(intSPORTS_COACHING));
            jLabelSPORTS_OFFICIATING.setText(String.valueOf(intSPORTS_OFFICIATING));
      
            // going to the RESULTS TAB & reseting choices
            jTabbedPane1.setSelectedIndex(5);
            ResetST();
        } else{
            JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s, please check again.","Incomplete Response",JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_jButtonRessultsMouseClicked

    private void jCBAcadRatingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBAcadRatingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAcadRatingMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButtonRessults;
    private javax.swing.JCheckBox jCBAcadRating;
    private javax.swing.JCheckBox jCBNcae;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelABM;
    private javax.swing.JLabel jLabelANIMATION;
    private javax.swing.JLabel jLabelBackArrow1;
    private javax.swing.JLabel jLabelFILM_PRODUCTION;
    private javax.swing.JLabel jLabelHOME_ECONOMICS;
    private javax.swing.JLabel jLabelHUMMS;
    private javax.swing.JLabel jLabelICT;
    private javax.swing.JLabel jLabelINDUSTRIAL_ARTS;
    private javax.swing.JLabel jLabelNextArrow;
    private javax.swing.JLabel jLabelNextArrow2;
    private javax.swing.JLabel jLabelNextArrow3;
    private javax.swing.JLabel jLabelNextArrow4;
    private javax.swing.JLabel jLabelNextArrow5;
    private javax.swing.JLabel jLabelPERFORMING_ARTS;
    private javax.swing.JPanel jLabelPERFORMING_ARTS22;
    private javax.swing.JLabel jLabelResultAcadTrack;
    private javax.swing.JLabel jLabelResultArtsTrack;
    private javax.swing.JLabel jLabelResultSportsTrack;
    private javax.swing.JLabel jLabelResultStrand;
    private javax.swing.JLabel jLabelResultTVLTrack;
    private javax.swing.JLabel jLabelResultTrack2;
    private javax.swing.JLabel jLabelSPORTS_COACHING;
    private javax.swing.JLabel jLabelSPORTS_OFFICIATING;
    private javax.swing.JLabel jLabelSTEM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelSTEvaluation;
    private javax.swing.JPanel jPanelSTEvaluation_1;
    private javax.swing.JPanel jPanelSTEvaluation_2;
    private javax.swing.JPanel jPanelSTEvaluation_3;
    private javax.swing.JPanel jPanelSTEvaluation_4;
    private javax.swing.JRadioButton jRB10_1;
    private javax.swing.JRadioButton jRB10_2;
    private javax.swing.JRadioButton jRB10_3;
    private javax.swing.JRadioButton jRB11_1;
    private javax.swing.JRadioButton jRB11_2;
    private javax.swing.JRadioButton jRB11_3;
    private javax.swing.JRadioButton jRB12_1;
    private javax.swing.JRadioButton jRB12_2;
    private javax.swing.JRadioButton jRB12_3;
    private javax.swing.JRadioButton jRB13_1;
    private javax.swing.JRadioButton jRB13_2;
    private javax.swing.JRadioButton jRB13_3;
    private javax.swing.JRadioButton jRB14_1;
    private javax.swing.JRadioButton jRB14_2;
    private javax.swing.JRadioButton jRB14_3;
    private javax.swing.JRadioButton jRB15_1;
    private javax.swing.JRadioButton jRB15_2;
    private javax.swing.JRadioButton jRB15_3;
    private javax.swing.JRadioButton jRB16_1;
    private javax.swing.JRadioButton jRB16_2;
    private javax.swing.JRadioButton jRB16_3;
    private javax.swing.JRadioButton jRB17_1;
    private javax.swing.JRadioButton jRB17_2;
    private javax.swing.JRadioButton jRB17_3;
    private javax.swing.JRadioButton jRB18_1;
    private javax.swing.JRadioButton jRB18_2;
    private javax.swing.JRadioButton jRB18_3;
    private javax.swing.JRadioButton jRB19_1;
    private javax.swing.JRadioButton jRB19_2;
    private javax.swing.JRadioButton jRB19_3;
    private javax.swing.JRadioButton jRB1_1;
    private javax.swing.JRadioButton jRB1_2;
    private javax.swing.JRadioButton jRB1_3;
    private javax.swing.JRadioButton jRB20_1;
    private javax.swing.JRadioButton jRB20_2;
    private javax.swing.JRadioButton jRB20_3;
    private javax.swing.JRadioButton jRB21_1;
    private javax.swing.JRadioButton jRB21_2;
    private javax.swing.JRadioButton jRB21_3;
    private javax.swing.JRadioButton jRB22_1;
    private javax.swing.JRadioButton jRB22_2;
    private javax.swing.JRadioButton jRB22_3;
    private javax.swing.JRadioButton jRB2_1;
    private javax.swing.JRadioButton jRB2_2;
    private javax.swing.JRadioButton jRB2_3;
    private javax.swing.JRadioButton jRB3_1;
    private javax.swing.JRadioButton jRB3_2;
    private javax.swing.JRadioButton jRB3_3;
    private javax.swing.JRadioButton jRB4_1;
    private javax.swing.JRadioButton jRB4_2;
    private javax.swing.JRadioButton jRB4_3;
    private javax.swing.JRadioButton jRB5_1;
    private javax.swing.JRadioButton jRB5_2;
    private javax.swing.JRadioButton jRB5_3;
    private javax.swing.JRadioButton jRB6_1;
    private javax.swing.JRadioButton jRB6_2;
    private javax.swing.JRadioButton jRB6_3;
    private javax.swing.JRadioButton jRB7_1;
    private javax.swing.JRadioButton jRB7_2;
    private javax.swing.JRadioButton jRB7_3;
    private javax.swing.JRadioButton jRB8_1;
    private javax.swing.JRadioButton jRB8_2;
    private javax.swing.JRadioButton jRB8_3;
    private javax.swing.JRadioButton jRB9_1;
    private javax.swing.JRadioButton jRB9_2;
    private javax.swing.JRadioButton jRB9_3;
    private javax.swing.JRadioButton jRBNo1;
    private javax.swing.JRadioButton jRBNo2;
    private javax.swing.JRadioButton jRBNo3;
    private javax.swing.JRadioButton jRBNo4;
    private javax.swing.JRadioButton jRBNo5;
    private javax.swing.JRadioButton jRBNo6;
    private javax.swing.JRadioButton jRBNo7;
    private javax.swing.JRadioButton jRBNo8;
    private javax.swing.JRadioButton jRBYes1;
    private javax.swing.JRadioButton jRBYes2;
    private javax.swing.JRadioButton jRBYes3;
    private javax.swing.JRadioButton jRBYes4;
    private javax.swing.JRadioButton jRBYes5;
    private javax.swing.JRadioButton jRBYes6;
    private javax.swing.JRadioButton jRBYes7;
    private javax.swing.JRadioButton jRBYes8;
    private javax.swing.JTextField jTFAcademic;
    private javax.swing.JTextField jTFArts;
    private javax.swing.JTextField jTFEnglish;
    private javax.swing.JTextField jTFFilipino;
    private javax.swing.JTextField jTFGenAve;
    private javax.swing.JTextField jTFMath;
    private javax.swing.JTextField jTFScience;
    private javax.swing.JTextField jTFSports;
    private javax.swing.JTextField jTFTVL;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
