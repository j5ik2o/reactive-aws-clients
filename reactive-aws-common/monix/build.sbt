import Settings._

name := "reactive-aws-common-monix"


libraryDependencies ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2L, scalaMajor)) if scalaMajor == 13 =>
      Seq(
        "io.monix" % "monix_2.13.0-M5" % monixVersion
      )
    case Some((2L, scalaMajor)) if scalaMajor <= 12 =>
      Seq(
        "io.monix" %% "monix" % monixVersion
      )
  }
}
