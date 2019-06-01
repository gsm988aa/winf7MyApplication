package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



    public class Main2Activity extends Activity {
        /** Called when the activity is first created. */
        TextView textview;
        ImageButton imgbtn1;
        ImageButton imgbtn2;
        ImageButton imgbtn3;
        ImageButton imgbtn4;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            textview=(TextView)findViewById(R.id.textview);
            //分别取得4个ImageButton对象
            imgbtn1=(ImageButton)findViewById(R.id.imagebutton1);
            imgbtn2=(ImageButton)findViewById(R.id.imagebutton2);
            imgbtn3=(ImageButton)findViewById(R.id.imagebutton3);
            imgbtn4=(ImageButton)findViewById(R.id.imagebutton4);

            //分别为ImageButton设置图标
            //imgbtn1已经在main.xml布局中设置了图标，所以就不在这里设置了（设置图标即可在程序中设置，也可在布局文件中设置）
            imgbtn2.setImageDrawable(getResources().getDrawable(R.drawable.i2));//在程序中设置图标
            imgbtn3.setImageDrawable(getResources().getDrawable(R.drawable.i3));
            imgbtn4.setImageDrawable(getResources().getDrawable(android.R.drawable.sym_call_incoming));//设置系统图标

            //下面为各个按钮设置事件监听
            imgbtn1.setOnClickListener(new Button.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Dialog dialog=new AlertDialog.Builder(Main2Activity.this)
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

            imgbtn2.setOnClickListener(new Button.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Dialog dialog=new AlertDialog.Builder(Main2Activity.this)
                            .setTitle("提示")
                            .setMessage("我是ImageButton2，我要使用ImageButton3的图标")
                            .setPositiveButton("确定",new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // TODO Auto-generated method stub
                                    imgbtn2.setImageDrawable(getResources().getDrawable(R.drawable.i2));
                                }
                            }).create();
                    dialog.show();
                }

            });

            imgbtn3.setOnClickListener(new Button.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Dialog dialog=new AlertDialog.Builder(Main2Activity.this)
                            .setTitle("提示")
                            .setMessage("我是ImageButton3，我想使用系统打电话的图标")
                            .setPositiveButton("确定",new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // TODO Auto-generated method stub
                                    imgbtn3.setImageDrawable(getResources().getDrawable(android.R.drawable.sym_action_call));
                                }
                            }).create();
                    dialog.show();
                }

            });

            imgbtn4.setOnClickListener(new Button.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Dialog dialog=new AlertDialog.Builder(Main2Activity.this)
                            .setTitle("提示")
                            .setMessage("我是使用的系统图标")
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
        }
    }



