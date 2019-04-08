// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalTableBuilderOps(val self: GlobalTable.Builder) extends AnyVal {

  final def globalTableNameAsScala(value: Option[String]): GlobalTable.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  } // String

  final def replicationGroupAsScala(value: Option[Seq[Replica]]): GlobalTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicationGroup(v.asJava)
    } // Seq[Replica]
  }

}

final class GlobalTableOps(val self: GlobalTable) extends AnyVal {

  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName) // String

  final def replicationGroupAsScala: Option[Seq[Replica]] = Option(self.replicationGroup).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Replica]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalTableOps {

  implicit def toGlobalTableBuilderOps(v: GlobalTable.Builder): GlobalTableBuilderOps = new GlobalTableBuilderOps(v)

  implicit def toGlobalTableOps(v: GlobalTable): GlobalTableOps = new GlobalTableOps(v)

}
