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
  } // ElasticsearchVersionStatus

  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfigStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  } // ElasticsearchClusterConfigStatus

  final def ebsOptionsAsScala(value: Option[EBSOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  } // EBSOptionsStatus

  final def accessPoliciesAsScala(value: Option[AccessPoliciesStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  } // AccessPoliciesStatus

  final def snapshotOptionsAsScala(value: Option[SnapshotOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  } // SnapshotOptionsStatus

  final def vpcOptionsAsScala(value: Option[VPCDerivedInfoStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  } // VPCDerivedInfoStatus

  final def cognitoOptionsAsScala(value: Option[CognitoOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  } // CognitoOptionsStatus

  final def encryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  } // EncryptionAtRestOptionsStatus

  final def nodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  } // NodeToNodeEncryptionOptionsStatus

  final def advancedOptionsAsScala(value: Option[AdvancedOptionsStatus]): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.advancedOptions(v)
    }
  } // AdvancedOptionsStatus

  final def logPublishingOptionsAsScala(
      value: Option[LogPublishingOptionsStatus]
  ): ElasticsearchDomainConfig.Builder = {
    value.fold(self) { v =>
      self.logPublishingOptions(v)
    }
  } // LogPublishingOptionsStatus

}

final class ElasticsearchDomainConfigOps(val self: ElasticsearchDomainConfig) extends AnyVal {

  final def elasticsearchVersionAsScala: Option[ElasticsearchVersionStatus] =
    Option(self.elasticsearchVersion) // ElasticsearchVersionStatus

  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfigStatus] =
    Option(self.elasticsearchClusterConfig) // ElasticsearchClusterConfigStatus

  final def ebsOptionsAsScala: Option[EBSOptionsStatus] = Option(self.ebsOptions) // EBSOptionsStatus

  final def accessPoliciesAsScala: Option[AccessPoliciesStatus] = Option(self.accessPolicies) // AccessPoliciesStatus

  final def snapshotOptionsAsScala: Option[SnapshotOptionsStatus] =
    Option(self.snapshotOptions) // SnapshotOptionsStatus

  final def vpcOptionsAsScala: Option[VPCDerivedInfoStatus] = Option(self.vpcOptions) // VPCDerivedInfoStatus

  final def cognitoOptionsAsScala: Option[CognitoOptionsStatus] = Option(self.cognitoOptions) // CognitoOptionsStatus

  final def encryptionAtRestOptionsAsScala: Option[EncryptionAtRestOptionsStatus] =
    Option(self.encryptionAtRestOptions) // EncryptionAtRestOptionsStatus

  final def nodeToNodeEncryptionOptionsAsScala: Option[NodeToNodeEncryptionOptionsStatus] =
    Option(self.nodeToNodeEncryptionOptions) // NodeToNodeEncryptionOptionsStatus

  final def advancedOptionsAsScala: Option[AdvancedOptionsStatus] =
    Option(self.advancedOptions) // AdvancedOptionsStatus

  final def logPublishingOptionsAsScala: Option[LogPublishingOptionsStatus] =
    Option(self.logPublishingOptions) // LogPublishingOptionsStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchDomainConfigOps {

  implicit def toElasticsearchDomainConfigBuilderOps(
      v: ElasticsearchDomainConfig.Builder
  ): ElasticsearchDomainConfigBuilderOps = new ElasticsearchDomainConfigBuilderOps(v)

  implicit def toElasticsearchDomainConfigOps(v: ElasticsearchDomainConfig): ElasticsearchDomainConfigOps =
    new ElasticsearchDomainConfigOps(v)

}
