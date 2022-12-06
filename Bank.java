public abstract class Bank {
    // 抽象类，里面是有很多个拥有不同价钱的人，不同的价钱有不同的利润模式
    InterestStrategy interestStrategy;//聚合接口


    public String discretion;

    public void setDiscretion(String discretion) {
        this.discretion = discretion;
    }

    public String getDiscretion() {
        return discretion;
    }

    public abstract String display();//抽象方法，展示拥有不同资本的用户以及相应的利润策略


    public void strategy() {
        if (interestStrategy != null) {
            //如果接口有实现，则调用接口实现的方法
            interestStrategy.strategy();
        }
    }

}
