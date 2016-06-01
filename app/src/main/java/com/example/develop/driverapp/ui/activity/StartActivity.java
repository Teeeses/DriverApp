package com.example.develop.driverapp.ui.activity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.develop.driverapp.R;
import com.example.develop.driverapp.nfs.NfcManager;
import com.github.pinball83.maskededittext.MaskedEditText;

public class StartActivity extends Activity {

    private NfcManager nfcManager;
    private MaskedEditText textPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        nfcManager = new NfcManager(this);

        //textPhone = (MaskedEditText) findViewById(R.id.maskedEditText);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        if (intent.getAction().equals(NfcAdapter.ACTION_TAG_DISCOVERED)) {
            String tag = nfcManager.ByteArrayToHexString(intent.getByteArrayExtra(NfcAdapter.EXTRA_ID));
            showToast(tag);
        }
    }

    private void showToast(String t) {
        Toast toast = Toast.makeText(this, ("UID: " + t), Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0);
            IntentFilter filter = new IntentFilter();
            filter.addAction(NfcAdapter.ACTION_TAG_DISCOVERED);
            filter.addAction(NfcAdapter.ACTION_NDEF_DISCOVERED);
            filter.addAction(NfcAdapter.ACTION_TECH_DISCOVERED);
            NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(this);
            nfcAdapter.enableForegroundDispatch(this, pendingIntent, new IntentFilter[]{filter}, nfcManager.techList);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        try {
            NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(this);
            nfcAdapter.disableForegroundDispatch(this);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
