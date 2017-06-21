package demo.app

class Student {
    String name
    String email

    static constraints = {
        name blank: false
        email blank: false, unique: true, email: true
    }

    static hasMany = [schools: String]

    static mapping = {
        table 'students'
        schools joinTable: [column: 'school']
    }
}
