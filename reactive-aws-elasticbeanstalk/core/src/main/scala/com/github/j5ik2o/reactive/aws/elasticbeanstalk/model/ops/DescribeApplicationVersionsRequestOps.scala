// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeApplicationVersionsRequestBuilderOps(val self: DescribeApplicationVersionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): DescribeApplicationVersionsRequest.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelsAsScala(value: Option[Seq[String]]): DescribeApplicationVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.versionLabels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala(value: Option[Int]): DescribeApplicationVersionsRequest.Builder = {
    value.fold(self) { v => self.maxRecords(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeApplicationVersionsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeApplicationVersionsRequestOps(val self: DescribeApplicationVersionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelsAsScala: Option[Seq[String]] =
    Option(self.versionLabels).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeApplicationVersionsRequestOps {

  implicit def toDescribeApplicationVersionsRequestBuilderOps(
      v: DescribeApplicationVersionsRequest.Builder
  ): DescribeApplicationVersionsRequestBuilderOps = new DescribeApplicationVersionsRequestBuilderOps(v)

  implicit def toDescribeApplicationVersionsRequestOps(
      v: DescribeApplicationVersionsRequest
  ): DescribeApplicationVersionsRequestOps = new DescribeApplicationVersionsRequestOps(v)

}
