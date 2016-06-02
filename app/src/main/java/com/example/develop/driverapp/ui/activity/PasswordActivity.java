package com.example.develop.driverapp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import com.example.develop.driverapp.R;
import com.github.pinball83.maskededittext.MaskedEditText;


/**
 * Created by develop on 02.06.2016.
 */
public class PasswordActivity extends Activity {

    private MaskedEditText textPassword;
    private int lengthPassword = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        textPassword = (MaskedEditText) findViewById(R.id.maskedEditTextPassword);
        textPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                    if((textPassword.getUnmaskedText().length() == lengthPassword)) {
                        Intent intent = new Intent(PasswordActivity.this, GeneralActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
                return false;
            }
        });
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
