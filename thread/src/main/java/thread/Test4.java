package thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2021/3/4 17:12
 */

public class Test4 {

    private static ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(5,8,30, TimeUnit.MINUTES,new LinkedBlockingQueue());

    public static void main(String[] args) throws Exception {

        System.out.println(new Date());
        Long result = 0L;
        Long temp  = 100000000L / 8;
        List<Future<Long>> results = new ArrayList<Future<Long>>();
        for(Long i = 1L;i < 100000000L;){
            Test test = new Test(i,i+temp);
            Future<Long> Long = threadPoolExecutor.submit(test);
            i = i+temp;
            results.add(Long);
        }
        for(;;){
            if(threadPoolExecutor.getCompletedTaskCount() == results.size()){
                for(int i = 0; i < results.size(); i++){
                    result = result + results.get(i).get();
                }
                break;
            }
        }

        System.out.println(result);
        System.out.println(new Date());
    }

}
