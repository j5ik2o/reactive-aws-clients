import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenDynamoDBBaseSettings

name := "reactive-aws-dynamodb-cats"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

packageNameMapper in scalaWrapperGen := {
  case (s, _, _) =>
    s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws") + ".cats"
}

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    Seq("DynamoDBCatsIOClient")
}

templateNameMapper in scalaWrapperGen := {
  case ("DynamoDBCatsIOClient", cd: ClassDesc) if cd.simpleTypeName == "DynamoDbAsyncClient" =>
    "DynamoDBCatsIOClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
