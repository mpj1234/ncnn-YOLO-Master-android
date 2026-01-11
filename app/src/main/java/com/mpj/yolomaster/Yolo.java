/**
 * @author mpj
 * @date 2026/1/11 23:02
 * @version V1.0
 * @since jdk1.8
 **/
package com.mpj.yolomaster;

import android.content.res.AssetManager;
import android.view.Surface;

public class Yolo {
    public native boolean loadModel(AssetManager mgr, int modelid, int cpugpu);

    public native boolean openCamera(int facing);

    public native boolean closeCamera();

    public native boolean setOutputWindow(Surface surface);

    static {
        System.loadLibrary("yolomaster");
    }
}
