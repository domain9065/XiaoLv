package com.xiaolv.xiaolv.acitivtymanagement.JavaBean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */

public class GetActivitySimpleInfoBean {


    /**
     * SimpleInfo : {"Info":[{"_id":"53","activityID":"2017060474890","title":"五张图片测试","price":"11","costTime":"0.5","destCity":"阿坝藏族羌族自治州","destCounty":"阿坝县","hasCar":true,"photoID1":"photo1","activityType":"2"},{"_id":"1","activityID":"201705059999900001","title":"赣州一日游","price":"99","costTime":"1","destCity":"赣州市","destCounty":"章贡区","hasCar":true,"photoID1":"照片1","activityType":"0"}]}
     */

    private SimpleInfoBean SimpleInfo;

    public SimpleInfoBean getSimpleInfo() {
        return SimpleInfo;
    }

    public void setSimpleInfo(SimpleInfoBean SimpleInfo) {
        this.SimpleInfo = SimpleInfo;
    }

    public static class SimpleInfoBean {
        private List<InfoBean> Info;

        public List<InfoBean> getInfo() {
            return Info;
        }

        public void setInfo(List<InfoBean> Info) {
            this.Info = Info;
        }

        public static class InfoBean {
            /**
             * _id : 53
             * activityID : 2017060474890
             * title : 五张图片测试
             * price : 11
             * costTime : 0.5
             * destCity : 阿坝藏族羌族自治州
             * destCounty : 阿坝县
             * hasCar : true
             * photoID1 : photo1
             * activityType : 2
             */

            private String _id;
            private String activityID;
            private String title;
            private String price;
            private String costTime;
            private String destCity;
            private String destCounty;
            private boolean hasCar;
            private String photoID1;
            private String activityType;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getActivityID() {
                return activityID;
            }

            public void setActivityID(String activityID) {
                this.activityID = activityID;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getCostTime() {
                return costTime;
            }

            public void setCostTime(String costTime) {
                this.costTime = costTime;
            }

            public String getDestCity() {
                return destCity;
            }

            public void setDestCity(String destCity) {
                this.destCity = destCity;
            }

            public String getDestCounty() {
                return destCounty;
            }

            public void setDestCounty(String destCounty) {
                this.destCounty = destCounty;
            }

            public boolean isHasCar() {
                return hasCar;
            }

            public void setHasCar(boolean hasCar) {
                this.hasCar = hasCar;
            }

            public String getPhotoID1() {
                return photoID1;
            }

            public void setPhotoID1(String photoID1) {
                this.photoID1 = photoID1;
            }

            public String getActivityType() {
                return activityType;
            }

            public void setActivityType(String activityType) {
                this.activityType = activityType;
            }
        }
    }
}
