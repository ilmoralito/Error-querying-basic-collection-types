package demo.app

class BootStrap {

    def init = { servletContext ->
        new Student(
            name: 'John Doe',
            email: 'john.doe@domain.com',
            schools: ['School1', 'School2', 'School3']
        ).save failOnError: true

        new Student(
            name: 'Jane Doe',
            email: 'jane.doe@domain.com',
            schools: ['School2', 'School3']
        ).save failOnError: true

        new Student(
            name: 'Johan Doe',
            email: 'johan.doe@domain.com',
            schools: ['School2']
        ).save failOnError: true

        assert Student.count() == 3
    }
    def destroy = {
    }
}
