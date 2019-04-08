// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class FilterLogEventsRequestBuilderOps(val self: FilterLogEventsRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def logStreamNamesAsScala(value: Option[Seq[String]]): FilterLogEventsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logStreamNames(v.asJava)
    } // Seq[String]
  }

  final def logStreamNamePrefixAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamNamePrefix(v)
    }
  } // String

  final def startTimeAsScala(value: Option[Long]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  } // Long

  final def endTimeAsScala(value: Option[Long]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  } // Long

  final def filterPatternAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def limitAsScala(value: Option[Int]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def interleavedAsScala(value: Option[Boolean]): FilterLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.interleaved(v)
    }
  } // Boolean

}

final class FilterLogEventsRequestOps(val self: FilterLogEventsRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def logStreamNamesAsScala: Option[Seq[String]] = Option(self.logStreamNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix) // String

  final def startTimeAsScala: Option[Long] = Option(self.startTime) // Long

  final def endTimeAsScala: Option[Long] = Option(self.endTime) // Long

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def interleavedAsScala: Option[Boolean] = Option(self.interleaved) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilterLogEventsRequestOps {

  implicit def toFilterLogEventsRequestBuilderOps(v: FilterLogEventsRequest.Builder): FilterLogEventsRequestBuilderOps =
    new FilterLogEventsRequestBuilderOps(v)

  implicit def toFilterLogEventsRequestOps(v: FilterLogEventsRequest): FilterLogEventsRequestOps =
    new FilterLogEventsRequestOps(v)

}
