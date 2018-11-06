package cl.nygma.keyproject.service

import cl.nygma.keyproject.model.Users
import org.apache.ibatis.annotations.Param

/**
 * Created by Camilo Jorquera on 29-10-18
 */
interface UsersService {

    fun findByEmail(email: String): Users

    fun insertUser(users: Users): Unit

    fun updateUser(users: Users): Unit

    fun deleteUsers(email: String): Unit

    fun findAll(): List<Users>

}