// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class TestMetricFilterResponseBuilderOps(val self: TestMetricFilterResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def matchesAsScala(value: Option[Seq[MetricFilterMatchRecord]]): TestMetricFilterResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.matches(v.asJava)
    }
  }

}

final class TestMetricFilterResponseOps(val self: TestMetricFilterResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def matchesAsScala: Option[Seq[MetricFilterMatchRecord]] =
    Option(self.matches).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTestMetricFilterResponseOps {

  implicit def toTestMetricFilterResponseBuilderOps(
      v: TestMetricFilterResponse.Builder
  ): TestMetricFilterResponseBuilderOps = new TestMetricFilterResponseBuilderOps(v)

  implicit def toTestMetricFilterResponseOps(v: TestMetricFilterResponse): TestMetricFilterResponseOps =
    new TestMetricFilterResponseOps(v)

}
