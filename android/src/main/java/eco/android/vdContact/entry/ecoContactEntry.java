package eco.android.ecoContact.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eco.framework.extend.annotation.ModuleEntry;
import eco.android.ecoContact.module.ecoContactAppModule;

@ModuleEntry
public class ecoContactEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        //1、注册weex模块
        try {
            WXSDKEngine.registerModule("ecoContact", ecoContactAppModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }
}
