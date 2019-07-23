// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingSettingsUpdateBuilderOps(val self: AutoScalingSettingsUpdate.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minimumUnitsAsScala(value: Option[Long]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.minimumUnits(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumUnitsAsScala(value: Option[Long]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.maximumUnits(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingDisabledAsScala(value: Option[Boolean]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.autoScalingDisabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingRoleArnAsScala(value: Option[String]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.autoScalingRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scalingPolicyUpdateAsScala(value: Option[AutoScalingPolicyUpdate]): AutoScalingSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.scalingPolicyUpdate(v)
    }
  }

}

final class AutoScalingSettingsUpdateOps(val self: AutoScalingSettingsUpdate) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minimumUnitsAsScala: Option[Long] = Option(self.minimumUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumUnitsAsScala: Option[Long] = Option(self.maximumUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingDisabledAsScala: Option[Boolean] = Option(self.autoScalingDisabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingRoleArnAsScala: Option[String] = Option(self.autoScalingRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scalingPolicyUpdateAsScala: Option[AutoScalingPolicyUpdate] = Option(self.scalingPolicyUpdate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingSettingsUpdateOps {

  implicit def toAutoScalingSettingsUpdateBuilderOps(
      v: AutoScalingSettingsUpdate.Builder
  ): AutoScalingSettingsUpdateBuilderOps = new AutoScalingSettingsUpdateBuilderOps(v)

  implicit def toAutoScalingSettingsUpdateOps(v: AutoScalingSettingsUpdate): AutoScalingSettingsUpdateOps =
    new AutoScalingSettingsUpdateOps(v)

}
