package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
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

public class JS1Activity extends Activity {
    ImageButton imageButton02;
    ImageButton imageButton03;
    ImageButton imageButton04;
    ImageButton imageButton05;
    ImageButton imageButton06;
    ImageButton imageButton07;
    ImageButton imageButton08;
    ImageButton imageButton09;


  //  private ImageButton imageButton02, imageButton03;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_js1);

            // 方法：初始化View

            imageButton02 = (ImageButton) findViewById(R.id.imageButton02);
            imageButton03 = (ImageButton) findViewById(R.id.imageButton03);
            imageButton04 = (ImageButton) findViewById(R.id.imageButton04);
            imageButton05 = (ImageButton) findViewById(R.id.imageButton05);
            imageButton06 = (ImageButton) findViewById(R.id.imageButton06);
            imageButton07 = (ImageButton) findViewById(R.id.imageButton07);
            imageButton08 = (ImageButton) findViewById(R.id.imageButton08);
            imageButton09 = (ImageButton) findViewById(R.id.imageButton09);

        imageButton02.setImageDrawable(getResources().getDrawable(R.drawable.i2));//在程序中设置图标
        imageButton03.setImageDrawable(getResources().getDrawable(R.drawable.i3));

        //下面为各个按钮设置事件监听
        imageButton02.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Dialog dialog=new AlertDialog.Builder(JS1Activity.this)
                        .setTitle("提示")
                        .setMessage("我是ImageButton1")
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // TODO Auto-generated method stub
                                //相应的处理操作
                            }
                        }).create();
                dialog.show();
            }

        });

        imageButton03.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Dialog dialog=new AlertDialog.Builder(JS1Activity.this)
                        .setTitle("提示")
                        .setMessage("我是ImageButton1")
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // TODO Auto-generated method stub
                                //相应的处理操作
                            }
                        }).create();
                dialog.show();
            }

        });


        imageButton04.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Dialog dialog=new AlertDialog.Builder(JS1Activity.this)
                        .setTitle("提示")
                        .setMessage("我是ImageButton1")
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // TODO Auto-generated method stub
                                //相应的处理操作
                            }
                        }).create();
                dialog.show();
            }

        });









        //按钮绑定点击事件的监听器




//            //方法：按钮的单击事件
//            @Override
//
//
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.imageButton02:
//                         //Toast.makeText(JS1Activity.this, "btn1", Toast.LENGTH_SHORT).show();
//
//
//
//                        break;
//                    case R.id.imageButton03:
//                        //Toast.makeText(JS1Activity.this, "btn2", Toast.LENGTH_SHORT).show();
//                        break;
//                    default:
//                        break;
//                }
//
//            }






    }


}
