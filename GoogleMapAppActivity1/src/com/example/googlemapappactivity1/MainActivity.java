package com.example.googlemapappactivity1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.google.android.maps.MapActivity;

class MainActivity extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	protected boolean isRouteDisplayed(){
		return true;
	}

}
