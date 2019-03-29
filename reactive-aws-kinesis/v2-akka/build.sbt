import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenKinesisBaseSettings

name := "reactive-aws-kinesis-v2-akka"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  _.replace("software.amazon.awssdk.services.kinesis", "com.github.j5ik2o.reactive.aws.kinesis.v2.akka")
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient" =>
    Seq("KinesisStreamClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("KinesisStreamClient", cd: ClassDesc) if cd.simpleTypeName == "KinesisAsyncClient" =>
    "KinesisStreamClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
