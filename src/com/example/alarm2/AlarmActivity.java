//alarm activity for actual alarm action
package com.example.alarm2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class AlarmActivity extends Activity
{
	public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        
        //send alarm with alert dialog
		AlertDialog alert = new AlertDialog.Builder(this).create();
		//set message
		alert.setMessage("Wake Up!");
		//display alert dialog
		alert.show();
	}
	
	DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener()
	{
		@Override
		public void onClick(DialogInterface di, int btn)
		{
			//close the alarm
			finish();	
		}
	};

}
