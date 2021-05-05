package com.example.karat_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class SettingDeviceActivity extends AppCompatActivity {

    EditText port;
    EditText ip;
    RadioButton radioTCP, radioUSB;
    Spinner spinner_usb;
    Boolean mode = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_device);
        port = findViewById(R.id.edit_text_port);
        ip = findViewById(R.id.edit_text_ip);
        ip.setVisibility(View.GONE);
        port.setVisibility(View.GONE);
        radioTCP = (RadioButton) findViewById(R.id.tsp);
        radioUSB = (RadioButton) findViewById(R.id.usb);
        spinner_usb = findViewById(R.id.spinner_usb);
        spinner_usb.setVisibility(View.GONE);

    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.tsp:
                enableTCP();
                break;
            case R.id.usb:
                enableUSB();
                break;
        }
    }

    private void enableUSB() {
        radioTCP.setChecked(true);
        spinner_usb.setVisibility(View.VISIBLE);
        ip.setVisibility(View.GONE);
        port.setVisibility(View.GONE);
        radioTCP.setChecked(false);
        mode = false;
    }

    private void enableTCP() {
        radioUSB.setChecked(true);
        ip.setVisibility(View.VISIBLE);
        port.setVisibility(View.VISIBLE);
        spinner_usb.setVisibility(View.GONE);
        radioUSB.setChecked(false);
        mode = true;
    }
}