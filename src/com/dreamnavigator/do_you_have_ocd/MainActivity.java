package com.dreamnavigator.do_you_have_ocd;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		//alertDialog.setMessage("Hello");
		//alertDialog.show();
		//View target = findViewById(R.id.this);
		//BadgeView badge = new BadgeView(this, target);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
