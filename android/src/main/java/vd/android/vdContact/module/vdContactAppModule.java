package vd.android.vdContact.module;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;

import app.vd.framework.extend.base.WXModuleBase;
import vd.android.vdContact.module.utils.ContactUtils;

public class vdContactAppModule extends WXModuleBase {

    /**
     * 获取联系人列表
     *
     * @param callback
     */
    @JSMethod
    public void lists(JSCallback callback) {
        ContactUtils.get(false, getContext(), callback);
    }

    /**
     * 获取联系人列表（分组）
     *
     * @param callback
     */
    @JSMethod
    public void section(JSCallback callback) {
        ContactUtils.get(true, getContext(), callback);
    }
}
