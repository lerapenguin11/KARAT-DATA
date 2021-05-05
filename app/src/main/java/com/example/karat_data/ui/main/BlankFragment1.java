package com.example.karat_data.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.karat_data.R;

public class BlankFragment1 extends Fragment {

    ImageButton img_setting;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank1, container, false);
        img_setting = (ImageButton) view.findViewById(R.id.img_setting);
        img_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), com.example.karat_data.SettingDeviceActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}