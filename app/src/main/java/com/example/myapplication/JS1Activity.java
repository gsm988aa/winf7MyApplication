package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JS1Activity extends Activity {
    ImageButton imageButton02;
    ImageButton imageButton03;
    ImageButton imageButton04;
    ImageButton imageButton05;
    ImageButton imageButton06;
    ImageButton imageButton07;
    ImageButton imageButton08;
    ImageButton imageButton09;
    ImageButton imageButton10;
    ImageButton imageButton11;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton14;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton18;
    ImageButton imageButton19;
    ImageButton imageButton20;
    private WebViewJavaScriptInterface2 webViewJavaScriptInterface;
    private WebView webView;


  //  private ImageButton imageButton02, imageButton03;



    private String readFileToString(String fileName) {
        BufferedReader reader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open(fileName), "UTF-8"));

            // Read the file, usually looping until the end is reached.
            String myLine;
            while ((myLine = reader.readLine()) != null) {
                stringBuilder.append(myLine);
                stringBuilder.append("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return stringBuilder.toString();
    }

    public void goToSecondActivity() {

        Intent intent = new Intent(this, BasicActivity.class);
        startActivity(intent);
    }

    public void goTojadeshop1Activity() {

        Intent intent = new Intent(this, JS1Activity.class);
        // Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }








    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_js1);



        webView = (WebView) findViewById(R.id.webView);

        // JavaScript is disabled by default. Enable it.
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        // Enable JavaScript calling Java methods.
        webViewJavaScriptInterface = new WebViewJavaScriptInterface2(this);
        // "app" is the name of the JavaScript object that calls the methods in the interface.
        webView.addJavascriptInterface(webViewJavaScriptInterface, "app");

        // Do not allow flickering.
        webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        // Enable debugging in Chrome. This only works on SDK KitKat or newer.
        WebView.setWebContentsDebuggingEnabled(true);

        // Add support for the JavaScript alert function.
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                //Required functionality here
                return super.onJsAlert(view, url, message, result);
            }
        });











        // 方法：初始化View

            imageButton02 = (ImageButton) findViewById(R.id.imageButton02);
            imageButton03 = (ImageButton) findViewById(R.id.imageButton03);
            imageButton04 = (ImageButton) findViewById(R.id.imageButton04);
            imageButton05 = (ImageButton) findViewById(R.id.imageButton05);
            imageButton06 = (ImageButton) findViewById(R.id.imageButton06);
            imageButton07 = (ImageButton) findViewById(R.id.imageButton07);
            imageButton08 = (ImageButton) findViewById(R.id.imageButton08);
            imageButton09 = (ImageButton) findViewById(R.id.imageButton09);
        imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
        imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
        imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
        imageButton14 = (ImageButton) findViewById(R.id.imageButton14);
        imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
        imageButton16 = (ImageButton) findViewById(R.id.imageButton16);
        imageButton17 = (ImageButton) findViewById(R.id.imageButton17);
        imageButton18 = (ImageButton) findViewById(R.id.imageButton18);
        imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
        imageButton20 = (ImageButton) findViewById(R.id.imageButton20);




        imageButton02.setImageDrawable(getResources().getDrawable(R.drawable.i2));//在程序中设置图标
        imageButton03.setImageDrawable(getResources().getDrawable(R.drawable.i3));
        imageButton04.setImageDrawable(getResources().getDrawable(R.drawable.i4));//在程序中设置图标
        imageButton05.setImageDrawable(getResources().getDrawable(R.drawable.i5));
        imageButton06.setImageDrawable(getResources().getDrawable(R.drawable.i6));//在程序中设置图标
        imageButton07.setImageDrawable(getResources().getDrawable(R.drawable.i7));
        imageButton08.setImageDrawable(getResources().getDrawable(R.drawable.i8));//在程序中设置图标
        imageButton09.setImageDrawable(getResources().getDrawable(R.drawable.i9));
        imageButton10.setImageDrawable(getResources().getDrawable(R.drawable.i10));//在程序中设置图标
        imageButton11.setImageDrawable(getResources().getDrawable(R.drawable.i11));
        imageButton12.setImageDrawable(getResources().getDrawable(R.drawable.i12));//在程序中设置图标
        imageButton13.setImageDrawable(getResources().getDrawable(R.drawable.i13));
        imageButton14.setImageDrawable(getResources().getDrawable(R.drawable.i14));
        imageButton15.setImageDrawable(getResources().getDrawable(R.drawable.i15));
        imageButton16.setImageDrawable(getResources().getDrawable(R.drawable.i16));
        imageButton17.setImageDrawable(getResources().getDrawable(R.drawable.i17));
        imageButton18.setImageDrawable(getResources().getDrawable(R.drawable.i18));
        imageButton19.setImageDrawable(getResources().getDrawable(R.drawable.i19));
        imageButton20.setImageDrawable(getResources().getDrawable(R.drawable.i20));
        //下面为各个按钮设置事件监听
        imageButton02.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                String indexFile = readFileToString("JS1.html");

                // Perform search and replace operations.
                indexFile = indexFile.replace("preview", "i2");
                indexFile = indexFile.replace("Title_Ware", "Kugelschreiber Lucy");
                indexFile = indexFile.replace("Preis_Ware", "0,64€");
                indexFile = indexFile.replace("Beschreibung_ware", "Roter Kunststoff-Druckkugelschreiber inkl. Aufdruck: JADE HOCHSCHULE auf dem Schaft in weiß    Minenfarbe: blau");
                // Load the web page with all assets that are referenced in the HTML file.

                webView.loadDataWithBaseURL("file:///android_asset/", indexFile, "text/html", "utf-8", null);
                v.bringToFront();
                webView.bringToFront();

            }

        });

        imageButton03.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                String indexFile = readFileToString("JS1.html");

                // Perform search and replace operations.
                indexFile = indexFile.replace("preview", "i3");
                indexFile = indexFile.replace("Title_Ware", "Bleistifte Schwarz");
                indexFile = indexFile.replace("Preis_Ware", "1,61€");
                indexFile = indexFile.replace("Beschreibung_ware", " Bleistift, schwarz inkl. Logo zweifarbig");
                // Load the web page with all assets that are referenced in the HTML file.

                webView.loadDataWithBaseURL("file:///android_asset/", indexFile, "text/html", "utf-8", null);
                v.bringToFront();
                webView.bringToFront();

            }

        });

/////////////////  noch nicht
        imageButton04.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                String indexFile = readFileToString("JS1.html");

                // Perform search and replace operations.
                indexFile = indexFile.replace("preview", "i4");
                indexFile = indexFile.replace("Title_Ware", "Schluesselband Lanyard");
                indexFile = indexFile.replace("Preis_Ware", "3,391€");
                indexFile = indexFile.replace("Beschreibung_ware", " Schlüsselband, rot ca. 900x20 mm lang mit Schnappverschluss und Karabinerhaken und Sicherheitsverschluss im Nacken inkl. einfarbigem Werbedruck www.jade-hs.de");
                // Load the web page with all assets that are referenced in the HTML file.

                webView.loadDataWithBaseURL("file:///android_asset/", indexFile, "text/html", "utf-8", null);
                v.bringToFront();
                webView.bringToFront();

            }

        });

        imageButton05.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                String indexFile = readFileToString("JS1.html");

                // Perform search and replace operations.
                indexFile = indexFile.replace("preview", "i5");
                indexFile = indexFile.replace("Title_Ware", "Filz Schluesselanhaenger");
                indexFile = indexFile.replace("Preis_Ware", "9,64€");
                indexFile = indexFile.replace("Beschreibung_ware", "Hochwertiger Schlüsselanhänger aus Wollfilz, rot  mit Aufdruck: www.jade-hs.de in weiß");
                // Load the web page with all assets that are referenced in the HTML file.

                webView.loadDataWithBaseURL("file:///android_asset/", indexFile, "text/html", "utf-8", null);
                v.bringToFront();
                webView.bringToFront();

            }

        });


///////noch nicht






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
