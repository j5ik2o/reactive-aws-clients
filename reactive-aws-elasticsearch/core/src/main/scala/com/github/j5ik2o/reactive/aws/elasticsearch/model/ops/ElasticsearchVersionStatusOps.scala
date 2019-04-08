// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ElasticsearchVersionStatusBuilderOps(val self: ElasticsearchVersionStatus.Builder) extends AnyVal {

  final def optionsAsScala(value: Option[String]): ElasticsearchVersionStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // String

  final def statusAsScala(value: Option[OptionStatus]): ElasticsearchVersionStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class ElasticsearchVersionStatusOps(val self: ElasticsearchVersionStatus) extends AnyVal {

  final def optionsAsScala: Option[String] = Option(self.options) // String

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchVersionStatusOps {

  implicit def toElasticsearchVersionStatusBuilderOps(
      v: ElasticsearchVersionStatus.Builder
  ): ElasticsearchVersionStatusBuilderOps = new ElasticsearchVersionStatusBuilderOps(v)

  implicit def toElasticsearchVersionStatusOps(v: ElasticsearchVersionStatus): ElasticsearchVersionStatusOps =
    new ElasticsearchVersionStatusOps(v)

}
