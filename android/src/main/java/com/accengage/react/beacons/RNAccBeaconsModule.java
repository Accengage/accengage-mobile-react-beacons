
package com.accengage.react.beacons;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNAccBeaconsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAccBeaconsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    Log.d("RN Beacons Plugin", "Plugin loaded.");
  }

  @Override
  public String getName() {
    return "RNAccBeacons";
  }
}