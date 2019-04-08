// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFleetsRequestBuilderOps(val self: DeleteFleetsRequest.Builder) extends AnyVal {

  final def fleetIdsAsScala(value: Option[Seq[String]]): DeleteFleetsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.fleetIds(v.asJava)
    }
  }

  final def terminateInstancesAsScala(value: Option[Boolean]): DeleteFleetsRequest.Builder = {
    value.fold(self) { v =>
      self.terminateInstances(v)
    }
  }

}

final class DeleteFleetsRequestOps(val self: DeleteFleetsRequest) extends AnyVal {

  final def fleetIdsAsScala: Option[Seq[String]] = Option(self.fleetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def terminateInstancesAsScala: Option[Boolean] = Option(self.terminateInstances)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFleetsRequestOps {

  implicit def toDeleteFleetsRequestBuilderOps(v: DeleteFleetsRequest.Builder): DeleteFleetsRequestBuilderOps =
    new DeleteFleetsRequestBuilderOps(v)

  implicit def toDeleteFleetsRequestOps(v: DeleteFleetsRequest): DeleteFleetsRequestOps = new DeleteFleetsRequestOps(v)

}
