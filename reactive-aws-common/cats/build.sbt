import Settings._

name := "reactive-aws-common-cats"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core"   % catsVersion,
  "org.typelevel" %% "cats-free"   % catsVersion,
  "org.typelevel" %% "cats-effect" % "1.2.0"
)
