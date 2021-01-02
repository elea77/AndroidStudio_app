package fr.vivaneo.googlemap.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preference {
    private static final String PREFERENCE_CITY = "city";

    // getPreference()
    private static SharedPreferences getPreference(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    /*
    // setCity()
    public static void setCity(Context context, String city) {
        getPreference(context)
                .edit()
                .putString(PREFERENCE_CITY, city)
                .apply(); // enregistrement des informations
    }

    // getCity()
    public static String getCity(Context context) {
        return getPreference(context).getString(PREFERENCE_CITY, null); // ""
    }
    */

}
