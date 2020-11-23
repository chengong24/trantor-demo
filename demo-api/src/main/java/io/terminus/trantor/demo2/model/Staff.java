package io.terminus.trantor.demo2.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.custom.api.annotation.ExtendTModel;
import io.terminus.trantor.module.base.model.User;

/**
 * model定义信息
 */
@TModel(name = "staff")
public class Staff extends BaseModel<Long> {
    private static final long serialVersionUID = 3L;
    @TModelField(name = "二开字段")
    String code;
}
