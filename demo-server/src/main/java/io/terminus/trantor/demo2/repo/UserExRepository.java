package io.terminus.trantor.demo2.repo;

import io.terminus.trantor.demo2.model.UserEx;
import io.terminus.trantor.sdk.autumn.dao.TrantorDAO;
import org.springframework.stereotype.Repository;

/**
 * 用户 dao, 须继承 TrantorDAO，默认已包含 CRUD 操作
 *
 * @author zhengdong.jzd@alibaba-inc.com
 * @date 2020/7/13
 */
@Repository
public class UserExRepository extends TrantorDAO<UserEx, Long> {
}
