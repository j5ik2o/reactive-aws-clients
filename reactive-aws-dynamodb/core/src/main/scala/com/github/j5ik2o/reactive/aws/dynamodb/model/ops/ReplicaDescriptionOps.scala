// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaDescriptionBuilderOps(val self: ReplicaDescription.Builder) extends AnyVal {

  final def withRegionNameAsScala(value: Option[String]): ReplicaDescription.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  } // String

}

final class ReplicaDescriptionOps(val self: ReplicaDescription) extends AnyVal {

  final def regionNameAsScala: Option[String] = Option(self.regionName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaDescriptionOps {

  implicit def toReplicaDescriptionBuilderOps(v: ReplicaDescription.Builder): ReplicaDescriptionBuilderOps =
    new ReplicaDescriptionBuilderOps(v)

  implicit def toReplicaDescriptionOps(v: ReplicaDescription): ReplicaDescriptionOps = new ReplicaDescriptionOps(v)

}
