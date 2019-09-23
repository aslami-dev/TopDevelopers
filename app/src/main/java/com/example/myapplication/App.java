package com.example.myapplication;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        setContext(this);
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        App.context = context;
    }
}
