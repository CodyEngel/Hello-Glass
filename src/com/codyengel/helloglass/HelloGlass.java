/*
 * HelloGlass.java
 * @author Cody Engel
 * http://codyengel.info
 */
package com.codyengel.helloglass;

// Glass Specific
import com.google.android.glass.timeline.LiveCard;
import com.google.android.glass.timeline.TimelineManager;

import android.os.IBinder;
import android.app.Service;
import android.content.Intent;

public class HelloGlass extends Service {
	
	private static final String LIVE_CARD_ID = "helloglass";
	
	/*
	 * TimelineManager allows applications to interact with the timeline.
	 * 
	 * Additional information: https://developers.google.com/glass/develop/gdk/reference/com/google/android/glass/timeline/TimelineManager
	 */
	private TimelineManager mTimelineManager;
	
	/*
	 * LiveCard lets you create cards as well as publish them to the users timeline.
	 * 
	 * Additional information: https://developers.google.com/glass/develop/gdk/reference/com/google/android/glass/timeline/LiveCard
	 */
	@SuppressWarnings("unused")
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
	 * onStartCommand is used to start a service from your voice trigger you set up in res/xml/voice_trigger_start.xml
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
