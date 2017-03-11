
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(error:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Sign Up Page</h1>
<form action=""""),_display_(/*10.16*/routes/*10.22*/.SignupController.store),format.raw/*10.45*/("""" method="post" style="border:double;"><br>
First Name : <input type="text" name="firstname" placeholder="First Name">*Should not be Empty<br><br>
Middle Name : <input type="text" name="middlename" placeholder="Middle Name"><br>
    <br>
    Last Name : <input type="text" name="lastname" placeholder="Last Name">*Should not be Empty<br><br>
    User Name : <input type="text" name="username" placeholder="Username"><br><br>
    Password : <input type="password" name="password" placeholder="Password"><br><br>
    Re-Password : <input type="password" name="repassword" placeholder="Re-Password">*Password should match<br><br>
    Mobile Number : <input type="text" name="mobile" placeholder="Mobile">*10 digit mobile number<br><br>
    Gender : <input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="Female">Female<br><br>
        Age : <input type="text" name="age" placeholder="Age">*Age limit 18 to 75<br><br>
        Hobbies : <select name="hobbies">
            <option value="Playing Cricket">Playing Cricket</option>
            <option value="Listening Music">Listening Music</option>
            <option value="Watching Movies">Watching Movies</option>
        </select><br><br>
    <div style="color:red;  ">"""),_display_(/*26.32*/error),format.raw/*26.37*/("""</div>
    <button>Submit</button>
</form>

</body>
</html>"""))
      }
    }
  }

  def render(error:String): play.twirl.api.HtmlFormat.Appendable = apply(error)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (error) => apply(error)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 09:37:07 IST 2017
                  SOURCE: /home/knoldus/Desktop/mahesh/Ajax-Play-Assignment/Play/app/views/signup.scala.html
                  HASH: 7d1dc7fb649f56868f855f008a3aecb6d7ad419c
                  MATRIX: 529->1|638->15|665->16|836->160|851->166|895->189|2180->1447|2206->1452
                  LINES: 20->1|25->1|26->2|34->10|34->10|34->10|50->26|50->26
                  -- GENERATED --
              */
          