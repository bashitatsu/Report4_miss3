package jp.ac.uryukyu.e185714;

public class Exception {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            //NullPointerExceptionが起きたときの処理
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
