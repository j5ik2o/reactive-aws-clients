// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class FilterLogEventsRequestBuilderOps(val self: FilterLogEventsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNamesAsScala(value: Option[Seq[String]]): FilterLogEventsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logStreamNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNamePrefixAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v => self.logStreamNamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[Long]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v => self.startTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala(value: Option[Long]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v => self.endTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v => self.filterPattern(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def interleavedAsScala(value: Option[Boolean]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v => self.interleaved(v) }
  }

}

final class FilterLogEventsRequestOps(val self: FilterLogEventsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNamesAsScala: Option[Seq[String]] =
    Option(self.logStreamNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[Long] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala: Option[Long] = Option(self.endTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def interleavedAsScala: Option[Boolean] = Option(self.interleaved)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilterLogEventsRequestOps {

  implicit def toFilterLogEventsRequestBuilderOps(v: FilterLogEventsRequest.Builder): FilterLogEventsRequestBuilderOps =
    new FilterLogEventsRequestBuilderOps(v)

  implicit def toFilterLogEventsRequestOps(v: FilterLogEventsRequest): FilterLogEventsRequestOps =
    new FilterLogEventsRequestOps(v)

}
