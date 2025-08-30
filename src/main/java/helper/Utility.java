//package helper;
//
//import lombok.extern.slf4j.Slf4j;
//import objectmanager.FileReaderManager;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;
//
//import java.io.File;
//
//@Slf4j
//
//
//public class Utility {
//
//    public void getScreenshotMethod(WebDriver driver){
//    try{
//        TakesScreenshot screenshot=(TakesScreenshot) driver;
//        File source=screenshot.getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(source,new File("src/test/resources/Screenshot/ABC.jpg"));
//    }
//    catch (Exception e){
//        log.info("An exception occured while taking the screenshot" + e.getMessage());
//    }
//    }
//    public String getAbsolutePath(String fileType) {
//        String absolutePath =
//                FileReaderManager.getInstance().getConfigReader().getDemoFilePath(fileType);
//        absolutePath = new File(absolutePath).getAbsolutePath();
//        return absolutePath;
//    }
//}




