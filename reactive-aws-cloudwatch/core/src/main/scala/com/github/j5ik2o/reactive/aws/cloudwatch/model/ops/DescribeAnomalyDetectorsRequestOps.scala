// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAnomalyDetectorsRequestBuilderOps(val self: DescribeAnomalyDetectorsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeAnomalyDetectorsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeAnomalyDetectorsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): DescribeAnomalyDetectorsRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): DescribeAnomalyDetectorsRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala(value: Option[Seq[Dimension]]): DescribeAnomalyDetectorsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dimensions(v.asJava)
    }
  }

}

final class DescribeAnomalyDetectorsRequestOps(val self: DescribeAnomalyDetectorsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAnomalyDetectorsRequestOps {

  implicit def toDescribeAnomalyDetectorsRequestBuilderOps(
      v: DescribeAnomalyDetectorsRequest.Builder
  ): DescribeAnomalyDetectorsRequestBuilderOps = new DescribeAnomalyDetectorsRequestBuilderOps(v)

  implicit def toDescribeAnomalyDetectorsRequestOps(
      v: DescribeAnomalyDetectorsRequest
  ): DescribeAnomalyDetectorsRequestOps = new DescribeAnomalyDetectorsRequestOps(v)

}
