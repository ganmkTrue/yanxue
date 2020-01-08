package com.ketai.activity.orgin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ketai.model.domain.YxUndertakeOrg;

import java.util.List;

/**
 * <p>
 * 研学承办机构表 Mapper 接口
 * </p>
 *
 * @author 研学旅行网项目组
 * @since 2020-01-06
 */
public interface YxUndertakeOrgMapper extends BaseMapper<YxUndertakeOrg> {

    List<String> getAllYear();
}
