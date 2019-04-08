// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ElasticsearchDomainConfigBuilderOps(val self: ElasticsearchDomainConfig.Builder) extends AnyVal {

  final def elasticsearchVersionAsScala(
      value: Option[ElasticsearchVersionStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  }

  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfigStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  }

  final def ebsOptionsAsScala(value: Option[EBSOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  }

  final def accessPoliciesAsScala(value: Option[AccessPoliciesStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  }

  final def snapshotOptionsAsScala(value: Option[SnapshotOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  }

  final def vpcOptionsAsScala(value: Option[VPCDerivedInfoStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  }

  final def cognitoOptionsAsScala(value: Option[CognitoOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  }

  final def encryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  }

  final def nodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  }

  final def advancedOptionsAsScala(value: Option[AdvancedOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.advancedOptions(v)
    }
  }

  final def logPublishingOptionsAsScala(
      value: Option[LogPublishingOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.logPublishingOptions(v)
    }
  }

}

final class ElasticsearchDomainConfigOps(val self: ElasticsearchDomainConfig) extends AnyVal {

  final def elasticsearchVersionAsScala: Option[ElasticsearchVersionStatus] = Option(self.elasticsearchVersion)

  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfigStatus] =
    Option(self.elasticsearchClusterConfig)

  final def ebsOptionsAsScala: Option[EBSOptionsStatus] = Option(self.ebsOptions)

  final def accessPoliciesAsScala: Option[AccessPoliciesStatus] = Option(self.accessPolicies)

  final def snapshotOptionsAsScala: Option[SnapshotOptionsStatus] = Option(self.snapshotOptions)

  final def vpcOptionsAsScala: Option[VPCDerivedInfoStatus] = Option(self.vpcOptions)

  final def cognitoOptionsAsScala: Option[CognitoOptionsStatus] = Option(self.cognitoOptions)

  final def encryptionAtRestOptionsAsScala: Option[EncryptionAtRestOptionsStatus] = Option(self.encryptionAtRestOptions)

  final def nodeToNodeEncryptionOptionsAsScala: Option[NodeToNodeEncryptionOptionsStatus] =
    Option(self.nodeToNodeEncryptionOptions)

  final def advancedOptionsAsScala: Option[AdvancedOptionsStatus] = Option(self.advancedOptions)

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
