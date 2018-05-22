package com.hansen.mvpframe.app;

import android.os.Environment;

import java.io.File;

/**
 * Created by codeest on 2016/8/3.
 */
public class Constants {

    public static final String BUGLY_ID = "3e8f458fe2";


    //================= TYPE ====================

    public static final int TYPE_ZHIHU = 101;
    public static final int TYPE_GANK = 102;
    public static final int TYPE_SET = 103;
    //================= PATH ====================

    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "codeest" + File.separator + "GeekNews";

//======================sp 数据存储标识
    public static final String SP_NIGHT_MODE = "night_mode";
    public static final String SP_NO_IMAGE = "no_image";
    public static final String SP_AUTO_CACHE = "auto_cache";
    //当前界面索引
    public static final String SP_CURRENT_ITEM = "current_item";
    public static final String SP_LIKE_POINT = "like_point";
    public static final String SP_VERSION_POINT = "version_point";
    public static final String SP_MANAGER_POINT = "manager_point";

    public static final String IT_GANK_TYPE = "gank_type";

    public static final String IT_GANK_TYPE_CODE = "gank_type_code";

    public static final String IT_GANK_DETAIL_TITLE = "gank_detail_title";

    public static final String IT_GANK_DETAIL_URL = "gank_detail_url";

    public static final String IT_GANK_DETAIL_IMG_URL = "gank_detail_img_url";

    public static final String IT_GANK_DETAIL_ID = "gank_detail_id";

    public static final String IT_GANK_DETAIL_TYPE = "gank_detail_type";

    public static final String IT_GANK_GRIL_ID = "gank_girl_id";

    public static final String IT_GANK_GRIL_URL = "gank_girl_url";
    public static final int TYPE_ANDROID = 102;

    public static final int TYPE_IOS = 103;

    public static final int TYPE_WEB = 104;
    public static final int TYPE_GIRL = 105;
}
