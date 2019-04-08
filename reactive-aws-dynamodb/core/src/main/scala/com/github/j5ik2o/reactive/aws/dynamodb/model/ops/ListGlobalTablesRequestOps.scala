// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListGlobalTablesRequestBuilderOps(val self: ListGlobalTablesRequest.Builder) extends AnyVal {

  final def exclusiveStartGlobalTableNameAsScala(value: Option[String]): ListGlobalTablesRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartGlobalTableName(v)
    }
  } // String

  final def limitAsScala(value: Option[Int]): ListGlobalTablesRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def regionNameAsScala(value: Option[String]): ListGlobalTablesRequest.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  } // String

}

final class ListGlobalTablesRequestOps(val self: ListGlobalTablesRequest) extends AnyVal {

  final def exclusiveStartGlobalTableNameAsScala: Option[String] = Option(self.exclusiveStartGlobalTableName) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def regionNameAsScala: Option[String] = Option(self.regionName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListGlobalTablesRequestOps {

  implicit def toListGlobalTablesRequestBuilderOps(
      v: ListGlobalTablesRequest.Builder
  ): ListGlobalTablesRequestBuilderOps = new ListGlobalTablesRequestBuilderOps(v)

  implicit def toListGlobalTablesRequestOps(v: ListGlobalTablesRequest): ListGlobalTablesRequestOps =
    new ListGlobalTablesRequestOps(v)

}
