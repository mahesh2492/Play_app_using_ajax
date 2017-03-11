
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(error:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<h1>Login Page</h1>
<br>
<form action=""""),_display_(/*5.16*/routes/*5.22*/.SigninController.check),format.raw/*5.45*/("""" method="post" style="border:double;"><br>
User Name : <input type="text" name="username" placeholder="Username"><br><br>
Password :  <input type="password" name="password" placeholder="Password"><br><br>
<div style="color:red;">"""),_display_(/*8.26*/error),format.raw/*8.31*/("""</div>
<button>Submit</button>

</form>"""))
      }
    }
  }

  def render(error:String): play.twirl.api.HtmlFormat.Appendable = apply(error)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (error) => apply(error)

  def ref: this.type = this

}


}

/**/
object signin extends signin_Scope0.signin
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 09:37:07 IST 2017
                  SOURCE: /home/knoldus/Desktop/mahesh/Ajax-Play-Assignment/Play/app/views/signin.scala.html
                  HASH: 1801397a41f4ecaa8cf5de2d85fcf7859dbad061
                  MATRIX: 529->1|638->15|666->17|732->57|746->63|789->86|1046->317|1071->322
                  LINES: 20->1|25->1|27->3|29->5|29->5|29->5|32->8|32->8
                  -- GENERATED --
              */
          