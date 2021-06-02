package testReflect;

public class test {
    public static void main(String[] args) {
        //利用微信支付
                                                                //WeChat wc = new WeChat();
                                                                //wc.payOnline();
        //pay(new WeChat());

        //利用支付宝支付
        //pay(new AliPay());
        //必须选择唯一的支付方式, 到底是选的哪种支付方式
        String str = "支付宝";
        if("支付宝".equals(str))
            pay(new AliPay());
        else
            pay(new WeChat());



    }
    /*
    public static void pay(WeChat w){
        w.payOnline();
    }
    public static void pay(AliPay a){
        a.payOnline();
    }

     */
    public static void pay(MTYM m){
        m.payOnline();
    }
}
