// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class RebootNodeRequestBuilderOps(val self: RebootNodeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): RebootNodeRequest.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIdAsScala(value: Option[String]): RebootNodeRequest.Builder = {
    value.fold(self) { v => self.nodeId(v) }
  }

}

final class RebootNodeRequestOps(val self: RebootNodeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIdAsScala: Option[String] = Option(self.nodeId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRebootNodeRequestOps {

  implicit def toRebootNodeRequestBuilderOps(v: RebootNodeRequest.Builder): RebootNodeRequestBuilderOps =
    new RebootNodeRequestBuilderOps(v)

  implicit def toRebootNodeRequestOps(v: RebootNodeRequest): RebootNodeRequestOps = new RebootNodeRequestOps(v)

}
