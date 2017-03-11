
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

"""),format.raw/*5.1*/("""<div class="container" id="signup">
    <h2>Create a new account</h2>
    <h5>It's free and always will be.</h5>
    <form class ="userForm" >
        <div class="form-group">

            <input type="text" class="form-control" id="fname" placeholder="Firstname" name="fname" required><br>
            <input type="text" class="form-control" id="mname" placeholder="Middlename" name="mname" ><br>
            <input type="text" class="form-control" id="lname" placeholder="Lastname" name="lname" required><br>
            <input type="text" class="form-control" id="uname" placeholder="Select Username" name="uname" required><br>   """),_display_(/*14.124*/flash/*14.129*/.get("alreadyExist").getOrElse("")),format.raw/*14.163*/("""
            """),format.raw/*15.13*/("""<input type="password" class="form-control" id="pass" placeholder="Enter Password" name="password" required><br>
            <input type="password" class="form-control" id="repass"  placeholder="Re-Enter Password" name="repassword" required><br> """),_display_(/*16.135*/flash/*16.140*/.get("PasswordMismatch").getOrElse("")),format.raw/*16.178*/("""
            """),format.raw/*17.13*/("""<input type="number" class="form-control" id="mobile" placeholder="Enter Mobile Number" name="mobile" required><br>"""),_display_(/*17.129*/flash/*17.134*/.get("mobile").getOrElse("")),format.raw/*17.162*/("""

            """),format.raw/*19.13*/("""<div class="form-group row" id="gender">
                <label class="radio-inline"><input type="radio" name="gender" value="male">Male</label>
                <label class="radio-inline"><input type="radio" name="gender" value="female">Female</label>
            </div><br>
            <input type="number" class="form-control" id="age" placeholder="Age (18-75)" id="age" min ="18" max ="75" name="age" required><br>
            <div class="form-group row" id="hobbies">
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="Tv Shows">Tv Shows</label>
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="Sky Diving">Sky Diving</label>
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="Reading Novels">Reading Novels</label>
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="Movies">Movies</label>
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="none">None of mentioned</label>
            </div>

        </div>



        <button id="submit" class="btn btn-success">Create Account</button>
    </form>
</div>

""")))}/*40.2*/(request)))
      }
    }
  }

  def render(flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(flash,request)

  def f:(() => (Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (flash,request) => apply()(flash,request)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 20:43:57 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/signup.scala.html
                  HASH: 38eb1247b002f5eef0262db9c7e0a6949eb37560
                  MATRIX: 542->1|686->50|714->53|727->59|766->61|794->63|1456->697|1471->702|1527->736|1568->749|1843->996|1858->1001|1918->1039|1959->1052|2103->1168|2118->1173|2168->1201|2210->1215|3448->2435
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|38->14|38->14|38->14|39->15|40->16|40->16|40->16|41->17|41->17|41->17|41->17|43->19|64->40
                  -- GENERATED --
              */
          