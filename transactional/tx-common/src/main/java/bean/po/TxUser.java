package bean.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:  用户实体类
 *
 * @author songcx
 * @date 2020/10/9 16:44
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TxUser {

    private Long id;

    private String username;

    private String password;
}
