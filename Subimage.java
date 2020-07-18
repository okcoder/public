import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.imageio.ImageIO;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.image.RasterFormatException;

public class Subimage {
	public static void main( String[] args ) throws Exception {

        Files.list(Paths.get("./temp"))
        .filter(path -> !path.getFileName().toString().startsWith("."))
        .forEach(path->{
            System.out.println(path);
            try{
		    // 変数の宣言
		    int x=0, y=0;	// 切り出す左上のﾋﾟｸｾﾙ座標
		    int w=0, h=0;	// 切り出す画像サイズ
            
            BufferedImage img = ImageIO.read(path.toFile());
            switch(img.getRGB(30, 600)){
                case -2236963://221,221,221 new Color(img.getRGB(30, 600))
                case -4210482:
                case -3616311://200,201,209
                    x=110;
                    y=466;
                    w= 970;
                    h=1530;
                break;
                case -7434058://142,144,182 new Color(img.getRGB(30, 600))
                case -6374238://158,162,188
                    x=40;
                    y=466;
                    w= 970;
                    h=1530;
                break;
                /*default:
                System.out.println(img.getRGB(30, 600));
                System.out.println(new Color(img.getRGB(30, 600)).getRed());
                System.out.println(new Color(img.getRGB(30, 600)).getBlue());
                System.out.println(new Color(img.getRGB(30, 600)).getGreen());
                return;*/
            }
            //if(true) return;

            // 切り出し処理
            BufferedImage subimg = null;	// 切り出し画像格納クラス
            try {
                //subimg = img.getSubimage( x, y, w, h );
                subimg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
                subimg.createGraphics().drawImage(img, -x, -y, Color.WHITE, null);
            }
            catch ( RasterFormatException re ) {
                System.out.println( "指定した範囲が画像の範囲外です" );
                return;
            }

            ImageIO.write( subimg, "jpeg", Paths.get("./images", path.getFileName().toString().replace(".PNG", ".JPG")).toFile() );
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        });
        System.out.println("git status | grep images | awk -F\"/\" '{print $2}' | xargs -I{} echo '![Alternate text]('{}')'");
    }
}
