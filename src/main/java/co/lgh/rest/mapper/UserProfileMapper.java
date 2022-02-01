package co.lgh.rest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import co.lgh.rest.model.UserProfile;

@Mapper
public interface UserProfileMapper {

	@Select("select * from userprofile where id=#{id}")
	UserProfile getUserProfile(@Param("id") String id);

	@Select("select * from userprofile")
	List<UserProfile> getUserProfileList();

	@Insert("insert into userprofile values(#{id}, #{name}, #{phone}, #{addr})")
	int insertUserProfile(@Param("id") String id, @Param("name") String name, @Param("phone") String phone,
			@Param("addr") String addr);

	@Update("update userprofile set name=#{name}, phone=#{phone}, addr=#{addr} where id=#{id}")
	int updateUserProfile(@Param("id") String id, @Param("name") String name, @Param("phone") String phone,
			@Param("addr") String addr);

	@Delete("delete from userprofile where id=#{id}")
	int deleteUserProfile(@Param("id") String id);

}
