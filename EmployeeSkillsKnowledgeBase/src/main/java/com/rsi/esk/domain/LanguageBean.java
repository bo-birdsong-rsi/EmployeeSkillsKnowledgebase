package com.rsi.esk.domain;

import java.io.Serializable;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;


public class LanguageBean implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final Locale ESPANOL = new Locale("es", "ES");
    private static Map<String, Object> countries;

    static {
        countries = new LinkedHashMap<String, Object>();
        countries.put("English", Locale.ENGLISH);
        countries.put("Espanol", ESPANOL);
    }

    private String localeCode;

    public Map<String, Object> getCountriesInMap() {
        return countries;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

//    //value change event listener
//    public void countryLocaleCodeChanged(ValueChangeEvent e) {
//        String newLocaleValue = e.getNewValue().toString();
//
//        //loop country map to compare the locale code
//        for (Map.Entry<String, Object> entry : countries.entrySet()) {
//            if (entry.getValue().toString().equals(newLocaleValue)) {
//                FacesContext.getCurrentInstance().getViewRoot()
//                            .setLocale((Locale) entry.getValue());
//            }
//        }
//    }
}
