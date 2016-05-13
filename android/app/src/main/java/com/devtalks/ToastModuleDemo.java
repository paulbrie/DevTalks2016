package com.devtalks;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class ToastModuleDemo extends ReactContextBaseJavaModule {

    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";

    public ToastModuleDemo(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    // this is required by React Native
    @Override
    public String getName() {
        return "ToastAndroidDemo";
    }

    // An optional method called getConstants returns the constant values exposed to JavaScript.
    // Its implementation is not required but is very useful to key pre-defined values that need
    // to be communicated from JavaScript to Java in sync.
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
        return constants;
    }

    // the annotation exposes this method in the JS representation of the code
    @ReactMethod
    public void show(String message, int duration) {
        Toast.makeText(getReactApplicationContext(), message, duration).show();
    }
}