// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DomainEndpointOptionsStatusBuilderOps(val self: DomainEndpointOptionsStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[DomainEndpointOptions]): DomainEndpointOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[OptionStatus]): DomainEndpointOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class DomainEndpointOptionsStatusOps(val self: DomainEndpointOptionsStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[DomainEndpointOptions] = Option(self.options)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[OptionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDomainEndpointOptionsStatusOps {

  implicit def toDomainEndpointOptionsStatusBuilderOps(
      v: DomainEndpointOptionsStatus.Builder
  ): DomainEndpointOptionsStatusBuilderOps = new DomainEndpointOptionsStatusBuilderOps(v)

  implicit def toDomainEndpointOptionsStatusOps(v: DomainEndpointOptionsStatus): DomainEndpointOptionsStatusOps =
    new DomainEndpointOptionsStatusOps(v)

}
