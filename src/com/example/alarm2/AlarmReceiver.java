//broadcast receiver class to receive and run alarm
package com.example.alarm2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver
{
	@Override
	public void onReceive(Context context, Intent intent)
	{
		if (intent.getAction().equals("true"))
		{
			//set alarm
			Intent alarm = new Intent(context, AlarmActivity.class);
			//add flags
			alarm.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			//run the alarm
			context.startActivity(alarm);
		}
	}
}