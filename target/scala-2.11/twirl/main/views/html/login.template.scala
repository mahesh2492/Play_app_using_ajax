
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""


"""),format.raw/*6.1*/("""<form action=""""),_display_(/*6.16*/routes/*6.22*/.Login.processForm()),format.raw/*6.42*/("""" method="post" style="border: 3px solid #f1f1f1; width: 100%">
    <div class="imgcontainer" style =" text-align: center;
    margin: 24px 0 12px 0;">
        <img src=""""),_display_(/*9.20*/routes/*9.26*/.Assets.versioned("images/img_avatar2.png")),format.raw/*9.69*/("""" alt="Avatar" style =" width: 20%;
    border-radius: 50%;">
    </div>
    <div class="container">
        <h2>Sign in to continue</h2>
        <form>
            <div class="form-group">
                <label for="usr">Username:</label>
                <input type="name" class="form-control" name ="username" id="usr" placeholder="Enter username" required style="width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;">
            </div>
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" name ="password" id="pwd" placeholder="Enter password" required style=" width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;">
            </div>
            <div class="checkbox">
                <label><input type="checkbox"> Remember me</label>
            </div>
            <button type="submit" class="btn btn-success" style="  background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;">Login</button>
        </form>
    </div>

</form>
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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 10:03:02 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/login.scala.html
                  HASH: a17d51a3b49a4b9e5ed7b241e2ea3027b0352c65
                  MATRIX: 609->3|622->9|661->11|690->14|731->29|745->35|785->55|982->226|996->232|1059->275
                  LINES: 25->3|25->3|25->3|28->6|28->6|28->6|28->6|31->9|31->9|31->9
                  -- GENERATED --
              */
          