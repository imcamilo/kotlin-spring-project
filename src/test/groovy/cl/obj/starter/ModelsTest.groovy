package cl.obj.starter

import cl.obj.starter.model.Users
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 5/27/19
 */
class ModelsTest extends Specification {

    def "Test Users Data Class"() {
        given:
            Users users = new Users()
            users.id = "1"
            users.email = "cc@gmail.com"
            users.password = "qwerty"
            users.name = "Drone"
        expect:
            a.equals(b) == c
        where:
                a     |   b       |   c
            "finatra" | "finch"   | false
            "tornado" | "tornado" | true
            "stra"    | "la"      | false
    }

}
