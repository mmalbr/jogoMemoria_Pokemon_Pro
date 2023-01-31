package com.meafocus.memoriapk02pro;

import android.app.Application;

import com.meafocus.memoriapk02pro.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
