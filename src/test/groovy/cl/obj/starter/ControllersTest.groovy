package cl.obj.starter

import cl.obj.starter.controller.UsersController
import cl.obj.starter.model.Users
import cl.obj.starter.service.UsersService
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 5/27/19
 */
class ControllersTest extends Specification {

    UsersController usersController
    def usersService = Stub(UsersService)

    def setup() {
        usersController = new UsersController(usersService)
    }

    def "Test getSome() on UsersController"() {
        given:
            String email = "cml@gg"
            Users users = new Users()
            usersService.findByEmail(_ as String) >> users
        when:
            def expectedResponse = usersController.getSome(email)
        then:
            expectedResponse instanceof Users
    }

    def "Test getAll() on UsersController"() {
        given:
            List<Users> users = []
            usersService.findAll() >> users
        when:
            def expectedResponse = usersController.getAll()
        then:
            expectedResponse instanceof List<Users>
    }

    void "Test create() on UsersController"() {
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

    void "Test update() on UsersController"() {
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

    void "Test deleteUsers() on UsersController"() {
        given:
            String email = "cml@gg"
            usersService.deleteUsers(_ as String)
        when:
            def exchSave = usersController.delete(email)
        then:
            exchSave == null
    }

}
