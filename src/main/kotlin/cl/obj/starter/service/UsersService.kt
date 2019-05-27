package cl.obj.starter.service

import cl.obj.starter.model.Users


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