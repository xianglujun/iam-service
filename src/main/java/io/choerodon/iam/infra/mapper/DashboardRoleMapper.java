package io.choerodon.iam.infra.mapper;

import java.util.List;

import io.choerodon.iam.infra.dto.DashboardRoleDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dongfan117@gmail.com
 */
public interface DashboardRoleMapper extends Mapper<DashboardRoleDTO> {

    List<Long> selectRoleIds(@Param("dashboardId") Long dashboardId);

    void deleteByDashboardId(@Param("dashboardId") Long dashboardId);

    List<Long> selectDashboardByUserId(@Param("userId") Long userId,
                                       @Param("sourceId") Long sourceId,
                                       @Param("level") String level);
}
