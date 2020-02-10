package cl.obj.starter.service

import cl.obj.starter.mapper.UsersMapper
import cl.obj.starter.model.Users
import spock.lang.Shared
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 5/9/19
 */
class UsersServiceSpec extends Specification {

    @Shared
    private UsersService usersService
    @Shared
    private UsersMapper userMapper = Stub(UsersMapper)

    def setupSpec() {
        usersService = new UsersServiceImp(userMapper)
    }

    def "given an email, when findByEmail is invoked must return a valid user"() {
        given:
        String email = "cml@gg"
        Users users = new Users()
        userMapper.findByEmail(_ as String) >> users

        when:
        def expectedResponse = usersService.findByEmail(email)

        then:
        expectedResponse instanceof Users
    }

    def "when findByEmail is invoked must return a List<Users>"() {
        given:
        List<Users> users = []
        userMapper.findAll() >> users

        when:
        def expectedResponse = usersService.findAll()

        then:
        expectedResponse instanceof List<Users>
    }

    def "given an user, when save is invoked must be ok"() {
        given:
        Users user = new Users()
        user.email = "cml@gg"
        user.password = "xxxxx"
        user.name = "Den"
        userMapper.insertUser(_ as String, _ as String, _ as String)

        when:
        def exchSave = usersService.insertUser(user)

        then:
        exchSave == null
    }

    def "given an user, when update is invoked must be ok"() {
        given:
        Users user = new Users()
        user.email = "cml@gg"
        user.password = "yyyy"
        user.name = "Don"
        userMapper.updateUser(_ as String, _ as String, _ as String)

        when:
        def exchSave = usersService.updateUser(user)

        then:
        exchSave == null
    }

    def "given an email, when delete is invoked must be ok"() {
        given:
        String email = "cml@gg"
        userMapper.deleteUser(_ as String)

        when:
        def exchSave = usersService.deleteUsers(email)

        then:
        exchSave == null
    }

}
