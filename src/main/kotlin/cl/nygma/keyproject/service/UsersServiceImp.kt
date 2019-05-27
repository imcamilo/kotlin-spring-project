package cl.nygma.keyproject.service

import cl.nygma.keyproject.mapper.UsersMapper
import cl.nygma.keyproject.model.Users
import org.springframework.stereotype.Service

/**
 * Created by Camilo Jorquera on 29-10-18
 */
@Service
class UsersServiceImp(var usersMapper: UsersMapper) : UsersService{

    override fun findByEmail(email: String) : Users {
        return usersMapper.findByEmail(email)
    }

    override fun insertUser(users: Users) {
        usersMapper.insertUser(users.email, users.password, users.name)
    }

    override fun updateUser(users: Users) {
        usersMapper.updateUser(users.email, users.password, users.name)
    }

    override fun deleteUsers(email: String) {
        usersMapper.deleteUser(email)
    }

    override fun findAll(): List<Users> {
        return usersMapper.findAll()
    }

}