package com.example.develop.driverapp.ui.fragment;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.develop.driverapp.R;


/**
 * Created by develop on 08.06.2016.
 */
public class IntercomFragment extends Fragment {

    private MediaRecorder mediaRecorder;
    private MediaPlayer mediaPlayer;
    private String fileName;

    private Button speakButton;
    private Button redRingStopButton;
    private LinearLayout playStop;

    //record, play, write
    private String status = "record";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_intercom, container, false);

        playStop = (LinearLayout) view.findViewById(R.id.playStop);
        speakButton = (Button) view.findViewById(R.id.speakButton);
        redRingStopButton = (Button) view.findViewById(R.id.redRingStop);

        fileName = Environment.getExternalStorageDirectory() + "/record.3gpp";

        speakButton.setOnClickListener(speakButtonClick);
        redRingStopButton.setOnClickListener(redRingStopButtonClick);

        return view;
    }

    private View.OnClickListener speakButtonClick = new View.OnClickListener() {
        public void onClick(View v) {
            if(status.equals("record")) {
                //status = "write";
                speakButton.setText(getActivity().getResources().getString(R.string.playSound));
                speakButton.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.button_intercom_fragment_click_shape));
                playStop.setVisibility(View.VISIBLE);
                //recordStart();
            }
            /*if(status.equals("play")) {
                status = "record";
                playStart();
            }*/
        }
    };

    private View.OnClickListener redRingStopButtonClick = new View.OnClickListener() {
        public void onClick(View v) {
            //status = "play";
            //recordStop();
        }
    };

    /*private void recordStart() {
        try {
            releaseRecorder();
            File outFile = new File(fileName);
            if (outFile.exists()) {
                outFile.delete();
            }
            mediaRecorder = new MediaRecorder();
            mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            mediaRecorder.setOutputFile(fileName);
            mediaRecorder.prepare();
            mediaRecorder.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recordStop() {
        if (mediaRecorder != null) {
            mediaRecorder.stop();
        }
    }

    public void playStart() {
        try {
            releasePlayer();
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(fileName);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void releaseRecorder() {
        if (mediaRecorder != null) {
            mediaRecorder.release();
            mediaRecorder = null;
        }
    }

    private void releasePlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }*/
}
