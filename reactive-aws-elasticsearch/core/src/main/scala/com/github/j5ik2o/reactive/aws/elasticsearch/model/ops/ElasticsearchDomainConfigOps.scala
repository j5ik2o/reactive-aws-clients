// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ElasticsearchDomainConfigBuilderOps(val self: ElasticsearchDomainConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchVersionAsScala(
      value: Option[ElasticsearchVersionStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfigStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptionsAsScala(value: Option[EBSOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPoliciesAsScala(value: Option[AccessPoliciesStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotOptionsAsScala(value: Option[SnapshotOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcOptionsAsScala(value: Option[VPCDerivedInfoStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cognitoOptionsAsScala(value: Option[CognitoOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedOptionsAsScala(value: Option[AdvancedOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.advancedOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logPublishingOptionsAsScala(
      value: Option[LogPublishingOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.logPublishingOptions(v)
    }
  }

}

final class ElasticsearchDomainConfigOps(val self: ElasticsearchDomainConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchVersionAsScala: Option[ElasticsearchVersionStatus] = Option(self.elasticsearchVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfigStatus] =
    Option(self.elasticsearchClusterConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptionsAsScala: Option[EBSOptionsStatus] = Option(self.ebsOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPoliciesAsScala: Option[AccessPoliciesStatus] = Option(self.accessPolicies)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotOptionsAsScala: Option[SnapshotOptionsStatus] = Option(self.snapshotOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcOptionsAsScala: Option[VPCDerivedInfoStatus] = Option(self.vpcOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cognitoOptionsAsScala: Option[CognitoOptionsStatus] = Option(self.cognitoOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAtRestOptionsAsScala: Option[EncryptionAtRestOptionsStatus] = Option(self.encryptionAtRestOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeToNodeEncryptionOptionsAsScala: Option[NodeToNodeEncryptionOptionsStatus] =
    Option(self.nodeToNodeEncryptionOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedOptionsAsScala: Option[AdvancedOptionsStatus] = Option(self.advancedOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logPublishingOptionsAsScala: Option[LogPublishingOptionsStatus] = Option(self.logPublishingOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchDomainConfigOps {

  implicit def toElasticsearchDomainConfigBuilderOps(
      v: ElasticsearchDomainConfig.Builder
  ): ElasticsearchDomainConfigBuilderOps = new ElasticsearchDomainConfigBuilderOps(v)

  implicit def toElasticsearchDomainConfigOps(v: ElasticsearchDomainConfig): ElasticsearchDomainConfigOps =
    new ElasticsearchDomainConfigOps(v)

}
