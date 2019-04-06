import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenSQSBaseSettings

name := "reactive-aws-sqs-monix"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services.sqs", "com.github.j5ik2o.reactive.aws.sqs.monix")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "SqsAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "SqsAsyncClient" =>
    Seq("SQSMonixClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("SQSMonixClient", cd: ClassDesc) if cd.simpleTypeName == "SqsAsyncClient" =>
    "SQSMonixClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
