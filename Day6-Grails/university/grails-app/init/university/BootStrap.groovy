package university

class BootStrap {

    def init = {

        User.withTransaction {

            Role adminRole = Role.findByAuthority('ROLE_ADMIN')

            if (!adminRole) {
                adminRole = new Role(
                    authority: 'ROLE_ADMIN'
                ).save(failOnError: true)
            }

            Role userRole = Role.findByAuthority('ROLE_USER')

            if (!userRole) {
                userRole = new Role(
                    authority: 'ROLE_USER'
                ).save(failOnError: true)
            }


            User admin = User.findByUsername('admin@ubs.com')

            if (!admin) {
                admin = new User(
                    username: 'admin@ubs.com',
                    password: 'admin123',
                    enabled: true
                ).save(failOnError: true)
            }

            if (!UserRole.exists(admin.id, adminRole.id)) {
                UserRole.create(admin, adminRole, true)
            }


            User intern = User.findByUsername('intern@ubs.com')

            if (!intern) {
                intern = new User(
                    username: 'intern@ubs.com',
                    password: 'intern123',
                    enabled: true
                ).save(failOnError: true)
            }

            if (!UserRole.exists(intern.id, userRole.id)) {
                UserRole.create(intern, userRole, true)
            }
        }
    }

    def destroy = {
    }
}