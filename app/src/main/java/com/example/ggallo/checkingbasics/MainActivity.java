package com.example.ggallo.checkingbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Bundle mAppState;

    /*
    * In the onCreate() method, you perform basic application startup logic that should happen only once for the entire life of the activity.
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(" ************ APP EN onCreate() ************ ");

        // recovering the instance state
        if (savedInstanceState != null) {
            mAppState = savedInstanceState;
            System.out.println("APP savedInstanceState: " + mAppState);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == PICK_CONTACT_REQUEST) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                // The user picked a contact.
                // The Intent's data Uri identifies which contact was selected.

                // Do something with the contact here (bigger example below)
            }
        }
    }

    /*
    * This method is where the app initializes the code that maintains the UI.
    * It might also register a BroadcastReceiver that monitors changes that are reflected in the UI.
    * */
    @Override
    protected  void onStart() {
        super.onStart();
        System.out.println(" ************ APP EN onStart() ************ ");
    }

    /*
    * Should implement onResume() to initialize components that you release during onPause()
    * */
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(" ************ APP EN onResume() ************ ");
        System.out.println(mAppState);
    }

    /*
    * Use the onPause() method to pause operations such animations and music playback that should not continue
    * while the Activity is in the Paused state, and that you expect to resume shortly.
    * */
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(" ************ APP EN onPause() ************ ");
    }

    /*
    * In the onStop() method, the app should release almost all resources that aren't needed while the user is not using it.
    * */
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(" ************ APP EN onStop() ************ ");
    }

    /*
    * The system either invokes this callback because the activity is finishing due to someone's calling finish(),
    * or because the system is temporarily destroying the process containing the activity to save space.
    * The system may also call this method when an orientation change occurs,
    * and then immediately call onCreate() to recreate the process (and the components that it contains) in the new orientation.
    * */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(" ************ APP EN onDestroy() ************ ");
    }
}
