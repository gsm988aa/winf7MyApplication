package com.example.myapplication;


import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * This class contains all of the functions used by JavaScript to call Java Functions
 */
public class WebViewJavaScriptInterface {

    private MainActivity context;



    /*
     * Need a reference to the context in order to execute Java code.
     */
    public WebViewJavaScriptInterface(MainActivity context) {
        this.context = context;
    }

    /**
     * Use the native application's toast object to post a notification on the screen.
     * @param message String
     * @param lengthLong boolean
     */
    @JavascriptInterface
    public void makeToast(String message, boolean lengthLong) {
        Toast.makeText(context, message, (lengthLong ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT)).show();
    }

    /**
     * Change activities within the application.
     */
    @JavascriptInterface
    public void goToSecondActivity() {
        context.goToSecondActivity();
    }
    @JavascriptInterface
    public void goTojadeshop1Activity() {
        context.goTojadeshop1Activity();
    }

}
