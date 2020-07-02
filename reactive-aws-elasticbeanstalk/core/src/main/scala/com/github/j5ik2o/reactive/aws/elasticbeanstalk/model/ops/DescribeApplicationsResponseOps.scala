// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeApplicationsResponseBuilderOps(val self: DescribeApplicationsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationsAsScala(value: Option[Seq[ApplicationDescription]]): DescribeApplicationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.applications(v.asJava)
    }
  }

}

final class DescribeApplicationsResponseOps(val self: DescribeApplicationsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationsAsScala: Option[Seq[ApplicationDescription]] =
    Option(self.applications).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeApplicationsResponseOps {

  implicit def toDescribeApplicationsResponseBuilderOps(
      v: DescribeApplicationsResponse.Builder
  ): DescribeApplicationsResponseBuilderOps = new DescribeApplicationsResponseBuilderOps(v)

  implicit def toDescribeApplicationsResponseOps(v: DescribeApplicationsResponse): DescribeApplicationsResponseOps =
    new DescribeApplicationsResponseOps(v)

}
