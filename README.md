# reactive-aws-clients

AWS Client libraries for Scala

[![CircleCI](https://circleci.com/gh/j5ik2o/reactive-aws-clients/tree/master.svg?style=shield&circle-token=ca08b2c115d354a7abff35d195b9bebe4bf960d0)](https://circleci.com/gh/j5ik2o/reactive-aws-clients/tree/master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.j5ik2o/reactive-aws-common-core_2.12/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.j5ik2o/reactive-aws-common-core_2.12)
[![Scaladoc](http://javadoc-badge.appspot.com/com.github.j5ik2o/reactive-aws-common-core_2.12.svg?label=scaladoc)](http://javadoc-badge.appspot.com/com.github.j5ik2o/reactive-aws-common-core_2.12/com/github/j5ik2o/reactive-aws-clients/index.html?javadocio=true)
[![License: MIT](http://img.shields.io/badge/license-MIT-orange.svg)](LICENSE)

[日本語README](README.ja.md)

## Features

- AWS SDK for Java V2 Support
- Scala wrapper auto generation from Java sources of AWS 
    - Support all java methods via Scala wrapper(but methods which Consumer type has can't used)
- Enrich Java model classes
    - Support Java model classes, add methods(`AsScala` suffix) for Scala by enriching the Java model class
- Support concurrent types
    - core
        - `scala.concurrent.Future`
    - monix
        - `monix.eval.Task`
        - `monix.reactive.Observable`
    - cats-effect
        - `cats.effect.IO`
    - akka-stream
        - `akka.stream.scaladsl.Source`
        - `akka.stream.scaladsl.Flow`
    
## Support environments

- Java SE 8
- Scala
    - 2.11.x
    - 2.12.x
    - 2.13.x

## Installation

Add dependencies to `build.sbt`.

```scala
val libraryName = "dynamodb"
val version = "1.1.4"

libraryDependencies += Seq(
  "com.github.j5ik2o" %% s"reactive-aws-$libraryName-core" % version,
  "com.github.j5ik2o" %% s"reactive-aws-$libraryName-monix" % version, // optional
  "com.github.j5ik2o" %% s"reactive-aws-$libraryName-akka" % version, // optional
  "com.github.j5ik2o" %% s"reactive-aws-$libraryName-cats" % version, // optional
)
```

## Usage

The following is an example of dynamodb. The usage is almost the same as other libraries.

```scala
import com.github.j5ik2o.reactive.aws.dynamodb._
import com.github.j5ik2o.reactive.aws.dynamodb.implicits._ // import for enrich
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.{ DynamoDbAsyncClient => JavaDynamoDbAsyncClient }

val underlying = JavaDynamoDbAsyncClient
  .builder()
  // ...
  .build()
val client = DynamoDbAsyncClient(underlying) // Pass the Java client instance to the constructor
val putItemRequest = PutItemRequest // Java types can be used as is
  .builder()
  .tableName(tableName)
  .itemAsScala(
    Map[String, AttributeValue](
      "Id"   -> AttributeValue.builder().s("abc").build(),
      "Name" -> AttributeValue.builder().s("xyz").build()
    )
  ) // use the enriched Scala method
  .build()
val putItemResponseFuture = client.putItem(putItemRequest)

```

## How to build

Run the following commands (`Maven` is required to run `mvnInstall` or `mvnClean`)

```sh
$ sbt mvnClean mvnInstall // first time only
$ sbt compile
```

## How to contribute

If you need other SDK features, please create an issue or send a P-R.



