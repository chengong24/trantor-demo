package io.terminus.trantor.demo2.model;

import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.custom.api.annotation.ExtendTModel;
import io.terminus.trantor.demo.model.User;
import lombok.Data;

/**
 * model定义信息
 */
@Data
@ExtendTModel(User.class)
public class UserEx extends User {
    private static final long serialVersionUID = 2L;
    @TModelField(name = "二开字段")
    String ex;

}
