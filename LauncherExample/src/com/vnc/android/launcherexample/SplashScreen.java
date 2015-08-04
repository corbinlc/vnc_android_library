package com.vnc.android.launcherexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	// Splash screen timer
	private static int SPLASH_TIME_OUT = 3000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		new Handler().postDelayed(new Runnable() {
			
			/*
			 * Showing splash screen with a timer
			 */
			
			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
				Intent intent = new Intent(SplashScreen.this, LauncherActivity.class);
				startActivity(intent);
				
				// close this activity
				finish();
			}
		}, SPLASH_TIME_OUT);
	}
}
