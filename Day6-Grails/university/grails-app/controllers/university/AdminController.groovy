package university

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class AdminController {

    def test() {
        render "Admin access granted"
    }
}