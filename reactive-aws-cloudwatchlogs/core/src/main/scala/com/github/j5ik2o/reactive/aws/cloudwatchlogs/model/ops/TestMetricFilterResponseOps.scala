// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class TestMetricFilterResponseBuilderOps(val self: TestMetricFilterResponse.Builder) extends AnyVal {

  final def matchesAsScala(value: Option[Seq[MetricFilterMatchRecord]]): TestMetricFilterResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.matches(v.asJava)
    }
  }

}

final class TestMetricFilterResponseOps(val self: TestMetricFilterResponse) extends AnyVal {

  final def matchesAsScala: Option[Seq[MetricFilterMatchRecord]] = Option(self.matches).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTestMetricFilterResponseOps {

  implicit def toTestMetricFilterResponseBuilderOps(
      v: TestMetricFilterResponse.Builder
  ): TestMetricFilterResponseBuilderOps = new TestMetricFilterResponseBuilderOps(v)

  implicit def toTestMetricFilterResponseOps(v: TestMetricFilterResponse): TestMetricFilterResponseOps =
    new TestMetricFilterResponseOps(v)

}
