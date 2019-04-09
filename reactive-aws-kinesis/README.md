# reactive-kinesis

AWS Kinesis Client for Scala

## Installation

Add the following to your sbt build (Scala 2.11.x, 2.12.x):

```scala
resolvers += "Sonatype OSS Release Repository" at "https://oss.sonatype.org/content/repositories/releases/"

val version = "..."

libraryDependencies += Seq(
  "com.github.j5ik2o" %% "reactive-aws-kinesis-core" % version,
  "com.github.j5ik2o" %% "reactive-aws-kinesis-monix" % version, // optional
  "com.github.j5ik2o" %% "reactive-aws-kinesis-akka" % version, // optional
  "com.github.j5ik2o" %% "reactive-aws-kinesis-cats" % version, // optional
)
```

## Usage

- default: scala.concurrent.Future

```scala
val client = KinesisAsyncClient(underlying)
val resultFuture = client.getRecords(getRecordsRequest)
val result = Awat.result(resultFuture, Duration.Inf)
```

- monix: monix.eval.Task

```scala
val client = KinesisMonixClient(underlying)
val resultFuture = client.getRecords(getRecordsRequest).runToFuture
val result = Awat.result(resultFuture, Duration.Inf)
```

- cats: cats.effect.IO

```scala
val client = KinesisCatsIOClient(underlying)
val resultFuture = client.getRecords(getRecordsRequest).unsafeToFuture()
val result = Awat.result(resultFuture, Duration.Inf)
```

- akka-stream: akka.scaladsl.Flow

```scala
val client = KinesisAkkaClient(underlying)
val resultFuture = Source.single(getRecordsRequest)
  .via(client.getRecordsFlow)
  .runWith(Sink.head)
val result = Awat.result(resultFuture, Duration.Inf)
```

