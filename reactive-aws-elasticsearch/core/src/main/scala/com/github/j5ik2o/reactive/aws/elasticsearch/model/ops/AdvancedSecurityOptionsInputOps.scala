// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AdvancedSecurityOptionsInputBuilderOps(val self: AdvancedSecurityOptionsInput.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): AdvancedSecurityOptionsInput.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internalUserDatabaseEnabledAsScala(value: Option[Boolean]): AdvancedSecurityOptionsInput.Builder = {
    value.fold(self) { v =>
      self.internalUserDatabaseEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterUserOptionsAsScala(value: Option[MasterUserOptions]): AdvancedSecurityOptionsInput.Builder = {
    value.fold(self) { v =>
      self.masterUserOptions(v)
    }
  }

}

final class AdvancedSecurityOptionsInputOps(val self: AdvancedSecurityOptionsInput) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internalUserDatabaseEnabledAsScala: Option[Boolean] = Option(self.internalUserDatabaseEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterUserOptionsAsScala: Option[MasterUserOptions] = Option(self.masterUserOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdvancedSecurityOptionsInputOps {

  implicit def toAdvancedSecurityOptionsInputBuilderOps(
      v: AdvancedSecurityOptionsInput.Builder
  ): AdvancedSecurityOptionsInputBuilderOps = new AdvancedSecurityOptionsInputBuilderOps(v)

  implicit def toAdvancedSecurityOptionsInputOps(v: AdvancedSecurityOptionsInput): AdvancedSecurityOptionsInputOps =
    new AdvancedSecurityOptionsInputOps(v)

}
