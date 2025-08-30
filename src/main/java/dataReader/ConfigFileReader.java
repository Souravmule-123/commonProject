package dataReader;

import enums.DriverType;
import helper.EncryptDecrypt;
import org.openqa.selenium.InvalidArgumentException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Properties;

import static appdata.Constant.PROPERTY_FILE_PATH;

public class ConfigFileReader {

    private final Properties properties;


    public ConfigFileReader() throws FileNotFoundException {
    properties=new Properties();
        FileReader fileReader=new FileReader(PROPERTY_FILE_PATH);
        try (BufferedReader reader = new BufferedReader(fileReader)) {
            properties.load(reader);
        } catch (IOException e) {
        }
    }
    public long getImplicitlyWait(){
        String implicitWait= properties.getProperty("implicitWait");
        if (implicitWait!=null) return Long.parseLong(implicitWait);
        else
            throw new InvalidParameterException
                    ("implicitWait is not specified in config file");
    }
    public String getApplicationUrl(String applicationUrl){
        String url=properties.getProperty(applicationUrl);
        if(url!=null) return url;
        else throw new InvalidParameterException("url is not specified in config file");
    }
    public Boolean getWindowBrowserSize(){
    String windowSize=properties.getProperty("windowSize");
        if(windowSize!=null)
            return Boolean.valueOf(windowSize);
        return true;
    }
    public String getAmazonUserName(String user){
        String Amazonuser=properties.getProperty("Amazonuser");
        if(Amazonuser!=null) return Amazonuser;
        else throw new InvalidParameterException("username is not specified in config file");
    }
    public String getAmazonPwd(String pwd){
        String Amazonpwd=properties.getProperty("Amazonpwd");
        if(Amazonpwd!=null) return Amazonpwd;
        else throw new InvalidParameterException("username is not specified in config file");
    }

    public String getNaukariUserName(String user){
        String UsernameNaukari=properties.getProperty("UsernameNaukari");
        if(UsernameNaukari!=null) return UsernameNaukari;
        else throw new InvalidParameterException("username is not specified in config file");
    }
    public String getNaukariPassword(String user){
        String PwdNaukari=properties.getProperty("PwdNaukari");
        if(PwdNaukari!=null) return PwdNaukari;
        else throw new InvalidParameterException("username is not specified in config file");
    }

    public DriverType getBrowser(){
        String browserName = properties.getProperty("browser");
        if (browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if (browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else if (browserName.equalsIgnoreCase("none")) return DriverType.NONE;
        else if (browserName.equalsIgnoreCase("chromeheadless")) return DriverType.CHROMEHEADLESS;
        else if(browserName.equalsIgnoreCase("edge")) return DriverType.EDGE;
        else if(browserName.equalsIgnoreCase("chromeincognito")) return DriverType.CHROMEINCOGNITO;
        else throw new InvalidArgumentException("Browser Name is not matched : " + browserName);
    }
//    public String getPassword(String pwd) {
//        EncryptDecrypt encryptDecrypt=new EncryptDecrypt();
//        String password = encryptDecrypt.getDecodedString(properties.getProperty(pwd));
//        String password = properties.getProperty(pwd);
//        if (password != null) return password;
//        else
//            throw new InvalidParameterException(
//                    "Password not specified in the Configuration.properties file.");
//    }
    public String getDemoFilePath(String fileType) {
        String file = properties.getProperty(fileType);
        if (file != null) return file;
        else
            throw new InvalidParameterException(
                    "FileName is not specified in the Configuration.properties file.");
    }
    }


