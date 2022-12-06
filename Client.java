public class Client {
    public static void main(String[] args) {
        User user = new User();//用户初始化 user=一个有10000元的人
        user.strategy();//查看他的投资利润模式
        System.out.println(user.display());//
    }
}
