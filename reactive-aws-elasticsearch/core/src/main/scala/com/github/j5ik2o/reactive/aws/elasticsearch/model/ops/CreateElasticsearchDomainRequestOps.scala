// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CreateElasticsearchDomainRequestBuilderOps(val self: CreateElasticsearchDomainRequest.Builder)
    extends AnyVal {

  final def withDomainNameAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

  final def withElasticsearchVersionAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  } // String

  final def withElasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfig]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  } // ElasticsearchClusterConfig

  final def withEbsOptionsAsScala(value: Option[EBSOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  } // EBSOptions

  final def withAccessPoliciesAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  } // String

  final def withSnapshotOptionsAsScala(value: Option[SnapshotOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  } // SnapshotOptions

  final def withVpcOptionsAsScala(value: Option[VPCOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  } // VPCOptions

  final def withCognitoOptionsAsScala(value: Option[CognitoOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  } // CognitoOptions

  final def withEncryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptions]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  } // EncryptionAtRestOptions

  final def withNodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptions]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  } // NodeToNodeEncryptionOptions

  final def withAdvancedOptionsAsScala(value: Option[Map[String, String]]): CreateElasticsearchDomainRequest.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.advancedOptions(v.asJava)
    } // Map[String, String]
  }

  final def withLogPublishingOptionsAsScala(
      value: Option[Map[LogType, LogPublishingOption]]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logPublishingOptions(v.asJava)
    } // Map[String, LogPublishingOption]
  }

}

final class CreateElasticsearchDomainRequestOps(val self: CreateElasticsearchDomainRequest) extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion) // String

  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfig] =
    Option(self.elasticsearchClusterConfig) // ElasticsearchClusterConfig

  final def ebsOptionsAsScala: Option[EBSOptions] = Option(self.ebsOptions) // EBSOptions

  final def accessPoliciesAsScala: Option[String] = Option(self.accessPolicies) // String

  final def snapshotOptionsAsScala: Option[SnapshotOptions] = Option(self.snapshotOptions) // SnapshotOptions

  final def vpcOptionsAsScala: Option[VPCOptions] = Option(self.vpcOptions) // VPCOptions

  final def cognitoOptionsAsScala: Option[CognitoOptions] = Option(self.cognitoOptions) // CognitoOptions

  final def encryptionAtRestOptionsAsScala: Option[EncryptionAtRestOptions] =
    Option(self.encryptionAtRestOptions) // EncryptionAtRestOptions

  final def nodeToNodeEncryptionOptionsAsScala: Option[NodeToNodeEncryptionOptions] =
    Option(self.nodeToNodeEncryptionOptions) // NodeToNodeEncryptionOptions

  final def advancedOptionsAsScala: Option[Map[String, String]] = Option(self.advancedOptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def logPublishingOptionsAsScala: Option[Map[LogType, LogPublishingOption]] =
    Option(self.logPublishingOptions).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    } // Map[String, LogPublishingOption]

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
