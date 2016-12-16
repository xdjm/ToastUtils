package com.yjm.utils;
import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 *
 * @author yjm
 * @date 16/12/16
 */

/**
 * 显示toast
 *
 * @param context
 * @param str
 */
public class ToastUtil
{

		public static void showToast(Context context, String str) {
				Toast.makeText(context, str, Toast.LENGTH_LONG).show();
		}
}

