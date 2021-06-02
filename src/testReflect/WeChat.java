package testReflect;

public class WeChat implements MTYM{
    public WeChat() {
        System.out.println("创建了微信的对象");
    }

    @Override
    public void payOnline() {

        System.out.println("我正在定外卖， 在使用微信支付");
    }
}
