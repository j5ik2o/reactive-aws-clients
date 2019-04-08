// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class RebootNodeRequestBuilderOps(val self: RebootNodeRequest.Builder) extends AnyVal {

  final def clusterNameAsScala(value: Option[String]): RebootNodeRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  } // String

  final def nodeIdAsScala(value: Option[String]): RebootNodeRequest.Builder = {
    value.fold(self) { v =>
      self.nodeId(v)
    }
  } // String

}

final class RebootNodeRequestOps(val self: RebootNodeRequest) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName) // String

  final def nodeIdAsScala: Option[String] = Option(self.nodeId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRebootNodeRequestOps {

  implicit def toRebootNodeRequestBuilderOps(v: RebootNodeRequest.Builder): RebootNodeRequestBuilderOps =
    new RebootNodeRequestBuilderOps(v)

  implicit def toRebootNodeRequestOps(v: RebootNodeRequest): RebootNodeRequestOps = new RebootNodeRequestOps(v)

}
