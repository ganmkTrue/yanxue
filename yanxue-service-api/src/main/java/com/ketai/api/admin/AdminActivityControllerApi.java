package com.ketai.api.admin;

import com.ketai.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 描述:
 *
 * @author 愿你活的通透拎得清轻重辩得明是非
 * @create 2020-01-06 19:51
 */
@Api(value = "研学活动操作", description = "研学活动管理中心")
public interface AdminActivityControllerApi {

    @ApiOperation("得到统计总数")
    public Result getActivityStatisticsCount();
}
