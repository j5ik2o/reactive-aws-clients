import Settings._

coreSettings

name := "reactive-aws-common-monix"

libraryDependencies ++= Seq(
  "io.monix" %% "monix" % monixVersion
)
