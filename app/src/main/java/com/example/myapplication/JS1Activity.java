package com.example.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class JS1Activity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_js1);




            }
    private ImageButton imageButton02, imageButton03;
            // 方法：初始化View
            private void initView() {
            imageButton02 = (ImageButton) findViewById(R.id.imageButton02);
            imageButton03 = (ImageButton) findViewById(R.id.imageButton03);

                //按钮绑定点击事件的监听器
            imageButton02.setOnClickListener(this);
            imageButton03.setOnClickListener(this);
            }

            //方法：按钮的单击事件
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageButton02:
                        Toast.makeText(JS1Activity.this, "btn1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.imageButton03:
                        Toast.makeText(JS1Activity.this, "btn2", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }

            }
}
