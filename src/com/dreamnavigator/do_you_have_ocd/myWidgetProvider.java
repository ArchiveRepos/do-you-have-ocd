package com.dreamnavigator.do_you_have_ocd;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class myWidgetProvider extends AppWidgetProvider {

	public myWidgetProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds){
		RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.mywidgetclick);
		remoteViews.setOnClickPendingIntent(R.id.my_widgetclick, buildButtonPendingIntent(context));
		pushWidgetUpdate(context, remoteViews);
	}
	
	public static PendingIntent buildButtonPendingIntent(Context context){
		Intent intent = new Intent();
		intent.setAction("com.dreamnavigator.do_you_have_ocd.CLICKED");
		return PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
	}
	
	public static void pushWidgetUpdate(Context context, RemoteViews remoteViews){
		ComponentName myWidget = new ComponentName(context, myWidgetProvider.class);
		AppWidgetManager manager = AppWidgetManager.getInstance(context);
		manager.updateAppWidget(myWidget, remoteViews);
	}

}
