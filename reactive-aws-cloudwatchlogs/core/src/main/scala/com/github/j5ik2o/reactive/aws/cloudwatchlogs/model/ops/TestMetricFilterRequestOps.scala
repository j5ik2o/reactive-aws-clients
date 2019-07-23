// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class TestMetricFilterRequestBuilderOps(val self: TestMetricFilterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala(value: Option[String]): TestMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logEventMessagesAsScala(value: Option[Seq[String]]): TestMetricFilterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logEventMessages(v.asJava)
    }
  }

}

final class TestMetricFilterRequestOps(val self: TestMetricFilterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logEventMessagesAsScala: Option[Seq[String]] = Option(self.logEventMessages).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
