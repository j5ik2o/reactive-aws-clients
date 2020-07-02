// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLaunchTemplateVersionsResponseBuilderOps(val self: DescribeLaunchTemplateVersionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateVersionsAsScala(
      value: Option[Seq[LaunchTemplateVersion]]
  ): DescribeLaunchTemplateVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchTemplateVersions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLaunchTemplateVersionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeLaunchTemplateVersionsResponseOps(val self: DescribeLaunchTemplateVersionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateVersionsAsScala: Option[Seq[LaunchTemplateVersion]] =
    Option(self.launchTemplateVersions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLaunchTemplateVersionsResponseOps {

  implicit def toDescribeLaunchTemplateVersionsResponseBuilderOps(
      v: DescribeLaunchTemplateVersionsResponse.Builder
  ): DescribeLaunchTemplateVersionsResponseBuilderOps = new DescribeLaunchTemplateVersionsResponseBuilderOps(v)

  implicit def toDescribeLaunchTemplateVersionsResponseOps(
      v: DescribeLaunchTemplateVersionsResponse
  ): DescribeLaunchTemplateVersionsResponseOps = new DescribeLaunchTemplateVersionsResponseOps(v)

}
