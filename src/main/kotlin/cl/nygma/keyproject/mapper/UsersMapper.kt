package cl.nygma.keyproject.mapper

import cl.nygma.keyproject.model.Users
import org.apache.ibatis.annotations.*

/**
 * Created by Camilo Jorquera on 29-10-18
 */
@Mapper
interface UsersMapper {

    @Select("select * from users where email = #{email}")
    fun findByEmail(@Param("email") email: String): Users

    @Insert("insert into users (email, password, name) values (#{email}, #{password}, #{name})")
    fun insertParam(@Param("email") email: String?,
                    @Param("password") password: String?,
                    @Param("name") name: String?): Unit


}