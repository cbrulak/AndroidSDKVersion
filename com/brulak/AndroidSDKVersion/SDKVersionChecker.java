package com.brulak.AndroidSDKVersion;

import android.os.Build;

public class SDKVersionChecker {
	
	private static final int ANDROID_SDK_VERISON_GINGERBREAD = 9;
	private static final int ANDROID_SDK_VERISON_GINGERBREAD_MR1 = 10;
	private static final int ANDROID_SDK_VERISON_HONEYCOMB = 11;
	private static final int ANDROID_SDK_VERISON_HONEYCOMB_MR1 = 12;
	private static final int ANDROID_SDK_VERISON_HONEYCOMB_MR2 = 13;
	private static final int ANDROID_SDK_VERISON_ICECREAMSANDWICH = 14;
	private static final int ANDROID_SDK_VERISON_ICECREAMSANDWICH_MR1 = 15;
	private static final int ANDROID_SDK_VERISON_JELLYBEAN = 16;

	public static boolean isGingerBread()
	{
		 return (Build.VERSION.SDK_INT == ANDROID_SDK_VERISON_GINGERBREAD || Build.VERSION.SDK_INT == ANDROID_SDK_VERISON_GINGERBREAD_MR1); 
	}
	
	public static boolean isGingerBreadOrHigher()
	{
		 return (Build.VERSION.SDK_INT >= ANDROID_SDK_VERISON_GINGERBREAD); 
	}
	
	public static boolean isHoneyComb()
	{
		 return (Build.VERSION.SDK_INT == ANDROID_SDK_VERISON_HONEYCOMB || 
				 Build.VERSION.SDK_INT == ANDROID_SDK_VERISON_HONEYCOMB_MR1 || 
				 Build.VERSION.SDK_INT == ANDROID_SDK_VERISON_HONEYCOMB_MR2); 
	}
	
	public static boolean isHoneyCombOrHigher()
	{
		 return (Build.VERSION.SDK_INT >= ANDROID_SDK_VERISON_HONEYCOMB); 
	}
	
	public static boolean isCreamSandwich()
	{
		 return (Build.VERSION.SDK_INT == ANDROID_SDK_VERISON_ICECREAMSANDWICH || Build.VERSION.SDK_INT == ANDROID_SDK_VERISON_ICECREAMSANDWICH_MR1); 
	}
	
	public static boolean isCreamSandwichOrHigher()
	{
		 return (Build.VERSION.SDK_INT >= ANDROID_SDK_VERISON_ICECREAMSANDWICH); 
	}
	
	public static boolean isJellyBean()
	{
		 return (Build.VERSION.SDK_INT == ANDROID_SDK_VERISON_JELLYBEAN); 
	}
	
	public static boolean isJellyBeanOrHigher()
	{
		 return (Build.VERSION.SDK_INT >= ANDROID_SDK_VERISON_JELLYBEAN); 
	}
}
