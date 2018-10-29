package cl.nygma.keyproject.mapper

import cl.nygma.keyproject.model.Users
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

/**
 * Created by Camilo Jorquera on 29-10-18
 */
@Mapper
interface UsersMapper {

    @Select("select * from users where email = #{email}")
    fun findByEmail(@Param("email") email: String): Users

}