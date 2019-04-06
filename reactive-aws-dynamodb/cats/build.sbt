import Settings._

coreSettings

scalaWrapperGenBaseSettings("CatsIO", "Cats")

val baseName = "DynamoDb"

sdkBaseName := baseName

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-cats"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value
