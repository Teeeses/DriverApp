package com.example.develop.driverapp.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.develop.driverapp.R;

/**
 * Created by develop on 02.06.2016.
 */
public class LeftFragment extends Fragment {

    private ImageView wifiSignal;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_left, container, false);


        //wifiSignal.setImageIcon(android.R.drawable.);

        return view;
    }
}
