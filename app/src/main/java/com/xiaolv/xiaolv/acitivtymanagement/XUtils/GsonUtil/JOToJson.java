package com.xiaolv.xiaolv.acitivtymanagement.XUtils.GsonUtil;

import com.google.gson.Gson;
import com.xiaolv.xiaolv.acitivtymanagement.JavaBean.AddActivityInfoBean;

/**
 * Created by Administrator on 2017/8/2.
 */

public class JOToJson {

    /*发起活动java实体类转化为json*/
    public String tojson(AddActivityInfoBean a){
        Gson gson=new Gson();
        String result = gson.toJson(a);
        System.out.println("AddActivityInfo数据:"+result);
        return result;
    }


}
