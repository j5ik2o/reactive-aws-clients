import Settings._

sdkBaseName := "Eks"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % sdkBaseName.value.toLowerCase % awsSdk2Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

scalaWrapperGenCoreSettings
