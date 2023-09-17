package com.katalon_demo_cura.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class EnterData {
    private static ArrayList<Map<String, String>> data= new ArrayList<>();
    public static ArrayList<Map<String, String>> extractTo() {
        try {
            data = DataExcel.leerDatosDeHojaDeExcel("src/main/resources/dataExcel/UserData.xlsx", "UserInformation");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
