// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class AutoScalingGroupBuilderOps(val self: AutoScalingGroup.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): AutoScalingGroup.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class AutoScalingGroupOps(val self: AutoScalingGroup) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingGroupOps {

  implicit def toAutoScalingGroupBuilderOps(v: AutoScalingGroup.Builder): AutoScalingGroupBuilderOps =
    new AutoScalingGroupBuilderOps(v)

  implicit def toAutoScalingGroupOps(v: AutoScalingGroup): AutoScalingGroupOps = new AutoScalingGroupOps(v)

}
