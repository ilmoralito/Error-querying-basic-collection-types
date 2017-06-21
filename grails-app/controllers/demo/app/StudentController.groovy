package demo.app

class StudentController {

    def index() {
        List<String> emailList = Student.createCriteria().list {
            'in' 'schools', ['School2']

            projections {
                property 'email'
            }
        }

        render emailList
    }
}
