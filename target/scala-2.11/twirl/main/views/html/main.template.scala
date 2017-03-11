
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Html,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*8.2*/()(content: Html)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.52*/("""


"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*14.62*/("""

        """),format.raw/*16.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/bootstrap-3.3.7-dist/css/bootstrap.min.css")),format.raw/*18.135*/("""">
         <script src=""""),_display_(/*19.24*/routes/*19.30*/.Assets.versioned("javascripts/jQuery.js")),format.raw/*19.72*/("""" type="text/javascript"></script>

          <script src=""""),_display_(/*21.25*/routes/*21.31*/.Assets.versioned("bootstrapjs/bootstrap.min.js")),format.raw/*21.80*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("javascripts/app.js")),format.raw/*22.68*/("""" type="text/javascript"></script>



        """),_display_(/*26.10*/helper/*26.16*/.javascriptRouter("jsRoutes")/*26.45*/(
        routes.javascript.Signup.showForm,
        routes.javascript.Signup.addPerson,
        routes.javascript.Login.showForm,
        routes.javascript.Login.processForm
        )),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""</head>
    <body >
        """),format.raw/*35.32*/("""
        """),_display_(/*36.10*/content),format.raw/*36.17*/("""
    """),format.raw/*37.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(content:Html,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(content)(request)

  def f:(() => (Html) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (content) => (request) => apply()(content)(request)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 18:58:07 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/main.scala.html
                  HASH: 34953d3a932a76af16c2a3fa72a763380a26a162
                  MATRIX: 791->261|936->311|966->314|1046->419|1083->429|1155->474|1170->480|1233->521|1321->582|1336->588|1397->627|1480->683|1495->689|1592->764|1645->790|1660->796|1723->838|1810->898|1825->904|1895->953|1979->1010|1994->1016|2054->1055|2128->1102|2143->1108|2181->1137|2386->1321|2418->1326|2474->1444|2511->1454|2539->1461|2571->1466
                  LINES: 25->8|30->8|33->11|36->14|38->16|38->16|38->16|38->16|39->17|39->17|39->17|40->18|40->18|40->18|41->19|41->19|41->19|43->21|43->21|43->21|44->22|44->22|44->22|48->26|48->26|48->26|53->31|54->32|56->35|57->36|57->36|58->37
                  -- GENERATED --
              */
          