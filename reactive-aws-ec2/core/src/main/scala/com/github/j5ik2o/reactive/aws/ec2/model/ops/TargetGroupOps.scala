// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetGroupBuilderOps(val self: TargetGroup.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): TargetGroup.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

}

final class TargetGroupOps(val self: TargetGroup) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetGroupOps {

  implicit def toTargetGroupBuilderOps(v: TargetGroup.Builder): TargetGroupBuilderOps = new TargetGroupBuilderOps(v)

  implicit def toTargetGroupOps(v: TargetGroup): TargetGroupOps = new TargetGroupOps(v)

}
