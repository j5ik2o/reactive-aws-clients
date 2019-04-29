# reactive-aws-clients

ScalaのためのAWSクライアントライブラリ。

[![CircleCI](https://circleci.com/gh/j5ik2o/reactive-aws-clients/tree/master.svg?style=shield&circle-token=ca08b2c115d354a7abff35d195b9bebe4bf960d0)](https://circleci.com/gh/j5ik2o/reactive-aws-clients/tree/master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.j5ik2o/reactive-aws-common-core_2.12/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.j5ik2o/reactive-aws-common-core_2.12)
[![Scaladoc](http://javadoc-badge.appspot.com/com.github.j5ik2o/reactive-aws-common-core_2.12.svg?label=scaladoc)](http://javadoc-badge.appspot.com/com.github.j5ik2o/reactive-aws-common-core_2.12/com/github/j5ik2o/reactive-aws-clients/index.html?javadocio=true)
[![License: MIT](http://img.shields.io/badge/license-MIT-orange.svg)](LICENSE)

## 特徴

- AWS SDK for Java V2 対応
- AWS ClientのソースコードからScalaラッパーを自動生成
    - Java SDKで使えるメソッドはすべて使うことができます(ただし、Consumer型の引数を使うメソッドは使えません)
- Javaモデルクラスのエンリッチ
    - モデルクラスなどはJavaの既存の型を利用します。これらのモデルクラスをエンリッチすることでScala用メソッド(`AsScala`サフィックス)を追加できます
- Scalaの非同期型に対応
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
    
## 動作環境
 
- Java SE 8
- Scala
    - 2.11.x
    - 2.12.x

## インストール

`build.sbt`に依存関係を追加してください。

```scala
val libraryName = "..." // e.g.) dynamodb
val version = "..."

libraryDependencies += Seq(
  "com.github.j5ik2o" %% s"reactive-aws-$libraryName-core" % version,
  "com.github.j5ik2o" %% s"reactive-aws-$libraryName-monix" % version, // optional
  "com.github.j5ik2o" %% s"reactive-aws-$libraryName-akka" % version, // optional
  "com.github.j5ik2o" %% s"reactive-aws-$libraryName-cats" % version, // optional
)
```

## 使い方

以下はdynamodbの例です。他のライブラリを使う場合もほとんど同じです。

```scala
import com.github.j5ik2o.reactive.aws.dynamodb._
import com.github.j5ik2o.reactive.aws.dynamodb.implicits._ // エンリッチのためのインポート
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.{ DynamoDbAsyncClient => JavaDynamoDbAsyncClient }

val underlying = JavaDynamoDbAsyncClient
  .builder()
  // ...
  .build()
val client = DynamoDbAsyncClient(underlying) // Javaクライントのインスタンスをコンストラクタに渡す
val putItemRequest = PutItemRequest // Javaの型をそのまま利用可能
  .builder()
  .tableName(tableName)
  .itemAsScala(
    Map[String, AttributeValue](
      "Id"   -> AttributeValue.builder().s("abc").build(),
      "Name" -> AttributeValue.builder().s("xyz").build()
    )
  ) // エンリッチされたScala用メソッドが使える
  .build()
val putItemResponseFuture = client.putItem(putItemRequest)

```

## ビルド方法

以下のコマンドを実行してください(mvnInstall の実行にはMavenが必要です)

```sh
$ sbt mvnClean mvnInstall // 初回のみ
$ sbt compile
```



