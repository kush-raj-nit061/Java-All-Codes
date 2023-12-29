package practice;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class codeChef1 {
}

 class SimpleImageViewer extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel panelImage;
    private JScrollPane scrollPane;
    private JLabel labelImage;
    private JButton buttonOpen;
    private ArrayList<File> imageFiles;
    private int currentImageIndex;

    public SimpleImageViewer() {
        super("Simple Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        panelImage = new JPanel();
        panelImage.setPreferredSize(new Dimension(800, 600));
        panelImage.setLayout(null);
        panelImage.setBorder(BorderFactory.createEtchedBorder());
        scrollPane = new JScrollPane(panelImage);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane, BorderLayout.CENTER);

        labelImage = new JLabel();
        panelImage.add(labelImage);

        buttonOpen = new JButton("Open");
        buttonOpen.addActionListener(this);
        add(buttonOpen, BorderLayout.NORTH);

        imageFiles = new ArrayList<File>();
        currentImageIndex = -1;
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == buttonOpen) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File[] selectedFiles = fileChooser.getSelectedFiles();
                for (File file : selectedFiles) {
                    if (isImageFile(file)) {
                        imageFiles.add(file);
                    }
                }
                if (imageFiles.size() > 0) {
                    currentImageIndex = 0;
                    displayImage(imageFiles.get(currentImageIndex));
                }
            }
        }
    }

    private boolean isImageFile(File file) {
        String name = file.getName().toLowerCase();
        return name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png") || name.endsWith(".gif") || name.endsWith(".bmp");
    }

    private void displayImage(File file) {
        try {
            BufferedImage image = ImageIO.read(file);
            int width = panelImage.getWidth();
            int height = panelImage.getHeight();
            double imageAspectRatio = (double) image.getWidth() / image.getHeight();
            double panelAspectRatio = (double) width / height;
            int x = 0, y = 0, w = 0, h = 0;
            if (imageAspectRatio > panelAspectRatio) {
                h = height;
                w = (int) (h * imageAspectRatio);
                x = (width - w) / 2;
            } else {
                w = width;
                h = (int) (w / imageAspectRatio);
                y = (height - h) / 2;
            }
            Image scaledImage = image.getScaledInstance(w, h, Image.SCALE_DEFAULT);
            BufferedImage bufferedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics = bufferedImage.createGraphics();
            graphics.drawImage(scaledImage, 0, 0, null);
            labelImage.setIcon(new ImageIcon(bufferedImage));
            labelImage.setBounds(x, y, w, h);
            panelImage.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
            panelImage.revalidate();
            panelImage.repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SimpleImageViewer viewer = new SimpleImageViewer();
        viewer.setVisible(true);
    }
}
