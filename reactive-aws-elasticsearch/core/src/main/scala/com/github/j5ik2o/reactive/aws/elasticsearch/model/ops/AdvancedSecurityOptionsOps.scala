// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AdvancedSecurityOptionsBuilderOps(val self: AdvancedSecurityOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): AdvancedSecurityOptions.Builder = {
    value.fold(self) { v => self.enabled(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internalUserDatabaseEnabledAsScala(value: Option[Boolean]): AdvancedSecurityOptions.Builder = {
    value.fold(self) { v => self.internalUserDatabaseEnabled(v) }
  }

}

final class AdvancedSecurityOptionsOps(val self: AdvancedSecurityOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internalUserDatabaseEnabledAsScala: Option[Boolean] = Option(self.internalUserDatabaseEnabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdvancedSecurityOptionsOps {

  implicit def toAdvancedSecurityOptionsBuilderOps(
      v: AdvancedSecurityOptions.Builder
  ): AdvancedSecurityOptionsBuilderOps = new AdvancedSecurityOptionsBuilderOps(v)

  implicit def toAdvancedSecurityOptionsOps(v: AdvancedSecurityOptions): AdvancedSecurityOptionsOps =
    new AdvancedSecurityOptionsOps(v)

}
