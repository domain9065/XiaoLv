package com.xiaolv.xiaolv.acitivtymanagement.JavaBean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */

public class GetUserActivityInfoBean {


    /**
     * SimpleInfo : {"Info":[{"_id":"55","activityID":"2017072634625","personID":"15888888888","agencyID":null,"title":"五张图片测试","price":"11","costTime":"0.5","hasCar":true,"activityType":"0","validDurationStart":"2017-05-02","validDurationEnd":"2017-05-02","departCity":"阿坝藏族羌族自治州","departCounty":"阿坝县","destCity":"阿坝藏族羌族自治州","destCounty":"阿坝县","details":"","stars":"0","dealCount":"0","likeCount":"0","personLimit":"5","activityState":"2","photoID1":"photo1","photoID2":"photo2","photoID3":"photo3","photoID4":"photo4","photoID5":"photo5"}]}
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
             * _id : 55
             * activityID : 2017072634625
             * personID : 15888888888
             * agencyID : null
             * title : 五张图片测试
             * price : 11
             * costTime : 0.5
             * hasCar : true
             * activityType : 0
             * validDurationStart : 2017-05-02
             * validDurationEnd : 2017-05-02
             * departCity : 阿坝藏族羌族自治州
             * departCounty : 阿坝县
             * destCity : 阿坝藏族羌族自治州
             * destCounty : 阿坝县
             * details :
             * stars : 0
             * dealCount : 0
             * likeCount : 0
             * personLimit : 5
             * activityState : 2
             * photoID1 : photo1
             * photoID2 : photo2
             * photoID3 : photo3
             * photoID4 : photo4
             * photoID5 : photo5
             */

            private String _id;
            private String activityID;
            private String personID;
            private Object agencyID;
            private String title;
            private String price;
            private String costTime;
            private boolean hasCar;
            private String activityType;
            private String validDurationStart;
            private String validDurationEnd;
            private String departCity;
            private String departCounty;
            private String destCity;
            private String destCounty;
            private String details;
            private String stars;
            private String dealCount;
            private String likeCount;
            private String personLimit;
            private String activityState;
            private String photoID1;
            private String photoID2;
            private String photoID3;
            private String photoID4;
            private String photoID5;

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

            public String getPersonID() {
                return personID;
            }

            public void setPersonID(String personID) {
                this.personID = personID;
            }

            public Object getAgencyID() {
                return agencyID;
            }

            public void setAgencyID(Object agencyID) {
                this.agencyID = agencyID;
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

            public boolean isHasCar() {
                return hasCar;
            }

            public void setHasCar(boolean hasCar) {
                this.hasCar = hasCar;
            }

            public String getActivityType() {
                return activityType;
            }

            public void setActivityType(String activityType) {
                this.activityType = activityType;
            }

            public String getValidDurationStart() {
                return validDurationStart;
            }

            public void setValidDurationStart(String validDurationStart) {
                this.validDurationStart = validDurationStart;
            }

            public String getValidDurationEnd() {
                return validDurationEnd;
            }

            public void setValidDurationEnd(String validDurationEnd) {
                this.validDurationEnd = validDurationEnd;
            }

            public String getDepartCity() {
                return departCity;
            }

            public void setDepartCity(String departCity) {
                this.departCity = departCity;
            }

            public String getDepartCounty() {
                return departCounty;
            }

            public void setDepartCounty(String departCounty) {
                this.departCounty = departCounty;
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

            public String getDetails() {
                return details;
            }

            public void setDetails(String details) {
                this.details = details;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public String getDealCount() {
                return dealCount;
            }

            public void setDealCount(String dealCount) {
                this.dealCount = dealCount;
            }

            public String getLikeCount() {
                return likeCount;
            }

            public void setLikeCount(String likeCount) {
                this.likeCount = likeCount;
            }

            public String getPersonLimit() {
                return personLimit;
            }

            public void setPersonLimit(String personLimit) {
                this.personLimit = personLimit;
            }

            public String getActivityState() {
                return activityState;
            }

            public void setActivityState(String activityState) {
                this.activityState = activityState;
            }

            public String getPhotoID1() {
                return photoID1;
            }

            public void setPhotoID1(String photoID1) {
                this.photoID1 = photoID1;
            }

            public String getPhotoID2() {
                return photoID2;
            }

            public void setPhotoID2(String photoID2) {
                this.photoID2 = photoID2;
            }

            public String getPhotoID3() {
                return photoID3;
            }

            public void setPhotoID3(String photoID3) {
                this.photoID3 = photoID3;
            }

            public String getPhotoID4() {
                return photoID4;
            }

            public void setPhotoID4(String photoID4) {
                this.photoID4 = photoID4;
            }

            public String getPhotoID5() {
                return photoID5;
            }

            public void setPhotoID5(String photoID5) {
                this.photoID5 = photoID5;
            }
        }
    }
}
