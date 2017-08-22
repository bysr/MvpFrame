package com.wolearn.mvpframe.login.contract;

import com.wolearn.mvpframelib.base.BasePresenter;
import com.wolearn.mvpframelib.base.BaseView;

/**
 * Created by wulei
 * Data: 2016/8/4.
 */
public class LoginContract {

    /*UI抽象类*/
    public interface View extends BaseView {
        String getAccount();
        String getPassword();
        void loginSuccess();
        void loginError(String errorMsg);
    }


    //业务逻辑抽象类

    public interface Present extends BasePresenter {
        void login();
    }
}
