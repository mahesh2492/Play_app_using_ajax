
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/()(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.19*/("""


"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*13.62*/("""

        """),format.raw/*15.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/bootstrap-3.3.7-dist/css/bootstrap.min.css")),format.raw/*18.135*/("""">
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/app.js")),format.raw/*19.68*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),format.raw/*23.32*/("""
        """),_display_(/*24.10*/content),format.raw/*24.17*/("""
    """),format.raw/*25.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply()(content)

  def f:(() => (Html) => play.twirl.api.HtmlFormat.Appendable) = () => (content) => apply()(content)

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
                  DATE: Sat Mar 11 10:09:28 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/main.scala.html
                  HASH: 82ac0425e88927a3f469bc11ff704884119831ed
                  MATRIX: 777->260|889->277|919->280|999->385|1036->395|1108->440|1123->446|1186->487|1274->548|1289->554|1350->593|1402->618|1417->624|1479->665|1594->753|1609->759|1706->834|1758->859|1773->865|1833->904|1927->1060|1964->1070|1992->1077|2024->1082
                  LINES: 25->7|30->7|33->10|36->13|38->15|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|45->23|46->24|46->24|47->25
                  -- GENERATED --
              */
          