import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

scalaWrapperGenBaseSettings("CatsIO", "Cats")

val baseName = "DynamoDb"

sdkBaseName := baseName

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-cats"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient"        => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    Seq(s"${sdkBaseName.value}CatsIOClient")
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    Seq(s"${sdkBaseName.value}StreamsCatsIOClient")
}

templateNameMapper in scalaWrapperGen := {
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}CatsIOClient" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    s"${sdkBaseName.value}CatsIOClient.ftl"
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}StreamsCatsIOClient" && cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    s"${sdkBaseName.value}StreamsCatsIOClient.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
