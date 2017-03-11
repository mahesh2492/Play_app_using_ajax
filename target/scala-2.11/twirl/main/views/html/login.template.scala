
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""


"""),format.raw/*6.1*/("""<form  style="border: 3px solid #f1f1f1; width: 100%">
    <div class="imgcontainer" style =" text-align: center;
    margin: 24px 0 12px 0;">
        <img src=""""),_display_(/*9.20*/routes/*9.26*/.Assets.versioned("images/img_avatar2.png")),format.raw/*9.69*/("""" alt="Avatar" style =" width: 20%;
    border-radius: 50%;">
    </div>
    <div class="container">
        <h2>Sign in to continue</h2>
        <form>
            <div class="form-group">
                """),_display_(/*16.18*/flash/*16.23*/.get("msg").getOrElse("")),format.raw/*16.48*/("""
                """),format.raw/*17.17*/("""<input type="name" class="form-control" name ="username" id="uname" placeholder="Enter username" required style="width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;">
            </div>
            <div class="form-group">

                <input type="password" class="form-control" name ="password" id="pass" placeholder="Enter password" required style=" width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;">
            </div>
            <div class="checkbox">
                <label><input type="checkbox"> Remember me</label>
            </div>
            <button id="submit2" class="btn btn-success" style="  background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;">Login</button>
        </form>
    </div>

</form>
""")))}/*47.2*/(request)))
      }
    }
  }

  def render(flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(flash,request)

  def f:(() => (Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (flash,request) => apply()(flash,request)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 19:34:35 IST 2017
                  SOURCE: /home/knoldus/Desktop/fuck/app/views/login.scala.html
                  HASH: 796c28e372ee7b9b4062ba04f26d41d6c0ce8837
                  MATRIX: 540->1|684->50|712->53|725->59|764->61|793->64|981->226|995->232|1058->275|1292->482|1306->487|1352->512|1397->529|2403->1517
                  LINES: 20->1|25->1|27->3|27->3|27->3|30->6|33->9|33->9|33->9|40->16|40->16|40->16|41->17|71->47
                  -- GENERATED --
              */
          