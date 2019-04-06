import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenSQSBaseSettings

name := "reactive-aws-sqs-akka"

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
  case cd if cd.simpleTypeName == "SqsAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "SqsAsyncClient" =>
    Seq("SQSStreamClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("SQSStreamClient", cd: ClassDesc) if cd.simpleTypeName == "SqsAsyncClient" =>
    "SQSStreamClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
