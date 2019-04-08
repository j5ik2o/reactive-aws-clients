// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeApplicationVersionsResponseBuilderOps(val self: DescribeApplicationVersionsResponse.Builder)
    extends AnyVal {

  final def applicationVersionsAsScala(
      value: Option[Seq[ApplicationVersionDescription]]
  ): DescribeApplicationVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.applicationVersions(v.asJava)
    } // Seq[ApplicationVersionDescription]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeApplicationVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeApplicationVersionsResponseOps(val self: DescribeApplicationVersionsResponse) extends AnyVal {

  final def applicationVersionsAsScala: Option[Seq[ApplicationVersionDescription]] =
    Option(self.applicationVersions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[ApplicationVersionDescription]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

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
