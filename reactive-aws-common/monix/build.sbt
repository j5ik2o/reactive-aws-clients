import Settings._

name := "reactive-aws-common-monix"


libraryDependencies ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2L, _)) =>
      Seq(
        "io.monix" %% "monix" % monixVersion
      )
  }
}
