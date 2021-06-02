package testReflect;

public class AliPay implements MTYM{
    public AliPay() {
        System.out.println("创建了阿里的对象");
    }

    @Override
    public void payOnline() {
        System.out.println("我正在订外卖， 正在使用支付宝支付");

    }
}
