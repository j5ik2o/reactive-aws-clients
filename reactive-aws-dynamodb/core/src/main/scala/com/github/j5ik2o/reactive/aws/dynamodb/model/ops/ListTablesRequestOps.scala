// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListTablesRequestBuilderOps(val self: ListTablesRequest.Builder) extends AnyVal {

  final def exclusiveStartTableNameAsScala(value: Option[String]): ListTablesRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartTableName(v)
    }
  }

  final def limitAsScala(value: Option[Int]): ListTablesRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

}

final class ListTablesRequestOps(val self: ListTablesRequest) extends AnyVal {

  final def exclusiveStartTableNameAsScala: Option[String] = Option(self.exclusiveStartTableName)

  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTablesRequestOps {

  implicit def toListTablesRequestBuilderOps(v: ListTablesRequest.Builder): ListTablesRequestBuilderOps =
    new ListTablesRequestBuilderOps(v)

  implicit def toListTablesRequestOps(v: ListTablesRequest): ListTablesRequestOps = new ListTablesRequestOps(v)

}
