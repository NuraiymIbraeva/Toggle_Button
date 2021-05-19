package com.nurayim.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout relativeLayout = findViewById(R.id.deltaRelative);
        ToggleButton toggle = findViewById(R.id.toggle_button);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    relativeLayout.setBackgroundColor(Color.parseColor("#FF03DAC5"));
                    Toast.makeText(MainActivity.this, "Toggle Button is on ", Toast.LENGTH_SHORT).show();
                }else {
                    relativeLayout.setBackgroundColor(Color.parseColor("white"));
                    Toast.makeText(MainActivity.this,"Toggle Button is off",Toast.LENGTH_SHORT).show();
                }

            }

        });






    }
}