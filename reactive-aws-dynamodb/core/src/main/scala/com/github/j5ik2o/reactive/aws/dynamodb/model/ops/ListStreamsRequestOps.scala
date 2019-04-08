// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListStreamsRequestBuilderOps(val self: ListStreamsRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): ListStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def limitAsScala(value: Option[Int]): ListStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def exclusiveStartStreamArnAsScala(value: Option[String]): ListStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartStreamArn(v)
    }
  }

}

final class ListStreamsRequestOps(val self: ListStreamsRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def exclusiveStartStreamArnAsScala: Option[String] = Option(self.exclusiveStartStreamArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamsRequestOps {

  implicit def toListStreamsRequestBuilderOps(v: ListStreamsRequest.Builder): ListStreamsRequestBuilderOps =
    new ListStreamsRequestBuilderOps(v)

  implicit def toListStreamsRequestOps(v: ListStreamsRequest): ListStreamsRequestOps = new ListStreamsRequestOps(v)

}
