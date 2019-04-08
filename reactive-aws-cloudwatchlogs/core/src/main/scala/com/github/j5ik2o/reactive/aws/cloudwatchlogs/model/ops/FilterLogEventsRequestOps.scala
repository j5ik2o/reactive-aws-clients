// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class FilterLogEventsRequestBuilderOps(val self: FilterLogEventsRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def logStreamNamesAsScala(value: Option[Seq[String]]): FilterLogEventsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logStreamNames(v.asJava)
    }
  }

  final def logStreamNamePrefixAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamNamePrefix(v)
    }
  }

  final def startTimeAsScala(value: Option[Long]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  final def endTimeAsScala(value: Option[Long]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  final def filterPatternAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def limitAsScala(value: Option[Int]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def interleavedAsScala(value: Option[Boolean]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.interleaved(v)
    }
  }

}

final class FilterLogEventsRequestOps(val self: FilterLogEventsRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def logStreamNamesAsScala: Option[Seq[String]] = Option(self.logStreamNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix)

  final def startTimeAsScala: Option[Long] = Option(self.startTime)

  final def endTimeAsScala: Option[Long] = Option(self.endTime)

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def interleavedAsScala: Option[Boolean] = Option(self.interleaved)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilterLogEventsRequestOps {

  implicit def toFilterLogEventsRequestBuilderOps(v: FilterLogEventsRequest.Builder): FilterLogEventsRequestBuilderOps =
    new FilterLogEventsRequestBuilderOps(v)

  implicit def toFilterLogEventsRequestOps(v: FilterLogEventsRequest): FilterLogEventsRequestOps =
    new FilterLogEventsRequestOps(v)

}
