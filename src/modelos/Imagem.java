package modelos;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagem{
    private static final Set extensoes = Set.of("png", "jpg");
    private ImageIcon imageIco;
    private String extensao = "png";
    private long length;

    public Imagem(File arquivo) {
        this.length = arquivo.length();
        String path = arquivo.getAbsolutePath();
        this.extensao = path.substring(path.lastIndexOf('.') + 1);
        this.imageIco = new ImageIcon(path);
    }

    public long getLength() {
        return length;
    }
    public Imagem(byte[] arquivo) {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(arquivo);
            BufferedImage bufferedImage = ImageIO.read(bais);
            if (bufferedImage == null) {
                System.err.println("Failed to read image from byte array. ImageIO.read() returned null.");
                return;
            }
            imageIco = new ImageIcon(bufferedImage);
        } catch (IOException e) {
             System.err.println("Error reading image from byte array: " + e.getMessage());
             return ;
        }
    }
    
    public byte[] getBinary(){
        
        try {
            Image image = imageIco.getImage();
            
            BufferedImage bufferedImage = new BufferedImage(
                    image.getWidth(null),
                    image.getHeight(null),
                    BufferedImage.TYPE_INT_RGB
            );
            bufferedImage.getGraphics().drawImage(image, 0, 0, null);
            
            byte[] byteImage;
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                ImageIO.write(bufferedImage, extensao, baos);
                baos.flush();
                byteImage = baos.toByteArray();
            } 
            
            return byteImage;
        } catch (IOException ex) {
            Logger.getLogger(Imagem.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    static public boolean imagemValida(String arquivo){
        String tipoArquivo = arquivo.substring(arquivo.lastIndexOf('.') + 1);
        return extensoes.contains(tipoArquivo);
    }

    public ImageIcon getImageIco() {
        return imageIco;
    }

    public void setImageIco(String path) {
        this.imageIco = new ImageIcon(path);
    }
    
    
    public ImageIcon fit(JLabel lbl){
        Image novaImagem = imageIco.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(novaImagem);
    }

    
}

/*
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtroImagens = new FileNameExtensionFilter("Imagens", "jpg", "png");
        fileChooser.setFileFilter(filtroImagens);
        int resposta = fileChooser.showOpenDialog(null);
        if (resposta == JFileChooser.APPROVE_OPTION) {
            arquivoCapa = new File(fileChooser.getSelectedFile().getAbsolutePath());
            tipoValido = Imagem.imagemValida(arquivoCapa.getName());
            if (tipoValido){
                lblcaminhoImagem.setText(arquivoCapa.getName());
                capa = new Imagem(arquivoCapa.getAbsolutePath());
                lblFoto.setIcon(capa.fit(lblFoto));
            }
            else{
                JOptionPane.showMessageDialog(null, "Arquivo Inválido", 
                "ERRO", JOptionPane.ERROR_MESSAGE);
            }*/
