// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectLockConfigurationBuilderOps(val self: ObjectLockConfiguration.Builder) extends AnyVal {

  final def withObjectLockEnabledAsScala(value: Option[ObjectLockEnabled]): ObjectLockConfiguration.Builder = {
    value.fold(self) { v =>
      self.objectLockEnabled(v)
    }
  } // String

  final def withRuleAsScala(value: Option[ObjectLockRule]): ObjectLockConfiguration.Builder = {
    value.fold(self) { v =>
      self.rule(v)
    }
  } // ObjectLockRule

}

final class ObjectLockConfigurationOps(val self: ObjectLockConfiguration) extends AnyVal {

  final def objectLockEnabledAsScala: Option[ObjectLockEnabled] = Option(self.objectLockEnabled) // String

  final def ruleAsScala: Option[ObjectLockRule] = Option(self.rule) // ObjectLockRule

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectLockConfigurationOps {

  implicit def toObjectLockConfigurationBuilderOps(
      v: ObjectLockConfiguration.Builder
  ): ObjectLockConfigurationBuilderOps = new ObjectLockConfigurationBuilderOps(v)

  implicit def toObjectLockConfigurationOps(v: ObjectLockConfiguration): ObjectLockConfigurationOps =
    new ObjectLockConfigurationOps(v)

}
