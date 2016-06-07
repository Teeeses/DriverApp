package com.example.develop.driverapp.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.develop.driverapp.R;

/**
 * Created by develop on 02.06.2016.
 */
public class SummaryFragment extends Fragment {

    private TextView passengersInCabin;
    private TextView paidPlaces;
    private TextView timeText;
    private TextView lostTime;
    private TextView nextStop;
    private TextView numberPeople;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_summary, container, false);

        passengersInCabin = (TextView) view.findViewById(R.id.passengersInCabin);
        paidPlaces = (TextView) view.findViewById(R.id.paidPlaces);
        nextStop = (TextView) view.findViewById(R.id.nextStop);
        numberPeople = (TextView) view.findViewById(R.id.numberPeople);
        timeText = (TextView) view.findViewById(R.id.timeText);
        lostTime = (TextView) view.findViewById(R.id.lostTime);

        passengersInCabin.setText("43");
        paidPlaces.setText("41");
        nextStop.setText("Центральный проезд \nХорошевского...");
        numberPeople.setText("7 человек \n+малоподвижные (2)");
        timeText.setText("22:45");
        lostTime.setText("Через 9 минут");
        return view;
    }

}
