// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateGlobalTableRequestBuilderOps(val self: UpdateGlobalTableRequest.Builder) extends AnyVal {

  final def globalTableNameAsScala(value: Option[String]): UpdateGlobalTableRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  } // String

  final def replicaUpdatesAsScala(value: Option[Seq[ReplicaUpdate]]): UpdateGlobalTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicaUpdates(v.asJava)
    } // Seq[ReplicaUpdate]
  }

}

final class UpdateGlobalTableRequestOps(val self: UpdateGlobalTableRequest) extends AnyVal {

  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName) // String

  final def replicaUpdatesAsScala: Option[Seq[ReplicaUpdate]] = Option(self.replicaUpdates).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ReplicaUpdate]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateGlobalTableRequestOps {

  implicit def toUpdateGlobalTableRequestBuilderOps(
      v: UpdateGlobalTableRequest.Builder
  ): UpdateGlobalTableRequestBuilderOps = new UpdateGlobalTableRequestBuilderOps(v)

  implicit def toUpdateGlobalTableRequestOps(v: UpdateGlobalTableRequest): UpdateGlobalTableRequestOps =
    new UpdateGlobalTableRequestOps(v)

}
