
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class klasifikasi extends javax.swing.JFrame {

    private String file = "", file2 = "", file3 = "", file4 = "";
    public int x, y;
    public int lebar, tinggi;
    public int value;

    public klasifikasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        open1 = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        Gray = new javax.swing.JButton();
        gray1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        treshold2 = new javax.swing.JLabel();
        tresholding = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        spinner_treshold = new javax.swing.JSpinner();
        open2 = new javax.swing.JButton();
        open3 = new javax.swing.JButton();
        open4 = new javax.swing.JButton();
        image2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gray2 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();
        gray3 = new javax.swing.JLabel();
        image4 = new javax.swing.JLabel();
        gray4 = new javax.swing.JLabel();
        treshold1 = new javax.swing.JLabel();
        treshold3 = new javax.swing.JLabel();
        treshold4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        open1.setText("Pilih Gambar 1");
        open1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open1ActionPerformed(evt);
            }
        });

        Gray.setText("Grayscale");
        Gray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrayActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Gentium", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 242, 244));
        jLabel1.setText("KLASIFIKASI MOTIF BATIK DI JAWA TIMUR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        refresh.setText("Bersihkan");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        tresholding.setText("Treshold");
        tresholding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresholdingActionPerformed(evt);
            }
        });

        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        spinner_treshold.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_tresholdStateChanged(evt);
            }
        });

        open2.setText("Pilih Gambar 2");
        open2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open2ActionPerformed(evt);
            }
        });

        open3.setText("Pilih Gambar 3");
        open3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open3ActionPerformed(evt);
            }
        });

        open4.setText("Pilih Gambar 4");
        open4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(2, 3, 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(open1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(open2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(open3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(image3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(open4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Gray)
                        .addGap(27, 27, 27)
                        .addComponent(gray1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(gray2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(gray3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(gray4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinner_treshold, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tresholding, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(treshold1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(treshold2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(treshold3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(treshold4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(open1)
                    .addComponent(open2)
                    .addComponent(open3)
                    .addComponent(open4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(image3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(image4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refresh)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1))
                    .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gray3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gray4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gray2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gray1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Gray)
                        .addGap(69, 69, 69)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(treshold1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(treshold2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(treshold3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(treshold4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(spinner_treshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tresholding)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void open1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open1ActionPerformed
        // TODO add your handling code here:
        file();
    }//GEN-LAST:event_open1ActionPerformed

    private void GrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrayActionPerformed
        // TODO add your handling code here:
        gray();
    }//GEN-LAST:event_GrayActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_refreshActionPerformed

    private void tresholdingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresholdingActionPerformed
        // TODO add your handling code here:
        Tresholding();
    }//GEN-LAST:event_tresholdingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void spinner_tresholdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_tresholdStateChanged
        // TODO add your handling code here:
        int val = Integer.parseInt(spinner_treshold.getValue().toString());
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(file));
        } catch (IOException e) {
        }

        int lebar = img.getWidth();
        int tinggi = img.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {
                Color c = new Color(img.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                int gray = (red + green + blue) / 3;
                if (gray >= val) {
                    gray = 255;
                } else if (gray < val) {
                    gray = 0;
                }
                Color newcolor = new Color(gray, gray, gray);
                img.setRGB(x, y, newcolor.getRGB());
            }
        }

        Image yosh = img.getScaledInstance(treshold2.getWidth(), treshold2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ico = new ImageIcon(yosh);
        treshold2.setIcon(ico);

    }//GEN-LAST:event_spinner_tresholdStateChanged

    private void open2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open2ActionPerformed
        // TODO add your handling code here:
        file2();
    }//GEN-LAST:event_open2ActionPerformed

    private void open3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open3ActionPerformed
        // TODO add your handling code here:
        file3();
    }//GEN-LAST:event_open3ActionPerformed

    private void open4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open4ActionPerformed
        // TODO add your handling code here:
        file4();
    }//GEN-LAST:event_open4ActionPerformed

    public void file() {

        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile().getAbsolutePath();
            System.out.println(file);

            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(file));
            } catch (IOException e) {
            }

            Image yosh = img.getScaledInstance(image1.getWidth(), image1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ico = new ImageIcon(yosh);
            image1.setIcon(ico);
        }
    }

    public void file2() {

        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            file2 = chooser.getSelectedFile().getAbsolutePath();
            System.out.println(file2);

            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(file2));
            } catch (IOException e) {
            }

            Image yosh = img.getScaledInstance(image2.getWidth(), image2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ico = new ImageIcon(yosh);
            image2.setIcon(ico);
        }
    }

    public void file3() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            file3 = chooser.getSelectedFile().getAbsolutePath();
            System.out.println(file3);

            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(file3));
            } catch (IOException e) {
            }

            Image yosh = img.getScaledInstance(image3.getWidth(), image3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ico = new ImageIcon(yosh);
            image3.setIcon(ico);
        }
    }

    public void file4() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            file4 = chooser.getSelectedFile().getAbsolutePath();
            System.out.println(file4);

            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(file4));
            } catch (IOException e) {
            }

            Image yosh = img.getScaledInstance(image4.getWidth(), image4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ico = new ImageIcon(yosh);
            image4.setIcon(ico);
        }
    }

    public void gray() {

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(file));

        } catch (IOException e) {
        }

        lebar = img.getWidth();
        tinggi = img.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {

                int p = img.getRGB(x, y);

                int a = (p >> 24) & 0xff;

                int r = (p >> 16) & 0xff;

                int g = (p >> 8) & 0xff;

                int b = p & 0xff;

                //calculate average
                int avg = (r + g + b) / 3;

                //replace RGB value with avg
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;

                img.setRGB(x, y, p);
            }
        }
        Image yosh = img.getScaledInstance(gray1.getWidth(), gray1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ico = new ImageIcon(yosh);
        gray1.setIcon(ico);

        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File(file2));

        } catch (IOException e) {
        }

        lebar = img2.getWidth();
        tinggi = img2.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {

                int p = img2.getRGB(x, y);

                int a = (p >> 24) & 0xff;

                int r = (p >> 16) & 0xff;

                int g = (p >> 8) & 0xff;

                int b = p & 0xff;

                //calculate average
                int avg = (r + g + b) / 3;

                //replace RGB value with avg
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;

                img2.setRGB(x, y, p);
            }
        }
        yosh = img2.getScaledInstance(gray2.getWidth(), gray2.getHeight(), Image.SCALE_SMOOTH);
        ico = new ImageIcon(yosh);
        gray2.setIcon(ico);

        BufferedImage img3 = null;
        try {
            img3 = ImageIO.read(new File(file3));

        } catch (IOException e) {
        }

        lebar = img3.getWidth();
        tinggi = img3.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {

                int p = img3.getRGB(x, y);

                int a = (p >> 24) & 0xff;

                int r = (p >> 16) & 0xff;

                int g = (p >> 8) & 0xff;

                int b = p & 0xff;

                //calculate average
                int avg = (r + g + b) / 3;

                //replace RGB value with avg
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;

                img3.setRGB(x, y, p);
            }
        }
        yosh = img3.getScaledInstance(gray3.getWidth(), gray3.getHeight(), Image.SCALE_SMOOTH);
        ico = new ImageIcon(yosh);
        gray3.setIcon(ico);

        BufferedImage img4 = null;
        try {
            img4 = ImageIO.read(new File(file4));

        } catch (IOException e) {
        }

        lebar = img4.getWidth();
        tinggi = img4.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {

                int p = img4.getRGB(x, y);

                int a = (p >> 24) & 0xff;

                int r = (p >> 16) & 0xff;

                int g = (p >> 8) & 0xff;

                int b = p & 0xff;

                //calculate average
                int avg = (r + g + b) / 3;

                //replace RGB value with avg
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;

                img4.setRGB(x, y, p);
            }
        }
        yosh = img4.getScaledInstance(gray4.getWidth(), gray4.getHeight(), Image.SCALE_SMOOTH);
        ico = new ImageIcon(yosh);
        gray4.setIcon(ico);
    }

    public void Tresholding() {

        value = Integer.parseInt(spinner_treshold.getValue().toString());
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(file));
        } catch (IOException e) {
        }

        int lebar = img.getWidth();
        int tinggi = img.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {
                Color c = new Color(img.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                int gray = red + green + blue / 3;
                if (gray >= value) {
                    gray = 255;
                } else if (gray < value) {
                    gray = 0;
                }
                Color newcolor = new Color(gray, gray, gray);
                img.setRGB(x, y, newcolor.getRGB());
            }
        }

        Image yosh = img.getScaledInstance(treshold1.getWidth(), treshold1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ico = new ImageIcon(yosh);
        treshold1.setIcon(ico);

        value = Integer.parseInt(spinner_treshold.getValue().toString());
        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File(file2));
        } catch (IOException e) {
        }

        lebar = img2.getWidth();
        tinggi = img2.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {
                Color c = new Color(img2.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                int gray = red + green + blue / 3;
                if (gray >= value) {
                    gray = 255;
                } else if (gray < value) {
                    gray = 0;
                }
                Color newcolor = new Color(gray, gray, gray);
                img2.setRGB(x, y, newcolor.getRGB());
            }
        }

        yosh = img2.getScaledInstance(treshold2.getWidth(), treshold2.getHeight(), Image.SCALE_SMOOTH);
        ico = new ImageIcon(yosh);
        treshold2.setIcon(ico);

        value = Integer.parseInt(spinner_treshold.getValue().toString());
        BufferedImage img3 = null;
        try {
            img3 = ImageIO.read(new File(file3));
        } catch (IOException e) {
        }

        lebar = img3.getWidth();
        tinggi = img3.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {
                Color c = new Color(img3.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                int gray = red + green + blue / 3;
                if (gray >= value) {
                    gray = 255;
                } else if (gray < value) {
                    gray = 0;
                }
                Color newcolor = new Color(gray, gray, gray);
                img3.setRGB(x, y, newcolor.getRGB());
            }
        }

        yosh = img3.getScaledInstance(treshold3.getWidth(), treshold3.getHeight(), Image.SCALE_SMOOTH);
        ico = new ImageIcon(yosh);
        treshold3.setIcon(ico);

        value = Integer.parseInt(spinner_treshold.getValue().toString());
        BufferedImage img4 = null;
        try {
            img4 = ImageIO.read(new File(file4));
        } catch (IOException e) {
        }

        lebar = img4.getWidth();
        tinggi = img4.getHeight();

        for (y = 0; y < tinggi; y++) {
            for (x = 0; x < lebar; x++) {
                Color c = new Color(img4.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                int gray = red + green + blue / 3;
                if (gray >= value) {
                    gray = 255;
                } else if (gray < value) {
                    gray = 0;
                }
                Color newcolor = new Color(gray, gray, gray);
                img4.setRGB(x, y, newcolor.getRGB());
            }
        }

        yosh = img4.getScaledInstance(treshold4.getWidth(), treshold4.getHeight(), Image.SCALE_SMOOTH);
        ico = new ImageIcon(yosh);
        treshold4.setIcon(ico);
    }

    public void refresh() {

        image1.setIcon(null);
        image2.setIcon(null);
        image3.setIcon(null);
        image4.setIcon(null);

        gray1.setIcon(null);
        gray2.setIcon(null);
        gray3.setIcon(null);
        gray4.setIcon(null);

        treshold1.setIcon(null);
        treshold2.setIcon(null);
        treshold3.setIcon(null);
        treshold4.setIcon(null);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new klasifikasi().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gray;
    private javax.swing.JLabel gray1;
    private javax.swing.JLabel gray2;
    private javax.swing.JLabel gray3;
    private javax.swing.JLabel gray4;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton open1;
    private javax.swing.JButton open2;
    private javax.swing.JButton open3;
    private javax.swing.JButton open4;
    private javax.swing.JButton refresh;
    private javax.swing.JSpinner spinner_treshold;
    private javax.swing.JLabel treshold1;
    private javax.swing.JLabel treshold2;
    private javax.swing.JLabel treshold3;
    private javax.swing.JLabel treshold4;
    private javax.swing.JButton tresholding;
    // End of variables declaration//GEN-END:variables
}
