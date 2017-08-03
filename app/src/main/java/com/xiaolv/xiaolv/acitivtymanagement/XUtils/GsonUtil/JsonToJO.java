package com.xiaolv.xiaolv.acitivtymanagement.XUtils.GsonUtil;

import com.google.gson.Gson;
import com.xiaolv.acitivtymanagement.JavaBean.GetActivityComplexInfoBean;
import com.xiaolv.acitivtymanagement.JavaBean.GetActivitySimpleInfoBean;
import com.xiaolv.acitivtymanagement.JavaBean.GetUserActivityInfoBean;
import com.xiaolv.acitivtymanagement.JavaBean.GetUserApplyInfoBean;

/**
 * Created by Administrator on 2017/8/2.
 */

public class JsonToJO {


    /*转化为活动详情信息实体类*/
    public GetActivityComplexInfoBean JOGetActivityComplexInfo(String str_json){
        GetActivityComplexInfoBean o=new GetActivityComplexInfoBean();
        Gson gson=new Gson();
        o=gson.fromJson(str_json,GetActivityComplexInfoBean.class);
        System.out.println("活动状态--ActivityComplexInfoBean:"+o.getComplexInfo().get(0).getActivityState());
        System.out.println("活动ID--ActivityComplexInfoBean:"+o.getComplexInfo().get(0).getActivityID());
        return o;
    }

    /*转化为活动简单信息实体类*/
    public GetActivitySimpleInfoBean JOGetActivitySimpleInfo(String str_json){
        GetActivitySimpleInfoBean o=new GetActivitySimpleInfoBean();
        Gson gson=new Gson();
        o=gson.fromJson(str_json,GetActivitySimpleInfoBean.class);
        return o;
    }

    /*转化为用户发起的活动信息实体类*/
    public GetUserActivityInfoBean JOGetUserActivityInfo(String str_json){
        GetUserActivityInfoBean o=new GetUserActivityInfoBean();
        Gson gson=new Gson();
        o=gson.fromJson(str_json,GetUserActivityInfoBean.class);
        return o;
    }

    /*转化为用户预约信息实体类*/
    public GetUserApplyInfoBean JOGetUserApplyInfoBean(String str_json){
        GetUserApplyInfoBean o=new GetUserApplyInfoBean();
        Gson gson=new Gson();
        o=gson.fromJson(str_json,GetUserApplyInfoBean.class);
        return o;
    }


}
