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

    override fun insertUser(user: Users): Unit {
        usersMapper.insertUser(user.email, user.password, user.name)
    }

    override fun updateUser(user: Users): Unit {
        usersMapper.updateUser(user.email, user.password, user.name)
    }

}