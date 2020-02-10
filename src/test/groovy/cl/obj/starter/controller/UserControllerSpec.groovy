package cl.obj.starter.controller

import cl.obj.starter.model.Users
import cl.obj.starter.service.UsersService
import spock.lang.Shared
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 5/27/19
 */
class UserControllerSpec extends Specification {

    @Shared
    private UsersController usersController
    @Shared
    private UsersService usersService = Stub(UsersService)

    def setupSpec() {
        usersController = new UsersController(usersService)
    }

    def "given an email, findByEmail must return an user"() {
        given:
        String email = "cml@gg"
        Users users = new Users()
        usersService.findByEmail(_ as String) >> users

        when:
        def expectedResponse = usersController.getSome(email)

        then:
        expectedResponse instanceof Users
    }

    def "findAll must return an user list"() {
        given:
        List<Users> users = []
        usersService.findAll() >> users

        when:
        def expectedResponse = usersController.getAll()

        then:
        expectedResponse instanceof List<Users>
    }

    def "given an user, when save is invoked, then return null"() {
        given:
        Users user = new Users()
        user.email = "cml@gg"
        user.password = "xxxxx"
        user.name = "Den"
        usersService.insertUser(user)

        when:
        def exchSave = usersController.create(user)

        then:
        exchSave == null
    }

    def "given an user, when update is invoked, then return null"() {
        given:
        Users user = new Users()
        user.email = "cml@gg"
        user.password = "xxxxx"
        user.name = "Den"
        usersService.updateUser(user)

        when:
        def exchSave = usersController.update(user)

        then:
        exchSave == null
    }

    def "given an email, when delete is invoked, then return null"() {
        given:
        String email = "cml@gg"
        usersService.deleteUsers(_ as String)

        when:
        def exchSave = usersController.delete(email)

        then:
        exchSave == null
    }

}
