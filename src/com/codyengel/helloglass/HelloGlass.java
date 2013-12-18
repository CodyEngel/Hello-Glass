package com.codyengel.helloglass;

// Glass Specific
import com.google.android.glass.timeline.LiveCard;
//import com.google.android.glass.timeline.LiveCard.PublishMode;
import com.google.android.glass.timeline.TimelineManager;

import android.os.IBinder;
import android.app.Service;
import android.content.Intent;

/**
 * Main Activity
 * @author Cody Engel
 *
 */
public class HelloGlass extends Service {
	
	private static final String TAG = "HelloGlass"; 		// For console logs
	private static final String LIVE_CARD_ID = "helloglass";
	
	private TimelineManager mTimelineManager;
	private LiveCard mLiveCard;
	
	@Override
	public void onCreate() {
		super.onCreate();
		mTimelineManager = TimelineManager.from(this);
	} // onCreate

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	} // IBinder
	
	/*
	 * As far as I can tell this is what gets called once the application has launched.
	 * 
	 * I am creating a new intent, Magic.class, which is where the rest of the code resides for the application.
	 */
	public int onStartCommand(Intent intent, int flags, int startId) {
		// Where the magic happens
		mLiveCard = mTimelineManager.createLiveCard(LIVE_CARD_ID);
		
		Intent i = new Intent(this, Magic.class);
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(i);
		return START_STICKY;
	} // onStartCommand

}
