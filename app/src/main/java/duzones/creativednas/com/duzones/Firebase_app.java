package duzones.creativednas.com.duzones;

import android.app.Application;

import com.firebase.client.Firebase;

public class Firebase_app extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
