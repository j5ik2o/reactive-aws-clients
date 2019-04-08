// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AnalyticsFilterBuilderOps(val self: AnalyticsFilter.Builder) extends AnyVal {

  final def prefixAsScala(value: Option[String]): AnalyticsFilter.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def tagAsScala(value: Option[Tag]): AnalyticsFilter.Builder = {
    value.fold(self) { v =>
      self.tag(v)
    }
  }

  final def andAsScala(value: Option[AnalyticsAndOperator]): AnalyticsFilter.Builder = {
    value.fold(self) { v =>
      self.and(v)
    }
  }

}

final class AnalyticsFilterOps(val self: AnalyticsFilter) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def tagAsScala: Option[Tag] = Option(self.tag)

  final def andAsScala: Option[AnalyticsAndOperator] = Option(self.and)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnalyticsFilterOps {

  implicit def toAnalyticsFilterBuilderOps(v: AnalyticsFilter.Builder): AnalyticsFilterBuilderOps =
    new AnalyticsFilterBuilderOps(v)

  implicit def toAnalyticsFilterOps(v: AnalyticsFilter): AnalyticsFilterOps = new AnalyticsFilterOps(v)

}
