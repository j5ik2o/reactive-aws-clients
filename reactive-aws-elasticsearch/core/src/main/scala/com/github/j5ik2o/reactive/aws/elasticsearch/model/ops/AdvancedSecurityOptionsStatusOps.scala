// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AdvancedSecurityOptionsStatusBuilderOps(val self: AdvancedSecurityOptionsStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[AdvancedSecurityOptions]): AdvancedSecurityOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[OptionStatus]): AdvancedSecurityOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class AdvancedSecurityOptionsStatusOps(val self: AdvancedSecurityOptionsStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[AdvancedSecurityOptions] = Option(self.options)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[OptionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdvancedSecurityOptionsStatusOps {

  implicit def toAdvancedSecurityOptionsStatusBuilderOps(
      v: AdvancedSecurityOptionsStatus.Builder
  ): AdvancedSecurityOptionsStatusBuilderOps = new AdvancedSecurityOptionsStatusBuilderOps(v)

  implicit def toAdvancedSecurityOptionsStatusOps(v: AdvancedSecurityOptionsStatus): AdvancedSecurityOptionsStatusOps =
    new AdvancedSecurityOptionsStatusOps(v)

}
