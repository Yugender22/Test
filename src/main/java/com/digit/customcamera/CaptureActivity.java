package com.digit.customcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.digit.customcamera.internal.BaseCaptureActivity;
import com.digit.customcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

    @Override
    @NonNull
    public Fragment getFragment() {
        return CameraFragment.newInstance();
    }
}
