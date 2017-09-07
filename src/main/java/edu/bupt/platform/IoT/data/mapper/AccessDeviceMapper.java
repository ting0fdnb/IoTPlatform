package edu.bupt.platform.IoT.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import edu.bupt.platform.IoT.data.obj.AccessDevice;



/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年9月6日 下午11:38:37
* @introduction:
*/

@Mapper
@Repository
public interface AccessDeviceMapper {
	
	String tableName="access_device";
	
	@Select("select * from " + tableName)
    List<AccessDevice> getAll();

    @Select("select * from " + tableName + " where name = #{name}")
    AccessDevice getByName(@Param("name") String name);
    
    @Select("select count(*) from " + tableName + " where 1=1 " + " AND device_name=#{deviceName}" + " AND type_id=#{typeCode}" + " AND company=#{manufacturer}" + " AND device_code=#{deviceCode}")
    Integer existAccessRecord(@Param("deviceName") String deviceName, @Param("typeCode") String typeCode, @Param("manufacturer") String manufacturer, @Param("deviceCode") String deviceCode);
}
