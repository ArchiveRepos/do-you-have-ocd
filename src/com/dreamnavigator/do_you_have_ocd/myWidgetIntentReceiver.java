package com.dreamnavigator.do_you_have_ocd;

//import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
//import android.os.Bundle;
import android.widget.RemoteViews;

public class myWidgetIntentReceiver extends BroadcastReceiver {

	private static int clickCount = 1;
	
	public myWidgetIntentReceiver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().equals("com.dreamnavigator.do_you_have_ocd.CLICKED")){
			//Bundle extras = intent.getExtras();
			//if (extras != null){
			//	int widgetId = extras.getInt(AppWidgetManager.EXTRA_APPWIDGET_ID,AppWidgetManager.INVALID_APPWIDGET_ID);
			//	updateWidgetIcon(context, widgetId);
			//}
			updateWidgetIcon(context);
		}

	}

	//private void updateWidgetIcon(Context context, int widgetId) {
	private void updateWidgetIcon(Context context){
		//RemoteViews remoteViews = new RemoteViews(context.getPackageName(),widgetId);
		RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.mywidgetclick);
		remoteViews.setImageViewResource(R.id.my_widgetclick, setClickCount());
		remoteViews.setOnClickPendingIntent(R.id.my_widgetclick, myWidgetProvider.buildButtonPendingIntent(context));
		remoteViews.setTextViewText(R.id.notification, Integer.toString(clickCount));
		myWidgetProvider.pushWidgetUpdate(context, remoteViews);
	}

	private int setClickCount() {
		clickCount++;
		//return (clickCount % 2 == 0) ? R.drawable.ic_you_hurt_me : R.drawable.ic_launcher;
		return R.drawable.ic_you_hurt_me;
	}

}
