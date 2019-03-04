# reactive-kinesis

AWS Kinesis Client for Scala

## Installation

Add the following to your sbt build (Scala 2.11.x, 2.12.x):

```scala
resolvers += "Sonatype OSS Release Repository" at "https://oss.sonatype.org/content/repositories/releases/"

val version = "..."

libraryDependencies += Seq(
  "com.github.j5ik2o" %% "reactive-kinesis-v2" % version, // or -v1
  "com.github.j5ik2o" %% "reactive-kinesis-v2-monix" % version, // optional
  "com.github.j5ik2o" %% "reactive-kinesis-v2-akka" % version, // optional
  "com.github.j5ik2o" %% "reactive-kinesis-v2-cats" % version, // optional
)
```

The module has `reactive-kinesis-v2` prefix supports [aws-sdk of version 2](https://github.com/aws/aws-sdk-java-v2).
If need legacy aws-sdk, choose `reactive-kinesis-v1` modules. `reactive-kinesis-cats`,`reactive-kinesis-monix`,`reactive-kinesis-akka` can be used with either v1 or v2

## Usage

- default: scala.concurrent.Future

```scala
val client = KinesisAsyncClientV2(underlying)
val resultFuture = client.getRecords(getRecordsRequest)
val result = Awat.result(resultFuture, Duration.Inf)
```

- monix: monix.eval.Task

```scala
val client = KinesisTaskClientV2(underlying)
val resultFuture = client.getRecords(getRecordsRequest).runToFuture
val result = Awat.result(resultFuture, Duration.Inf)
```

- cats: cats.data.ReaderT

```scala
val ec: ExecutionContext = ...
val client = KinesisAsyncClientV2(underlying)
val resultFuture = client.getRecords(getRecordsRequest).run(ec)
val result = Awat.result(resultFuture, Duration.Inf)
```

- akka-stream: akka.scaladsl.Flow

```scala
val client = KinesisStreamClientV2(underlying)
val resultFuture = Source.single(getRecordsRequest)
  .via(client.getRecordsFlow)
  .runWith(Sink.head)
val result = Awat.result(resultFuture, Duration.Inf)
```

