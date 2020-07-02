// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAnomalyDetectorsResponseBuilderOps(val self: DescribeAnomalyDetectorsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def anomalyDetectorsAsScala(value: Option[Seq[AnomalyDetector]]): DescribeAnomalyDetectorsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.anomalyDetectors(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeAnomalyDetectorsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeAnomalyDetectorsResponseOps(val self: DescribeAnomalyDetectorsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def anomalyDetectorsAsScala: Option[Seq[AnomalyDetector]] =
    Option(self.anomalyDetectors).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAnomalyDetectorsResponseOps {

  implicit def toDescribeAnomalyDetectorsResponseBuilderOps(
      v: DescribeAnomalyDetectorsResponse.Builder
  ): DescribeAnomalyDetectorsResponseBuilderOps = new DescribeAnomalyDetectorsResponseBuilderOps(v)

  implicit def toDescribeAnomalyDetectorsResponseOps(
      v: DescribeAnomalyDetectorsResponse
  ): DescribeAnomalyDetectorsResponseOps = new DescribeAnomalyDetectorsResponseOps(v)

}
