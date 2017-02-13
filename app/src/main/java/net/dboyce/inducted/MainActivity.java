package net.dboyce.inducted;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected  void onStart() {
        System.out.print("onStart called.");
        //placeholder for onstart mechanics

    }

    @Override
    protected  void onRestart() {
        System.out.print("onRestart called.");
        //placeholder for onRestart mechanics

    }

    @Override
    protected void onResume() {
        super.onResume();  // Always call the superclass method first

        System.out.print("onResume called.");
        //placeholder for onResume mechanics

    }

    @Override
    protected void onPause() {
        super.onPause();  // Always call the superclass method first
        System.out.print("onPause called.");
        //placeholder for onPause mechanics

    }

    @Override
    protected void onStop() {
        System.out.print("onStop called.");
        //placeholder for onStop mechanics
        //save application data here instead of onPause


    }

    @Override
    protected void onDestroy() {
        System.out.print("onDestroy called.");
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
}
