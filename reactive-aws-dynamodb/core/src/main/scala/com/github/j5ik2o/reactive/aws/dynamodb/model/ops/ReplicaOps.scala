// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaBuilderOps(val self: Replica.Builder) extends AnyVal {

  final def withRegionNameAsScala(value: Option[String]): Replica.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  } // String

}

final class ReplicaOps(val self: Replica) extends AnyVal {

  final def regionNameAsScala: Option[String] = Option(self.regionName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaOps {

  implicit def toReplicaBuilderOps(v: Replica.Builder): ReplicaBuilderOps = new ReplicaBuilderOps(v)

  implicit def toReplicaOps(v: Replica): ReplicaOps = new ReplicaOps(v)

}
