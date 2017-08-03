package com.xiaolv.xiaolv.acitivtymanagement.JavaBean;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */

public class GetActivityComplexInfoBean {


    private List<ComplexInfoBean> ComplexInfo;

    public List<ComplexInfoBean> getComplexInfo() {
        return ComplexInfo;
    }

    public void setComplexInfo(List<ComplexInfoBean> ComplexInfo) {
        this.ComplexInfo = ComplexInfo;
    }

    public static class ComplexInfoBean {
        /**
         * _id : 5
         * activityID : 2017073186126
         * personID :
         * agencyID : null
         * title : 标题51.38212142022836
         * price : 11
         * costTime : 0.5
         * hasCar : 1
         * activityType : 0
         * validDurationStart : 2017-07-03
         * validDurationEnd : 2017-07-08
         * departCity : 阿坝藏族羌族自治州
         * departCounty : 阿坝县
         * destCity : 阿坝藏族羌族自治州
         * destCounty : 阿坝县
         * details : activity5complexinfo
         * stars : 0
         * dealCount : 0
         * likeCount : 0
         * personLimit : 5
         * activityState : 2
         * photoID1 :
         * photoID2 :
         * photoID3 :
         * photoID4 :
         * photoID5 :
         */

        private String _id;
        private String activityID;
        private String personID;
        private Object agencyID;
        private String title;
        private String price;
        private String costTime;
        private String hasCar;
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
        private int activityState;
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

        public String getHasCar() {
            return hasCar;
        }

        public void setHasCar(String hasCar) {
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

//        public ActivityState getActivityState() {
//            return activityState;
//        }
//
//        public void setActivityState(ActivityState activityState) {
//            this.activityState = activityState;
//        }


        public int getActivityState() {
            return activityState;
        }

        public void setActivityState(int activityState) {
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
