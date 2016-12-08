package com.liu.test.control;

import com.liu.test.common.Response;

/**
 * Created by yulong.liu on 2016/12/7.
 */
public class BaseController {

    protected Response success() {
        return new Response().success();
    }

    protected Response success(Object data) {
        return new Response().success().setData(data);
    }
}


