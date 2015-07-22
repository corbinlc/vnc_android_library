package com.vnc.android.launcherexample;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

public class LauncherActivity extends ActionBarActivity {

	public void launchbVNC(View view) {
		EditText editText = (EditText)findViewById(R.id.ipText);
		Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("vnc://"+editText.getText().toString()+":5900/"));
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			Log.e("Missing Activity", e.getMessage());
		}
	}
	
	public void launchLocalhost(View view) {
		Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("vnc://localhost:5900/"));
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			Log.e("Missing Activity", e.getMessage());
		}
	}
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launcher, menu);
		return true;
	}

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
