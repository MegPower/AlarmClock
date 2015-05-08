//main activity to set up the alarm and layout
//triggers the alarm receiver and setter when button is clicked
package com.example.alarm2;

//import java.util.Calendar;
//import java.util.Date;

import android.os.Bundle;
//import android.os.SystemClock;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
//import android.content.Context;
import android.content.Intent;
//import android.content.IntentFilter;
//import android.text.Editable;
//import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
//import android.widget.EditText;
//import android.widget.ImageButton;
//import android.widget.TextView;
import android.widget.TimePicker;
//import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    PendingIntent pi;
    BroadcastReceiver br;
    AlarmManager am;
    
    TimePicker timePicker;
    
    int hour;
    
//	private TextView timePickerTextView;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		//EditText timeEditText = (EditText) findViewById(R.id.timeEditText);
		//timeEditText.addTextChangedListener(timeEditTextWatcher);	
		
		//timePicker = (TimePicker) findViewById(R.id.timePicker);
		//timePicker.setIs24HourView(true);
		
		//ImageButton setButton = (ImageButton) findViewById(R.id.setButton);
		//setButton.setOnClickListener(setButtonListener);

	}
/*	
	private TextWatcher timeEditTextWatcher = new TextWatcher()
	{
		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count)
		{
			//cast s as a string
			String timeEntered = (String) s;
			//parse the string from the editText into 2 ints
			String hours = (String) timeEntered.substring(0, timeEntered.indexOf(':'));
			String minutes = (String) timeEntered.substring(timeEntered.indexOf(':'), 0);
			
		    timePickerTextView.setText(minutes);						
		    
			int hourEntered = Integer.parseInt(hours.toString());
			hour = hourEntered * 1000;
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
		}

		@Override
		public void afterTextChanged(Editable s) {
		}
	};
*/

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, SetAlarmActivity.class);
		startActivity(intent);		
	}
	
/*	private TextWatcher enterHourEditTextWatcher = new TextWatcher()
	{
		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count)
		{
			//display time in textView and then start alarm manager
			//timePickerTextView.setText(s);
		
			int hourEntered = Integer.parseInt(s.toString());
			hour = hourEntered * 1000;
			
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
		}

		@Override
		public void afterTextChanged(Editable s) {
		}
	};
*/
/*
	private void setAlarm() {
		//set and schedule time
     	Calendar cal = Calendar.getInstance();
    	cal.setTimeInMillis(System.currentTimeMillis());
        cal.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
        cal.set(Calendar.MINUTE, timePicker.getCurrentMinute());
        
		//send broadcast intent to alarm receiver
		Intent broadcastIntent = new Intent(MainActivity.this, AlarmReceiver.class);
		broadcastIntent.setAction("true");
		PendingIntent pi = PendingIntent.getBroadcast(MainActivity.this, 0, broadcastIntent, 0);
        
    	//set alarm
	    AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
	    am = (AlarmManager)(this.getSystemService(Context.ALARM_SERVICE));
		am.set(AlarmManager.RTC, cal.getTimeInMillis(), pi);
	}
*/
	//public OnClickListener setButtonListener = new OnClickListener()
	//{
			
/*			@Override
			public void onClick(View v) {
				//am.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, System.currentTimeMillis(), pi );
				setAlarm();
			}
	//};
	
*/
/*	@Override
	protected void onDestroy() {
	       am.cancel(pi);
	       unregisterReceiver(br);
	       super.onDestroy();
	}
*/
	
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	*/
}
