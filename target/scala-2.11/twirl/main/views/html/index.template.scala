
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*6.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.4*/("""


"""),format.raw/*13.3*/("""
"""),_display_(/*14.2*/main()/*14.8*/ {_display_(Seq[Any](format.raw/*14.10*/("""
"""),format.raw/*15.1*/("""<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href ="sign" id="a">Sign Up</a></li>
            <li><a href ="login" id ="b">Sign In</a></li>
        </ul>
    </div>
</nav>

"""),format.raw/*30.3*/("""


""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/*
* This template takes a single argument, a String containing a
* message to display.
*/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 10:03:19 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/index.scala.html
                  HASH: 99ff63d6a3ce43e74eb5d237ac0aaffcbc063e19
                  MATRIX: 606->93|702->95|732->288|760->290|774->296|814->298|842->299|1230->768|1264->772
                  LINES: 23->6|28->6|31->13|32->14|32->14|32->14|33->15|45->30|48->33
                  -- GENERATED --
              */
          