// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeScheduledInstancesRequestBuilderOps(val self: DescribeScheduledInstancesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeScheduledInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeScheduledInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeScheduledInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceIdsAsScala(value: Option[Seq[String]]): DescribeScheduledInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.scheduledInstanceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def slotStartTimeRangeAsScala(
      value: Option[SlotStartTimeRangeRequest]
  ): DescribeScheduledInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.slotStartTimeRange(v)
    }
  }

}

final class DescribeScheduledInstancesRequestOps(val self: DescribeScheduledInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceIdsAsScala: Option[Seq[String]] = Option(self.scheduledInstanceIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def slotStartTimeRangeAsScala: Option[SlotStartTimeRangeRequest] = Option(self.slotStartTimeRange)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeScheduledInstancesRequestOps {

  implicit def toDescribeScheduledInstancesRequestBuilderOps(
      v: DescribeScheduledInstancesRequest.Builder
  ): DescribeScheduledInstancesRequestBuilderOps = new DescribeScheduledInstancesRequestBuilderOps(v)

  implicit def toDescribeScheduledInstancesRequestOps(
      v: DescribeScheduledInstancesRequest
  ): DescribeScheduledInstancesRequestOps = new DescribeScheduledInstancesRequestOps(v)

}
