package com.example.win10_pc.project.common;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * Created by win10_pc on 2017-06-13.
 */

public class Constants {

    public static final String TAG_LOG = "APPLOG";
    public static final String API_SERVER_URL = "localhost:3000";
    public static final String CHAT_SERVER_URL = "localhost:3000";
    public static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");


    /**
     * Comment  : 배열에서 정상적인 이메일 인지 검증.
     */
    public static boolean isEmail(String email) {
        if (email==null) return false;
        boolean b = Pattern.matches(
                "[\\w\\~\\-\\.]+@[\\w\\~\\-]+(\\.[\\w\\~\\-]+)+",
                email.trim());
        return b;
    }

}
