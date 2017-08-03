package com.xiaolv.xiaolv.acitivtymanagement.JavaBean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */

public class AddActivityInfoBean {


    /**
     * validDuration : [{"year":2017,"month":5,"dayOfMonth":2},{"year":2017,"month":5,"dayOfMonth":2}]
     * title : 五张图片测试
     * departure : ["阿坝藏族羌族自治州","阿坝县"]
     * destination : ["阿坝藏族羌族自治州","阿坝县"]
     * details :
     * hasCar : true
     * photos : ["photo1","photo2","photo3","photo4","photo5"]
     * photoID1 : photo1
     * personID : 15888888888
     * costTime : 0.5
     * stars : 0
     * price : 11
     * likeCount : 0
     * myActivityType : 2
     * dealCount : 0
     * personLimit : 5
     */

    private String title;
    private String details;
    private boolean hasCar;
    private String photoID1;
    private String personID;
    private double costTime;
    private int stars;
    private int price;
    private int likeCount;
    private int myActivityType;
    private int dealCount;
    private int personLimit;
    private List<ValidDurationBean> validDuration;
    private List<String> departure;
    private List<String> destination;
    private List<String> photos;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public double getCostTime() {
        return costTime;
    }

    public void setCostTime(double costTime) {
        this.costTime = costTime;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getMyActivityType() {
        return myActivityType;
    }

    public void setMyActivityType(int myActivityType) {
        this.myActivityType = myActivityType;
    }

    public int getDealCount() {
        return dealCount;
    }

    public void setDealCount(int dealCount) {
        this.dealCount = dealCount;
    }

    public int getPersonLimit() {
        return personLimit;
    }

    public void setPersonLimit(int personLimit) {
        this.personLimit = personLimit;
    }

    public List<ValidDurationBean> getValidDuration() {
        return validDuration;
    }

    public void setValidDuration(List<ValidDurationBean> validDuration) {
        this.validDuration = validDuration;
    }

    public List<String> getDeparture() {
        return departure;
    }

    public void setDeparture(List<String> departure) {
        this.departure = departure;
    }

    public List<String> getDestination() {
        return destination;
    }

    public void setDestination(List<String> destination) {
        this.destination = destination;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public static class ValidDurationBean {
        /**
         * year : 2017
         * month : 5
         * dayOfMonth : 2
         */

        private int year;
        private int month;
        private int dayOfMonth;

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDayOfMonth() {
            return dayOfMonth;
        }

        public void setDayOfMonth(int dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
        }
    }
}
