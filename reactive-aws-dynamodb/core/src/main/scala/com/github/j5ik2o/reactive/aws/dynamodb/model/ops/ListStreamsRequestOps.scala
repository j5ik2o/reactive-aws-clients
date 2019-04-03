// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListStreamsRequestBuilderOps(val self: ListStreamsRequest.Builder) extends AnyVal {

  final def withTableNameAsScala(value: Option[String]): ListStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withLimitAsScala(value: Option[Int]): ListStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def withExclusiveStartStreamArnAsScala(value: Option[String]): ListStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartStreamArn(v)
    }
  } // String

}

final class ListStreamsRequestOps(val self: ListStreamsRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def exclusiveStartStreamArnAsScala: Option[String] = Option(self.exclusiveStartStreamArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamsRequestOps {

  implicit def toListStreamsRequestBuilderOps(v: ListStreamsRequest.Builder): ListStreamsRequestBuilderOps =
    new ListStreamsRequestBuilderOps(v)

  implicit def toListStreamsRequestOps(v: ListStreamsRequest): ListStreamsRequestOps = new ListStreamsRequestOps(v)

}
