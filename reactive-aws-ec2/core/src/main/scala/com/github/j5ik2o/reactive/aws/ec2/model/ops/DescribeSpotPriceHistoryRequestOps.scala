// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotPriceHistoryRequestBuilderOps(val self: DescribeSpotPriceHistoryRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeSpotPriceHistoryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): DescribeSpotPriceHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def endTimeAsScala(value: Option[java.time.Instant]): DescribeSpotPriceHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  final def instanceTypesAsScala(value: Option[Seq[InstanceType]]): DescribeSpotPriceHistoryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceTypes(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeSpotPriceHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSpotPriceHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def productDescriptionsAsScala(value: Option[Seq[String]]): DescribeSpotPriceHistoryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productDescriptions(v.asJava)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): DescribeSpotPriceHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

}

final class DescribeSpotPriceHistoryRequestOps(val self: DescribeSpotPriceHistoryRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

  final def instanceTypesAsScala: Option[Seq[InstanceType]] = Option(self.instanceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def productDescriptionsAsScala: Option[Seq[String]] = Option(self.productDescriptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotPriceHistoryRequestOps {

  implicit def toDescribeSpotPriceHistoryRequestBuilderOps(
      v: DescribeSpotPriceHistoryRequest.Builder
  ): DescribeSpotPriceHistoryRequestBuilderOps = new DescribeSpotPriceHistoryRequestBuilderOps(v)

  implicit def toDescribeSpotPriceHistoryRequestOps(
      v: DescribeSpotPriceHistoryRequest
  ): DescribeSpotPriceHistoryRequestOps = new DescribeSpotPriceHistoryRequestOps(v)

}
