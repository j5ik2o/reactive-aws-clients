// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ElasticsearchDomainStatusBuilderOps(val self: ElasticsearchDomainStatus.Builder) extends AnyVal {

  final def domainIdAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.domainId(v)
    }
  }

  final def domainNameAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  final def arnAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def createdAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.created(v)
    }
  }

  final def deletedAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.deleted(v)
    }
  }

  final def endpointAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  final def endpointsAsScala(value: Option[Map[String, String]]): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.endpoints(v.asJava)
    }
  }

  final def processingAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.processing(v)
    }
  }

  final def upgradeProcessingAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.upgradeProcessing(v)
    }
  }

  final def elasticsearchVersionAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  }

  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfig]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  }

  final def ebsOptionsAsScala(value: Option[EBSOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  }

  final def accessPoliciesAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  }

  final def snapshotOptionsAsScala(value: Option[SnapshotOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  }

  final def vpcOptionsAsScala(value: Option[VPCDerivedInfo]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  }

  final def cognitoOptionsAsScala(value: Option[CognitoOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  }

  final def encryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptions]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  }

  final def nodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptions]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  }

  final def advancedOptionsAsScala(value: Option[Map[String, String]]): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.advancedOptions(v.asJava)
    }
  }

  final def logPublishingOptionsAsScala(
      value: Option[Map[LogType, LogPublishingOption]]
  ): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logPublishingOptions(v.asJava)
    }
  }

  final def serviceSoftwareOptionsAsScala(value: Option[ServiceSoftwareOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.serviceSoftwareOptions(v)
    }
  }

}

final class ElasticsearchDomainStatusOps(val self: ElasticsearchDomainStatus) extends AnyVal {

  final def domainIdAsScala: Option[String] = Option(self.domainId)

  final def domainNameAsScala: Option[String] = Option(self.domainName)

  final def arnAsScala: Option[String] = Option(self.arn)

  final def createdAsScala: Option[Boolean] = Option(self.created)

  final def deletedAsScala: Option[Boolean] = Option(self.deleted)

  final def endpointAsScala: Option[String] = Option(self.endpoint)

  final def endpointsAsScala: Option[Map[String, String]] = Option(self.endpoints).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def processingAsScala: Option[Boolean] = Option(self.processing)

  final def upgradeProcessingAsScala: Option[Boolean] = Option(self.upgradeProcessing)

  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion)

  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfig] =
    Option(self.elasticsearchClusterConfig)

  final def ebsOptionsAsScala: Option[EBSOptions] = Option(self.ebsOptions)

  final def accessPoliciesAsScala: Option[String] = Option(self.accessPolicies)

  final def snapshotOptionsAsScala: Option[SnapshotOptions] = Option(self.snapshotOptions)

  final def vpcOptionsAsScala: Option[VPCDerivedInfo] = Option(self.vpcOptions)

  final def cognitoOptionsAsScala: Option[CognitoOptions] = Option(self.cognitoOptions)

  final def encryptionAtRestOptionsAsScala: Option[EncryptionAtRestOptions] = Option(self.encryptionAtRestOptions)

  final def nodeToNodeEncryptionOptionsAsScala: Option[NodeToNodeEncryptionOptions] =
    Option(self.nodeToNodeEncryptionOptions)

  final def advancedOptionsAsScala: Option[Map[String, String]] = Option(self.advancedOptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def logPublishingOptionsAsScala: Option[Map[LogType, LogPublishingOption]] =
    Option(self.logPublishingOptions).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    }

  final def serviceSoftwareOptionsAsScala: Option[ServiceSoftwareOptions] = Option(self.serviceSoftwareOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchDomainStatusOps {

  implicit def toElasticsearchDomainStatusBuilderOps(
      v: ElasticsearchDomainStatus.Builder
  ): ElasticsearchDomainStatusBuilderOps = new ElasticsearchDomainStatusBuilderOps(v)

  implicit def toElasticsearchDomainStatusOps(v: ElasticsearchDomainStatus): ElasticsearchDomainStatusOps =
    new ElasticsearchDomainStatusOps(v)

}
