package cl.obj.starter.model

import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 5/27/19
 */
class UsersSpec extends Specification {

    def "given a user, the data must be correct"() {
        when:
        Users users = new Users()
        users.id = "1"
        users.email = "cc@gmail.com"
        users.password = "qwerty"
        users.name = "Drone"

        sthen:
        users.id == "1"
        users.name == "Drone"
    }

}
