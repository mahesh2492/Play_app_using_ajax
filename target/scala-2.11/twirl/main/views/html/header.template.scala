
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a id="front">Home</a></li>
            <li><a  id="a">Sign Up</a></li>
            <li><a id ="b">Sign In</a></li>
        </ul>
    </div>
</nav>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 11:12:05 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/header.scala.html
                  HASH: 459ba611cc2520578ad45e6150446d29d9ef7e85
                  MATRIX: 611->0
                  LINES: 25->1
                  -- GENERATED --
              */
          