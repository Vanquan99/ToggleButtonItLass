package com.vanquan.togglebuttonitlass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ToggleButton tgThongMinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgThongMinh=findViewById(R.id.tgbutton);
        tgThongMinh.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

//        switch (buttonView.getId()){
//            case R.id.tgbutton:
//            ;
//            break;
//        }

        if(isChecked){
            Toast.makeText(this, "Ban da bat che do thong minh", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Ban da tat che do thong minh", Toast.LENGTH_SHORT).show();
        }
    }
}