// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateServicePrimaryTaskSetRequestBuilderOps(val self: UpdateServicePrimaryTaskSetRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): UpdateServicePrimaryTaskSetRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala(value: Option[String]): UpdateServicePrimaryTaskSetRequest.Builder = {
    value.fold(self) { v =>
      self.service(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def primaryTaskSetAsScala(value: Option[String]): UpdateServicePrimaryTaskSetRequest.Builder = {
    value.fold(self) { v =>
      self.primaryTaskSet(v)
    }
  }

}

final class UpdateServicePrimaryTaskSetRequestOps(val self: UpdateServicePrimaryTaskSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala: Option[String] = Option(self.service)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def primaryTaskSetAsScala: Option[String] = Option(self.primaryTaskSet)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateServicePrimaryTaskSetRequestOps {

  implicit def toUpdateServicePrimaryTaskSetRequestBuilderOps(
      v: UpdateServicePrimaryTaskSetRequest.Builder
  ): UpdateServicePrimaryTaskSetRequestBuilderOps = new UpdateServicePrimaryTaskSetRequestBuilderOps(v)

  implicit def toUpdateServicePrimaryTaskSetRequestOps(
      v: UpdateServicePrimaryTaskSetRequest
  ): UpdateServicePrimaryTaskSetRequestOps = new UpdateServicePrimaryTaskSetRequestOps(v)

}
