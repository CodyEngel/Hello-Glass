package edu.niu.cs.codyengel.hellodate;

import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	/*
	 * onCreate
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*
         * Variables 
         */
        String current_date = new Date().toString();
        final Button btnDate = (Button) findViewById(R.id.btnDate);
        
        // Set the button to be the current date.
        btnDate.setText(current_date);
        
        /*
         * OnClick listener to refresh the date/time.
         */
        btnDate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String new_date = new Date().toString();
				btnDate.setText(new_date);
			}
		});
    } // onCreate
    
    /*
	 * onStart
	 */
    @Override
    public void onStart() {
    	super.onStart();
    
    } //onStart
    
    /*
	 * onRestart
	 */
    @Override
    public void onRestart() {
    	super.onRestart();
    
    } // onRestart
    
    /*
	 * onResume
	 */
    @Override
    public void onResume() {
    	super.onResume();
    
    } // onResume
    
    /*
	 * onPause
	 */
    @Override
    public void onPause() {
    	super.onPause();
    
    } // onPause
    
    /*
	 * onStop
	 */
    @Override
    public void onStop() {
    	super.onStop();
    
    } // onStop
    
    /*
	 * onDestroy
	 */
    @Override
    public void onDestroy() {
    	super.onDestroy();
    
    } // onDestroy
    
}
