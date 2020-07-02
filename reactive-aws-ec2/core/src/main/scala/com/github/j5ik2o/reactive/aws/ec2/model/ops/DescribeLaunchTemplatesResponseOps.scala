// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLaunchTemplatesResponseBuilderOps(val self: DescribeLaunchTemplatesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplatesAsScala(value: Option[Seq[LaunchTemplate]]): DescribeLaunchTemplatesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchTemplates(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLaunchTemplatesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeLaunchTemplatesResponseOps(val self: DescribeLaunchTemplatesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplatesAsScala: Option[Seq[LaunchTemplate]] =
    Option(self.launchTemplates).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLaunchTemplatesResponseOps {

  implicit def toDescribeLaunchTemplatesResponseBuilderOps(
      v: DescribeLaunchTemplatesResponse.Builder
  ): DescribeLaunchTemplatesResponseBuilderOps = new DescribeLaunchTemplatesResponseBuilderOps(v)

  implicit def toDescribeLaunchTemplatesResponseOps(
      v: DescribeLaunchTemplatesResponse
  ): DescribeLaunchTemplatesResponseOps = new DescribeLaunchTemplatesResponseOps(v)

}
