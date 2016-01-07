package com.tools;
//中文可乱码处理
public class Chinese {
    public  static String  toChinese(String strvalue) {
           try {
               if (strvalue == null) {
                   return "";
               } else {
                   strvalue = new String(strvalue.getBytes("ISO8859_1"), "UTF-8");
                   return strvalue;
               }
           } catch (Exception e) {
               return "";
           }
    }
}
