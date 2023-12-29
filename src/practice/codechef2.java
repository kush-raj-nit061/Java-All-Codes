package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class codechef2 {
}

 class FileExplorer {
    private JFrame frame;
    private JPanel panel;
    private JList<String> fileList;
    private JButton backButton;
    private JButton openButton;
    private JButton copyButton;
    private JButton moveButton;
    private JButton deleteButton;
    private String currentPath;

    public static void main(String[] args) {
        FileExplorer explorer = new FileExplorer();
        explorer.init();
    }

    public void init() {
        frame = new JFrame("File Explorer");
        panel = new JPanel(new BorderLayout());
        fileList = new JList<>();
        backButton = new JButton("Back");
        openButton = new JButton("Open");
        copyButton = new JButton("Copy");
        moveButton = new JButton("Move");
        deleteButton = new JButton("Delete");
        currentPath = System.getProperty("user.home");

        // Set up the GUI
        fileList.setModel(new DefaultListModel<String>());
        updateFileList(currentPath);
        panel.add(new JScrollPane(fileList), BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(backButton);
        buttonPanel.add(openButton);
        buttonPanel.add(copyButton);
        buttonPanel.add(moveButton);
        buttonPanel.add(deleteButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setVisible(true);

        // Add event listeners to the buttons
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentPath = new File(currentPath).getParent();
                updateFileList(currentPath);
            }
        });
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fileName = fileList.getSelectedValue();
                if (fileName != null) {
                    File file = new File(currentPath + File.separator + fileName);
                    if (file.isDirectory()) {
                        currentPath = file.getAbsolutePath();
                        updateFileList(currentPath);
                    } else {
                        // Open the file
                    }
                }
            }
        });
        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Copy the selected file or folder
            }
        });
        moveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Move the selected file or folder
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Delete the selected file or folder
            }
        });
    }

    private void updateFileList(String path) {
        DefaultListModel<String> model = (DefaultListModel<String>) fileList.getModel();
        model.clear();
        currentPath = path;
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                model.addElement(file.getName());
            }
        }
    }


    private void copyFile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    private void copyDirectory(File source, File dest) throws IOException {
        if (!dest.exists()) {
            dest.mkdir();
        }
        File[] files = source.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                copyDirectory(file, new File(dest, file.getName()));
            } else {
                copyFile(file, new File(dest, file.getName()));
            }
        }
    }

    private void moveFile(File source, File dest) throws IOException {
        copyFile(source, dest);
        source.delete();
    }

    private void moveDirectory(File source, File dest) throws IOException {
        copyDirectory(source, dest);
        deleteDirectory(source);
    }

    private void deleteFile(File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectory(file);
        } else {
            file.delete();
        }
    }

    private void deleteDirectory(File dir) throws IOException {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                deleteFile(file);
            }
        }
        dir.delete();
    }
}




