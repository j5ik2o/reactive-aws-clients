import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenKinesisBaseSettings

name := "reactive-aws-kinesis-monix"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws") + ".monix"
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient" =>
    Seq("KinesisMonixClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("KinesisMonixClient", cd: ClassDesc) if cd.simpleTypeName == "KinesisAsyncClient" =>
    "KinesisMonixClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
