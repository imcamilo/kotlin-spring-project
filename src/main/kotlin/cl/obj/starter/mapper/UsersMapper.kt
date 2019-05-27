package cl.obj.starter.mapper

import cl.obj.starter.model.Users
import org.apache.ibatis.annotations.*


/**
 * Created by Camilo Jorquera on 29-10-18
 */
@Mapper
interface UsersMapper {

    @Select("select * from users where email = #{email}")
    fun findByEmail(@Param("email") email: String): Users

    @Insert("insert into users (email, password, name) values (#{email}, #{password}, #{name})")
    fun insertUser(@Param("email") email: String?,
                   @Param("password") password: String?,
                   @Param("name") name: String?)

    @Update("update users set password=#{password}, name=#{name} where email = #{email}")
    fun updateUser(@Param("email") email: String?,
                    @Param("password") password: String?,
                    @Param("name") name: String?)

    @Delete("delete from users where email = #{email}")
    fun deleteUser(@Param("email") email: String?)

    @Select("select * from users")
    fun findAll(): List<Users>
}