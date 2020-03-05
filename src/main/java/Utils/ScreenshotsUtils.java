package Utils;

import BaseTest.BaseTest;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ScreenshotsUtils extends BaseTest {

    public static void teste(String testCase, String nomeArquivo) throws IOException {
        String path = "./evidencias/" + NAVEGADOR + "_" + horario + "/" + testCase;

        if (new File(path).mkdirs()){
        }

        Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(),"PNG",new File(path + "/" + nomeArquivo + ".jpg"));
    }

}
