package com.dzt.openlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by M02323 on 2017/9/11.
 */

public class ToastUtils {

	/**
	 * 显示吐司 * * @param context * @param str
	 */
	public static void showToast(Context context, String str) {
		Toast.makeText(context, str, Toast.LENGTH_LONG).show();
	}
}
