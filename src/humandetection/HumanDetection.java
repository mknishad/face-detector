package humandetection;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class HumanDetection extends javax.swing.JFrame
{
    public static BufferedImage openImg;    //  the image that we will open for manipulate
    public static ImageIcon icon1;      //  the icon to set on the JPanel 1
    public static ImageIcon icon2;      //  the icon to set on the JPanel 2
    public static File f;               //  the file that will be opened by file chooser
    private final JFileChooser fc;      //  the file chooser

    // constructor
    public HumanDetection()
    {
        initComponents();
        fc = new JFileChooser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        srcImagePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        cropButton = new javax.swing.JButton();
        rotateLeftButton = new javax.swing.JButton();
        blackWhiteButton = new javax.swing.JButton();
        zoomImageButton = new javax.swing.JButton();
        grayScaleButton = new javax.swing.JButton();
        rgbValueButton = new javax.swing.JButton();
        editedImagePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rotateRightButton = new javax.swing.JButton();
        detectEdgeButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        humanDetectButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenuOption = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        closeMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenuOption = new javax.swing.JMenu();
        detectHumanMenuItem = new javax.swing.JMenuItem();
        blackWhiteMenuItem = new javax.swing.JMenuItem();
        cropMenuItem = new javax.swing.JMenuItem();
        detectEdgeMenuItem = new javax.swing.JMenuItem();
        grayScaleMenuItem = new javax.swing.JMenuItem();
        rotateLeftMenuItem = new javax.swing.JMenuItem();
        rotateRightMenuItem = new javax.swing.JMenuItem();
        rgbValuesMenuItem = new javax.swing.JMenuItem();
        zoomImageMenuItem = new javax.swing.JMenuItem();
        aboutMenuOption = new javax.swing.JMenu();
        developerMenuItem = new javax.swing.JMenuItem();
        helpMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Editor");

        srcImagePanel.setPreferredSize(new java.awt.Dimension(260, 2));

        jScrollPane2.setViewportView(jLabel1);

        javax.swing.GroupLayout srcImagePanelLayout = new javax.swing.GroupLayout(srcImagePanel);
        srcImagePanel.setLayout(srcImagePanelLayout);
        srcImagePanelLayout.setHorizontalGroup(
            srcImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        srcImagePanelLayout.setVerticalGroup(
            srcImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        cropButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cropButton.setText("Crop");
        cropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropButtonActionPerformed(evt);
            }
        });

        rotateLeftButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rotateLeftButton.setText("Rotate Left");
        rotateLeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateLeftButtonActionPerformed(evt);
            }
        });

        blackWhiteButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        blackWhiteButton.setText("Black/White");
        blackWhiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackWhiteButtonActionPerformed(evt);
            }
        });

        zoomImageButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        zoomImageButton.setText("Zoom In/Out");
        zoomImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomImageButtonActionPerformed(evt);
            }
        });

        grayScaleButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        grayScaleButton.setText("Gray Scale");
        grayScaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayScaleButtonActionPerformed(evt);
            }
        });

        rgbValueButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rgbValueButton.setText("RGB Values");
        rgbValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgbValueButtonActionPerformed(evt);
            }
        });

        editedImagePanel.setPreferredSize(new java.awt.Dimension(260, 2));

        jScrollPane3.setViewportView(jLabel2);

        javax.swing.GroupLayout editedImagePanelLayout = new javax.swing.GroupLayout(editedImagePanel);
        editedImagePanel.setLayout(editedImagePanelLayout);
        editedImagePanelLayout.setHorizontalGroup(
            editedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        editedImagePanelLayout.setVerticalGroup(
            editedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        rotateRightButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rotateRightButton.setText("Rotate Right");
        rotateRightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateRightButtonActionPerformed(evt);
            }
        });

        detectEdgeButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        detectEdgeButton.setText("Detect Edge");
        detectEdgeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detectEdgeButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        humanDetectButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        humanDetectButton.setText("Detect Human");
        humanDetectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanDetectButtonActionPerformed(evt);
            }
        });

        fileMenuOption.setText("File");
        fileMenuOption.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenuOption.add(openMenuItem);

        closeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        closeMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        closeMenuItem.setText("Close");
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuItemActionPerformed(evt);
            }
        });
        fileMenuOption.add(closeMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenuOption.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        saveAsMenuItem.setText("Save As");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenuOption.add(saveAsMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenuOption.add(exitMenuItem);

        jMenuBar1.add(fileMenuOption);

        editMenuOption.setText("Edit");
        editMenuOption.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        detectHumanMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        detectHumanMenuItem.setText("Detect Human");
        detectHumanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detectHumanMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(detectHumanMenuItem);

        blackWhiteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        blackWhiteMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        blackWhiteMenuItem.setText("Black & White");
        blackWhiteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackWhiteMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(blackWhiteMenuItem);

        cropMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cropMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cropMenuItem.setText("Crop");
        cropMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(cropMenuItem);

        detectEdgeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        detectEdgeMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        detectEdgeMenuItem.setText("Detect Edge");
        detectEdgeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detectEdgeMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(detectEdgeMenuItem);

        grayScaleMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        grayScaleMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        grayScaleMenuItem.setText("Grayscale");
        grayScaleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayScaleMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(grayScaleMenuItem);

        rotateLeftMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        rotateLeftMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rotateLeftMenuItem.setText("Rotate Left");
        rotateLeftMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateLeftMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(rotateLeftMenuItem);

        rotateRightMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        rotateRightMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rotateRightMenuItem.setText("Rotate Right");
        rotateRightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateRightMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(rotateRightMenuItem);

        rgbValuesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        rgbValuesMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rgbValuesMenuItem.setText("RGB Values");
        rgbValuesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgbValuesMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(rgbValuesMenuItem);

        zoomImageMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.CTRL_MASK));
        zoomImageMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        zoomImageMenuItem.setText("Zoom Image");
        zoomImageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomImageMenuItemActionPerformed(evt);
            }
        });
        editMenuOption.add(zoomImageMenuItem);

        jMenuBar1.add(editMenuOption);

        aboutMenuOption.setText("About");
        aboutMenuOption.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        developerMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        developerMenuItem.setText("Developer");
        developerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developerMenuItemActionPerformed(evt);
            }
        });
        aboutMenuOption.add(developerMenuItem);

        helpMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        helpMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        helpMenuItem.setText("Help");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        aboutMenuOption.add(helpMenuItem);

        jMenuBar1.add(aboutMenuOption);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(cropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(rotateLeftButton)
                .addGap(30, 30, 30)
                .addComponent(rotateRightButton)
                .addGap(30, 30, 30)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(srcImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(editedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(humanDetectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blackWhiteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grayScaleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detectEdgeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rgbValueButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zoomImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(rotateRightButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(cropButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(rotateLeftButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(srcImagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(humanDetectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(blackWhiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(grayScaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(detectEdgeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rgbValueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(zoomImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // method to detect faces on the image
    private void doDetection() {
        FaceDetection fd = new FaceDetection();
        BufferedImage detectedImage;
        String str;
        
        fd.readImage();
        fd.detectFace();
        fd.writeImage();
        
        detectedImage = fd.getNewImg();
        //str = fd.getNoOfFaces() + " Human detected";
        int count = Integer.parseInt(fd.getNoOfFaces());
        str = (count > 1)? count + " Humans detected" : count + " Human detected" ;
        
        icon2 = new ImageIcon(detectedImage.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
        jLabel2.setIcon(icon2);
        jTextField1.setText(str);
    }

    // method to crop the image
    private void doCrop()
    {
        Crop cr = new Crop();
        BufferedImage croppedImage;

        cr.readImage();
        cr.crop();
        croppedImage = cr.getCroppedImg();
        icon2 = new ImageIcon(croppedImage.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
        jLabel2.setIcon(icon2);
    }

    // method to rotate the image left
    private void doRotateLeft()
    {

        RotateLeft rl = new RotateLeft();
        BufferedImage rotatedImg;

        if(jLabel2.getIcon() == null)
            rl.readImageFromLabel1();
        else
            rl.readImageFromLabel2();
        rl.rotate();
        rl.writeImage();
        rotatedImg = rl.getNewImg();
        icon2 = new ImageIcon(rotatedImg.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
        jLabel2.setIcon(icon2);
    }

    // method to rotate the image right
    private void doRotateRight()
    {
        RotateRight rr = new RotateRight();
        BufferedImage rotatedImg;

        if(jLabel2.getIcon() == null)
            rr.readImageFromLabel1();
        else
            rr.readImageFromLabel2();
        rr.rotate();
        rr.writeImage();
        rotatedImg = rr.getNewImg();
        icon2 = new ImageIcon(rotatedImg.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
        jLabel2.setIcon(icon2);

    }

    // method to make the image black white
    private void doBlackWhite()
    {
        BlackWhite bw = new BlackWhite();
        BufferedImage bwImage;

        bw.readImage();
        bw.writeImage();
        bwImage = bw.getBwImg();
        icon2 = new ImageIcon(bwImage.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
        jLabel2.setIcon(icon2);
    }

    // method to make the image grayscale
    private void doGrayScale() throws IOException
    {
        Grayscale gs;
        BufferedImage gsImage;

        gs = new Grayscale();
        gs.readImage();
        gs.writeImage();
        gsImage = gs.getNewImg();
        icon2 = new ImageIcon(gsImage.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
        jLabel2.setIcon(icon2);
    }

    // method to detect the edges of the image
    private void doEdgeDetection()
    {
        EdgeDetection ed;
        BufferedImage edImage;

        ed = new EdgeDetection();
        ed.readImage();
        ed.writeImage();
        edImage = ed.getNewImg();
        icon2 = new ImageIcon(edImage.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
        jLabel2.setIcon(icon2);
    }

    // method to find RGB values of the image
    private void findRGBvalues()
    {
        RGBValues rgbv = new RGBValues();
        String str;

        rgbv.readImage();
        rgbv.findRGB();
        str = rgbv.getStr();
        jTextArea1.setText(str);
    }

    // method to zoom the image
    private void performZoom()
    {
        ZoomPerform zp = new ZoomPerform();
        zp.setBounds(100, 50, 800, 600);
    }

    // method to save the image
    private void saveImage()
    {
        BufferedImage svImg = new BufferedImage(icon2.getIconWidth(), icon2.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = svImg.createGraphics();
        icon2.paintIcon(null, g, 0, 0);
        try{
            ImageIO.write( svImg, "jpg", new File("Saved Image.jpg"));
            JOptionPane.showMessageDialog(this, "Image has been saved successfully");
        }
        catch(IOException e)
        {

        }
    }

    // method to read the image
    private void renameImage()
    {
        int res = fc.showSaveDialog(this);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            String fileName = fc.getSelectedFile().toString();
            
            String ftype = fileName.substring(fileName.lastIndexOf('.')+1);

            BufferedImage saveImg = new BufferedImage(icon2.getIconWidth(), icon2.getIconHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics g = saveImg.createGraphics();
            icon2.paintIcon(null, g, 0, 0);
            try{
                ImageIO.write( saveImg, ftype, new File(fileName));
                JOptionPane.showMessageDialog(this, "Image has been saved successfully");
            }
            catch(IOException e)
            {

            }
        }
    }

    
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images files", "jpg", "png");
        fc.setFileFilter(filter);
        int res = fc.showOpenDialog(this);

        if(res == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                f = fc.getSelectedFile();  
                openImg = ImageIO.read(f);
                icon1 = new ImageIcon(openImg.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH));
                jLabel1.setIcon(icon1);
            }
            catch(IOException ex)
            {

            }
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed

        if(jLabel1.getIcon() == null)
        {
            JOptionPane.showMessageDialog(this, "Open an Image First");
        }
        else if(jLabel2.getIcon() == null)
        {
            JOptionPane.showMessageDialog(this, "Nothing has changed");
        }
        else
            saveImage();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void grayScaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayScaleButtonActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            try {
                doGrayScale();
            }
            catch (IOException ex)
            {
            Logger.getLogger(HumanDetection.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_grayScaleButtonActionPerformed

    private void zoomImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomImageButtonActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            performZoom();
    }//GEN-LAST:event_zoomImageButtonActionPerformed

    private void rgbValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgbValueButtonActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            findRGBvalues();

    }//GEN-LAST:event_rgbValueButtonActionPerformed

    private void blackWhiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackWhiteButtonActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doBlackWhite();

    }//GEN-LAST:event_blackWhiteButtonActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void cropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropButtonActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doCrop();

    }//GEN-LAST:event_cropButtonActionPerformed

    private void rotateLeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateLeftButtonActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doRotateLeft();

    }//GEN-LAST:event_rotateLeftButtonActionPerformed

    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuItemActionPerformed

        jLabel1.setIcon(null);
        jLabel2.setIcon(null);
        jTextField1.setText(null);
        jTextArea1.setText(null);
        openImg = null;

    }//GEN-LAST:event_closeMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed

        if(jLabel1.getIcon() == null)
        {
            JOptionPane.showMessageDialog(this, "Open an Image First");
        }
        else if(jLabel2.getIcon() == null)
        {
            JOptionPane.showMessageDialog(this, "Nothing has changed");
        }
        else
            renameImage();

    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void rotateRightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateRightButtonActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doRotateRight();

    }//GEN-LAST:event_rotateRightButtonActionPerformed

    private void detectEdgeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detectEdgeButtonActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doEdgeDetection();

    }//GEN-LAST:event_detectEdgeButtonActionPerformed

    private void zoomImageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomImageMenuItemActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            performZoom();
    }//GEN-LAST:event_zoomImageMenuItemActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed

        JOptionPane.showMessageDialog(this, "Are you kidding?\nThis application is too simple.\nIf you can't operate it you shouldn't touch the computer :p");
    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

        jLabel2.setIcon(null);
        jTextField1.setText(null);
        jTextArea1.setText(null);

    }//GEN-LAST:event_refreshButtonActionPerformed

    private void blackWhiteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackWhiteMenuItemActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doBlackWhite();
    }//GEN-LAST:event_blackWhiteMenuItemActionPerformed

    private void grayScaleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayScaleMenuItemActionPerformed

         if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            try {
                doGrayScale();
            }
            catch (IOException ex)
            {
             Logger.getLogger(HumanDetection.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_grayScaleMenuItemActionPerformed

    private void detectEdgeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detectEdgeMenuItemActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doEdgeDetection();
    }//GEN-LAST:event_detectEdgeMenuItemActionPerformed

    private void rotateLeftMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateLeftMenuItemActionPerformed

         if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doRotateLeft();
    }//GEN-LAST:event_rotateLeftMenuItemActionPerformed

    private void rotateRightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateRightMenuItemActionPerformed

         if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doRotateRight();
    }//GEN-LAST:event_rotateRightMenuItemActionPerformed

    private void rgbValuesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgbValuesMenuItemActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            findRGBvalues();
    }//GEN-LAST:event_rgbValuesMenuItemActionPerformed

    private void developerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developerMenuItemActionPerformed
        JOptionPane.showMessageDialog(this, "This software was developed by some brilliant students of NUB");
        /*String st =  "<html>"
                    +"<p align=left>Author: Mainul Hossain"
                    +"<p align=center>mainul.hossain94@gmail.com</p></html>";

        JOptionPane.showMessageDialog(this, st, "Image Editor", JOptionPane.INFORMATION_MESSAGE);*/
    }//GEN-LAST:event_developerMenuItemActionPerformed

    private void cropMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropMenuItemActionPerformed

        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doCrop();
    }//GEN-LAST:event_cropMenuItemActionPerformed

    private void humanDetectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanDetectButtonActionPerformed
  
        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doDetection();
        
    }//GEN-LAST:event_humanDetectButtonActionPerformed

    private void detectHumanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detectHumanMenuItemActionPerformed
       
        if(jLabel1.getIcon() == null)
            JOptionPane.showMessageDialog(this, "Image not found");
        else
            doDetection();
    }//GEN-LAST:event_detectHumanMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HumanDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HumanDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HumanDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HumanDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */

        java.awt.EventQueue.invokeLater(() -> {
            new HumanDetection().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenuOption;
    private javax.swing.JButton blackWhiteButton;
    private javax.swing.JMenuItem blackWhiteMenuItem;
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JButton cropButton;
    private javax.swing.JMenuItem cropMenuItem;
    private javax.swing.JButton detectEdgeButton;
    private javax.swing.JMenuItem detectEdgeMenuItem;
    private javax.swing.JMenuItem detectHumanMenuItem;
    private javax.swing.JMenuItem developerMenuItem;
    private javax.swing.JMenu editMenuOption;
    private javax.swing.JPanel editedImagePanel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenuOption;
    private javax.swing.JButton grayScaleButton;
    private javax.swing.JMenuItem grayScaleMenuItem;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JButton humanDetectButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton rgbValueButton;
    private javax.swing.JMenuItem rgbValuesMenuItem;
    private javax.swing.JButton rotateLeftButton;
    private javax.swing.JMenuItem rotateLeftMenuItem;
    private javax.swing.JButton rotateRightButton;
    private javax.swing.JMenuItem rotateRightMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JPanel srcImagePanel;
    private javax.swing.JButton zoomImageButton;
    private javax.swing.JMenuItem zoomImageMenuItem;
    // End of variables declaration//GEN-END:variables

}
