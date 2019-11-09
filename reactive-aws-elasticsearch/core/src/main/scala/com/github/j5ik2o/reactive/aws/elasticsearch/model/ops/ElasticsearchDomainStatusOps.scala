// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ElasticsearchDomainStatusBuilderOps(val self: ElasticsearchDomainStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainIdAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.domainId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.created(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletedAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.deleted(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointsAsScala(value: Option[Map[String, String]]): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.endpoints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def processingAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.processing(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeProcessingAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.upgradeProcessing(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchVersionAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfig]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptionsAsScala(value: Option[EBSOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPoliciesAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotOptionsAsScala(value: Option[SnapshotOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcOptionsAsScala(value: Option[VPCDerivedInfo]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cognitoOptionsAsScala(value: Option[CognitoOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptions]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptions]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedOptionsAsScala(value: Option[Map[String, String]]): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.advancedOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logPublishingOptionsAsScala(
      value: Option[Map[LogType, LogPublishingOption]]
  ): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logPublishingOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceSoftwareOptionsAsScala(value: Option[ServiceSoftwareOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.serviceSoftwareOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainEndpointOptionsAsScala(value: Option[DomainEndpointOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.domainEndpointOptions(v)
    }
  }

}

final class ElasticsearchDomainStatusOps(val self: ElasticsearchDomainStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainIdAsScala: Option[String] = Option(self.domainId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAsScala: Option[Boolean] = Option(self.created)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletedAsScala: Option[Boolean] = Option(self.deleted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointAsScala: Option[String] = Option(self.endpoint)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointsAsScala: Option[Map[String, String]] = Option(self.endpoints).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def processingAsScala: Option[Boolean] = Option(self.processing)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeProcessingAsScala: Option[Boolean] = Option(self.upgradeProcessing)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfig] =
    Option(self.elasticsearchClusterConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptionsAsScala: Option[EBSOptions] = Option(self.ebsOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPoliciesAsScala: Option[String] = Option(self.accessPolicies)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotOptionsAsScala: Option[SnapshotOptions] = Option(self.snapshotOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcOptionsAsScala: Option[VPCDerivedInfo] = Option(self.vpcOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cognitoOptionsAsScala: Option[CognitoOptions] = Option(self.cognitoOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAtRestOptionsAsScala: Option[EncryptionAtRestOptions] = Option(self.encryptionAtRestOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeToNodeEncryptionOptionsAsScala: Option[NodeToNodeEncryptionOptions] =
    Option(self.nodeToNodeEncryptionOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedOptionsAsScala: Option[Map[String, String]] = Option(self.advancedOptions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logPublishingOptionsAsScala: Option[Map[LogType, LogPublishingOption]] =
    Option(self.logPublishingOptions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceSoftwareOptionsAsScala: Option[ServiceSoftwareOptions] = Option(self.serviceSoftwareOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainEndpointOptionsAsScala: Option[DomainEndpointOptions] = Option(self.domainEndpointOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchDomainStatusOps {

  implicit def toElasticsearchDomainStatusBuilderOps(
      v: ElasticsearchDomainStatus.Builder
  ): ElasticsearchDomainStatusBuilderOps = new ElasticsearchDomainStatusBuilderOps(v)

  implicit def toElasticsearchDomainStatusOps(v: ElasticsearchDomainStatus): ElasticsearchDomainStatusOps =
    new ElasticsearchDomainStatusOps(v)

}
