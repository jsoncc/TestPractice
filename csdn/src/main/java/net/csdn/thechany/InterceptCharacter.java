package net.csdn.thechany;

public class InterceptCharacter {
    public static void main(String[] args) {
        /*--------------------------------字符串截取的几种方式----------------------------------------------*/
        String str = "窗前明月光,疑是地上霜。";
        //截取第n个字符
        String ns = str.substring(2);
        System.out.println("截掉前两位字符的内容：" + ns);//明月光,疑是地上霜。
        //截取字符串的某个范围字符
        String fw = str.substring(0, 3);
        System.out.println("截取字符串前三位的内容：" + fw);//窗前明
        //截取字符串最后一个字符的问题
        String lastS = str.substring(str.lastIndexOf(",") + 1);
        System.out.println("截取最后一个，后的内容：" + lastS);//疑是地上霜。
        //从开始截取到中间某个指定字符 (该字符出现的第一次)
        String zdS = str.substring(0, str.indexOf("地"));
        System.out.println("截取到中间某个指定字符(第一次出现)：" + zdS);//窗前明月光,疑是
        //从开始截取到指定某段字符串结尾
        String midStr = "上霜";
        String jwS = str.substring(0, str.indexOf(midStr) + midStr.length());
        System.out.println("截取到指定某段字符串结尾：" + jwS);//窗前明月光,疑是地上霜

    }
}
