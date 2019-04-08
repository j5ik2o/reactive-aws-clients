// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListGlobalTablesResponseBuilderOps(val self: ListGlobalTablesResponse.Builder) extends AnyVal {

  final def globalTablesAsScala(value: Option[Seq[GlobalTable]]): ListGlobalTablesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalTables(v.asJava)
    } // Seq[GlobalTable]
  }

  final def lastEvaluatedGlobalTableNameAsScala(value: Option[String]): ListGlobalTablesResponse.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedGlobalTableName(v)
    }
  } // String

}

final class ListGlobalTablesResponseOps(val self: ListGlobalTablesResponse) extends AnyVal {

  final def globalTablesAsScala: Option[Seq[GlobalTable]] = Option(self.globalTables).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[GlobalTable]

  final def lastEvaluatedGlobalTableNameAsScala: Option[String] = Option(self.lastEvaluatedGlobalTableName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListGlobalTablesResponseOps {

  implicit def toListGlobalTablesResponseBuilderOps(
      v: ListGlobalTablesResponse.Builder
  ): ListGlobalTablesResponseBuilderOps = new ListGlobalTablesResponseBuilderOps(v)

  implicit def toListGlobalTablesResponseOps(v: ListGlobalTablesResponse): ListGlobalTablesResponseOps =
    new ListGlobalTablesResponseOps(v)

}
