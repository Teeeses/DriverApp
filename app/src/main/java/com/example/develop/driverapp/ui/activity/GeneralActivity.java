package com.example.develop.driverapp.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageButton;

import com.example.develop.driverapp.R;
import com.example.develop.driverapp.ui.fragment.CameraFragment;
import com.example.develop.driverapp.ui.fragment.ChangeFragment;
import com.example.develop.driverapp.ui.fragment.DispatcherFragment;
import com.example.develop.driverapp.ui.fragment.IntercomFragment;
import com.example.develop.driverapp.ui.fragment.SosFragment;
import com.example.develop.driverapp.ui.fragment.SummaryFragment;

/**
 * Created by develop on 02.06.2016.
 */
public class GeneralActivity extends FragmentActivity implements View.OnClickListener{

    //Right navigation
    ImageButton summaryButton;
    ImageButton changeButton;
    ImageButton intercomButton;
    ImageButton dispatcherButton;
    ImageButton cameraButton;

    //Left navigation
    ImageButton topButton;
    ImageButton centerButton;
    ImageButton downButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        createLeftNavigationButton();
        createRightNavigationButton();

        SummaryFragment summaryFragment = new SummaryFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, summaryFragment).commit();
        setBackgroundButton(summaryButton);
    }

    private void createLeftNavigationButton() {
        topButton = (ImageButton) findViewById(R.id.topButtonLeftNavigation);
        centerButton = (ImageButton) findViewById(R.id.centerButtonLeftNavigation);
        downButton = (ImageButton) findViewById(R.id.downButtonLeftNavigation);

        topButton.setOnClickListener(this);
        centerButton.setOnClickListener(this);
        downButton.setOnClickListener(this);
    }

    private void createRightNavigationButton() {
        summaryButton = (ImageButton) findViewById(R.id.summaryButton);
        changeButton = (ImageButton) findViewById(R.id.changeButton);
        intercomButton = (ImageButton) findViewById(R.id.intercomButton);
        dispatcherButton = (ImageButton) findViewById(R.id.dispatcherButton);
        cameraButton = (ImageButton) findViewById(R.id.cameraButton);

        summaryButton.setOnClickListener(this);
        changeButton.setOnClickListener(this);
        intercomButton.setOnClickListener(this);
        dispatcherButton.setOnClickListener(this);
        cameraButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.summaryButton:
                setAllButtonBackground();
                setBackgroundButton(summaryButton);
                transaction.replace(R.id.fragmentContainer,  new SummaryFragment());
                transaction.commit();
                break;
            case R.id.changeButton:
                setAllButtonBackground();
                setBackgroundButton(changeButton);
                transaction.replace(R.id.fragmentContainer, new ChangeFragment());
                transaction.commit();
                break;
            case R.id.intercomButton:
                setAllButtonBackground();
                setBackgroundButton(intercomButton);
                transaction.replace(R.id.fragmentContainer, new IntercomFragment());
                transaction.commit();
                break;
            case R.id.dispatcherButton:
                setAllButtonBackground();
                setBackgroundButton(dispatcherButton);
                transaction.replace(R.id.fragmentContainer, new DispatcherFragment());
                transaction.commit();
                break;
            case R.id.cameraButton:
                setAllButtonBackground();
                setBackgroundButton(cameraButton);
                transaction.replace(R.id.fragmentContainer, new CameraFragment());
                transaction.commit();
                break;

            case R.id.topButtonLeftNavigation:
                setAllButtonBackground();
                break;
            case R.id.centerButtonLeftNavigation:
                setAllButtonBackground();
                transaction.replace(R.id.fragmentContainer, new SosFragment());
                transaction.commit();
                break;
            case R.id.downButtonLeftNavigation:
                setAllButtonBackground();
                break;

            default:
                break;

        }

    }


    private void setAllButtonBackground() {
        summaryButton.setBackgroundColor(getResources().getColor(R.color.mainColor));
        changeButton.setBackgroundColor(getResources().getColor(R.color.mainColor));
        intercomButton.setBackgroundColor(getResources().getColor(R.color.mainColor));
        dispatcherButton.setBackgroundColor(getResources().getColor(R.color.mainColor));
        cameraButton.setBackgroundColor(getResources().getColor(R.color.mainColor));
    }

    private void setBackgroundButton(ImageButton button) {
        button.setBackgroundColor(getResources().getColor(R.color.clickedButton));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
