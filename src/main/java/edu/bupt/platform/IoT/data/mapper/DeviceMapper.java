package edu.bupt.platform.IoT.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import edu.bupt.platform.IoT.data.obj.Device;



/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年9月6日 下午11:38:37
* @introduction:
*/

@Mapper
@Repository
public interface DeviceMapper {
	
	String tableName="device";
	
	@Select("select * from " + tableName)
    List<Device> getAll();

    @Select("select * from " + tableName + " where device_name = #{name}")
    Device getByName(String name);
    
    @Select("select * from " + tableName + " where device_name = #{deviceName} AND device_code=#{deviceCode}")
    Device getByNameAndDeviceCode(@Param("deviceName")String deviceName, @Param("deviceCode") String deviceCode);
    
    @Select("select * from " + tableName + " where id = #{id}")
    Device getById(Integer id);

}
