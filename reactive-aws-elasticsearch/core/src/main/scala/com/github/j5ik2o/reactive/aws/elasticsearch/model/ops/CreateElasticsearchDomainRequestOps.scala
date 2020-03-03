// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CreateElasticsearchDomainRequestBuilderOps(val self: CreateElasticsearchDomainRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchVersionAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfig]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptionsAsScala(value: Option[EBSOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPoliciesAsScala(value: Option[String]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotOptionsAsScala(value: Option[SnapshotOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcOptionsAsScala(value: Option[VPCOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cognitoOptionsAsScala(value: Option[CognitoOptions]): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptions]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptions]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedOptionsAsScala(value: Option[Map[String, String]]): CreateElasticsearchDomainRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.advancedOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logPublishingOptionsAsScala(
      value: Option[Map[LogType, LogPublishingOption]]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logPublishingOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainEndpointOptionsAsScala(
      value: Option[DomainEndpointOptions]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.domainEndpointOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedSecurityOptionsAsScala(
      value: Option[AdvancedSecurityOptionsInput]
  ): CreateElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.advancedSecurityOptions(v)
    }
  }

}

final class CreateElasticsearchDomainRequestOps(val self: CreateElasticsearchDomainRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

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
  final def vpcOptionsAsScala: Option[VPCOptions] = Option(self.vpcOptions)

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
  final def domainEndpointOptionsAsScala: Option[DomainEndpointOptions] = Option(self.domainEndpointOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedSecurityOptionsAsScala: Option[AdvancedSecurityOptionsInput] = Option(self.advancedSecurityOptions)

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
