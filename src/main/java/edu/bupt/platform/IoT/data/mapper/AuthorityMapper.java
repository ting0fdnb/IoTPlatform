package edu.bupt.platform.IoT.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import edu.bupt.platform.IoT.data.obj.Authority;

@Mapper
@Repository
public interface AuthorityMapper {

	String tableName="authority";
	
	@Select("select * from " + tableName)
    List<Authority> getAll();

    @Select("select * from " + tableName + " where id = #{id}")
    Authority getById(@Param("id") Integer id);
    
    
}
