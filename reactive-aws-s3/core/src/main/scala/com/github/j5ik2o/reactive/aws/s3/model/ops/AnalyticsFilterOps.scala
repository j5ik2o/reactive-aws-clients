// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AnalyticsFilterBuilderOps(val self: AnalyticsFilter.Builder) extends AnyVal {

  final def withPrefixAsScala(value: Option[String]): AnalyticsFilter.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withTagAsScala(value: Option[Tag]): AnalyticsFilter.Builder = {
    value.fold(self) { v =>
      self.tag(v)
    }
  } // Tag

  final def withAndAsScala(value: Option[AnalyticsAndOperator]): AnalyticsFilter.Builder = {
    value.fold(self) { v =>
      self.and(v)
    }
  } // AnalyticsAndOperator

}

final class AnalyticsFilterOps(val self: AnalyticsFilter) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def tagAsScala: Option[Tag] = Option(self.tag) // Tag

  final def andAsScala: Option[AnalyticsAndOperator] = Option(self.and) // AnalyticsAndOperator

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnalyticsFilterOps {

  implicit def toAnalyticsFilterBuilderOps(v: AnalyticsFilter.Builder): AnalyticsFilterBuilderOps =
    new AnalyticsFilterBuilderOps(v)

  implicit def toAnalyticsFilterOps(v: AnalyticsFilter): AnalyticsFilterOps = new AnalyticsFilterOps(v)

}
