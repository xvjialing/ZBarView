package com.lytech.xjl.zbarview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zbarview.ZXingViewActivity;

public class MainActivity extends AppCompatActivity {
    private static final int REQUESTCODE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivityForResult(new Intent(this, ZXingViewActivity.class),REQUESTCODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case REQUESTCODE:
                if (resultCode==RESULT_OK){
                    String result = data.getStringExtra("result").toString();
                }
                break;
        }
    }
}
