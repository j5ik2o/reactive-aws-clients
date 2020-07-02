// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class RebootNodeResponseBuilderOps(val self: RebootNodeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[Cluster]): RebootNodeResponse.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

}

final class RebootNodeResponseOps(val self: RebootNodeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[Cluster] = Option(self.cluster)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRebootNodeResponseOps {

  implicit def toRebootNodeResponseBuilderOps(v: RebootNodeResponse.Builder): RebootNodeResponseBuilderOps =
    new RebootNodeResponseBuilderOps(v)

  implicit def toRebootNodeResponseOps(v: RebootNodeResponse): RebootNodeResponseOps = new RebootNodeResponseOps(v)

}
