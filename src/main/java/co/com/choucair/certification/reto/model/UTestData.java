package co.com.choucair.certification.reto.model;

import java.util.Objects;

public class UTestData {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strPassword;
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
    private String [] deviceData;
    private String strConfirmWelcome;


    public String[] getPersonalData() {
        return new String[]{strFirstName, strLastName,strEmail, strLanguage,strPassword};
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



    public String[] getDeviceData() {
        return new String[] {strComputerOperatingSystem,strVersion,strComputerLanguage,
                strMobilDevice,strDeviceModel,strDeviceOperatingSystem};
    }

    public void setDeviceData(String[] deviceData) {
        this.deviceData = deviceData;
    }



    public String strConfirmWelcome() {
        return strConfirmWelcome;
    }

    public void strConfirmWelcome(String strConfirmCheckPrivacy) {
        this.strConfirmWelcome = strConfirmCheckPrivacy;
    }
}
