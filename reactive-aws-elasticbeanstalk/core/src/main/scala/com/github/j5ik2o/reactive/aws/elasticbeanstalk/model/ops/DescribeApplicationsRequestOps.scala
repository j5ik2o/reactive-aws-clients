// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeApplicationsRequestBuilderOps(val self: DescribeApplicationsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNamesAsScala(value: Option[Seq[String]]): DescribeApplicationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.applicationNames(v.asJava)
    }
  }

}

final class DescribeApplicationsRequestOps(val self: DescribeApplicationsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNamesAsScala: Option[Seq[String]] =
    Option(self.applicationNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeApplicationsRequestOps {

  implicit def toDescribeApplicationsRequestBuilderOps(
      v: DescribeApplicationsRequest.Builder
  ): DescribeApplicationsRequestBuilderOps = new DescribeApplicationsRequestBuilderOps(v)

  implicit def toDescribeApplicationsRequestOps(v: DescribeApplicationsRequest): DescribeApplicationsRequestOps =
    new DescribeApplicationsRequestOps(v)

}
