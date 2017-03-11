
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Desktop/mahesh/Ajax-Play-Assignment/Play/conf/routes
// @DATE:Sat Mar 11 09:37:07 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
