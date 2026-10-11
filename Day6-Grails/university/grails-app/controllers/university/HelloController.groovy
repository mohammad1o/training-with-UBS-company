
package university

class HelloController {

    def index() {

render (view:"index")


 }
def showMessage(String name)
{
render "name ${name}"


}



}
