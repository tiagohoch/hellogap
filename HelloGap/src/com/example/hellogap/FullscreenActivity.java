package com.example.hellogap;

import com.example.hellogap.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.apache.cordova.DroidGap;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends DroidGap {
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_fullscreen);
        super.loadUrl("file:///android_asset/www/index.html");


        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
    }

  

}
