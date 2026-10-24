import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;

/** Gera os ícones do app: tela de TV dourada sobre fundo escuro. Uso: java ferramentas/Icone.java */
public class Icone {
    public static void main(String[] a) throws Exception {
        for (int t : new int[]{192, 512}) {
            BufferedImage img = new BufferedImage(t, t, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = img.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setColor(new Color(0x0B0D12));
            g.fillRect(0, 0, t, t);
            float s = t / 192f;
            g.setColor(new Color(0xD9B26A));
            g.setStroke(new BasicStroke(9 * s, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.draw(new RoundRectangle2D.Float(44 * s, 56 * s, 104 * s, 70 * s, 16 * s, 16 * s));
            g.draw(new Line2D.Float(78 * s, 142 * s, 114 * s, 142 * s));
            Path2D play = new Path2D.Float();
            play.moveTo(86 * s, 76 * s);
            play.lineTo(114 * s, 91 * s);
            play.lineTo(86 * s, 106 * s);
            play.closePath();
            g.fill(play);
            g.dispose();
            ImageIO.write(img, "png", new File("icone-" + t + ".png"));
        }
    }
}
