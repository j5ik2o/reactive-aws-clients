import Settings._

coreSettings

name := "reactive-aws-common-test"

libraryDependencies ++= Seq(
  "com.google.guava" % "guava"                        % "25.1-jre",
  "commons-io"       % "commons-io"                   % "2.6",
  "org.scalatest"    %% "scalatest"                   % "3.0.5" % Provided,
  "com.whisk"        %% "docker-testkit-scalatest"    % "0.9.8",
  "com.whisk"        %% "docker-testkit-impl-spotify" % "0.9.8",
  "org.seasar.util"  % "s2util"                       % "0.0.1"
)
