// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ElasticsearchClusterConfigStatusBuilderOps(val self: ElasticsearchClusterConfigStatus.Builder)
    extends AnyVal {

  final def optionsAsScala(value: Option[ElasticsearchClusterConfig]): ElasticsearchClusterConfigStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // ElasticsearchClusterConfig

  final def statusAsScala(value: Option[OptionStatus]): ElasticsearchClusterConfigStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class ElasticsearchClusterConfigStatusOps(val self: ElasticsearchClusterConfigStatus) extends AnyVal {

  final def optionsAsScala: Option[ElasticsearchClusterConfig] = Option(self.options) // ElasticsearchClusterConfig

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchClusterConfigStatusOps {

  implicit def toElasticsearchClusterConfigStatusBuilderOps(
      v: ElasticsearchClusterConfigStatus.Builder
  ): ElasticsearchClusterConfigStatusBuilderOps = new ElasticsearchClusterConfigStatusBuilderOps(v)

  implicit def toElasticsearchClusterConfigStatusOps(
      v: ElasticsearchClusterConfigStatus
  ): ElasticsearchClusterConfigStatusOps = new ElasticsearchClusterConfigStatusOps(v)

}
