
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

"""),format.raw/*3.1*/("""<div class="row">
    <div class="col-md-4"></div>
    <div class="col-md-4">

        <h1>Welcome</h1>
    </div>
    <div class="col-md-4"></div>

</div>

""")))}),format.raw/*13.2*/("""`"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 10:03:02 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/home.scala.html
                  HASH: 22dbfca044ba7ae6d287cdd45a450c1e185f76c0
                  MATRIX: 607->1|620->7|659->9|687->11|875->169
                  LINES: 25->1|25->1|25->1|27->3|37->13
                  -- GENERATED --
              */
          