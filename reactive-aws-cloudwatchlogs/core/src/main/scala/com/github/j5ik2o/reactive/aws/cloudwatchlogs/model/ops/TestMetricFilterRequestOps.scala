// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class TestMetricFilterRequestBuilderOps(val self: TestMetricFilterRequest.Builder) extends AnyVal {

  final def filterPatternAsScala(value: Option[String]): TestMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  }

  final def logEventMessagesAsScala(value: Option[Seq[String]]): TestMetricFilterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logEventMessages(v.asJava)
    }
  }

}

final class TestMetricFilterRequestOps(val self: TestMetricFilterRequest) extends AnyVal {

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  final def logEventMessagesAsScala: Option[Seq[String]] = Option(self.logEventMessages).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTestMetricFilterRequestOps {

  implicit def toTestMetricFilterRequestBuilderOps(
      v: TestMetricFilterRequest.Builder
  ): TestMetricFilterRequestBuilderOps = new TestMetricFilterRequestBuilderOps(v)

  implicit def toTestMetricFilterRequestOps(v: TestMetricFilterRequest): TestMetricFilterRequestOps =
    new TestMetricFilterRequestOps(v)

}
