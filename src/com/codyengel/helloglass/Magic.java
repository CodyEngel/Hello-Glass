/*
 * Magic.java
 * @author Cody Engel
 * http://codyengel.info
 * 
 * This is the service which is started from HelloGlass.java, this is where the magic happens.
 */
package com.codyengel.helloglass;

import com.google.android.glass.app.Card;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Magic extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*
		 * We're creating a card for the interface.
		 * 
		 * More info here: http://developer.android.com/guide/topics/ui/themes.html
		 */
		Card card1 = new Card(this);
		card1.setText("Hello, Sir!"); // Main text area
		card1.setFootnote("..or Ma'am"); // Footer
		View card1View = card1.toView();
		
		// Display the card we just created
		setContentView(card1View);
	}

}
