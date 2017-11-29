package com.digit.customcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.digit.customcamera.internal.BaseCaptureActivity;
import com.digit.customcamera.internal.Camera2Fragment;

public class CaptureActivity2 extends BaseCaptureActivity {

    @Override
    @NonNull
    public Fragment getFragment() {
        return Camera2Fragment.newInstance();
    }
}
