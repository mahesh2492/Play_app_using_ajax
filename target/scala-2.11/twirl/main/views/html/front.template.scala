
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object front_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class front extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

"""),format.raw/*5.1*/("""<div id ="placeholder">

</div>
""")))}))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


}

/**/
object front extends front_Scope0.front
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 10:11:59 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/front.scala.html
                  HASH: 53228e50c6464f49152b12a6e7c4a7b0f10889b9
                  MATRIX: 534->1|662->34|690->37|703->43|742->45|770->47
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5
                  -- GENERATED --
              */
          