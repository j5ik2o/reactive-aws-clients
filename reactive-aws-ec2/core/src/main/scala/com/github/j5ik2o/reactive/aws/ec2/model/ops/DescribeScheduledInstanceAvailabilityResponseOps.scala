// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeScheduledInstanceAvailabilityResponseBuilderOps(
    val self: DescribeScheduledInstanceAvailabilityResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeScheduledInstanceAvailabilityResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceAvailabilitySetAsScala(
      value: Option[Seq[ScheduledInstanceAvailability]]
  ): DescribeScheduledInstanceAvailabilityResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.scheduledInstanceAvailabilitySet(v.asJava)
    }
  }

}

final class DescribeScheduledInstanceAvailabilityResponseOps(val self: DescribeScheduledInstanceAvailabilityResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceAvailabilitySetAsScala: Option[Seq[ScheduledInstanceAvailability]] =
    Option(self.scheduledInstanceAvailabilitySet).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeScheduledInstanceAvailabilityResponseOps {

  implicit def toDescribeScheduledInstanceAvailabilityResponseBuilderOps(
      v: DescribeScheduledInstanceAvailabilityResponse.Builder
  ): DescribeScheduledInstanceAvailabilityResponseBuilderOps =
    new DescribeScheduledInstanceAvailabilityResponseBuilderOps(v)

  implicit def toDescribeScheduledInstanceAvailabilityResponseOps(
      v: DescribeScheduledInstanceAvailabilityResponse
  ): DescribeScheduledInstanceAvailabilityResponseOps = new DescribeScheduledInstanceAvailabilityResponseOps(v)

}
