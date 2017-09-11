package com.dzt.androidlib;

import android.app.Application;

import com.dzt.openlibrary.ToastUtils;

/**
 * Created by M02323 on 2017/9/11.
 */

public class App extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		ToastUtils.getInstance().init(this);
	}
}
