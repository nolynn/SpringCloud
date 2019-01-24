package com.bbd.pm.common.entities.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description:
 * @Date: 2019/1/21 10:14
 * @Auther: lynn
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private String id;
    private String userName;
    private String password;
    private String realName;
}
