
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

"""),format.raw/*5.1*/("""<div class="container">
    <h2>Create a new account</h2>
    <h5>It's free and always will be.</h5>
    <form class ="userForm" action=""""),_display_(/*8.38*/routes/*8.44*/.Signup.addPerson()),format.raw/*8.63*/("""" method="post">
        <div class="form-group">

            <input type="text" class="form-control" placeholder="Firstname" name="fname" required><br>
            <input type="text" class="form-control" placeholder="Middlename" name="mname" ><br>
            <input type="text" class="form-control" placeholder="Lastname" name="lname" required><br>
            <input type="text" class="form-control" placeholder="Select Username" name="uname" required><br>
            <input type="password" class="form-control" placeholder="Enter Password" name="password" required><br>
            <input type="password" class="form-control" placeholder="Re-Enter Password" name="repassword" required><br>
            <input type="number" class="form-control" placeholder="Enter Mobile Number" name="mobile" required><br>

            <div class="form-group row">
                <label class="radio-inline"><input type="radio" name="gender" value="male">Male</label>
                <label class="radio-inline"><input type="radio" name="gender" value="female">Female</label>
            </div><br>
            <input type="number" class="form-control" placeholder="Age (18-75)" id="age" min ="18" max ="75" name="age" required><br>
            <div class="form-group row">
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="Tv Shows">Tv Shows</label>
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="Sky Diving">Sky Diving</label>
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="Reading Novels">Reading Novels</label>
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="Movies">Movies</label>
                <label class="checkbox-inline"><input type="checkbox" name="hobbies" value="none">None of mentioned</label>
            </div>

        </div>



        <button type="submit" class="btn btn-success">Create Account</button>
    </form>
</div>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 10:03:02 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/signup.scala.html
                  HASH: d709012339f613dbc0b26cf58ef3a9553a9c8665
                  MATRIX: 611->3|624->9|663->11|691->13|855->151|869->157|908->176
                  LINES: 25->3|25->3|25->3|27->5|30->8|30->8|30->8
                  -- GENERATED --
              */
          