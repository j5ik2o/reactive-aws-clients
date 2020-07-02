// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeApplicationVersionsResponseBuilderOps(val self: DescribeApplicationVersionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationVersionsAsScala(
      value: Option[Seq[ApplicationVersionDescription]]
  ): DescribeApplicationVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.applicationVersions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeApplicationVersionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeApplicationVersionsResponseOps(val self: DescribeApplicationVersionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationVersionsAsScala: Option[Seq[ApplicationVersionDescription]] =
    Option(self.applicationVersions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeApplicationVersionsResponseOps {

  implicit def toDescribeApplicationVersionsResponseBuilderOps(
      v: DescribeApplicationVersionsResponse.Builder
  ): DescribeApplicationVersionsResponseBuilderOps = new DescribeApplicationVersionsResponseBuilderOps(v)

  implicit def toDescribeApplicationVersionsResponseOps(
      v: DescribeApplicationVersionsResponse
  ): DescribeApplicationVersionsResponseOps = new DescribeApplicationVersionsResponseOps(v)

}
