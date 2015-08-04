package com.vnc.android.launcherexample;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.iiordanov.bVNC.Constants;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

public class LauncherActivity extends ActionBarActivity {

	// Launches the Remote Viewer from bVNC to connect to the given ip address with the given password
	// Make sure to include com.iiordanov.bVNC.Constants if you're going to use them
	public void launchbVNC(View view) {
		EditText ipText = (EditText)findViewById(R.id.ipText);
		EditText pwText = (EditText)findViewById(R.id.pwText);
		Intent intent = new Intent(this, com.iiordanov.bVNC.RemoteCanvasActivity.class);
		intent.setData(Uri.parse("vnc://"+ipText.getText().toString()+":5900/?"+Constants.PARAM_VNC_PWD+"="+pwText.getText().toString()));
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			Log.e("Missing Activity", e.getMessage());
		}
	}
	
	// Launches the Remote Viewer from bVNC to connect to localhost with no password
	public void launchLocalhost(View view) {
		Intent intent = new Intent(this, com.iiordanov.bVNC.RemoteCanvasActivity.class);
		intent.setData(Uri.parse("vnc://localhost:5900/"));
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			Log.e("Missing Activity", e.getMessage());
		}
	}
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*
		 *  Comment this in to automatically start the VNC connection upon
		 *  creation of this activity. Note the IP is hard-coded at this
		 *  point, but could easily be fed in from some outside source 
		 *  or calling intent. The Password is optional and can be fed in 
		 *  the same as the ip address.
		 *  
		Intent intent = new Intent(this, com.iiordanov.bVNC.RemoteCanvasActivity.class);
		intent.setData(Uri.parse("vnc://172.17.161.71:5900/?"+Constants.PARAM_VNC_PWD+"=blabla  "));
		startActivity(intent);
		 */
		setContentView(R.layout.activity_launcher);
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launcher, menu);
		return true;
	}*/

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
