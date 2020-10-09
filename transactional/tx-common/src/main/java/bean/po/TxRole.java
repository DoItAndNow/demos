package bean.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 角色表实体类
 *
 * @author songcx
 * @date 2020/10/9 16:47
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
public class TxRole {

    private Long id;

    private String name;

    private String desc;
}
