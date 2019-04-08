// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeApplicationVersionsRequestBuilderOps(val self: DescribeApplicationVersionsRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): DescribeApplicationVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def versionLabelsAsScala(value: Option[Seq[String]]): DescribeApplicationVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.versionLabels(v.asJava)
    }
  }

  final def maxRecordsAsScala(value: Option[Int]): DescribeApplicationVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeApplicationVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeApplicationVersionsRequestOps(val self: DescribeApplicationVersionsRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def versionLabelsAsScala: Option[Seq[String]] = Option(self.versionLabels).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

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
