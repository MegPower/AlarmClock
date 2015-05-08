//set alarm activity to schedule an alarm
//based on the time the user picks in the time picker
package com.example.alarm2;

import java.util.Calendar;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TimePicker;
import android.view.*;

public class SetAlarmActivity extends Activity
{
	TimePicker timePicker;

	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        
    	// Get TimePicker
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);
	}
	
	public void onSaveClick(View v)
	{
		// Send Broadcast intent
		Intent broadcastIntent = new Intent(SetAlarmActivity.this, AlarmReceiver.class);
		broadcastIntent.setAction("true");
		PendingIntent pendingIntent = PendingIntent.getBroadcast(
			SetAlarmActivity.this, 0, broadcastIntent, 0);

		// Set Time
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(timePicker.getCurrentHour(), timePicker.getCurrentMinute(), 0);
		
		//schedule alarm with alarm manager
		AlarmManager alarm = (AlarmManager) getSystemService(ALARM_SERVICE);
		alarm.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
	}
}