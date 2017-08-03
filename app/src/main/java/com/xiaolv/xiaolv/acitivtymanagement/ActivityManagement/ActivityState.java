package com.xiaolv.xiaolv.acitivtymanagement.ActivityManagement;

/**
 * Created by Administrator on 2017/5/4.
 */

public enum ActivityState {


    /*0.已保存 1.已提交 2.已激活 3.已开始 已结束*/

//    saved( "0" ), submitted( "1" ), activated( "2" ),started("3"),finished("4") {
//
//        @Override
//        public boolean isRest() {
//            return true ;
//        }
//    };
//
//    private String value;
//    private ActivityState( String value) {
//        this .value = value;
//    }
//    public String getValue() {
//        return value;
//    }
//    public boolean isRest() {
//        return false ;
//    }


    saved("saved",0), submitted("submitted", 1), activated("activated", 2), started("started", 3),finished("finished",4);

    private String name ;
    private int index ;

    private ActivityState(String name , int index ){
        this.name = name ;
        this.index = index ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }


    public static String getName(int index) {
        for (ActivityState c : ActivityState.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

}



