package com.cinnamoroll.wallpaperlivewallpaperauth2.models;

public class PagerWallpapersItem {

	private String wallpaper;
	boolean isPremium;

	public PagerWallpapersItem(String wallpaper, boolean isPremium) {
		this.wallpaper = wallpaper;
		this.isPremium = isPremium;
	}

	public String getWallpaper() {
		return wallpaper;
	}

	public boolean isPremium() {
		return isPremium;
	}
}