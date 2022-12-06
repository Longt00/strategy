public class User extends Bank {
    //这个银行中的一个客户拥有10000本金
//    public String discretion = "A man have 10000 yuan && use ";

    public User() {
        interestStrategy = new FixedPercentageInterest();
        //定义这个客户的利润策略模式
        setDiscretion("A man have 10000 yuan && use");
    }

    @Override
    public String display() {
        return super.getDiscretion() + interestStrategy.strategy();
        //返回这个客户的个人信息和所使用的利润策略
    }

}
