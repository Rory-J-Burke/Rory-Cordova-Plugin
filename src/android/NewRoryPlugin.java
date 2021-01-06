package com.example.rory;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class NewRoryPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("rory")) {
            String message = args.getString(0);
            this.rory(message, callbackContext);
            return true;
        }
        return false;
    }

    //reverses input string
    private void rory(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            String ret = "";
            for(int i = 1; i <= message.length(); i++) ret += message.charAt(message.length() - i);
            callbackContext.success(ret);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
