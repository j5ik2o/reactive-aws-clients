import Settings._

sdkBaseName := "DynamoDb"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-test"

libraryDependencies ++= Seq(
  "software.amazon.awssdk"   % sdkBaseName.value.toLowerCase % awsSdk2Version,
  "com.amazonaws"            % "DynamoDBLocal"               % dynamoDBLocalVersion,
  "com.almworks.sqlite4java" % "sqlite4java"                 % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "sqlite4java-win32-x86"       % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "sqlite4java-win32-x64"       % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "libsqlite4java-osx"          % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "libsqlite4java-linux-i386"   % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "libsqlite4java-linux-amd64"  % sqlite4javaVersion
)
