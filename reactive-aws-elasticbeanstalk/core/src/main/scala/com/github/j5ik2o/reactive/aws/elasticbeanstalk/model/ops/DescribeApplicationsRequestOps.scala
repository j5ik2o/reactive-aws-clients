// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeApplicationsRequestBuilderOps(val self: DescribeApplicationsRequest.Builder) extends AnyVal {

  final def applicationNamesAsScala(value: Option[Seq[String]]): DescribeApplicationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.applicationNames(v.asJava)
    } // Seq[String]
  }

}

final class DescribeApplicationsRequestOps(val self: DescribeApplicationsRequest) extends AnyVal {

  final def applicationNamesAsScala: Option[Seq[String]] = Option(self.applicationNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeApplicationsRequestOps {

  implicit def toDescribeApplicationsRequestBuilderOps(
      v: DescribeApplicationsRequest.Builder
  ): DescribeApplicationsRequestBuilderOps = new DescribeApplicationsRequestBuilderOps(v)

  implicit def toDescribeApplicationsRequestOps(v: DescribeApplicationsRequest): DescribeApplicationsRequestOps =
    new DescribeApplicationsRequestOps(v)

}
