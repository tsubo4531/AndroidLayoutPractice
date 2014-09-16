package com.layoutpractice.example;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LayoutActivity1 extends ActionBarActivity {

	private Button btn1;
	private Button btn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layout2);
		
		btn1 = (Button)findViewById(R.id.button_layout1);
		btn1.setOnClickListener(new ButtonClickListener());	
		
		btn2 = (Button)findViewById(R.id.button_layout2);
		btn2.setOnClickListener(new ButtonClickListener());	
	}

	class ButtonClickListener implements OnClickListener{
		public void onClick(View v){
			Intent intent;
			if (v == btn1){
				intent = new Intent(LayoutActivity1.this, MainActivity.class);			
			}else if(v == btn2){
				intent = new Intent(LayoutActivity1.this, LayoutActivity2.class);							
			}else{
				intent = null;
			}
			startActivity(intent);
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_activity1, menu);
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
