package net.dboyce.inducted;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.support.v4.app.Fragment;


public class MainActivity extends FragmentActivity implements settingsFragment.OnFragmentInteractionListener {

    //we want to get the last induction from memory and start it


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (BuildConfig.DEBUG) {
            // These flags cause the device screen to turn on (and bypass screen guard if possible) when launching.
            // This makes it easy for developers to test the app launch without needing to turn on the device
            // each time and without needing to enable the "Stay awake" option.
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON
                    | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD
                    | WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("inducted","oncreate called");


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        settingsFragment sf = new settingsFragment();
        ft.add(R.id.mainact, sf);
        ft.commit();

    }

    @Override
    protected  void onStart() {
        super.onStart();
        Log.d("inducted","onStart called");
        //placeholder for onstart mechanics

    }

    @Override
    protected  void onRestart() {
        super.onRestart();
        Log.d("inducted","onRestart called");
        //placeholder for onRestart mechanics

    }

    @Override
    protected void onResume() {
        super.onResume();  // Always call the superclass method first

        Log.d("inducted","onResume called");
        //placeholder for onResume mechanics

    }

    @Override
    protected void onPause() {
        super.onPause();  // Always call the superclass method first
        Log.d("inducted","onPause called");
        //placeholder for onPause mechanics

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("inducted","onStop called.");
        //placeholder for onStop mechanics
        //save application data here instead of onPause


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("inducted","onDestroy called");
        //placeholder for onDestroy mechanics

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        //Fragment mabob
    }
}
