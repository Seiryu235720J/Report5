package jp.ac.uryukyu.ie.e235720;

public class Report5 {
    public static void main(String[] args) {
        
      
       
    
    
    try {
       
        String str = null;

        
        System.out.println("NullPointerException occurred.");

        
        System.out.println("Exception message: " + new NullPointerException().getMessage());

        // NullPointerExceptionが発生する行
        System.out.println(str.length());
    } catch (NullPointerException e) {
        // 例外処理
        System.err.println("Caught NullPointerException: " + e.getMessage());
    }
    
}
}