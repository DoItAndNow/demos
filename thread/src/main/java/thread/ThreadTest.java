package thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Description: 线程相关测试lei
 *
 * @author songcx
 * @date 2020/2/27 13:59
 */
@Slf4j
public class ThreadTest {

    private static ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(5,8,30, TimeUnit.MINUTES,new LinkedBlockingQueue());

    public static void main(String[] args) {

        for(int i = 0; i < 50; i++){
            threadPoolExecutor.execute(()->{
                log.info(String.valueOf(Thread.currentThread().getId()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
