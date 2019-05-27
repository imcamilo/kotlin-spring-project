package cl.obj.starter

import cl.obj.starter.mapper.UsersMapper
import cl.obj.starter.model.Users
import cl.obj.starter.service.UsersService
import cl.obj.starter.service.UsersServiceImp
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 5/9/19
 */
class ServicesTest extends Specification {

    UsersService usersService
    def userMapper = Stub(UsersMapper)

    def setup() {
        usersService = new UsersServiceImp(userMapper)
    }

    void "Test findbyemail() on UsersService"() {
        given:
            String email = "cml@gg"
            Users users = new Users()
            userMapper.findByEmail(_ as String) >> users
        when:
            def expectedResponse = usersService.findByEmail(email)
        then:
            expectedResponse instanceof Users
    }

    void "Test findAll() on UsersService"() {
        given:
            List<Users> users = []
            userMapper.findAll() >> users
        when:
            def expectedResponse = usersService.findAll()
        then:
            expectedResponse instanceof List<Users>
    }

    void "Test insertUser() on UsersService"() {
        given:
            Users user = new Users()
            user.email = "cml@gg"
            user.password = "xxxxx"
            user.name = "Den"
            userMapper.insertUser(_ as String,_ as String,_ as String)
        when:
            def exchSave = usersService.insertUser(user)
        then:
            exchSave == null
    }

    void "Test updateUser() on UsersService"() {
        given:
            Users user = new Users()
            user.email = "cml@gg"
            user.password = "yyyy"
            user.name = "Don"
            userMapper.updateUser(_ as String,_ as String,_ as String)
        when:
            def exchSave = usersService.updateUser(user)
        then:
            exchSave == null
    }

    void "Test deleteUsers() on UsersService"() {
        given:
            String email = "cml@gg"
            userMapper.deleteUser(_ as String)
        when:
            def exchSave = usersService.deleteUsers(email)
        then:
            exchSave == null
    }

}
