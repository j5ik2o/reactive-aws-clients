import Settings._

coreSettings

name := "reactive-aws-dynamodb-test"

libraryDependencies ++= Seq(
  "software.amazon.awssdk"   % "dynamodb"                   % awsSdk2Version,
  "com.amazonaws"            % "aws-java-sdk-dynamodb"      % awsSdk1Version,
  "com.amazonaws"            % "DynamoDBLocal"              % dynamoDBLocalVersion,
  "com.almworks.sqlite4java" % "sqlite4java"                % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "sqlite4java-win32-x86"      % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "sqlite4java-win32-x64"      % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "libsqlite4java-osx"         % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "libsqlite4java-linux-i386"  % sqlite4javaVersion,
  "com.almworks.sqlite4java" % "libsqlite4java-linux-amd64" % sqlite4javaVersion
)
