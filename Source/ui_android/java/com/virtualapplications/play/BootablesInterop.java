package com.virtualapplications.play;

public class BootablesInterop
{
	static
	{
		System.loadLibrary("Play");
	}

	public static final int SORT_RECENT = 0;
	public static final int SORT_HOMEBREW = 1;
	public static final int SORT_NONE = 2;

	public static native void scanBootables(String[] rootDirectories);
	public static native void fullScanBootables(String[] rootDirectories);
	public static native Bootable[] getBootables(int sortingMethod);
	public static native void tryRegisterBootable(String bootablePath);
	public static native void setLastBootedTime(String bootablePath, long lastBootedTime);
	public static native boolean IsBootableExecutablePath(String bootablePath);
	public static native boolean DoesBootableExist(String bootablePath);
	public static native void UnregisterBootable(String bootablePath);
	public static native void PurgeInexistingFiles();
}
