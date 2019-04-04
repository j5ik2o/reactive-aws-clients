import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenS3BaseSettings

name := "reactive-aws-s3-cats"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services.s3", "com.github.j5ik2o.reactive.aws.s3.cats")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "S3AsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "S3AsyncClient" =>
    Seq("S3CatsIOClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("S3CatsIOClient", cd: ClassDesc) if cd.simpleTypeName == "S3AsyncClient" =>
    "S3CatsIOClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
