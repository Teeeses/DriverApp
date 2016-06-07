package com.example.develop.driverapp.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.develop.driverapp.R;

/**
 * Created by develop on 07.06.2016.
 */
public class ChangeFragment extends Fragment{

    private TextView informationChange;
    private TextView driver;
    private TextView bus;
    private TextView busNumber;
    private TextView conductor;
    private TextView route;
    private TextView plan;
    private TextView executionPlan;
    private TextView soldTrips;
    private TextView timeEnd;
    private TextView endChange;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_change, container, false);

        informationChange = (TextView) view.findViewById(R.id.informationChange);
        driver = (TextView) view.findViewById(R.id.driver);
        bus = (TextView) view.findViewById(R.id.bus);
        busNumber = (TextView) view.findViewById(R.id.numberBus);
        conductor = (TextView) view.findViewById(R.id.conductor);
        route = (TextView) view.findViewById(R.id.route);
        plan = (TextView) view.findViewById(R.id.plan);
        executionPlan = (TextView) view.findViewById(R.id.executionPlan);
        soldTrips = (TextView) view.findViewById(R.id.soldTrips);
        timeEnd = (TextView) view.findViewById(R.id.timeEnd);
        endChange = (TextView) view.findViewById(R.id.endChange);

        informationChange.setText("Васильевское ПАТП-3");
        driver.setText("Смирнов С.И.");
        bus.setText("ЛИАЗ-4292");
        busNumber.setText("E 345 T0 90 RUS");
        conductor.setText("Константинопольская И. В.");
        route.setText("Ярославль - Москва");
        plan.setText("40 000 РУБ");
        executionPlan.setText("23 345 РУБ (54%)");
        soldTrips.setText("43");
        timeEnd.setText("22:43");
        endChange.setText("2 часа 34 минуты");

        return view;
    }
}
