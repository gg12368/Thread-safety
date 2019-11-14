class SaleThread implements Runnable{
    private int tickets=10;
    public void run(){
        while(true){
            if(tickets>0){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()
                        +"正在发售"+tickets--+"张票");
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        SaleThread saleThread=new SaleThread();
        //创建并开启4个线程，模拟4个售票窗口
        new Thread(saleThread,"黄牛1").start();
        new Thread(saleThread,"黄牛2").start();
        new Thread(saleThread,"黄牛3").start();
        new Thread(saleThread,"黄牛4").start();
    }
}
