package me.zeeroooo.materialfb.Fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import me.zeeroooo.materialfb.R;

public class NavigationMenuFragment extends PreferenceFragment {

    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.navigation_menu_settings);
    }

}