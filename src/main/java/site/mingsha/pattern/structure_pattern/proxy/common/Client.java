package site.mingsha.pattern.structure_pattern.proxy.common;

/**
 * 鍦烘櫙绫�
 * @author hjp21925
 * @version $Id: Client.java, v 0.1 2016骞�8鏈�25鏃� 涓嬪崍4:52:40 hjp21925 Exp $
 */
public class Client {
    
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
