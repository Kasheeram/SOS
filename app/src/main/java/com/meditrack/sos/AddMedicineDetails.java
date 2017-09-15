package com.meditrack.sos;

import java.util.ArrayList;

/**
 * Created by apogee on 7/3/17.
 */

public class AddMedicineDetails {

    String name;
    String doseFrequency;
    String quantity;
    String numberDosePerDay;
    String time1;
    String time2;
    String numberPurchase;


    AddMedicineDetails(String name,String doseFrequency,String quantity,String numberDosePerDay,String time1,String time2,String numberPurchase){
        this.name = name;
        this.doseFrequency = doseFrequency;
        this.quantity = quantity;
        this.numberDosePerDay = numberDosePerDay;
        this.time1 = time1;
        this.time2 = time2;
        this.numberPurchase = numberPurchase;

    }


}
