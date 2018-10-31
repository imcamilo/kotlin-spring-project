package cl.nygma.keyproject.service

import cl.nygma.keyproject.model.Users
import org.apache.ibatis.annotations.Param

/**
 * Created by Camilo Jorquera on 29-10-18
 */
interface UsersService {

    fun findByEmail(email: String): Users

    fun insertParam(users: Users): Unit

}