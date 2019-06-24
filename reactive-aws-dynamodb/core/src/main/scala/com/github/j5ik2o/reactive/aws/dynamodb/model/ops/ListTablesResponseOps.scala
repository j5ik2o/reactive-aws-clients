// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListTablesResponseBuilderOps(val self: ListTablesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNamesAsScala(value: Option[Seq[String]]): ListTablesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tableNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedTableNameAsScala(value: Option[String]): ListTablesResponse.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedTableName(v)
    }
  }

}

final class ListTablesResponseOps(val self: ListTablesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNamesAsScala: Option[Seq[String]] = Option(self.tableNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedTableNameAsScala: Option[String] = Option(self.lastEvaluatedTableName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTablesResponseOps {

  implicit def toListTablesResponseBuilderOps(v: ListTablesResponse.Builder): ListTablesResponseBuilderOps =
    new ListTablesResponseBuilderOps(v)

  implicit def toListTablesResponseOps(v: ListTablesResponse): ListTablesResponseOps = new ListTablesResponseOps(v)

}
