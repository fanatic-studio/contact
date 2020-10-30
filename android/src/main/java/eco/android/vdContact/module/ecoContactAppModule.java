package eco.android.ecoContact.module;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;

import app.eco.framework.extend.base.WXModuleBase;
import eco.android.ecoContact.module.utils.ContactUtils;

public class ecoContactAppModule extends WXModuleBase {

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
