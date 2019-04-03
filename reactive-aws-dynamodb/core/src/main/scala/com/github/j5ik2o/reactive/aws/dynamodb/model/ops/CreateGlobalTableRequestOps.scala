// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateGlobalTableRequestBuilderOps(val self: CreateGlobalTableRequest.Builder) extends AnyVal {

  final def withGlobalTableNameAsScala(value: Option[String]): CreateGlobalTableRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  } // String

  final def withReplicationGroupAsScala(value: Option[Seq[Replica]]): CreateGlobalTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicationGroup(v.asJava)
    } // Seq[Replica]
  }

}

final class CreateGlobalTableRequestOps(val self: CreateGlobalTableRequest) extends AnyVal {

  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName) // String

  final def replicationGroupAsScala: Option[Seq[Replica]] = Option(self.replicationGroup).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Replica]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGlobalTableRequestOps {

  implicit def toCreateGlobalTableRequestBuilderOps(
      v: CreateGlobalTableRequest.Builder
  ): CreateGlobalTableRequestBuilderOps = new CreateGlobalTableRequestBuilderOps(v)

  implicit def toCreateGlobalTableRequestOps(v: CreateGlobalTableRequest): CreateGlobalTableRequestOps =
    new CreateGlobalTableRequestOps(v)

}
