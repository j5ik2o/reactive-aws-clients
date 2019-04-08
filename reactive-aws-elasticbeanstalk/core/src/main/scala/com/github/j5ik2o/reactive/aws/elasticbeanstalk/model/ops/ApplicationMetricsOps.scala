// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplicationMetricsBuilderOps(val self: ApplicationMetrics.Builder) extends AnyVal {

  final def durationAsScala(value: Option[Int]): ApplicationMetrics.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  final def requestCountAsScala(value: Option[Int]): ApplicationMetrics.Builder = {
    value.fold(self) { v =>
      self.requestCount(v)
    }
  }

  final def statusCodesAsScala(value: Option[StatusCodes]): ApplicationMetrics.Builder = {
    value.fold(self) { v =>
      self.statusCodes(v)
    }
  }

  final def latencyAsScala(value: Option[Latency]): ApplicationMetrics.Builder = {
    value.fold(self) { v =>
      self.latency(v)
    }
  }

}

final class ApplicationMetricsOps(val self: ApplicationMetrics) extends AnyVal {

  final def durationAsScala: Option[Int] = Option(self.duration)

  final def requestCountAsScala: Option[Int] = Option(self.requestCount)

  final def statusCodesAsScala: Option[StatusCodes] = Option(self.statusCodes)

  final def latencyAsScala: Option[Latency] = Option(self.latency)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplicationMetricsOps {

  implicit def toApplicationMetricsBuilderOps(v: ApplicationMetrics.Builder): ApplicationMetricsBuilderOps =
    new ApplicationMetricsBuilderOps(v)

  implicit def toApplicationMetricsOps(v: ApplicationMetrics): ApplicationMetricsOps = new ApplicationMetricsOps(v)

}
