// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class HumanLoopConfigBuilderOps(val self: HumanLoopConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopNameAsScala(value: Option[String]): HumanLoopConfig.Builder = {
    value.fold(self) { v => self.humanLoopName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def flowDefinitionArnAsScala(value: Option[String]): HumanLoopConfig.Builder = {
    value.fold(self) { v => self.flowDefinitionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAttributesAsScala(value: Option[HumanLoopDataAttributes]): HumanLoopConfig.Builder = {
    value.fold(self) { v => self.dataAttributes(v) }
  }

}

final class HumanLoopConfigOps(val self: HumanLoopConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopNameAsScala: Option[String] = Option(self.humanLoopName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def flowDefinitionArnAsScala: Option[String] = Option(self.flowDefinitionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAttributesAsScala: Option[HumanLoopDataAttributes] = Option(self.dataAttributes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHumanLoopConfigOps {

  implicit def toHumanLoopConfigBuilderOps(v: HumanLoopConfig.Builder): HumanLoopConfigBuilderOps =
    new HumanLoopConfigBuilderOps(v)

  implicit def toHumanLoopConfigOps(v: HumanLoopConfig): HumanLoopConfigOps = new HumanLoopConfigOps(v)

}
