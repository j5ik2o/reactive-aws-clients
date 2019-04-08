// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CreateElasticsearchDomainRequestBuilderOps(val self: CreateElasticsearchDomainRequest.Builder)
    extends AnyVal {

  final def domainNameAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  final def elasticsearchVersionAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  }

  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfig]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  }

  final def ebsOptionsAsScala(value: Option[EBSOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  }

  final def accessPoliciesAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  }

  final def snapshotOptionsAsScala(value: Option[SnapshotOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  }

  final def vpcOptionsAsScala(value: Option[VPCOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  }

  final def cognitoOptionsAsScala(value: Option[CognitoOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  }

  final def encryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptions]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  }

  final def nodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptions]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  }

  final def advancedOptionsAsScala(value: Option[Map[String, String]]): CreateElasticsearchDomainRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.advancedOptions(v.asJava)
    }
  }

  final def logPublishingOptionsAsScala(
      value: Option[Map[LogType, LogPublishingOption]]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logPublishingOptions(v.asJava)
    }
  }

}

final class CreateElasticsearchDomainRequestOps(val self: CreateElasticsearchDomainRequest) extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName)

  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion)

  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfig] =
    Option(self.elasticsearchClusterConfig)

  final def ebsOptionsAsScala: Option[EBSOptions] = Option(self.ebsOptions)

  final def accessPoliciesAsScala: Option[String] = Option(self.accessPolicies)

  final def snapshotOptionsAsScala: Option[SnapshotOptions] = Option(self.snapshotOptions)

  final def vpcOptionsAsScala: Option[VPCOptions] = Option(self.vpcOptions)

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

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateElasticsearchDomainRequestOps {

  implicit def toCreateElasticsearchDomainRequestBuilderOps(
      v: CreateElasticsearchDomainRequest.Builder
  ): CreateElasticsearchDomainRequestBuilderOps = new CreateElasticsearchDomainRequestBuilderOps(v)

  implicit def toCreateElasticsearchDomainRequestOps(
      v: CreateElasticsearchDomainRequest
  ): CreateElasticsearchDomainRequestOps = new CreateElasticsearchDomainRequestOps(v)

}
