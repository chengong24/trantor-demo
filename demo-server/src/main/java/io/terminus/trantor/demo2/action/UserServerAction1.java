package io.terminus.trantor.demo2.action;

import io.terminus.common.model.Paging;
import io.terminus.platform.sdk.transaction.DSTransaction;
import io.terminus.trantor.api.TContext;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.api.annotation.params.TCollectionParam;
import io.terminus.trantor.api.annotation.params.TParam;
import io.terminus.trantor.demo.dao.UserRepository;
import io.terminus.trantor.demo.model.User;
import io.terminus.trantor.demo2.model.UserEx;
import io.terminus.trantor.demo2.repo.UserRepository1;
import io.terminus.trantor.sdk.autumn.param.Operators;
import io.terminus.trantor.sdk.autumn.param.OrderBy;
import io.terminus.trantor.sdk.datasource.MultiDataAction;
import io.terminus.trantor.sdk.datasource.MultiDataParams;
import io.terminus.trantor.sdk.datasource.MultiDataResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 用户模型自定义 server action
 *
 * @author zhengdong.jzd@alibaba-inc.com
 * @date 2020/7/13
 */
@Slf4j
@Component
public class UserServerAction1 implements MultiDataAction<User> {
    @Autowired
    private UserRepository1 userRepository1;

    @Override
    public MultiDataResult load(MultiDataParams multiDataParams) {
        Optional<UserEx> byId = userRepository1.findById(1L);
        ArrayList<UserEx> users = new ArrayList<>();
        users.add(byId.get());

        return new MultiDataResult<>(users, 1L);
    }
}