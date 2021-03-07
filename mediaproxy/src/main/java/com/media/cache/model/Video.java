package com.media.cache.model;

public class Video {

    public static class Type {
        public static final int HLS_TYPE = 0x1;
        public static final int HLS_LIVE_TYPE = 0x2;
        public static final int MP4_TYPE = 0x3;
        public static final int WEBM_TYPE = 0x4;
        public static final int QUICKTIME_TYPE = 0x5;
        public static final int GP3_TYPE = 0x6;
        public static final int MP3_TYPE = 0x7;
    }

    public static class Mime {

        public static String MIME_TYPE_MP4 = "video/mp4";
        public static String MIME_TYPE_M3U8_1 = "application/vnd.apple.mpegurl";
        public static String MIME_TYPE_M3U8_2 = "application/x-mpegurl";
        public static String MIME_TYPE_M3U8_3 = "vnd.apple.mpegurl";
        public static String MIME_TYPE_M3U8_4 = "applicationnd.apple.mpegurl";

        //Test url: https://vmedia.trafforsrv.com/system/files/videos/25147/t_f90367ccd2c15b649facea2b8008d450.webm
        public static String MIME_TYPE_WEBM = "video/webm";

        //Test url: https://vdse.bdstatic.com/3805e7089388e9abcc7fc59029f9363c.mov
        public static String MIME_TYPE_QUICKTIME = "video/quicktime";

        //Test url: https://x13y5.qq360cn.com/xx/file/774303/83113afba440817fe0584f917aefc660.3gp
        public static String MIME_TYPE_3GP = "video/3gp";

        //Test urls:
        //1.https://api.37live.com/api/ngyun/index.php?vid=We2egMd6z3owhm8LjOO0OOOgpQ0O0O00O0O0&hd=m3u8      ignore cert example;
        public static String MIME_TYPE_MP3 = "audio/mpeg";
    }
}

