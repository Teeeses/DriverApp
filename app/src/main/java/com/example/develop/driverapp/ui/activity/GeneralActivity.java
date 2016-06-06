package com.example.develop.driverapp.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.develop.driverapp.R;

/**
 * Created by develop on 02.06.2016.
 */
public class GeneralActivity extends FragmentActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        createRightNavigationButton();

    }

    private void createRightNavigationButton() {
        ImageButton summaryButton = (ImageButton) findViewById(R.id.summaryButton);
        ImageButton changeButton = (ImageButton) findViewById(R.id.changeButton);
        ImageButton optionsButton = (ImageButton) findViewById(R.id.optionsButton);
        ImageButton dispatcherButton = (ImageButton) findViewById(R.id.dispatcherButton);
        ImageButton cameraButton = (ImageButton) findViewById(R.id.cameraButton);

        summaryButton.setOnClickListener(this);
        changeButton.setOnClickListener(this);
        optionsButton.setOnClickListener(this);
        dispatcherButton.setOnClickListener(this);
        cameraButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.summaryButton:
                break;
            case R.id.changeButton:
                break;
            case R.id.optionsButton:
                break;
            case R.id.dispatcherButton:
                break;
            case R.id.cameraButton:
                break;
            default:
                break;

        }

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
