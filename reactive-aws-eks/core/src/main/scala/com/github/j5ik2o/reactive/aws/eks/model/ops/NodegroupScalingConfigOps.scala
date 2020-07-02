// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class NodegroupScalingConfigBuilderOps(val self: NodegroupScalingConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minSizeAsScala(value: Option[Int]): NodegroupScalingConfig.Builder = {
    value.fold(self) { v => self.minSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxSizeAsScala(value: Option[Int]): NodegroupScalingConfig.Builder = {
    value.fold(self) { v => self.maxSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredSizeAsScala(value: Option[Int]): NodegroupScalingConfig.Builder = {
    value.fold(self) { v => self.desiredSize(v) }
  }

}

final class NodegroupScalingConfigOps(val self: NodegroupScalingConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minSizeAsScala: Option[Int] = Option(self.minSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxSizeAsScala: Option[Int] = Option(self.maxSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredSizeAsScala: Option[Int] = Option(self.desiredSize)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodegroupScalingConfigOps {

  implicit def toNodegroupScalingConfigBuilderOps(v: NodegroupScalingConfig.Builder): NodegroupScalingConfigBuilderOps =
    new NodegroupScalingConfigBuilderOps(v)

  implicit def toNodegroupScalingConfigOps(v: NodegroupScalingConfig): NodegroupScalingConfigOps =
    new NodegroupScalingConfigOps(v)

}
