import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenS3BaseSettings

name := "reactive-aws-s3-akka"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws") + ".akka"
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "S3AsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "S3AsyncClient" =>
    Seq("S3StreamClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("S3StreamClient", cd: ClassDesc) if cd.simpleTypeName == "S3AsyncClient" =>
    "S3StreamClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
