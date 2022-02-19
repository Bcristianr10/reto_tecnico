package co.com.choucair.certification.reto.model;
public class UTestData {

    private String strFirstName;
    private String strLastName;
    private String strEmail;

    private String strLanguage;

    private String strCity;
    private String strPostalCode;
    private String strCountry;

    private String strComputerOperatingSystem;
    private String strVersion;
    private String strComputerLanguage;

    private String strMobilDevice;
    private String strDeviceModel;
    private String strDeviceOperatingSystem;

    private String [] personalData;
    private String [] personalLocation;
    private String [] computerData;
    private String [] mobileDeviceData;
    private String strPassword;
    private String strConfirmWelcome;



    public String[] getPersonalData() {
        return new String[]{strFirstName, strLastName,strEmail, strLanguage};
    }

    public void setPersonalData(String[] datosPersonales) {
        this.personalData = datosPersonales;
    }


    public String[] getPersonalLocation() {
        return new String[] {strCity,strPostalCode,strCountry};
    }

    public void setPersonalLocation(String[] personalLocation) {
        this.personalLocation = personalLocation;
    }

    public String[] getComputerData() {
        return new String[] {strComputerOperatingSystem,strVersion,strComputerLanguage};
    }

    public void setComputerData(String[] computerData) {
        this.computerData = computerData;
    }

    public String[] getMobileDeviceData() {
        return new String[] {strMobilDevice,strDeviceModel,strDeviceOperatingSystem};
    }

    public void setMobileDeviceData(String[] mobileDeviceData) {
        this.mobileDeviceData = mobileDeviceData;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String strConfirmWelcome() {
        return strConfirmWelcome;
    }

    public void strConfirmWelcome(String strConfirmCheckPrivacy) {
        this.strConfirmWelcome = strConfirmCheckPrivacy;
    }


}
