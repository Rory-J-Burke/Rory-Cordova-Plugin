package com.example.rory

import org.apache.cordova.CordovaPlugin
import org.apache.cordova.CallbackContext

import org.json.JSONArray
import org.json.JSONException
import android.R.attr.action




class Rory : CordovaPlugin() {
    @Throws(org.json.JSONException::class)
    override fun execute(action: String, args: JSONArray, callbackContext: CallbackContext): Boolean{
        if (action.equals("rory")) {
            val input: String = args.getString(0)
            var ret: String = ""
            for(i in 1..input.length)
                ret += input[input.length - i]
            callbackContext.success(ret)
            return true
        }
        return false
    }
}