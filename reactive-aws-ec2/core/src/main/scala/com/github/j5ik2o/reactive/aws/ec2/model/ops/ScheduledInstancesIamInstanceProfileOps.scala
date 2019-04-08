// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesIamInstanceProfileBuilderOps(val self: ScheduledInstancesIamInstanceProfile.Builder)
    extends AnyVal {

  final def arnAsScala(value: Option[String]): ScheduledInstancesIamInstanceProfile.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def nameAsScala(value: Option[String]): ScheduledInstancesIamInstanceProfile.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class ScheduledInstancesIamInstanceProfileOps(val self: ScheduledInstancesIamInstanceProfile) extends AnyVal {

  final def arnAsScala: Option[String] = Option(self.arn)

  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstancesIamInstanceProfileOps {

  implicit def toScheduledInstancesIamInstanceProfileBuilderOps(
      v: ScheduledInstancesIamInstanceProfile.Builder
  ): ScheduledInstancesIamInstanceProfileBuilderOps = new ScheduledInstancesIamInstanceProfileBuilderOps(v)

  implicit def toScheduledInstancesIamInstanceProfileOps(
      v: ScheduledInstancesIamInstanceProfile
  ): ScheduledInstancesIamInstanceProfileOps = new ScheduledInstancesIamInstanceProfileOps(v)

}
