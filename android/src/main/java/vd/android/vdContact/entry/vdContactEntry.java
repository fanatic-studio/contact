package vd.android.vdContact.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.vd.framework.extend.annotation.ModuleEntry;
import vd.android.vdContact.module.vdContactAppModule;

@ModuleEntry
public class vdContactEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        //1、注册weex模块
        try {
            WXSDKEngine.registerModule("vdContact", vdContactAppModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }
}
