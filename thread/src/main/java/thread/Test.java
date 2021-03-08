package thread;

import java.util.concurrent.Callable;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2021/3/4 17:21
 */

public class Test implements Callable<Long>{
        private Long start;
        private Long end;
        private Long sum = 0L;

        public Test(Long start,Long end){
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() throws Exception {
            for(;start <  end; start++){
                sum = sum + start;
            }
            return sum;
        }
}
