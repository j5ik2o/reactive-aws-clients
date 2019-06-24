// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ElasticsearchClusterConfigBuilderOps(val self: ElasticsearchClusterConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[ESPartitionInstanceType]): ElasticsearchClusterConfig.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): ElasticsearchClusterConfig.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dedicatedMasterEnabledAsScala(value: Option[Boolean]): ElasticsearchClusterConfig.Builder = {
    value.fold(self) { v =>
      self.dedicatedMasterEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneAwarenessEnabledAsScala(value: Option[Boolean]): ElasticsearchClusterConfig.Builder = {
    value.fold(self) { v =>
      self.zoneAwarenessEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneAwarenessConfigAsScala(value: Option[ZoneAwarenessConfig]): ElasticsearchClusterConfig.Builder = {
    value.fold(self) { v =>
      self.zoneAwarenessConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dedicatedMasterTypeAsScala(value: Option[ESPartitionInstanceType]): ElasticsearchClusterConfig.Builder = {
    value.fold(self) { v =>
      self.dedicatedMasterType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dedicatedMasterCountAsScala(value: Option[Int]): ElasticsearchClusterConfig.Builder = {
    value.fold(self) { v =>
      self.dedicatedMasterCount(v)
    }
  }

}

final class ElasticsearchClusterConfigOps(val self: ElasticsearchClusterConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[ESPartitionInstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dedicatedMasterEnabledAsScala: Option[Boolean] = Option(self.dedicatedMasterEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneAwarenessEnabledAsScala: Option[Boolean] = Option(self.zoneAwarenessEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneAwarenessConfigAsScala: Option[ZoneAwarenessConfig] = Option(self.zoneAwarenessConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dedicatedMasterTypeAsScala: Option[ESPartitionInstanceType] = Option(self.dedicatedMasterType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dedicatedMasterCountAsScala: Option[Int] = Option(self.dedicatedMasterCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchClusterConfigOps {

  implicit def toElasticsearchClusterConfigBuilderOps(
      v: ElasticsearchClusterConfig.Builder
  ): ElasticsearchClusterConfigBuilderOps = new ElasticsearchClusterConfigBuilderOps(v)

  implicit def toElasticsearchClusterConfigOps(v: ElasticsearchClusterConfig): ElasticsearchClusterConfigOps =
    new ElasticsearchClusterConfigOps(v)

}
