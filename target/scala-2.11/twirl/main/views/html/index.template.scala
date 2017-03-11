
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*5.3*/("""
"""),_display_(/*6.2*/()),format.raw/*6.4*/("""


"""),format.raw/*13.3*/("""
"""),_display_(/*14.2*/main()/*14.8*/ {_display_(Seq[Any](format.raw/*14.10*/("""
"""),format.raw/*15.1*/("""<div class="jumbotron text-center" style="background-color: #f4511e; color: #fff;">
    <h1>Welcome</h1>
    <p>Login/Signup Application</p>
    <form class="form-inline">

            <div class="input-group-btn">
                <a id ="a" class="btn btn-danger" role="button">Sign Up</a>-->
                <a id ="b" class="btn btn-info" role="button">Sign In</a>-->
            </div>
    </form>
</div>


"""),format.raw/*31.3*/("""


""")))}/*34.2*/(request)),format.raw/*34.11*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 17:23:23 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/index.scala.html
                  HASH: 1d5bcd512396b59c1ba1f810c6a65a37531e2485
                  MATRIX: 534->1|664->36|691->127|718->129|739->131|769->324|797->326|811->332|851->334|879->335|1317->854|1339->858|1369->867
                  LINES: 20->1|25->1|26->5|27->6|27->6|30->13|31->14|31->14|31->14|32->15|45->31|48->34|48->34
                  -- GENERATED --
              */
          